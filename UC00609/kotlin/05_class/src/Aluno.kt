import java.util.Locale
import java.util.Locale.getDefault

/*class Aluno {
    lateinit var nome: String
    var idade: Int = 0
}
 */
class Aluno(private var _nome: String, idade: Int){

    var nome: String
        get() = _nome
        set(value){
            _nome = value.capitalize()
        }

    var idade: Int = idade
        get() = field
        set(value){
            field = value * 2
        }


    init {
        println("Aluno $nome com ${this.idade} anos foi Criada com sucesso")
    }

    constructor(nome: String): this(nome, 0) {
        println(" ---> Aluno $nome, idade $idade  <---")
    }

    constructor(): this("Sem nome", 0)



    fun apresentar(): String{
        return ("$nome $idade")
    }
}