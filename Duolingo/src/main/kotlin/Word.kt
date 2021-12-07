import java.lang.Exception

open class Word(open val original: String, open val translated: String, open val language: String, open var difficulty: Int) {

    // Getters

    // Setters
    fun setDifficulty(feedback: String){
        if(feedback == "right"){
            this.difficulty = this.difficulty - 1
            if (this.difficulty < 1){
                this.difficulty = 1
            }
        }
        if(feedback == "wrong"){
            this.difficulty = this.difficulty + 2
        }
        if(feedback != "right" && feedback != "wrong"){
            throw Exception("Feedback not compatible")
        }
    }
}