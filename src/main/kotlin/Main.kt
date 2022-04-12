fun main(args: Array<String>) {

    val BookOne : Book?= null
    val Booktwo= Book(price = 10, wordCount = 150)

    BookOne?.let{
        buy(it)
    }
    Booktwo.let{
        buy(it)
    }
}
interface Publication {
    val price : Int
    val wordCount : Int
    fun getType (): String
}



fun buy(publication: Publication?) {
    println("The purchase is complete. The purchase amount was ${publication?.price}")
}
class Book(override val price: Int, override val wordCount: Int) : Publication {
    override fun getType(): String =
        when{
            wordCount<=1000 -> "Flash Fiction"
            wordCount<=7500 -> "Short Story"
            else -> "Novel"
        }
}

class Magazine(override val price: Int, override val wordCount: Int) : Publication {
    override fun getType(): String {
        return "Magazine"
    }
}