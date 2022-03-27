 fun main(args: Array<String>) {


        print("Введите имя: ")
        var firstname = readLine()!!

        print("Введите фамилию: ")
        val secondname = readLine()!!



        print("Введите возраст: ")
        var age = readLine()!!.toInt()


        if (age < 18 ) {

            println("Вход воспрещается")
            if (age <= 14)
            {
                println("Вызов полиции и сотавление протокола на имя: ${firstname} ${secondname}")
            }

        }
        else {
            println("Вход разрешается")
        }

    }
