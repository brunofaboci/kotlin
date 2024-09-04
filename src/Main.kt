import kotlin.math.*

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    println("Hello, world!")
    variaveis()
    tipoDados()
    unsigned()
    operadoresAritimeticos()

    val soma = sum(15f, 20f)
    println("A soma entre 15 e 20 é igual a $soma")
    val somaInline = sumInline(10f, 20f)
    println("A soma entre 10 e 20 é igual a $somaInline")

    val string = "Programação em Kotlin"
    stringMethods(string)

    mathMethods()
    flowControl()
    loopFor()
    loopWhile()
    loopDoWhile()
    exercicios()
}

fun variaveis() {
    //TIP variáveis mutáveis
    var nome = "Bruno"
    println("nome antes: $nome")
    nome = "Bruno Faboci"
    println("nome depois: $nome")

    //TIP variáveis imutáveis
    val idade = 20
    println(idade)
}

fun tipoDados() {
    /*
    Type    Bits
    Double  64
    Float   32
    Long    64
    Int     32
    Short   16
    Byte    8
    Boolean ?
    String  ?
    Char    ?
     */
    println("Double Min: ${Double.MIN_VALUE} - Max: ${Double.MAX_VALUE}")
    println("Float Min: ${Float.MIN_VALUE} - Max: ${Float.MAX_VALUE}")
    println("Long Min: ${Long.MIN_VALUE} - Max: ${Long.MAX_VALUE}")
    println("Int Min: ${Int.MIN_VALUE} - Max: ${Int.MAX_VALUE}")
    println("Short Min: ${Short.MIN_VALUE} - Max: ${Short.MAX_VALUE}")
    println("Byte Min: ${Byte.MIN_VALUE} - Max: ${Byte.MAX_VALUE}")

    val c: Char = 'a'
    val s: String = "alskhdjhsakdfjhskdfhlksjhdflkahsdlkfjasd"
    val b: Boolean = true

    val double: Double = 10.0
    val float: Float = 10f
    val long: Long = 10L
    val integer: Int = 10
    val short: Short = 10
    val byte: Byte = 10
}

fun unsigned() {
    //TIP valores numéricos que não possuem uma parte negativa
    println("ULong Min: ${ULong.MIN_VALUE} - Max: ${ULong.MAX_VALUE}")
    println("UInt Min: ${UInt.MIN_VALUE} - Max: ${UInt.MAX_VALUE}")
    println("UShort Min: ${UShort.MIN_VALUE} - Max: ${UShort.MAX_VALUE}")
    println("UByte Min: ${UByte.MIN_VALUE} - Max: ${UByte.MAX_VALUE}")

    val num: UInt = 5u
    val num2: UShort = 5u
    val num3: UByte = 5u
    val num4: ULong = 5u
}

fun operadoresAritimeticos() {
    //TIP soma +,
    //  subtração -,
    //  multiplicação *,
    //  divisão /,
    //  modulo ou resto %
    var age = 20
    println(age)
    //TIP Incremento após a variável irá primeiro usar o valor da variável e depois incrementá-la
    println(age++) // continua sendo 20
    println(age) // aqui é 21
    //TIP Incremento antes da variável irá primeiro incrementar o valor e depois usá=lo
    println(++age) // aqui o valor já é 22
    println(age)
}

fun sum(a:Float, b:Float): Float {
    return a + b
}
//TIP funções podem ser escritas em uma única linha quando possuem apenas uma instrução (a + b)
// quando os parâmetros de uma função são de tipos iguais, o retorno obrigatoriamente é do mesmo tipo,
// portanto podemos ocultar o tipo de retorno
fun sumInline(a:Float, b:Float) = a + b

fun stringMethods(str:String) {
    println("Tamanho da string: ${str.length}")
    println("Index 0 da string: ${str[0]}")
    println("Começa com ${str.startsWith("Pro")}")
    println("termina com ${str.endsWith("asf")}")
    println("possui o trecho ${str.substring(2, 5)}")
    println(str.replace("a", "4"))
    println(str.lowercase())
    println(str.uppercase())
}

fun mathMethods() {
    println(max(5,9))
    println(min(5, 9))
    println(sqrt(81f))
    println(PI)
    println(E)
    println(round(95.458))
}

fun flowControl() {
    maiorIdade(20)
    ternario(true)
    val bonus = bonusWhen("Desenvolvedor")
    println("Bonus: $bonus")
    range(25)
}

fun maiorIdade(age: Int) {
    if (age >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de Idade")
    }
}

fun ternario(dia: Boolean) {
    val saudacao = if (dia) "Bom dia!" else "Boa noite!"
    println(saudacao)
}

fun bonusWhen(cargo: String): Float {
    return when (cargo) {
        "Gerente" -> 2000f
        "Desenvolvedor" -> 1500f
        "Estagiário" -> 500f
        else -> 0f
    }
}

fun range(n:Int) {
    when (n) {
        in 1..10 -> println("1..10")
        in 10..100 -> println("10..100")
        else -> println("fora do range")
    }
}

fun loopFor() {
    for (i in 1..5) {
        print("$i ")
    }

    println(" ")

    for (i in 0..10 step 2) {
        print("$i ")
    }

    println(" ")

    for (i in 10 downTo 0) {
        print("$i ")
    }

    println(" ")

    val str = "To aprendendo kotlin!"
    for (char in str) {
        print("$char ")
    }
}

fun loopWhile() {
    var num = 0
    while(num < 10) {
        print("$num ")
        num++
    }
}

fun loopDoWhile() {
    do {
        print("Qual seu nome?: ")
        val value = readlnOrNull()
    } while (value == "")
}