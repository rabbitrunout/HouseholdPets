package org.example

fun main(){
    println("Welcome to the HouseholdPets Application")

    val myCat = Cat(name = "Garfield", age = 8)

    myCat.info()
    myCat.makeSound()
    myCat.scratch()

    println()

    val myDog = Dog(name = "Odie", age = 8)

    myDog.info()
    myDog.makeSound()
    myDog.fetch()
}