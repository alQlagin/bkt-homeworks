package ru.netology.profile

import ru.netology.profile.model.Profile

fun main() {
    val profile = Profile(
        1,
        "alQlagin",
        "Alex",
        "Kulagin",
        "Studying",
        "https://avatars3.githubusercontent.com/u/3256488?s=460&v=4"
    );

    println(profile.fullName);
    profile.firstName= "Al";
    println(profile.fullName);
}