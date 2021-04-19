package lermitage.intellij.exratci;

import com.intellij.openapi.diagnostic.Logger;
import com.intellij.openapi.util.IconLoader;
import com.intellij.openapi.util.IconPathPatcher;
import org.apache.groovy.util.Maps;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class ExtraToolWindowIconsPatcher extends IconPathPatcher {

    private static final Logger LOGGER = Logger.getInstance(ExtraToolWindowIconsPatcher.class);

    private final Map<String, String> icons = new HashMap<>();

    public ExtraToolWindowIconsPatcher() {
        super();
        IconLoader.installPathPatcher(this);

        // icons copied from ToolWindow Colorful Icons plugin
        icons.putAll(Maps.of("CMakeToolWindow.svg", "/extratci/icons/original/CIDR/clion/resources/icons/CMakeToolWindow.svg",
            "toolWindowProject_AS.svg", "/extratci/icons/original/community/android/adt-branding/src/artwork/toolWindowProject_AS.svg",
            "androidToolWindow.svg", "/extratci/icons/original/community/android/artwork/resources/icons/androidToolWindow.svg",
            "toolWindowWarning.svg", "/extratci/icons/original/community/android/artwork/resources/icons/toolwindows/toolWindowWarning.svg",
            "toolWindowBuild.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowBuild.svg",
            "toolWindowChanges.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowChanges.svg",
            "toolWindowDebugger.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowDebugger.svg",
            "toolWindowFavorites.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowFavorites.svg",
            "toolWindowProfiler.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowProfiler.svg",
            "toolWindowRun.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowRun.svg",
            "toolWindowStructure.svg", "/extratci/icons/original/community/platform/icons/src/toolwindows/toolWindowStructure.svg",
            "serversToolWindow.svg", "/extratci/icons/original/community/platform/remote-servers/impl/resources/icons/serversToolWindow.svg",
            "griffonToolWindow.svg", "/extratci/icons/original/community/plugins/groovy/groovy-psi/resources/icons/griffon/griffonToolWindow.svg",
            "toolWindowMaven.svg", "/extratci/icons/original/community/plugins/maven/src/main/resources/images/toolWindowMaven.svg",
            "pythonConsoleToolWindow.svg", "/extratci/icons/original/community/python/resources/icons/com/jetbrains/python/pythonConsoleToolWindow.svg",
            "dart_13.svg", "/extratci/icons/original/contrib/Dart/resources/icons/dart_13.svg",
            "pubServeToolWindow.svg", "/extratci/icons/original/contrib/Dart/resources/icons/pubServeToolWindow.svg",
            "toolWindowDatabase.svg", "/extratci/icons/original/dbe/database/api/resources/icons/toolWindowDatabase.svg",
            "toolwindowDatabaseChanges.svg", "/extratci/icons/original/dbe/database/api/resources/icons/toolwindowDatabaseChanges.svg",
            "toolWindowSQLGenerator.svg", "/extratci/icons/original/dbe/database/api/resources/icons/toolWindowSQLGenerator.svg",
            "hibConsoleToolWindow.svg", "/extratci/icons/original/plugins/frameworks/hibernate/hibernate-core/src/resources/icons/hibConsoleToolWindow.svg",
            "batchToolWindow.svg", "/extratci/icons/original/plugins/javaee/batch/batch-core/src/resources/icons/batchToolWindow.svg",
            "cdiToolWindow.svg", "/extratci/icons/original/plugins/javaee/cdi/cdi-core/src/resources/icons/cdiToolWindow.svg",
            "ejbToolWindow.svg", "/extratci/icons/original/plugins/javaee/core/javaee-impl/source/resources/icons/ejbToolWindow.svg",
            "javaeeToolWindow.svg", "/extratci/icons/original/plugins/javaee/core/javaee-impl/source/resources/icons/javaeeToolWindow.svg",
            "jpaToolWindow.svg", "/extratci/icons/original/plugins/javaee/core/javaee-impl/source/resources/icons/jpaToolWindow.svg",
            "jsfToolWindow.svg", "/extratci/icons/original/plugins/javaee/jsf/jsf-core/src/resources/icons/jsfToolWindow.svg",
            "webSocketFrameworkToolWindow.svg", "/extratci/icons/original/plugins/javaee/web-socket/websocket/src/resources/icons/webSocketFrameworkToolWindow.svg",
            "grunt_toolwindow.svg", "/extratci/icons/original/plugins/JavaScriptLanguage/src/icons/buildTools/grunt/grunt_toolwindow.svg",
            "gulp_toolwindow.svg", "/extratci/icons/original/plugins/JavaScriptLanguage/src/icons/buildTools/gulp_toolwindow.svg",
            "npm_13.svg", "/extratci/icons/original/plugins/JavaScriptLanguage/src/icons/buildTools/npm/npm_13.svg",
            "OpenV8HeapSnapshot_ToolWin.svg", "/extratci/icons/original/plugins/NodeJS/src/com/jetbrains/nodejs/icons/OpenV8HeapSnapshot_ToolWin.svg",
            "OpenV8ProfilingLog_ToolWin.svg", "/extratci/icons/original/plugins/NodeJS/src/com/jetbrains/nodejs/icons/OpenV8ProfilingLog_ToolWin.svg",
            "v8_ToolWin.svg", "/extratci/icons/original/plugins/NodeJS/src/com/jetbrains/nodejs/icons/v8_ToolWin.svg",
            "springToolWindow.svg", "/extratci/icons/original/plugins/spring/spring-api/resources/icons/springToolWindow.svg",
            "ConcurrencyDiagramToolwindow.svg", "/extratci/icons/original/python/concurrency-visualiser/resources/icons/ConcurrencyDiagramToolwindow.svg"));

        // custom icons
        icons.put("OpenTerminal_13x13.svg", "/extratci/icons/custom/OpenTerminal_13x13.svg");
        icons.put("toolWindowGradle.svg", "/extratci/icons/custom/toolWindowGradle.svg");
        icons.put("toolWindowProblemsEmpty.svg", "/extratci/icons/custom/problemsEmpty.svg");
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
