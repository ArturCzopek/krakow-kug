package pl.simplecoding.krakowkug

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

/**
 * @Author Artur Czopek
 * @Link https://simplecoding.pl/krakow-jug
 */

@Entity
@Table(name = "Authorities")
data class Authority(
        @Id @Column(name = "authority_id") var authorityId: Long = 0,
        @Column(name = "username") var name: String = "Name",
        @Column(name = "authority") var authority: String = "Authority"
)
