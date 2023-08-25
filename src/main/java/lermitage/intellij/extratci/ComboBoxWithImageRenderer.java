// SPDX-License-Identifier: MIT

package lermitage.intellij.extratci;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.IconLoader;
import org.jetbrains.annotations.NonNls;

import javax.swing.*;
import java.awt.*;

/**
 * A {@link JComboBox} renderer with PNG/SVG image + optional text.
 * Example:
 * <pre>
 * myComboBox.setRenderer(new ComboBoxWithImageRenderer());
 * myComboBox.addItem(new ComboBoxWithImageItem("first item", "extra-icons/first_item.svg"));
 * </pre>
 */
public class ComboBoxWithImageRenderer extends JLabel implements ListCellRenderer<Object> {

    private static final @NonNls Logger LOGGER = Logger.getInstance(ComboBoxWithImageRenderer.class);

    @SuppressWarnings("OverridableMethodCallInConstructor")
    public ComboBoxWithImageRenderer() {
        setOpaque(true);
        setHorizontalAlignment(LEFT);
        setVerticalAlignment(CENTER);
    }

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        String text = null;
        Icon icon = null;
        if (value == null) {
            return this;
        }
        try {
            if (value instanceof BundledIcon bundledIconValue) {
                text = bundledIconValue.description();
                icon = IconLoader.getIcon(((BundledIcon) value).iconPath(), ComboBoxWithImageRenderer.class);
            } else if (value instanceof ComboBoxWithImageItem comboBoxWithImageItemValue) {
                text = comboBoxWithImageItemValue.getTitle();
                String imagePath = ((ComboBoxWithImageItem) value).getImagePath();
                if (imagePath == null) {
                    icon = new ImageIcon();
                } else {
                    icon = IconLoader.getIcon(imagePath, ComboBoxWithImageRenderer.class);
                }
            } else if (value instanceof String strValue) {
                text = strValue;
                icon = new ImageIcon();
            }
            setText(text);
            setIcon(icon);
        } catch (Exception e) {
            setText("(error, failed to display icon)");
            setIcon(null);
            LOGGER.warn("failed to display icon " + text + ": " + icon, e);
        }

        if (isSelected) {
            setBackground(list.getSelectionBackground());
            setForeground(list.getSelectionForeground());
        } else {
            setBackground(list.getBackground());
            setForeground(list.getForeground());
        }
        setIconTextGap(6);
        return this;
    }
}
