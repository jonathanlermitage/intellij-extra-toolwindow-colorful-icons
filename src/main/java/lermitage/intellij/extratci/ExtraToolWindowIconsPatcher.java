// SPDX-License-Identifier: MIT

package lermitage.intellij.extratci;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.util.IconPathPatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ExtraToolWindowIconsPatcher extends IconPathPatcher {

    private final Logger LOG = Logger.getInstance(getClass().getName());

    private Map<String, String> icons;

    @SuppressWarnings("SpellCheckingInspection")
    @NotNull
    public static Map<String, String> allIcons() {
        Map<String, String> icons = new HashMap<>();

        // icons copied from ToolWindow Colorful Icons (JetBrains plugin)
        icons.put("CMakeToolWindow.svg", "/extratci/icons/original/CIDR/clion/resources/icons/CMakeToolWindow.svg");
        icons.put("toolWindowProject_AS.svg", "/extratci/icons/original/community/android/adt-branding/src/artwork/toolWindowProject_AS.svg");
        icons.put("androidToolWindow.svg", "/extratci/icons/original/community/android/artwork/resources/icons/androidToolWindow.svg");
        icons.put("toolWindowWarning.svg", "/extratci/icons/original/community/android/artwork/resources/icons/toolwindows/toolWindowWarning.svg");
        icons.put("toolWindowBuild.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowBuild.svg");
        icons.put("toolWindowChanges.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowChanges.svg");
        icons.put("toolWindowDebugger.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowDebugger.svg");
        icons.put("toolWindowFavorites.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowFavorites.svg");
        icons.put("toolWindowProfiler.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowProfiler.svg");
        icons.put("toolWindowRun.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowRun.svg");
        icons.put("toolWindowStructure.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowStructure.svg");
        icons.put("serversToolWindow.svg", "/extratci/icons/original/community/platform/remote-servers/impl/resources/icons/serversToolWindow.svg");
        icons.put("griffonToolWindow.svg", "/extratci/icons/original/community/plugins/groovy/groovy-psi/resources/icons/griffon/griffonToolWindow.svg");
        icons.put("toolWindowMaven.svg", "/extratci/icons/original/community/plugins/maven/src/main/resources/images/toolWindowMaven.svg");
        icons.put("pythonConsoleToolWindow.svg", "/extratci/icons/original/community/python/resources/icons/com/jetbrains/python/pythonConsoleToolWindow.svg");
        icons.put("dart_13.svg", "/extratci/icons/original/contrib/Dart/resources/icons/dart_13.svg");
        icons.put("pubServeToolWindow.svg", "/extratci/icons/original/contrib/Dart/resources/icons/pubServeToolWindow.svg");
        icons.put("toolWindowDatabase.svg", "/extratci/icons/original/dbe/database/api/resources/icons/toolWindowDatabase.svg");
        icons.put("toolwindowDatabaseChanges.svg", "/extratci/icons/original/dbe/database/api/resources/icons/toolwindowDatabaseChanges.svg");
        icons.put("toolWindowSQLGenerator.svg", "/extratci/icons/original/dbe/database/api/resources/icons/toolWindowSQLGenerator.svg");
        icons.put("hibConsoleToolWindow.svg", "/extratci/icons/original/plugins/frameworks/hibernate/hibernate-core/src/resources/icons/hibConsoleToolWindow.svg");
        icons.put("batchToolWindow.svg", "/extratci/icons/original/plugins/javaee/batch/batch-core/src/resources/icons/batchToolWindow.svg");
        icons.put("cdiToolWindow.svg", "/extratci/icons/original/plugins/javaee/cdi/cdi-core/src/resources/icons/cdiToolWindow.svg");
        icons.put("ejbToolWindow.svg", "/extratci/icons/original/plugins/javaee/core/javaee-impl/source/resources/icons/ejbToolWindow.svg");
        icons.put("javaeeToolWindow.svg", "/extratci/icons/original/plugins/javaee/core/javaee-impl/source/resources/icons/javaeeToolWindow.svg");
        icons.put("jpaToolWindow.svg", "/extratci/icons/original/plugins/javaee/core/javaee-impl/source/resources/icons/jpaToolWindow.svg");
        icons.put("jsfToolWindow.svg", "/extratci/icons/original/plugins/javaee/jsf/jsf-core/src/resources/icons/jsfToolWindow.svg");
        icons.put("webSocketFrameworkToolWindow.svg", "/extratci/icons/original/plugins/javaee/web-socket/websocket/src/resources/icons/webSocketFrameworkToolWindow.svg");
        icons.put("grunt_toolwindow.svg", "/extratci/icons/original/plugins/JavaScriptLanguage/src/icons/buildTools/grunt/grunt_toolwindow.svg");
        icons.put("gulp_toolwindow.svg", "/extratci/icons/original/plugins/JavaScriptLanguage/src/icons/buildTools/gulp_toolwindow.svg");
        icons.put("npm_13.svg", "/extratci/icons/original/plugins/JavaScriptLanguage/src/icons/buildTools/npm/npm_13.svg");
        icons.put("OpenV8HeapSnapshot_ToolWin.svg", "/extratci/icons/original/plugins/NodeJS/src/com/jetbrains/nodejs/icons/OpenV8HeapSnapshot_ToolWin.svg");
        icons.put("OpenV8ProfilingLog_ToolWin.svg", "/extratci/icons/original/plugins/NodeJS/src/com/jetbrains/nodejs/icons/OpenV8ProfilingLog_ToolWin.svg");
        icons.put("v8_ToolWin.svg", "/extratci/icons/original/plugins/NodeJS/src/com/jetbrains/nodejs/icons/v8_ToolWin.svg");
        icons.put("springToolWindow.svg", "/extratci/icons/original/plugins/spring/spring-api/resources/icons/springToolWindow.svg");
        icons.put("ConcurrencyDiagramToolwindow.svg", "/extratci/icons/original/python/concurrency-visualiser/resources/icons/ConcurrencyDiagramToolwindow.svg");

        // custom icons
        icons.put("OpenTerminal_13x13.svg", "/extratci/icons/custom/OpenTerminal_13x13.svg");
        icons.put("pullRequestsToolWindow.svg", "/extratci/icons/custom/pullRequestsToolWindow.svg");
        icons.put("pythonPackages.svg", "/extratci/icons/custom/pythonPackages.svg");
        icons.put("toolWindowCommit.svg", "/extratci/icons/custom/toolWindowCommit.svg");
        icons.put("toolWindowGradle.svg", "/extratci/icons/custom/toolWindowGradle.svg");
        icons.put("toolWindowProblemsEmpty.svg", "/extratci/icons/custom/problemsEmpty.svg");
        icons.put("problemsEmpty.svg", "/extratci/icons/custom/problemsEmpty.svg");
        icons.put("toolWindowProject.svg", "/extratci/icons/custom/toolWindowProject.svg");
        icons.put("branch.svg", "/extratci/icons/custom/branch.svg");
        icons.put("makefileToolWindow.svg", "/extratci/icons/custom/makefileToolWindow.svg");
        icons.put("intentionBulbGrey.svg", "/extratci/icons/custom/intentionBulb.svg");
        icons.put("menu-saveall.svg", "/extratci/icons/custom/menu-saveall.svg");
        icons.put("toolWindowAnt.svg", "/extratci/icons/custom/toolWindowAnt.svg");
        icons.put("build.svg", "/extratci/icons/custom/build.svg");
        icons.put("refresh.svg", "/extratci/icons/custom/refresh.svg");
        icons.put("reset.svg", "/extratci/icons/custom/reset.svg");
        icons.put("rollback.svg", "/extratci/icons/custom/rollback.svg");
        icons.put("toolWindowServices.svg", "/extratci/icons/custom/toolWindowServices.svg");
        icons.put("featureTrainer.svg", "/extratci/icons/custom/featureTrainer.svg");
        icons.put("featureTrainerToolWindow.svg", "/extratci/icons/custom/featureTrainerToolWindow.svg");
        icons.put("artifactSmall.svg", "/extratci/icons/custom/artifactSmall.svg");
        icons.put("emulator.svg", "/extratci/icons/custom/emulator.svg");
        icons.put("readwrite.svg", "/extratci/icons/custom/readwrite.svg");
        icons.put("readonly.svg", "/extratci/icons/custom/readonly.svg");
        icons.put("locked.svg", "/extratci/icons/custom/locked.svg"); // file badge (bottom-right corner) in editor tabs and Project view
        icons.put("inspection.svg", "/extratci/icons/custom/inspector.svg"); // App Inspection
        icons.put("toolWindowInspection.svg", "/extratci/icons/custom/inspector.svg"); // Inspection Results
        icons.put("add.svg", "/extratci/icons/custom/add.svg");
        icons.put("merge.svg", "/extratci/icons/custom/merge.svg");
        icons.put("android-profiler.svg", "/extratci/icons/custom/profiler.svg");
        icons.put("remove.svg", "/extratci/icons/custom/remove.svg");
        icons.put("removeSlot.svg", "/extratci/icons/custom/removeSlot.svg");
        icons.put("print.svg", "/extratci/icons/custom/print.svg");
        icons.put("toolWindowMessages.svg", "/extratci/icons/custom/toolWindowMessages.svg");
        icons.put("toolWindowTodo.svg", "/extratci/icons/custom/toolWindowTodo.svg");
        icons.put("collapseall.svg", "/extratci/icons/custom/collapseall.svg");
        icons.put("expandall.svg", "/extratci/icons/custom/expandall.svg");
        icons.put("back.svg", "/extratci/icons/custom/back.svg");
        icons.put("redo.svg", "/extratci/icons/custom/redo.svg");
        icons.put("undo.svg", "/extratci/icons/custom/undo.svg");
        icons.put("menu-cut.svg", "/extratci/icons/custom/menu-cut.svg");
        icons.put("toolWindowBookmarks.svg", "/extratci/icons/custom/toolWindowBookmarks.svg");
        icons.put("cwmAccessDotOff.svg", "/extratci/icons/custom/cwmAccessDotOff.svg");
        icons.put("cwmAccessOff.svg", "/extratci/icons/custom/cwmAccessOff.svg");
        icons.put("gradleFile.svg", "/extratci/icons/custom/gradleFile.svg");
        icons.put("kotlin.svg", "/extratci/icons/custom/kotlin.svg");
        icons.put("webServerToolWindow.svg", "/extratci/icons/custom/webServerToolWindow.svg");
        icons.put("connected.svg", "/extratci/icons/custom/connected.svg"); // IDE Settings sync status
        icons.put("addList.svg", "/extratci/icons/custom/addList.svg");
        //icons.put("notifications.svg", "/extratci/icons/custom/notifications.svg");
        //icons.put("notificationsNew.svg", "/extratci/icons/custom/notificationsNew.svg");
        //icons.put("notificationsNewImportant.svg", "/extratci/icons/custom/notificationsNewImportant.svg");
        icons.put("actions/close.svg", "/extratci/icons/custom/actions_close.svg");
        icons.put("actions/closeDarkGrey.svg", "/extratci/icons/custom/actions_closeDarkGrey.svg");
        icons.put("actions/closeHovered.svg", "/extratci/icons/custom/actions_closeHovered.svg");
        icons.put("ide/notification/close.svg", "/extratci/icons/custom/notification_close.svg");
        icons.put("ide/notification/closeHover.svg", "/extratci/icons/custom/notification_closeHover.svg");
        icons.put("addToDictionary.svg", "/extratci/icons/custom/addToDictionary.svg");
        icons.put("scroll_down.svg", "/extratci/icons/custom/scroll_down.svg");
        icons.put("scroll_up.svg", "/extratci/icons/custom/scroll_up.svg");
        icons.put("toggleSoftWrap.svg", "/extratci/icons/custom/toggleSoftWrap.svg");
        icons.put("cherryPick.svg", "/extratci/icons/custom/cherryPick.svg");
        icons.put("delete.svg", "/extratci/icons/custom/delete.svg");
        icons.put("gc.svg", "/extratci/icons/custom/delete.svg");
        icons.put("deleteHovered.svg", "/extratci/icons/custom/deleteHovered.svg");
        icons.put("pin.svg", "/extratci/icons/custom/pin.svg");
        icons.put("pin_tab.svg", "/extratci/icons/custom/pin_tab.svg");
        icons.put("pinned_items_favorites.svg", "/extratci/icons/custom/pinned_items_favorites.svg");
        icons.put("pinTab.svg", "/extratci/icons/custom/pinTab.svg");

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
        String fileName = (new File(path)).getName();
        if (icons == null) {
            loadConfig();
        }
        if (this.icons.containsKey(fileName)) {
            return this.icons.get(fileName);
        }
        if (path.startsWith("/") && path.length() > 2) {
            path = path.substring(1);
        }
        return this.icons.get(path);
    }

    private void loadConfig() {
        Map<String, String> enabledIcons = new HashMap<>(SettingsService.getAllIcons());
        int allIconsSize = enabledIcons.size();
        List<String> disabledIcons = SettingsService.getInstance().getDisabledIcons();
        disabledIcons.forEach(enabledIcons::remove);
        icons = enabledIcons;
        LOG.info("config loaded with success, enabled " + icons.size() + "/" + allIconsSize + " items");
    }
}
