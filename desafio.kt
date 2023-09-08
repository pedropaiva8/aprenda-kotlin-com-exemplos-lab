enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

data class Habilidade (val nome: String, var nivel: Nivel)

data class Usuario (val nome: String, val idade: Int, val habilidades: List<Habilidade>, var sobreMim: String)

data class ConteudoEducacional(val nome: String, var duracao: Int = 50)

data class Formacao(val nome: String, var nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println("Usuário ${usuario.nome} Adicionado ✅")
    }
    
    fun listarInscritos(){
        println("USUÁRIOS INSCRITOS NA FORMAÇÃO $nome")
        for (i in inscritos){
            println("- ${i.nome}")
        }
    }
}

fun main() {
    //TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")

    //TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
    
    val javaScript = Habilidade("JavaScript", Nivel.BASICO)
    val css = Habilidade("CSS", Nivel.INTERMEDIARIO)
    val html = Habilidade("HTML", Nivel.INTERMEDIARIO)
    val python = Habilidade("Python", Nivel.INTERMEDIARIO)
    val flutter = Habilidade("Flutter", Nivel.AVANCADO)
    
    var habilidadesJoao = mutableListOf(javaScript, python, flutter)
    var habilidadesMaria = mutableListOf(javaScript, css, html)
    
    val joao = Usuario("João", 23, habilidadesJoao, "Jovem dinâmico, aprendendo de tudo um pouco 🤓")
    val maria = Usuario("Maria", 22, habilidadesMaria, "FrontEnd nata ✨")
    
    
    val kotlin01 = ConteudoEducacional("Introdução à Linguagem Kotlin")
    val kotlin02 = ConteudoEducacional("Funções em Kotlin")
    val kotlin03 = ConteudoEducacional("Programação Orientada a Objetos em Kotlin")
    
    val conteudoKotlin = listOf(kotlin01, kotlin02, kotlin03)
    
    val kotlin = Formacao("Kotlin", Nivel.BASICO, conteudoKotlin)
    
    println("")
    kotlin.matricular(joao)
    
    println("")
    kotlin.listarInscritos()
    
    println("")
    kotlin.matricular(maria)
    
    println("")
    kotlin.listarInscritos()

}