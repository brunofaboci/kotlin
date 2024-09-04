fun exercicios() {
//    flowFor()
    flowWhile()
}

fun flowFor() {
    for (i in 1..50) {
        print("$i ")
    }

    println()

    for (i in 50 downTo 1) {
        print("$i ")
    }

    println()

    for (i in 1..50) {
        if(i % 5 != 0) {
            print("$i ")
        }
    }

    println()

    var soma = 0
    for (i in 1..500) {
        soma += i
    }
    println(soma)

    println()

    print("enter a number: ")
    val input: String = readlnOrNull().toString()
    val num: Int = input.toInt()

    for (i in 1..num) {
        for (j in 1..i) {
            print("#")
        }
        println()
    }
}

fun flowWhile() {
    val volume = 2000
    var nivel = 0
    var qtd = 0

    while (nivel < volume) {
        val restante = volume - nivel
        if (restante >= 7) {
            nivel += 7
            qtd++
        } else {
            break
        }
    }

    println("$qtd baloes")

    var num = 0
    while(num < 50) {
        when {
            num % 3 == 0 && num % 5 == 0 -> print("FizzBuzz ")
            num % 3 == 0 -> print("Buzz ")
            num % 5 == 0 -> print("Fizz ")
        }
        num++
    }

    println()

    println("Digite algo: ")
    val text = readlnOrNull().toString()
    var inverse: String = ""

    for (i in text.length - 1 downTo 0){
        inverse += text[i]
    }

    println(text)
    println(inverse)
    print("Digite algo: ")
    val text2 = readlnOrNull().toString().lowercase()
    var numOfX = 0
    var numOfO = 0

    for (char in text2) {
        when (char) {
            'x' -> numOfX++
            'o' -> numOfO++
        }
    }

    if (numOfX > 0 && numOfO > 0 && numOfX == numOfO) {
        println("true")
    }else {
        println("false")
    }
}
