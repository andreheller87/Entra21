
function formataMoeda(valor){
    return valor.toFixed(2).replace(".", ",")
  }

  
  function calcular(){
    valorTotal = 0
    distancia = inputDistancia.value.replace(",", ".");
    consumo = consumoCarro.value.replace(",",".");
    gasolina = valorComb.value.replace (",", ".");
    origem = origem.value;
    destino = destino.value;
    carro = carro.value;
  
    litrosCombustivel = distancia / consumo
  
    gastoCombustivel = (litrosCombustivel * gasolina)
  
    valorTotal = gastoCombustivel ;
    
    botaoCalcular.innerHTML = `Total: R$ ${formataMoeda(valorTotal)}`;
  }