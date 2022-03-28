fun main(args: Array<String>) {

    var count = 5
    var x = 0

    val nameArray = arrayOfNulls<String>(count)
    val surnameArray = arrayOfNulls<String>(count)
    val ageArray = arrayOfNulls<String>(count)

    while(x<ageArray.size){
        println ("Добро пожаловатьв наш торгово развлекательный центр, чтобы пройти в главный зал вам нужно указать свои контактные данные:")

        print("Имя:")
        val name = readLine().toString()

        print("Фамилия:")
        val surname = readLine().toString()

        print ("Возраст:")
        var age = readLine()!!.toInt()

        if (age>=18) {
            InputArray(nameArray,x, name, surnameArray, surname, ageArray, age)
            println("$name $surname можете пройти в торговый центр")
            x=x+1
        }else{ if(age<14){
            println("$name $surname вы должны пройти с полицией")
        } else println("$name $surname мы не можем впустить вас")

        }
    }

    OutputArray (nameArray, surnameArray, ageArray)
    println("Это были данные первых пяти совершеннолетних посетителях")
}

fun InputArray(nameArray: Array<String?>, x: Int, name: String, surnameArray: Array<String?>, surname: String, ageArray: Array<String?>, age: Int){
    nameArray[x]= "$name"
    surnameArray [x] ="$surname"
    ageArray[x]="$age"
}

fun OutputArray(nameArray: Array<String?>, surnameArray: Array<String?>, ageArray: Array<String?>){
    val count = 5
    var y =0

    while(y<count){
        print(nameArray[y])
        print(" ")
        print(surnameArray [y])
        print(" возраст:")
        println(ageArray[y])
        y++
    }
}