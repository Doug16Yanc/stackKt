import java.util.*
import domain.*

/*Realizado com base em outro programa na linguagem irmã*/

fun main() {

    val sc = Scanner(System.`in`)
    val lista = Lista()

    do{
        mostraMenu()

        var opcao = sc.nextInt()

        when(opcao){
            1 -> {
                println("Digite um número:")
                var numero = sc.nextDouble()
                lista.add(numero)
            }
            2 -> {
                println(lista.toString())
            }
            3 -> {
                lista.remove()
            }
            4 -> {
                println("Obrigado por sua interação comigo, até logo e abraços!\n")
                break
            }
            else -> {
                println("Opção inválida")
            }
        }
    } while (true)
}

fun mostraMenu(){
    println("Bem-vindo(a) ao nosso programa de pilha (estrutura LIFO)!\n")
    println("De tal modo, escolha uma opção.\n")
    println("   1 - Inserir elemento    \n")
    println("   2 - Mostrar lista       \n")
    println("   3 - Remover elemento    \n")
    println("   3 - Encerrar programa   \n")
}