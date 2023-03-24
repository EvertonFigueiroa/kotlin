import kotlin.math.*

4 % 2
5 - 2
5 * 3
6 / 2

3.0 / 2.0

"%.2f".format(29.0 / 10.0)

// 8 4 2 1
// 1 0 0 0

// 16 8 4 2 1
//  1 0 0 0 0
//  0 0 1 0 0

8 shl 1
8 shr 1


sqrt(2.0)
sin(90 * PI)
max(2, 3)
min(5, 7)

val x = 5
val pi: Float = 3.14159f

var y = 10
y = 1
println(y)
y = 1_000_000
println(y)

y += 1
println(y)

'c'.toInt()
'o'.toInt()
'd'.toInt()
'e'.toInt()

val c = 99
c.toChar()

val text: String = "Code"

"Olá ${c.toChar()} Kotlin"

val texts = """"
    Olá Kotlin
    em multiplas linhas
""".trimMargin()

println(texts)

val coordinates = Pair(2.3, 3)
println(coordinates)

coordinates.first
coordinates.second

val coord = 2 to 3
coord

val (x1, _) = coord

val coord3D = Triple(1, 2 ,3)


// Any, Unit, Nothing

// Any aceita qualquer coisa
val numberAny: Any = 10
val textAny: Any = "10"

// Unit
fun add (): Unit {
    val result = 2 + 2
    println(result)
}

fun add1 (x: Int, y: Int) : Int {
    val result = x + y
    return result
}
add1(2, 2)

// Nothing

// loop infinito que não da retorno

(1 == 2)
(1 != 2)
(1 <= 2)
(1 >= 2)
(1 > 2)
(1 < 2)

val and = true && true
val or = true || false

"barco" > "casa"

val a = 10
if (a > 5) {
    println("maior")
} else {
    println("menor")
}

val range = 0..5
println(range)

val descre = 5 downTo 0
val tiraUlt = 0 until 5

for (x in range) {
    println(x)
}

range.forEach {
    println(it)
}

val user = "Samsung"
when(user) {
    "Samsung", "Motorola" -> println("Android")
    else -> println("iOS")
}

val number = 3
val numberText = when(number) {
    0 -> "zero"
    1 -> "um"
    2 -> "dois"
    else -> {
        println("desconhecido")
        "desconhecido"
    }
}

println(numberText)

val hour = 13
val time = when(hour) {
    in 6..11 -> "Manhã"
    in 12..17 -> "Tarde"
    in 18..24 -> "Noite"
    else -> "Não definido"
}

println(time)

fun soma(x: Int, y: Int) {
    println(x + y)
}

soma(5, 6)

fun discount(x: Int, percent: Int = 10) {
    println(x - (x * percent / 100))
}

discount(100)

fun multi(x: Int, y: Int) : Int {
    return x * y
}

//fun multx (x: Int, y: Int) : Pair<Int, Int> {
//    return Pair(x * y, x / y)
//}
//println(multx(5, 2))

fun multx (x: Int, y: Int) = Pair(x * y, x / y)

println(multx(5,2))

