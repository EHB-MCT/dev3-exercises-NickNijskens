class Duolingo {
    private var wordDeck = WordDeck()

    private var words = mutableSetOf<Word>()

    constructor(difficulty: String, language: String){
        if(difficulty == "easy"){
            words = wordDeck.filterByLanguage(language).filter{it.difficulty < 2}.toMutableSet()
        }
        if(difficulty == "difficult"){
            words = wordDeck.filterByLanguage(language).filter{it.difficulty >= 2}.toMutableSet()
        }
        if(difficulty != "easy" && difficulty != "difficult"){
            throw Exception("Please provide a suitable difficulty")
        }
    }
    fun play(){
        val chosenWords = words.shuffled().take(6).toMutableSet()
        var iter = 0
        var lives = 2

        chosenWords.forEach(){
            if(lives > 0){
                println("")
                print("Vertaal ")
                print(it.original)
                print(" naar het ")
                print(it.language)
                print(": ")
                val answer = readLine()
                val translation = it.translated
                if(answer == it.translated){
                    wordDeck.words.find(){it.translated == translation}?.setDifficulty("right")
                    chosenWords.remove(Word(it.original, it.translated, it.language, it.difficulty))
                }
                else {
                    println()
                    wordDeck.words.find(){it.translated == translation}?.setDifficulty("wrong")
                    print("De juiste vertaling was ")
                    println(it.translated)
                    lives--

                }
                println()
                print("Nog ")
                print(chosenWords.size - iter - 1)
                println(" woorden te gaan")
                iter++
            }

        }

    }

}