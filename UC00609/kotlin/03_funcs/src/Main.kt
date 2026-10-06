

fun main() {

    msg()
    msg("Joao")
    msg("Gonçalo", 2026)

    println(msg2("Gonçalo", 2026))

    val teste = msg2("Rui", 2026)


    println(msg2("Gonçalo ", 2026))
    println(teste)


    println("-----")

    println(msg2(nome="Gonçalo 2", ano=2027))
    println(msg2(ano=2027, nome="Gonçalo 2"))

    println(msg2(nome="Gonçalo 2", 2020))

    // println(msg2(ano=2027, "Gonçalo 2"))

    println(soma(2,6))
    println(soma2(20,6))

    println("-----")

    myMsg("Gonçalo")
    myMsg()

    println("-----")
    myMsg2(ano=2026)
    myMsg2("Gonçalo")
    myMsg2("Rui", 2030)
    myMsg2()
}

fun msg(){
    println("Hello World")
}

fun msg(nome: String){
    println("Hello World, $nome")
}

fun msg(nome: String, ano: Int){
    println("Hello World, $nome no ano $ano")
}

fun msg2(nome: String, ano: Int):String{
    return "Ola Mundo, $nome no ano $ano"
}


fun soma(a: Int, b: Int ): Int = a + b
fun soma2(a: Int, b: Int ) = a + b


/*
fun funcSemRetorno(): Unit {
    println("Hello World")
}
*/
fun funcSemRetorno() {
    println("Hello World")
}


fun myMsg(nome :String = "Sem Nome"){
    println("Ola $nome")
}


fun myMsg2(nome :String = "Sem Nome", ano: Int = 2026){
    println("Ola $nome no ano $ano")
}