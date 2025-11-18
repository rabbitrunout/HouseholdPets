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

    println()

    val myDuck = Duck(name = "Donald", age = 4)

    myDuck.info()
    myDuck.makeSound()
    myDuck.fly()
    myDuck.swim()
}