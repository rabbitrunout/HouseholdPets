package org.example

class Duck(name: String, age: Int) : Animal(name, age) {

    override fun makeSound() {
        println("$name quacks.")
    }

    fun swim() {
        println("$name is swimming!")
    }

    fun fly() {
        println("$name is flying!")
    }
}
