// SPDX-License-Identifier: MIT

package lermitage.intellij.extratci;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// see http://www.jetbrains.org/intellij/sdk/docs/basics/persisting_state_of_components.html
@SuppressWarnings({"WeakerAccess", "unused"})
@State(
    name = "ExtraTciSettings",
    storages = @Storage("lermitage-extratci.xml")
)
public class SettingsService implements PersistentStateComponent<SettingsService> {

    private final Logger LOG = Logger.getInstance(getClass().getName());

    // the implementation of PersistentStateComponent works by serializing public fields, so keep them public
    @SuppressWarnings("WeakerAccess")
    public List<String> disabledIcons = new ArrayList<>();

    public static SettingsService getInstance() {
        return ApplicationManager.getApplication().getService(SettingsService.class);
    }

    public static Map<String, IconItem> getAllIcons() {
        return ExtraToolWindowIconsPatcher.allIcons();
    }

    public List<String> getDisabledIcons() {
        if (disabledIcons == null) { // a malformed xml file could make it null
            disabledIcons = new ArrayList<>();
        }
        return disabledIcons;
    }

    public void setDisabledIcons(List<String> disabledIcons) {
        this.disabledIcons = disabledIcons;
    }

    @Override
    public SettingsService getState() {
        return this;
    }

    @Override
    public void loadState(@NotNull SettingsService state) {
        XmlSerializerUtil.copyBean(state, this);
    }
}
