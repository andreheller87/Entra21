function formataMoeda(valor){
    return valor.toFixed(2).replace(".", ",")
  }
  
  function parouNoEstacionamento(){
    valorEstacionamento = 0
    var checkBox = document.getElementById("sim")
    if (checkBox.checked == true){
      valorEstacionamento = 15
      // supondo que o custo do período é de R$ 15
    }
    return valorEstacionamento
  }
  
  function calcular(){
    valorTotal = 0
    distancia = inputDistancia.value.replace(",", ".")
    
    consumoDoCarro = 10
    // supondo que o consumo médio do carro é de 10 km/L
  
    valorCombustivel = 4.56
    // supondo que o valor médio da  gasolina é de R$ 4,56
  
    litrosCombustivel = distancia / consumoDoCarro
  
    gastoCombustivel = (litrosCombustivel * valorCombustivel)
  
    valorTotal = gastoCombustivel + parouNoEstacionamento()
    
    botaoCalcular.innerHTML = `Total: R$${formataMoeda(valorTotal)}`
  }
  