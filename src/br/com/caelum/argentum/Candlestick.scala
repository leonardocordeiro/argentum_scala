package br.com.caelum.argentum

import java.util.Calendar
import java.text.SimpleDateFormat

class Candlestick(val abertura: Double, val fechamento: Double, val minimo: Double, val maximo: Double, val volume: Double, val data: Calendar) {
  
  def isAlta = abertura < fechamento
  def isBaixa = !isAlta
  
  override def toString = {
    val sdf = new SimpleDateFormat("dd/MM/yyyy")
    s"[Abertura ${abertura}, Fechamento ${fechamento}, Mínima ${minimo}, Máxima ${maximo}, Volume ${volume}, Data ${sdf.format(data.getTime)}]"
  }
  
}