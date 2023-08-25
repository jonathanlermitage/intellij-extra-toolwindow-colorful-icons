// SPDX-License-Identifier: MIT

package lermitage.intellij.extratci;

import com.intellij.openapi.options.Configurable;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.Nls;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

public class SettingsForm implements Configurable {

    private final SettingsService settingsService;
    private boolean modified = false;
    private IconsTableModel iconsTableModel;

    private JTable iconsTable;
    private JPanel mainPanel;
    private JButton enableAllBtn;
    private JButton disableAllBtn;
    private JLabel descriptionLabel;
    private JComboBox<ComboBoxWithImageItem> uiTypeSelector;
    private JLabel uiTypeLabel;

    public SettingsForm() {
        this.settingsService = SettingsService.getInstance();
        enableAllBtn.addActionListener(e -> {
            for (int rowIdx = 0; rowIdx < iconsTableModel.getRowCount(); rowIdx++) {
                iconsTableModel.setValueAt(true, rowIdx, IconsTableModel.ICON_ENABLED_ROW_NUMBER);
            }
            modified = true;
        });
        disableAllBtn.addActionListener(e -> {
            for (int rowIdx = 0; rowIdx < iconsTableModel.getRowCount(); rowIdx++) {
                iconsTableModel.setValueAt(false, rowIdx, IconsTableModel.ICON_ENABLED_ROW_NUMBER);
            }
            modified = true;
        });

    }

    private void loadIconsTable() {
        iconsTableModel = new IconsTableModel();
        iconsTableModel.addTableModelListener(e -> modified = true);
        Map<String, IconItem> allIcons = SettingsService.getAllIcons();
        List<String> disabledIconNames = SettingsService.getInstance().getDisabledIcons();
        allIcons.keySet()
            .stream().sorted(Comparator.comparing(String::toLowerCase))
            .forEach(iconName -> iconsTableModel.addRow(new Object[]{
                    IconLoader.getIcon(allIcons.get(iconName).getIcon(), SettingsForm.class),
                    !disabledIconNames.contains(iconName),
                    iconName,
                    allIcons.get(iconName).getDescription()
                })
            );
        iconsTable.setEnabled(true);
        iconsTable.setShowHorizontalLines(false);
        iconsTable.setShowVerticalLines(false);
        iconsTable.setFocusable(false);
        iconsTable.setRowSelectionAllowed(true);
        iconsTable.setModel(iconsTableModel);
        iconsTable.setRowHeight(28);
        iconsTable.getColumnModel().getColumn(IconsTableModel.ICON_PREVIEW_ROW_NUMBER).setWidth(28);
        iconsTable.getColumnModel().getColumn(IconsTableModel.ICON_PREVIEW_ROW_NUMBER).setMaxWidth(28);
        iconsTable.getColumnModel().getColumn(IconsTableModel.ICON_ENABLED_ROW_NUMBER).setWidth(28);
        iconsTable.getColumnModel().getColumn(IconsTableModel.ICON_ENABLED_ROW_NUMBER).setMaxWidth(28);
        //iconsTable.getColumnModel().getColumn(IconsTableModel.ICON_DESCRIPTION_ROW_NUMBER).setWidth(100);
        //iconsTable.getColumnModel().getColumn(IconsTableModel.ICON_DESCRIPTION_ROW_NUMBER).setMaxWidth(300);
    }


    private UITypeIconsPreference getSelectedUITypeIconsPreference() {
        int selectedIndex = uiTypeSelector.getSelectedIndex();
        if (selectedIndex == 0) {
            return UITypeIconsPreference.BASED_ON_ACTIVE_UI_TYPE;
        } else if (selectedIndex == 1) {
            return UITypeIconsPreference.PREFER_OLD_UI_ICONS;
        } else {
            return UITypeIconsPreference.PREFER_NEW_UI_ICONS;
        }
    }

    private void setSelectedUITypeIconsPreference(UITypeIconsPreference uiTypeIconsPreference) {
        switch (uiTypeIconsPreference) {
            case BASED_ON_ACTIVE_UI_TYPE -> uiTypeSelector.setSelectedIndex(0);
            case PREFER_OLD_UI_ICONS -> uiTypeSelector.setSelectedIndex(1);
            case PREFER_NEW_UI_ICONS -> uiTypeSelector.setSelectedIndex(2);
        }
    }

    @Nls(capitalization = Nls.Capitalization.Title)
    @Override
    public String getDisplayName() {
        return "Extra ToolWindow Colorful Icons";
    }

    @Override
    public @Nullable JComponent createComponent() {
        descriptionLabel.setText("Choose icons to (de)activate. Restart IDE to apply changes.");

        uiTypeLabel.setText("Prefer old UI or new UI icon variants (Restart IDE to apply changes):");
        uiTypeSelector.setRenderer(new ComboBoxWithImageRenderer());
        uiTypeSelector.addItem(new ComboBoxWithImageItem(
            "extratci/icons/plugin-internals/auto.svg", //NON-NLS
            "Auto select old/new UI icons"));
        uiTypeSelector.addItem(new ComboBoxWithImageItem(
            "extratci/icons/plugin-internals/folder_oldui.svg",//NON-NLS
            "Always prefer old UI icons"));
        uiTypeSelector.addItem(new ComboBoxWithImageItem(
            "extratci/icons/plugin-internals/folder_newui.svg", //NON-NLS
            "Always prefer new UI icons"));
        setSelectedUITypeIconsPreference(SettingsService.getInstance().getUiTypeIconsPreference());

        loadIconsTable();
        return mainPanel;
    }

    @Override
    public boolean isModified() {
        if (settingsService.getUiTypeIconsPreference() != getSelectedUITypeIconsPreference()) {
            return true;
        }
        return modified;
    }

    @Override
    public void apply() {
        settingsService.setDisabledIcons(collectDisabledIconNames());
        settingsService.setUiTypeIconsPreference(getSelectedUITypeIconsPreference());
        modified = false;
    }

    @Override
    public void reset() {
        loadIconsTable();
        modified = false;
    }

    private List<String> collectDisabledIconNames() {
        List<String> disabledModelIds = new ArrayList<>();
        for (int settingsTableRow = 0; settingsTableRow < iconsTableModel.getRowCount(); settingsTableRow++) {
            boolean iconEnabled = (boolean) iconsTableModel.getValueAt(settingsTableRow, IconsTableModel.ICON_ENABLED_ROW_NUMBER);
            if (!iconEnabled) {
                disabledModelIds.add((String) iconsTableModel.getValueAt(settingsTableRow, IconsTableModel.ICON_NAME_ROW_NUMBER));
            }
        }
        return disabledModelIds;
    }
}
