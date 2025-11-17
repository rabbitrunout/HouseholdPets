package org.example

class Dog (name: String, age: Int) : Animal(name,age){
    override fun makeSound(){
        println("$name barks.")
    }

    fun fetch(){
        println("$name is fetching the ball!")
    }
}