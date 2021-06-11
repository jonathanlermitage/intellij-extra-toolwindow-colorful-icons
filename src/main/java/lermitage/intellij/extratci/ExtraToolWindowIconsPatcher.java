package lermitage.intellij.extratci;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.util.IconPathPatcher;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ExtraToolWindowIconsPatcher extends IconPathPatcher {

    @SuppressWarnings("unused")
    private static final Logger LOGGER = Logger.getInstance(ExtraToolWindowIconsPatcher.class);

    private final Map<String, String> icons = new HashMap<>();

    public ExtraToolWindowIconsPatcher() {
        super();
        IconLoader.installPathPatcher(this);

        // icons copied from ToolWindow Colorful Icons plugin
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
    }

    @Override
    public @Nullable ClassLoader getContextClassLoader(@NotNull String path, @Nullable ClassLoader originalClassLoader) {
        return ExtraToolWindowIconsPatcher.class.getClassLoader();
    }

    @Override
    public @Nullable String patchPath(@NotNull String path, @Nullable ClassLoader classLoader) {
        String iconOriginalPath = (new File(path)).getName();
        //LOGGER.warn("patch " + iconOriginalPath);
        return this.icons.get(iconOriginalPath);
    }
}
