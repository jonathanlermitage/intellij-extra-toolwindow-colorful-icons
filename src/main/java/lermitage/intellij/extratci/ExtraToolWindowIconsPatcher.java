// SPDX-License-Identifier: MIT

package lermitage.intellij.extratci;

import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.util.IconPathPatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ExtraToolWindowIconsPatcher extends IconPathPatcher {

    public ExtraToolWindowIconsPatcher() {
        super();
        IconLoader.installPathPatcher(this);
    }

    @Override
    public @Nullable ClassLoader getContextClassLoader(@NotNull String path, @Nullable ClassLoader originalClassLoader) {
        return ExtraToolWindowIconsPatcher.class.getClassLoader();
    }

    @Override
    public @Nullable String patchPath(@NotNull String path, @Nullable ClassLoader classLoader) {
        return "extratci/icons/custom/upload.svg";
    }
}
