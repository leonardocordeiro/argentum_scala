package br.com.caelum.argentum

import java.util.Calendar
import java.text.SimpleDateFormat

object TesteCandlestickFactory extends App {
  var hoje = Calendar.getInstance;
  
  val negociacao = new Negociacao(40.5, 100, hoje)
  val negociacao2 = new Negociacao(45.0, 100, hoje)
  val negociacao3 = new Negociacao(39.8, 100, hoje)
  val negociacao4 = new Negociacao(42.3, 100, hoje)
  
  val negociacoes = List(negociacao, negociacao2, negociacao3, negociacao4)
  val fabrica = new CandlestickFactory
  
  val candle = fabrica.constroiCandleParaData(hoje, negociacoes)
  
  println(s"Abertura: ${candle.abertura}")
  println(s"Fechamento: ${candle.fechamento}")
  println(s"Mínimo: ${candle.minimo}")
  println(s"Máximo: ${candle.maximo}")
  println(s"Volume: ${candle.volume}")
  
  println(candle)
  
}