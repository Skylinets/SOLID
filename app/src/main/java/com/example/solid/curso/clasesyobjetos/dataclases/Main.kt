package com.example.solid.curso.clasesyobjetos.dataclases

fun main() {

    val firstSong = Song(
        "SOLO",
        "Jennie"
    )

    val secondSong = Song(
        "SOLO",
        "Jennie"
    )

    println(" are clases equals?: ${firstSong.equals(secondSong)}")

    println()

    val dataClassSong = Song(
        "SOLO",
        "Jennie"
    )

    val dataClassSong2 = Song(
        "SOLO",
        "Jennie"
    )

    println(" are clases equals?: ${dataClassSong == dataClassSong2}")
}