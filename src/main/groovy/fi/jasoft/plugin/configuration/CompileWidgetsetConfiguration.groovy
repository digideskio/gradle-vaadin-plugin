package fi.jasoft.plugin.configuration

import fi.jasoft.plugin.MessageLogger

/**
 * Created by john on 3/7/16.
 */
class CompileWidgetsetConfiguration {

    /**
     * Compilation style
     */
    String style = "OBF"

    /**
     * Should the compilation result be optimized
     */
    int optimize = 0

    /**
     * Should logging be enabled
     */
    boolean logging = true

    /**
     * The log level. Possible levels NONE,DEBUG,TRACE,INFO
     */
    String logLevel = "INFO"

    /**
     * Amount of local workers used when compiling. By default the amount of processors.
     */
    int localWorkers = Runtime.getRuntime().availableProcessors()

    /**
     * Should draft compile be used
     */
    boolean draftCompile = true

    /**
     * Should strict compiling be used
     */
    boolean strict = true

    /**
     * What user agents (browsers should be used. By defining null all user agents are used.
     */
    String userAgent = null

    /**
     * Extra jvm arguments passed the JVM running the compiler
     */
    String[] jvmArgs = null

    /**
     * Extra arguments passed to the compiler
     */
    String[] extraArgs = null

    /**
     * Source paths where the compiler will look for source files
     */
    String[] sourcePaths = ['client', 'shared']

    /**
     * Should the compiler permutations be collapsed to save time
     */
    boolean collapsePermutations = true

    /**
     * Extra module inherits
     */
    String[] extraInherits

    /**
     * Should GWT be placed first in the classpath when compiling the widgetset.
     */
    boolean gwtSdkFirstInClasspath = true

    /**
     * (Optional) root directory, for generated files; default is the web-app dir from the WAR plugin
     */
    String outputDirectory = null
}
