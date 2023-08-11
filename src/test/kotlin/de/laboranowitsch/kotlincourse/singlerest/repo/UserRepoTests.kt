package de.laboranowitsch.kotlincourse.singlerest.repo

import de.laboranowitsch.kotlincourse.singlerest.logutil.LoggingAware
import de.laboranowitsch.kotlincourse.singlerest.logutil.logger
import de.laboranowitsch.kotlincourse.singlerest.testutils.DbContainerInitializer
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.context.ContextConfiguration
import org.testcontainers.junit.jupiter.Testcontainers
import org.assertj.core.api.Assertions.assertThat

/**
 * Test class for UserRepo.
 *
 */
@SpringBootTest
@Testcontainers
@ActiveProfiles("int-test")
@ContextConfiguration(initializers = [DbContainerInitializer::class])
class UserRepoTests @Autowired constructor(
        val userRepo: UserRepo
): LoggingAware {

    @Test
    fun `Assert that the context has been wired properly`() {
        logger().info("Assert that the context has been wired properly")
        assertThat(userRepo).isNotNull
    }

    @Test
    fun `Assert that we can create a User and read it`() {
        logger().info("Assert that we can read user")
        val testUser = userRepo.findAll()
        assertThat(testUser.count()).isEqualTo(1)
        with(testUser.first()) {
            assertThat(this.id).isEqualTo(1)
            assertThat(this.firstName).isEqualTo("John")
            assertThat(this.lastName).isEqualTo("Doe")
            assertThat(this.email).isEqualTo("john@doe.com")
            assertThat(this.password).isEqualTo("123456")
        }
    }
}
