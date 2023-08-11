package de.laboranowitsch.kotlincourse.singlerest.config

/**
 * Run profiles for the application.
 * int-test: for integration tests
 * local-dev: for local development
 * prod: for production
 */
class RunProfile {
    companion object {
        const val INT_TEST = "int-test"
        const val LOCAL_DEV = "local-dev"
        const val PROD = "prod"
    }
}