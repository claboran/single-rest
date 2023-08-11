package de.laboranowitsch.kotlincourse.singlerest.logutil

import org.slf4j.Logger
import org.slf4j.LoggerFactory.getLogger

/**
 * Logging aware interface.
 * For logging purposes implement this interface and use the logger() function.
 */
interface LoggingAware

fun <T : LoggingAware> T.logger(): Logger = getLogger(javaClass)