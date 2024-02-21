// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} foi matriculado na formação $nome")
    }
}

fun main() {
    // Criar alguns conteúdos educacionais
    val kotlinBasico = ConteudoEducacional("Kotlin Básico", 45)
    val kotlinAvancado = ConteudoEducacional("Kotlin Avançado", 60)
    val androidBasico = ConteudoEducacional("Android Básico")

    // Criar uma formação
    val formacaoKotlin = Formacao("Formação Kotlin", listOf(kotlinBasico, kotlinAvancado))

    // Criar alguns usuários
    val usuario1 = Usuario("Carlos")
    val usuario2 = Usuario("João")
    val usuario3 = Usuario("Antônio")

    // Matricular os usuários na formação
    formacaoKotlin.matricular(usuario1)
    formacaoKotlin.matricular(usuario2)
    formacaoKotlin.matricular(usuario3)

    // Verificar os inscritos na formação
    println("Inscritos na formação ${formacaoKotlin.nome}: ${formacaoKotlin.inscritos.map { it.nome }}")
}
