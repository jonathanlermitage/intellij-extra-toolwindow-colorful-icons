// SPDX-License-Identifier: MIT

package lermitage.intellij.extratci;

import com.intellij.openapi.application.ApplicationInfo;
import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.util.IconPathPatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static lermitage.intellij.extratci.IconItem.of;

public class ExtraToolWindowIconsPatcher extends IconPathPatcher {

    private final Logger LOG = Logger.getInstance(getClass().getName());

    private Map<String, IconItem> icons;

    @SuppressWarnings("SpellCheckingInspection")
    @NotNull
    public static Map<String, IconItem> allIcons() {
        Map<String, IconItem> icons = new HashMap<>();

        // icons copied from ToolWindow Colorful Icons (JetBrains plugin)
        icons.put("CMakeToolWindow.svg", of("extratci/icons/original/CIDR/clion/resources/icons/CMakeToolWindow.svg"));
        icons.put("toolWindowProject_AS.svg", of("extratci/icons/original/community/android/adt-branding/src/artwork/toolWindowProject_AS.svg"));
        icons.put("androidToolWindow.svg", of("extratci/icons/original/community/android/artwork/resources/icons/androidToolWindow.svg"));
        icons.put("toolWindowWarning.svg", of("extratci/icons/original/community/android/artwork/resources/icons/toolwindows/toolWindowWarning.svg"));
        icons.put("toolWindowBuild.svg", of("extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowBuild.svg"));
        icons.put("toolWindowChanges.svg", of("extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowChanges.svg"));
        icons.put("toolWindowDebugger.svg", of("extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowDebugger.svg"));
        icons.put("toolWindowFavorites.svg", of("extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowFavorites.svg"));
        icons.put("toolWindowProfiler.svg", of("extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowProfiler.svg"));
        icons.put("toolWindowRun.svg", of("extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowRun.svg"));
        icons.put("toolWindowStructure.svg", of("extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowStructure.svg"));
        icons.put("serversToolWindow.svg", of("extratci/icons/original/community/platform/remote-servers/impl/resources/icons/serversToolWindow.svg"));
        icons.put("griffonToolWindow.svg", of("extratci/icons/original/community/plugins/groovy/groovy-psi/resources/icons/griffon/griffonToolWindow.svg"));
        icons.put("toolWindowMaven.svg", of("extratci/icons/original/community/plugins/maven/src/main/resources/images/toolWindowMaven.svg"));
        icons.put("pythonConsoleToolWindow.svg", of("extratci/icons/original/community/python/resources/icons/com/jetbrains/python/pythonConsoleToolWindow.svg"));
        icons.put("dart_13.svg", of("extratci/icons/original/contrib/Dart/resources/icons/dart_13.svg"));
        icons.put("pubServeToolWindow.svg", of("extratci/icons/original/contrib/Dart/resources/icons/pubServeToolWindow.svg"));
        icons.put("toolWindowDatabase.svg", of("extratci/icons/original/dbe/database/api/resources/icons/toolWindowDatabase.svg"));
        icons.put("toolwindowDatabaseChanges.svg", of("extratci/icons/original/dbe/database/api/resources/icons/toolwindowDatabaseChanges.svg"));
        icons.put("toolWindowSQLGenerator.svg", of("extratci/icons/original/dbe/database/api/resources/icons/toolWindowSQLGenerator.svg"));
        icons.put("hibConsoleToolWindow.svg", of("extratci/icons/original/plugins/frameworks/hibernate/hibernate-core/src/resources/icons/hibConsoleToolWindow.svg"));
        icons.put("batchToolWindow.svg", of("extratci/icons/original/plugins/javaee/batch/batch-core/src/resources/icons/batchToolWindow.svg"));
        icons.put("cdiToolWindow.svg", of("extratci/icons/original/plugins/javaee/cdi/cdi-core/src/resources/icons/cdiToolWindow.svg"));
        icons.put("ejbToolWindow.svg", of("extratci/icons/original/plugins/javaee/core/javaee-impl/source/resources/icons/ejbToolWindow.svg"));
        icons.put("javaeeToolWindow.svg", of("extratci/icons/original/plugins/javaee/core/javaee-impl/source/resources/icons/javaeeToolWindow.svg"));
        icons.put("jpaToolWindow.svg", of("extratci/icons/original/plugins/javaee/core/javaee-impl/source/resources/icons/jpaToolWindow.svg"));
        icons.put("jsfToolWindow.svg", of("extratci/icons/original/plugins/javaee/jsf/jsf-core/src/resources/icons/jsfToolWindow.svg"));
        icons.put("webSocketFrameworkToolWindow.svg", of("extratci/icons/original/plugins/javaee/web-socket/websocket/src/resources/icons/webSocketFrameworkToolWindow.svg"));
        icons.put("grunt_toolwindow.svg", of("extratci/icons/original/plugins/JavaScriptLanguage/src/icons/buildTools/grunt/grunt_toolwindow.svg"));
        icons.put("gulp_toolwindow.svg", of("extratci/icons/original/plugins/JavaScriptLanguage/src/icons/buildTools/gulp_toolwindow.svg"));
        icons.put("npm_13.svg", of("extratci/icons/original/plugins/JavaScriptLanguage/src/icons/buildTools/npm/npm_13.svg"));
        icons.put("OpenV8HeapSnapshot_ToolWin.svg", of("extratci/icons/original/plugins/NodeJS/src/com/jetbrains/nodejs/icons/OpenV8HeapSnapshot_ToolWin.svg"));
        icons.put("OpenV8ProfilingLog_ToolWin.svg", of("extratci/icons/original/plugins/NodeJS/src/com/jetbrains/nodejs/icons/OpenV8ProfilingLog_ToolWin.svg"));
        icons.put("v8_ToolWin.svg", of("extratci/icons/original/plugins/NodeJS/src/com/jetbrains/nodejs/icons/v8_ToolWin.svg"));
        icons.put("springToolWindow.svg", of("extratci/icons/original/plugins/spring/spring-api/resources/icons/springToolWindow.svg"));
        icons.put("ConcurrencyDiagramToolwindow.svg", of("extratci/icons/original/python/concurrency-visualiser/resources/icons/ConcurrencyDiagramToolwindow.svg"));

        // custom icons
        icons.put("OpenTerminal_13x13.svg", of("extratci/icons/custom/OpenTerminal_13x13.svg"));
        icons.put("pullRequestsToolWindow.svg", of("extratci/icons/custom/pullRequestsToolWindow.svg"));
        icons.put("pythonPackages.svg", of("extratci/icons/custom/pythonPackages.svg"));
        icons.put("toolWindowCommit.svg", of("extratci/icons/custom/toolWindowCommit.svg"));
        icons.put("toolWindowGradle.svg", of("extratci/icons/custom/toolWindowGradle.svg"));
        icons.put("toolWindowProblemsEmpty.svg", of("extratci/icons/custom/problemsEmpty.svg"));
        icons.put("problemsEmpty.svg", of("extratci/icons/custom/problemsEmpty.svg"));
        icons.put("toolWindowProject.svg", of("extratci/icons/custom/toolWindowProject.svg"));
        icons.put("branch.svg", of("extratci/icons/custom/branch.svg", "VCS branch selector (IDE's bottom-right corner)"));
        icons.put("branchNode.svg", of("extratci/icons/custom/branch.svg", "Branch nodes in VCS Log > Branches"));
        icons.put("makefileToolWindow.svg", of("extratci/icons/custom/makefileToolWindow.svg"));
        icons.put("intentionBulbGrey.svg", of("extratci/icons/custom/intentionBulb.svg"));
        icons.put("menu-saveall.svg", of("extratci/icons/custom/menu-saveall.svg"));
        icons.put("toolWindowAnt.svg", of("extratci/icons/custom/toolWindowAnt.svg"));
        icons.put("build.svg", of("extratci/icons/custom/build.svg"));
        icons.put("refresh.svg", of("extratci/icons/custom/refresh.svg"));
        icons.put("reset.svg", of("extratci/icons/custom/reset.svg"));
        icons.put("rollback.svg", of("extratci/icons/custom/rollback.svg"));
        icons.put("toolWindowServices.svg", of("extratci/icons/custom/toolWindowServices.svg"));
        icons.put("featureTrainer.svg", of("extratci/icons/custom/featureTrainer.svg"));
        icons.put("featureTrainerToolWindow.svg", of("extratci/icons/custom/featureTrainerToolWindow.svg"));
        icons.put("artifactSmall.svg", of("extratci/icons/custom/artifactSmall.svg"));
        icons.put("emulator.svg", of("extratci/icons/custom/emulator.svg"));
        icons.put("readwrite.svg", of("extratci/icons/custom/readwrite.svg"));
        icons.put("readonly.svg", of("extratci/icons/custom/readonly.svg"));
        icons.put("locked.svg", of("extratci/icons/custom/locked.svg", "File badge in editor tabs and Project view"));
        icons.put("inspection.svg", of("extratci/icons/custom/inspector.svg", "App inspection"));
        icons.put("toolWindowInspection.svg", of("extratci/icons/custom/inspector.svg", "Inspection results"));
        icons.put("add.svg", of("extratci/icons/custom/add.svg"));
        icons.put("merge.svg", of("extratci/icons/custom/merge.svg"));
        icons.put("android-profiler.svg", of("extratci/icons/custom/profiler.svg"));
        icons.put("remove.svg", of("extratci/icons/custom/remove.svg"));
        icons.put("removeSlot.svg", of("extratci/icons/custom/removeSlot.svg"));
        icons.put("print.svg", of("extratci/icons/custom/print.svg"));
        icons.put("toolWindowMessages.svg", of("extratci/icons/custom/toolWindowMessages.svg"));
        icons.put("toolWindowTodo.svg", of("extratci/icons/custom/toolWindowTodo.svg"));
        icons.put("collapseall.svg", of("extratci/icons/custom/collapseall.svg"));
        icons.put("expandall.svg", of("extratci/icons/custom/expandall.svg"));
        icons.put("back.svg", of("extratci/icons/custom/back.svg"));
        icons.put("redo.svg", of("extratci/icons/custom/redo.svg"));
        icons.put("undo.svg", of("extratci/icons/custom/undo.svg"));
        icons.put("menu-cut.svg", of("extratci/icons/custom/menu-cut.svg"));
        icons.put("toolWindowBookmarks.svg", of("extratci/icons/custom/toolWindowBookmarks.svg"));
        icons.put("cwmAccessDotOff.svg", of("extratci/icons/custom/cwmAccessDotOff.svg"));
        icons.put("cwmAccessOff.svg", of("extratci/icons/custom/cwmAccessOff.svg"));
        icons.put("gradleFile.svg", of("extratci/icons/custom/gradleFile.svg"));
        icons.put("kotlin.svg", of("extratci/icons/custom/kotlin.svg"));
        icons.put("webServerToolWindow.svg", of("extratci/icons/custom/webServerToolWindow.svg"));
        icons.put("connected.svg", of("extratci/icons/custom/connected.svg", "IDE settings sync status (bottom right corner)"));
        icons.put("addList.svg", of("extratci/icons/custom/addList.svg"));
        icons.put("actions/close.svg", of("extratci/icons/custom/actions_close.svg"));
        icons.put("actions/closeDarkGrey.svg", of("extratci/icons/custom/actions_closeDarkGrey.svg"));
        icons.put("actions/closeHovered.svg", of("extratci/icons/custom/actions_closeHovered.svg"));
        icons.put("ide/notification/close.svg", of("extratci/icons/custom/notification_close.svg"));
        icons.put("ide/notification/closeHover.svg", of("extratci/icons/custom/notification_closeHover.svg"));
        icons.put("addToDictionary.svg", of("extratci/icons/custom/addToDictionary.svg"));
        icons.put("scroll_down.svg", of("extratci/icons/custom/scroll_down.svg"));
        icons.put("scroll_up.svg", of("extratci/icons/custom/scroll_up.svg"));
        icons.put("toggleSoftWrap.svg", of("extratci/icons/custom/toggleSoftWrap.svg"));
        icons.put("cherryPick.svg", of("extratci/icons/custom/cherryPick.svg"));
        icons.put("delete.svg", of("extratci/icons/custom/delete.svg"));
        icons.put("gc.svg", of("extratci/icons/custom/delete.svg", "Delete button in gutter (Kubernetes tool window)"));
        icons.put("deleteHovered.svg", of("extratci/icons/custom/deleteHovered.svg"));
        icons.put("pin.svg", of("extratci/icons/custom/pin.svg"));
        icons.put("pin_tab.svg", of("extratci/icons/custom/pin_tab.svg"));
        icons.put("pinned_items_favorites.svg", of("extratci/icons/custom/pinned_items_favorites.svg"));
        icons.put("pinTab.svg", of("extratci/icons/custom/pinTab.svg"));

        return icons;
    }

    public ExtraToolWindowIconsPatcher() {
        super();
        loadConfig();
        IconLoader.installPathPatcher(this);
    }

    @Override
    public @Nullable ClassLoader getContextClassLoader(@NotNull String path, @Nullable ClassLoader originalClassLoader) {
        return ExtraToolWindowIconsPatcher.class.getClassLoader();
    }

    @Override
    public @Nullable String patchPath(@NotNull String path, @Nullable ClassLoader classLoader) {
        //LOG.info("------patchPath------ " + path);
        if (icons == null) {
            loadConfig();
        }

        if (this.icons.containsKey(path)) {
            return this.icons.get(path).getIcon();
        }
        if (path.startsWith("/") && path.length() > 2) {
            String simplifiedPath = path.substring(1);
            if (this.icons.containsKey(simplifiedPath)) {
                return this.icons.get(simplifiedPath).getIcon();
            }
        }

        String fileName = (new File(path)).getName();
        if (this.icons.containsKey(fileName)) {
            return this.icons.get(fileName).getIcon();
        }

        return null;
    }

    private void loadConfig() {
        Map<String, IconItem> enabledIcons = new HashMap<>(SettingsService.getAllIcons());
        int allIconsSize = enabledIcons.size();
        List<String> disabledIcons = SettingsService.getInstance().getDisabledIcons();
        disabledIcons.forEach(enabledIcons::remove);

        // Starting with IJ 2022 (build 221+), resource path must not start with a leading "/". On older IJ versions, resource
        // path has to start with a leading "/". A solution would be to support IJ 2022+ only, but we can easily
        // detect IDE build version and adapt icons path when needed.
        String buildVersion = ApplicationInfo.getInstance().getBuild().asStringWithoutProductCode();
        if (buildVersion.startsWith("20") || buildVersion.startsWith("21")) {
            LOG.info("Detected IDE build version " + buildVersion + ". This is an old build (<221). " +
                "Will adapt code in order to customize IDE icons correctly.");
            Map<String, IconItem> fixedEnabledIcons = new HashMap<>();
            enabledIcons.forEach((ideIconName, customIcon) -> fixedEnabledIcons.put(
                ideIconName,
                IconItem.of("/" + customIcon.getIcon(), customIcon.getDescription())));
            icons = fixedEnabledIcons;
        } else {
            icons = enabledIcons;
        }

        LOG.info("config loaded with success, enabled " + icons.size() + "/" + allIconsSize + " items");
    }
}
