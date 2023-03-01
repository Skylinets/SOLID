package com.example.solid.curso.clasesyobjetos.clasesyobjetos

fun main() {

    //Instanciando Objetos

    val firstSong = Song (
        title = "Lose yourself",
        artist = "Eminem"
            )
    val secondSong = Song(
        title = "Do i wanna know",
        artist = "Artic Monkey"
    )
    val thirdSong = Song(
        title = "Ayo Technologies",
        artist = "50 Cent"
    )

    //Usando sus componentes: Funciones

    secondSong.play()
    secondSong.stop()
    thirdSong.stop()

}