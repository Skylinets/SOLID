package com.example.solid.curso.clasesyobjetos.getterssetters

import java.time.LocalDate
import java.time.Month

fun main() {

    //User
    //- email
    //- password
    //- birthdate
    //- gender
    //register(user)
    val user = User("JOHN.HANSEN.M@GMAIL.COM", "abc123")
    val userRegistered: User? = RegisterUser().invoke(user)

    if(userRegistered != null){
        println("User Registered: ${userRegistered.email}")
        println("User Registered: ${userRegistered.password}")
    } else{
        println("User Not Registered")
    }

    println()
    val user2 = User(
        email = "user2@gmail.com",
        password = "123abc",
        birthdate = LocalDate.of(2022, Month.AUGUST, 11),
        gender = 'M'
    )
    if(userRegistered != null){
        println("User Registered: ${userRegistered.email}")
        println("User Registered: ${userRegistered.password}")
        println("User Registered: ${userRegistered.birthdate}")
        println("User Registered: ${userRegistered.password}")
    } else{
        println("User Not Registered")
    }

}