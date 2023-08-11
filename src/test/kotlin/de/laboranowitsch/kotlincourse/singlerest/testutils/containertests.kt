package de.laboranowitsch.kotlincourse.singlerest.testutils

import org.springframework.boot.test.util.TestPropertyValues
import org.springframework.context.ApplicationContextInitializer
import org.springframework.context.ConfigurableApplicationContext
import org.testcontainers.containers.PostgreSQLContainer

/**
 * Test container initializer.
 * This class is used to initialize the test container
 * for testing purposes.
 */
class DbContainerInitializer : ApplicationContextInitializer<ConfigurableApplicationContext> {

    override fun initialize(applicationContext: ConfigurableApplicationContext) {
            postgres.start()
            TestPropertyValues.of(
                    "spring.datasource.url=${postgres.jdbcUrl}",
                    "spring.datasource.username=${postgres.username}",
                    "spring.datasource.password=${postgres.password}"
            ).applyTo(applicationContext.environment)
    }

    companion object {
        // Lazy because we only want it to be initialized when accessed
        private val postgres: KPostgreSQLContainer by lazy {
            KPostgreSQLContainer("postgres:14-alpine")
                    .withDatabaseName("databasename")
                    .withUsername("username")
                    .withPassword("password")
        }
    }
}


// Hack needed because testcontainers use of generics confuses Kotlin
class KPostgreSQLContainer(imageName: String) : PostgreSQLContainer<KPostgreSQLContainer>(imageName)