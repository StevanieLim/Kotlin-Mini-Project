package com.example.mylearningapp

//can access property but cannot access parameter below is property, parameter : name : String
//Use Case of Val and Var to let user update the data or not
class Dog(val name:String, val breed: String, var age : Int = 0) {

    init{
        bark(name)
    }

    fun bark(name:String){
        println("$name : woof woof")
    }
}