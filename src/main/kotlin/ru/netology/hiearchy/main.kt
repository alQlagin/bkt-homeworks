package ru.netology.hiearchy

import ru.netology.hiearchy.view.ViewGroup
import ru.netology.hiearchy.widget.Button
import ru.netology.hiearchy.widget.TextView

fun main() {
    // TextView
    val text = TextView("Some Text")
    text.click() // вызывается метод из `View`
    println(text.text) // Some Text
    text.text = "Something bad happened"
    println(text.text) // Something bad happened

    // Button
    val button = Button("Click me")
    button.click() // вызывается метод из `View`
    println(button.text) // Click me
    button.text = "Don't click me"
    println(button.text) // Don't click me

    // ViewGroup
    val main = ViewGroup()
    val title = TextView("Main Screen")
    main.addView(title)

    val content = ViewGroup()
    val readMore = Button("Read more")
    content.addView(readMore)

    main.view.click()
    content.view.click()


}