package br.com.caelum.argentum

import java.util.Calendar

class Negociacao(val preco: Double, val quantidade: Int, val data: Calendar) {
  val volume = quantidade * preco  
}