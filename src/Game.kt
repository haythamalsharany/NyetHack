fun main() {
    var healthPoint: Int = 100
    val playerName: String = "Madrigal"
    var isBlessed: Boolean = true

    if (healthPoint == 100) {
        println(playerName + " is an excelant  condition!")
    } else if (healthPoint in 90..99)
        println(playerName + " has a few scraches  ")
    else if (healthPoint in 75..89) {
        if (isBlessed)
            println(playerName + " has some minor wounds but is healing quite ! ")
        else
            println(playerName + " has some minor wounds  ")
    } else if (healthPoint in 15..74)
        println(playerName + " looks prety hurt  ")
    else if (healthPoint in 0..14)
        println(playerName + " is in awful condition! ")
    else
        println("some thing wrong  ")


    println(playerName + "&" + healthPoint)

}