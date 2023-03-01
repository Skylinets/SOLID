package com.example.solid.curso.clasesyobjetos.clasesyobjetos

class Song (
    //Atributos
    val title: String,
    val artist: String
        ){

    private val artistUpper = artist.uppercase()

    init {
        println("Song $title created")
    }


    //Funcionalidades
    fun play(){
        println()
        println("Playing $title - $artistUpper")
    }

    fun stop(){
        println("Stopping $title - $artistUpper")
    }

}


