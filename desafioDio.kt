// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
    }
}

fun main() {
   
    val kotlin = ConteudoEducacional("KOTLIN", 60, NIvel.BASICO)
    val java = ConteudoEducacional("JAVA", 45, Nivel.INTERMEDIARIO)
    val css = ConteudoEducacional ("CSS", 100, Nivel.AVANÇADO)
   
    disciplinas.add(kotlin)
    disciplinas.add(java)
    disciplinas.add(css)

    val BackEnd = Formacao("BackEnd", disciplinas)

    val jonas = Usuario("Jonas")

    val juliana = Usuario("Juliana")
     
    BackEnd.matricular(Jonas)
    BackEnd.matricular(Juliana)

    val inscritos = BackEnd.inscritos
    val nome = BackEnd.nome
    val conteudo = BackEnd.conteudos

    println("Nome do Curso: $nome")

    conteudo.forEach { inscritos -> println(inscritos) }

    print("Inscritos para o Curso: $inscritos")

    disciplinas.clear()
    print("-------------------------------------")

    val node = ConteudoEducacional("POO", 60, Nivel.BASICO)
    val tdd = ConteudoEducacional("testes", 45, Nivel.MEDIO)
    val dotnet = ConteudoEducacional("ApiRest", 121, Nivel.AVANÇADO)

    disciplinas.add(POO)
    disciplinas.add(testes)
    disciplinas.add(ApiRest)
    val node = Formacao("Angular", conteudos)

    val gloria = Usuario("Gloria")
    val julia = Usuario("Julia")

    node.matricular(gloria)
    node.matricular(julia)
    node.matricular(juliana)

    val nome2 = node
    val cont2 = node
    val insc = node

    print("Nomde do Curso: $nome2")
    cont2.forEach{
        i -> println(i)
    }
    println("Incritos para o Curso: $insc")








}
