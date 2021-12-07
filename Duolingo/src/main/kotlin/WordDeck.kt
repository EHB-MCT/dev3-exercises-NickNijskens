class WordDeck {
    var words: MutableSet<Word> = mutableSetOf(LimburgsWord("Hond", "Hoooooooooond"),
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
        EnglishWord("Mok", "Mug"))

    fun filterByLanguage(language: String) : MutableSet<Word>{
        return words.filter{it.language == language}.toMutableSet()
    }

    fun filterByDifficulty(difficulty: Int) : MutableSet<Word>{
        return words.filter{it.difficulty == difficulty}.toMutableSet()
    }

    fun reset() : MutableSet<Word>{
        return words.filter{true}.toMutableSet()
    }
}