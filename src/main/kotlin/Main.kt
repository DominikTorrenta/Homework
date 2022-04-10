interface Publication {
    val price : Int
    val wordCount : Int
    fun getType (): String
}

fun main(args: Array<String>) {
    buy(publication = Publication)

    abstract class Book : Publication {
        val page1: String? = null
        val page2: String? = "Hi"
        override fun getType(): String {
            return if (wordCount<=1000) {
                ("Flash Fiction")
            } else{if (wordCount<=7500) {
                ("Short Story")
            } else ("Novel")
            }
        }
    }

    abstract class Magazine: Publication {
        override fun getType(): String {
            return "Magazine"
        }
    }
}

fun buy(publication: String) {
    println("The purchase is complete")
}