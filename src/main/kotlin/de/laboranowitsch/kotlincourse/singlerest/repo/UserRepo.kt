package de.laboranowitsch.kotlincourse.singlerest.repo

import de.laboranowitsch.kotlincourse.singlerest.entity.User
import org.springframework.data.repository.CrudRepository

/**
 * User repository.
 */
interface UserRepo: CrudRepository<User, Long> {
}