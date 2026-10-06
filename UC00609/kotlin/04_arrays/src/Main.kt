
fun main() {

    var nomes = arrayOf("Ana", "Maria", "Rita", "Joana", "Rui")

    println(nomes.contentToString())
    println(nomes[0])
    println(nomes[4])
    // println(nomes[7]) <--se idx não existir --> Erro

    println(nomes.get(2))
    // println(nomes.get(9))  <-- Erro

    println(nomes.size)

    nomes[0] = "Nuno"

    println(nomes[0])
    println(nomes.getOrNull(300))

    println("-----------")
    for (n in nomes) {
        println(n)
    }
    println("-----------")

    nomes.forEach { nome -> println(nome) }

    println("-----------")

    nomes.forEach { println(it) }

    println("-----------")


    var teste = Array(5) { "----" }

    println(teste.contentToString())

    println("-----------")


    var nomes2 = arrayOf("Ana", "Maria", "Rita", "Joana", "Rui")

    val resp = nomes2.filter { it.length > 3 }.toString()
    println(resp)

    println("-----------")


    var intArray_demo = intArrayOf(5, 2, 1, 3, 1, 2, 1)


    println("-----------")

    var lst = listOf("Ana", "Maria", "Rita", "Joana", "Rui", "Ana")

    println(lst)

    println(lst[0])

    // lst[0] = "Ana 2"
    println(lst[0])

    var lst2 = lst.toTypedArray()

    println(lst2[1])
    lst2[1] = "Pedro"

    lst = lst2.toList()

    println(lst)

    println("----- mutableListOf ------")


    var listaNomes = mutableListOf("Ana", "Maria", "Rita", "Joana", "Rui")

    println(listaNomes)

    println(listaNomes.size)

    println(listaNomes.get(2))

    println(listaNomes.getOrNull(19))
    println(listaNomes.getOrElse(2) { "Idx invalido" })
    println(listaNomes.getOrElse(21) { "Idx invalido" })

    /*
    String ≠ String?
     */

    listaNomes.add("Novo Nome")
    println(listaNomes)

    listaNomes.add(0, "Novo Nome 2")
    println(listaNomes)


    listaNomes.addFirst("Novo Nome 22")
    println(listaNomes)

    listaNomes.addLast("Novo Nome 221")
    println(listaNomes)


    println("-------")
    println(listaNomes.add("Novo Nome"))
    println(listaNomes.add(1, "Novo Nome"))
    println(listaNomes.addFirst("Novo Nome"))
    println(listaNomes.addLast("Novo Nome"))

    println("-------")
    println(listaNomes.remove("Novo Nome"))

    println("-------")
    println(listaNomes.remove("Novo Nome12121212"))


    println("-------")
    println (listaNomes.removeAt(2))

    println("-------")
   // print(listaNomes.removeAt(23))



    val listaNomes2 = mutableListOf("Ana", "Maria", "Rita", "Joana", "Rui")


    println(listaNomes2.add("Rita 2"))

    println(listaNomes2)


     // listaNomes2 = mutableListOf("Ana", "Maria", "Rita", "Joana", "Rui")



    print("nome: ")
    var nome_in = readln()

    println("o nome é $nome_in")

    print("idade: ")
    var idade = readln().toInt()

    val dataNasc = 2026-idade
    println("o a idade é $idade e nasceste no ano $dataNasc")

}


/*


jetpack compose
    entrada de dados
    saida de dados
    listas
    tabelas
    toast
MVVM <- MVC 
nav
apis




 */