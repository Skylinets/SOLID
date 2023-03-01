package com.example.solid.curso.clasesyobjetos.constructores

import java.time.LocalDateTime
import java.time.Month

fun main() {

val post = Post(
    name = "Tutorial de Kotlin",
    author = "Anahí Salgado",
    date = LocalDateTime.now()
)
    println(post.publish())

    val postKotlinClasses = Post(
        name = "Clases de Kotlin",
        author = "Anahi Salgado",
        date = LocalDateTime.now(),
        content = "Lorem Impsum Dolor Set",
        category = "Kotlin"
    )

    println(postKotlinClasses.publish())
}