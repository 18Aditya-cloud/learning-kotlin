fun main() {
    val names = arrayOf("adi", "ram", "avi", "hey")
    val num = arrayOf(1, 2, 3, "name", 'a')

    for (name in names)
        println("name stores in names array ${name}")

    for (n in num)
//        println("differet type of elements in array ${n}")
        println(n)
}