// SPDX-License-Identifier: MIT

package lermitage.intellij.extratci;

import java.util.Objects;

public class IconItem {

    private final String icon;
    private final String description;

    public static IconItem of(String icon, String description) {
        return new IconItem(icon, description);
    }

    public static IconItem of(String icon) {
        return new IconItem(icon, "");
    }

    public IconItem(String icon, String description) {
        this.icon = icon;
        this.description = description;

    }

    public String getIcon() {
        return icon;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IconItem iconItem = (IconItem) o;
        return Objects.equals(icon, iconItem.icon) && Objects.equals(description, iconItem.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(icon, description);
    }
}
