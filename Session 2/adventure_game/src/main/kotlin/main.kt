val answers = listOf("B")

fun challengeOne(){

    println("")
    println("You call your friends, they answer but you don't understand them, you do however hear a bell in the distance.")
    println("Where are your friends?")
    println("A) Arrested by the police")
    println("B) At a nearby clocktower")
    println("C) Behind you, the bell was a ringtone")
    println("D) They're in a local Delhaize")

    val answer = readLine()

    if(answer == answers[0]){

    }else {
        gameOver()
    }
}

fun gameOver(){
    println("You have fallen asleep in the gutter and are found by the police the next day.")

}

fun main() {
    println("*BUUUUUUUUURP* Maybe that 7th beer was too much")
    println("Anyway, where are your friends? You remember not coming to the bar alone.")
    challengeOne()
}