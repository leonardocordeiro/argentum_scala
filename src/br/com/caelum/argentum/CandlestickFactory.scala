package br.com.caelum.argentum

import java.util.Calendar

class CandlestickFactory {
  def constroiCandleParaData(data: Calendar, negociacoes: List[Negociacao]) = { 
    var maximo = negociacoes(0).preco
    var minimo = negociacoes(0).preco

    // necessario tipar por causa do +=
    var volume: Double = 0;
    
    negociacoes.foreach { negociacao => {
        volume += negociacao.volume
        
        if (negociacao.preco > maximo) {
          maximo = negociacao.preco        
        } else if (negociacao.preco < minimo) {
          minimo = negociacao.preco
        }
      }
    }
    var abertura = negociacoes(0).preco
    var fechamento = negociacoes(negociacoes.size - 1).preco
    
    new Candlestick(abertura, fechamento, minimo, maximo, volume, data)
    
  }
}