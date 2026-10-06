import java.util.Locale
import java.util.Locale.getDefault

fun main() {

    //cmt 1 linha
    /*
    cmt multi linha
     */

    println("Hello World!") // cmt
    print("Linha 2\n")

    println("Linha 3")


    var nome = "Gonçalo"
    println(nome.length)

    println("Ola " + nome)

    println("Ola $nome")

    println("Ola $nome o teu nome tem ${nome.length} letras ")

    println(nome.capitalize())
    println(nome.replaceFirstChar { if (it.isLowerCase()) it.titlecase(getDefault()) else it.toString() })


    var nome2 = "Gonçalo"
    nome2 = "João"

    // nome2 = 1984
    var ano: Int = 1984  // linha 200
    // linha 1
    println(ano)  // linha 240



    val escola = "ATEC"

    println(escola)

    println(escola.capitalize())


    //data type
    /*

    int
    string
    char
    boolean
    Double


     */


    var n1: Double = 0.1;
    var n2: Double = 0.2;

    println(n1 + n2)


    println(n1  + 3 )

    var n3: Double = n1 + 5;


    var f1: Float = 0.1f;
    var f2: Float = 0.2f;


    val v1 = 40
    val v2 = 20;

    // verifique se v1 e maior 1que v2

    if (v1 > v2) {
        println("v1($v1)  é maior")
    }


    // verifique qual dos 2 é maior (assuma que não são iguais)
    if (v1 > v2) {
        println("v1($v1)  é maior")
    }else{
        println("v2($v2)  é maior")
    }

    // verifique qual dos 2 é maior, se forem iguais de essa info


    if (v1 > v2) {
        println("v1($v1)  é maior")
    }else if(v1 < v2) {
        println("v2($v2)  é maior")
    } else{
        println("São igauis ")
    }


    val mes = 8

    when (mes) {
        1 -> println("Jan")
        2 -> println("Feb")
        3 -> println("Mar")
        4 -> println("Abril")
        5 -> println("May")
        6 -> println("June")
        7 -> println("Jul")
        8 -> {
            println("Aug")
            println("Linha 2")
        }
        9 -> println("Sep")
        10 -> println("Oct")
        11 -> println("Nov")
        12 -> println("Dez")
        else -> println("Mes invalido")
    }



    val diaSemana = 12

    val resp = when (diaSemana) {
        1 -> "Dom"
        2 -> "2f"
        3 -> "3f"
        4 -> "4f"
        5 -> "5f"
        6 -> "6f"
        7 -> "Sab"
        else -> "Dia invalido"
    }


    println(resp)







}