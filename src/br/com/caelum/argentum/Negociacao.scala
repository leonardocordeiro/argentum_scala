package br.com.caelum.argentum

import java.util.Calendar

class Negociacao(val preco: Double, val quantidade: Int, private var _data: Calendar) {
	this._data = _data.clone.asInstanceOf[Calendar]

	val volume = quantidade * preco  
	def data = this._data.clone.asInstanceOf[Calendar]
  
}