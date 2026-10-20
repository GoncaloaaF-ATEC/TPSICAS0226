package pt.atec.a05_mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class Aluno(var nome: String) // modelo de  dados

class MainViewModel: ViewModel() {

    private val _aluno = MutableLiveData<Aluno>()

    val aluno: LiveData<Aluno>
        get() = _aluno

    val nomeAluno: String
        get() = _aluno.value?.nome ?: ""


    init {
        _aluno.value = Aluno("João")
    }


    fun mudarNome(novoNome: String){
        _aluno.value = _aluno.value?.copy(nome = novoNome)

    }

}