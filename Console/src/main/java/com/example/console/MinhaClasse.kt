package com.example.console

class MinhaClasse {

}

//fun main() {
//    println("⚔️ BEM-VINDO AO REINO DE KOTLINIA ⚔️")
//    println("Escolha a sua classe:")
//    println("1 - Guerreiro")
//    println("2 - Mago")
//    println("3 - Arqueiro")
//    print("Digite o número da sua escolha: ")
//
//    val escolha = readLine()?.toIntOrNull()
//
//    when (escolha) {
//        1 -> {
//            println("\n🛡️ Você escolheu ser um Guerreiro!")
//            println("Arma inicial: Espada Longa e Escudo de Ferro.")
//            println("Missão: Proteger os portões da cidade dos goblins.")
//        }
//        2 -> {
//            println("\nVocê escolheu ser um Mago!")
//            println("Arma inicial: Cajado Místico e Livro de Feitiços.")
//            println("Missão: Investigar a torre abandonada do bruxo sombrio.")
//        }
//        3 -> {
//            println("\nVocê escolheu ser um Arqueiro!")
//            println("Arma inicial: Arco Recurvo e Aljava Infinita.")
//            println("Missão: Rastrear os bandidos na Floresta Sussurrante.")
//        }
//        else -> {
//            println("\nVocê escolheu ser um Aldeão Desavisado!")
//            println("Arma inicial: Uma colher de pau.")
//            println("Missão: Fugir das galinhas bravas da fazenda!")
//        }
//    }
//}

fun main() {

    val naipes = listOf("Copas", "Ouros", "Espadas", "Paus")


    println(naipes[0])


    println(naipes.size)


    for (item in naipes) {
        println(item)
    }
}