class Duolingo(val roundSize: Int = 5, val defaultLanguage: String = "Limburgs") {


    private val words = mutableSetOf<Word>(
        LimburgsWord("Hond", "Hoooooooooond"),
        LimburgsWord("Schoenen", "Sjoöon"),
        LimburgsWord("Fruitgebak", "Vlaai"),
        LimburgsWord("Water", "Wooater"),
        LimburgsWord("Fruitwater", "Jenever"),
        LimburgsWord("Klaar", "Gereit"),
        LimburgsWord("Melk", "Mellek"),
        LimburgsWord("Glijden", "Roetsjen"),
        LimburgsWord("Zagen", "Zeivere"),
        LimburgsWord("Mok", "Zjat"),
        EnglishWord("Hond", "Dog"),
        EnglishWord("Schoenen", "Shoes"),
        EnglishWord("Fruitgebak", "Fruit cake"),
        EnglishWord("Water", "Water"),
        EnglishWord("Fruitwater", "Fruitwater"),
        EnglishWord("Klaar", "Done"),
        EnglishWord("Melk", "Milk"),
        EnglishWord("Glijden", "Slide"),
        EnglishWord("Zagen", "Nag"),
        EnglishWord("Mok", "Mug")
    )

    public fun play(){
        val chosenWords = words.filter{it.language == defaultLanguage}.shuffled().take(roundSize).toMutableSet();
        var iter = 0

        chosenWords.map{
            println("")
            print("Vertaal ")
            print(it.original)
            print(" naar het ")
            print(it.language)
            print(": ")
            val answer = readLine()
            if(answer == it.translated){
                words.remove(Word(it.original, it.translated, it.language));
            }
            else {
                println()
                print("De juiste vertaling was ")
                println(it.translated)
            }
            println()
            print("Nog ")
            print(chosenWords.size - iter - 1)
            println(" woorden te gaan")
            iter++
        }
    }
}