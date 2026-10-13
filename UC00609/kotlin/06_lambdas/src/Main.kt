import kotlin.system.exitProcess


fun main() {


    /*

    {parm -> code }

     */


    val msg = { nome: String ->
        println("Hello World! $nome")
    }

    fun msg_fun(nome: String)  {
        println("Hello World! $nome")
    }


    msg("Gonçalo")
    msg_fun("Gonçalo")



    val somar = { n1: Int, n2: Int ->
        n1 + n2
    }

    val multplicar = { n1: Int, n2: Int ->
        n1 * n2
    }

    val ops = listOf(somar, multplicar)



    fun somar_fn (n1: Int, n2: Int):Int{
        return n1 + n2
    }

    fun calc(v1:Int, v2:Int, operation: (Int, Int) -> Int): Int {
        return operation(v1, v2)
    }

    /*
    println( calc(5,5, somar))
    println( calc(5,5, multplicar))
*/


    println( calc(5,5, {
        n1: Int, n2: Int ->

        n1 / n2
    }))

    //println( calc(5,5, somar_fn))


    println("-------------")

  for (op in ops) {

      println(calc(5,5, op))

  }



}