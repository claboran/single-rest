package de.laboranowitsch.kotlincourse.singlerest.entity

import jakarta.persistence.*

/**
 * User entity.
 */
@Entity
@Table(name = "user_tbl")
data class User(
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long? = null,
    @Column(name = "first_name")
    val firstName: String,
    @Column(name = "last_name")
    val lastName: String,
    @Column(name = "email")
    val email: String,
    @Column(name = "password")
    val password: String
) {
    override fun toString(): String {
        return "User(id=$id, firstName='$firstName', lastName='$lastName', email='$email', password='$password')"
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        return id == other.id
    }

    override fun hashCode(): Int {
        return id?.hashCode() ?: 0
    }

}
