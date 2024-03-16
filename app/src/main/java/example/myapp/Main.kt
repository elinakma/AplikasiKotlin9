package example.myapp

fun buildAquarium() {
    val myAquarium = Aquarium()
    myAquarium.printSize()
    myAquarium.height = 60
    myAquarium.printSize()
}
fun buildMyAquarium() {
    val aquarium1 = myAquarium()
    aquarium1.printSize()
    val aquarium2 = myAquarium(width = 25)
    aquarium2.printSize()
    val aquarium3 = myAquarium(height = 35, length = 110)
    aquarium3.printSize()
    val aquarium4 = myAquarium(width = 25, height = 35, length = 110)
    aquarium4.printSize()
    val aquarium6 = myAquarium(numberOfFish = 29)
    aquarium6.printSize()
    println("Volume: ${aquarium6.width * aquarium6.length * aquarium6.height / 1000} liters")
    val aquarium7 = myAquarium(numberOfFish = 29)
    aquarium7.printSize()
    aquarium7.volumes = 70
    aquarium7.printSize()
}
fun buildAquarium2() {
    println("======================================")
    val aquarium8 = Aquarium2(length = 25, width = 25, height = 40)
    aquarium8.printSizes()
    val myTower = TowerTank(diameter = 25, height = 40)
    myTower.printSizes()
}

fun makeFish() {
    println("======================================")
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color}")
    println("Plecostomus: ${pleco.color}")
}

fun makeFish2() {
    println("======================================")
    val shark = Shark()
    val pleco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun makeFish3() {
    println("======================================")
    val shark = Sharks()
    val pleco = Plecostomuss()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${pleco.color}")
    pleco.eat()
}

fun main() {
    buildAquarium()
//    println("=".repeat(50))
    println("~".repeat(50))
    buildMyAquarium()
    println("~".repeat(50))
    buildAquarium2()
    println("~".repeat(50))
    makeFish()
    println("~".repeat(50))
    makeFish2()
    println("~".repeat(50))
    makeFish3()
}