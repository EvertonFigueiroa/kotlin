    fun main () {
      //  forever()
        var sum = 1
        do {
            println(sum)
            sum += 1
        } while (sum < 100)
    }

    fun forever() : Nothing {
        while (true) {
            Thread.sleep(1000)
            println("oi")
        }
    }
    
    ///////
    
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



