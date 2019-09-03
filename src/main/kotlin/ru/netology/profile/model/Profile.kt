package ru.netology.profile.model

class Profile constructor(
    val id: Long,
    var login: String,
    var firstName: String,
    var lastName: String,
    var status: String,
    var avatar: String
) {
    val fullName: String
        get() = "${this.firstName} ${this.lastName}"
}