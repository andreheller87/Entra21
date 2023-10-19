function formataMoeda(valor){
    return valor.toFixed(2).replace(".", ",")
  }
  
  function calcular(){
    distancia = inputDistancia.value.replace(",", ".")
    tempo = inputTempo.value
     
    valorCorrida = 2 + (distancia * 1.4) + (tempo * 0.26)
    botaoCalcular.innerHTML = "Total: R$" + formataMoeda(valorCorrida)
  }
  