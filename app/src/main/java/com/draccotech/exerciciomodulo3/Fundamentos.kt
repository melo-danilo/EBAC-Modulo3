package com.draccotech.exerciciomodulo3

import java.util.*


fun main() {
    /*
        Crie uma variável mutável do tipo inteiro
        * Inicialize com o valor inicial de 6
        * Altere o valor dela para 5
        * Imprima o valor
     */
    var intMutavel: Int = 6
    intMutavel = 5
    println(intMutavel)

    /*
        Crie uma variável imutável do tipo inteiro
        * Inicialize com o valor de 6
        * Altere o valor para 7
        * Imprima o valor
     */
    val intImutavel: Int = 6
//    intImutavel = 7

    /*
        Não é possível alterar o valor de uma variavel imutável
        * Erro -> Val cannot be reassigned
     */

    println(intImutavel)

    /*
        Crie um condicional que testa se uma variável é ímpar ou par
        * Para nao deixar o valor estático, decidi gerar um random para validar a condicional
        * Espero que aceite como válido o exercício
     */
    val random = Random()
    val imparPar = random.nextInt(10)
    if (imparPar % 2 == 0){
        println("Número($imparPar) é PAR")
    }else{
        println("Número($imparPar) é ÍMPAR")
    }

    /*
        Refaça o exercicio anterior utilizando o comando WHEN
     */
    when{
        imparPar % 2 == 0 -> println("Número($imparPar) é PAR")
        else -> println("Número($imparPar) é ÍMPAR")
    }

    /*
        Crie um array de inteiro de tamanho 40
        * Escreva um codigo que escreva os numeros de 1 a 39 neste array utilizando
        o comando for
     */
    val array = IntArray(40)
    for (i in array.indices){
        array[i] = i + 1
        // Para printar o valor do indice, descomente a linha abaixo
//        println(array[i])
    }

    /*
        Crie uma lista de inteiro
        * Escreva na lista os numeros de 1 a 99
     */

    val mutableList = mutableListOf<Int>()
    for (i in 1 .. 99){
        mutableList.add(i)
    }

    // Para printar a lsita, descomente a linha abaixo
//    println(mutableList)

    /*
        Utilizando a lista anterior, faça:
        * Crie uma variavel do tipo inteiro com o nome 'soma' e inicialize ela com o valor 0
        * Crie um código que percorra a lista que criamos anteriormente e que a cada interacao,
        acrescente o valor da posicao atual à variável soma
     */
    var soma: Int = 0
    for (i in mutableList.indices){
        soma += mutableList[i]

        // Para acomapanhar a soma, descomente a linha abaixo
//        println(soma)
    }

    // Para printar o valor da soma, descomente a linha abaixo
//    println(soma)

}