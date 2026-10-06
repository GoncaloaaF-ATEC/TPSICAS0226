

fun main() {

    val al = Aluno("Carlos", 25)
    // println("nome: ${al.nome}, idade: ${al.idade}")
    // al.idade = 17
    // al.nome = "Aluno"

    println("nome: ${al.nome}, idade: ${al.idade}")

    println("------------")
    val al2 = Aluno("Maria")
    // println("nome: ${al.nome}, idade: ${al.idade}")
    // al.idade = 17
    // al.nome = "Aluno"
    println("------------")
    al2.idade = 18
    println("nome: ${al2.nome}, idade: ${al2.idade}")

    println("------------")

    val al3 = Aluno()
    println("nome: ${al3.nome}, idade: ${al3.idade}")


    println("------------")
    println(al3.apresentar())


    println("------------")


    val al4 = Aluno("ana", 10)
    println("nome: ${al4.nome}, idade: ${al4.idade}")
}


