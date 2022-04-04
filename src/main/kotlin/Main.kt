fun main(args: Array<String>) {

    data class User(var name: String, val surName: String, var age: Int)
    var y = 0
    var count = 10
    var x = 0

    var peoples = mutableListOf<User>(
        User("namePeople", "surnamePeople", 10),
        User("namePeople", "surnamePeople", 10),
        User("namePeople", "surnamePeople", 10),
        User("namePeople", "surnamePeople", 10)
    )

    while(y!=1) {
        println("Здравствуйте, чтобы пройти в торговый центр вам нужно указать свои контактные данные:")

        print("Имя:")
        val namePeople = readLine().toString()

        print("Фамилия:")
        val surnamePeople = readLine().toString()

        print("Возраст:")
        var agePeople = readLine()!!.toInt()

        println("$namePeople $surnamePeople: вы можете пройти пройти в торговый центр")

        val people = User(namePeople, surnamePeople, agePeople)

        peoples[x]=people

        println("0 - продолжить работу")
        println("1 - завершить работу")

        y = readLine()!!.toInt()
        x++
    }
    peoples.sortBy { it.surName }

    peoples.forEach{
        println("name: ${it.name}, surName: ${it.surName}, Age: ${it.age}")
    }
}