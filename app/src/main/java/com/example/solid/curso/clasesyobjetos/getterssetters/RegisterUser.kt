package com.example.solid.curso.clasesyobjetos.getterssetters

class RegisterUser {
    //clase que hace una sola funcion
    // si se registra o devuelve un null
    fun invoke(user: User): User?{
        return if(user.isValid) user else null
    }

}