
let nomes = document.getElementById("inputNome");

console.log(nomes)

function gerar(){
    inputNome.value =  nomes.value
    
    contador = 1000000
    while (contador > 0){
      contador = contador - 1
        certificadoHTML = emitirCertificado(inputNome.value)
    }
    
    listaLinks = [
      "https://github.com/andreheller87/Entra21",
      "https://andreheller87.github.io/PortFolio/",
      "https://codepen.io/laly_x/pen/GRJbJdB",
      "https://codepen.io/laly_x/pen/VwLJBrV",
      "https://codepen.io/laly_x/pen/LYpNbVy",
      "https://codepen.io/laly_x/pen/VwvaKxm",
      "https://codepen.io/laly_x/pen/JjYoaWy",
      "https://codepen.io/laly_x/pen/ZEGdodP",
      "https://codepen.io/laly_x/pen/GRpgpmO",
      "https://codepen.io/laly_x/pen/GRpjMmM",
      "https://codepen.io/laly_x/pen/jObEMME",
      "https://codepen.io/laly_x/pen/xxwGKZz",
      "https://codepen.io/laly_x/pen/dyYPQwW"
    ]
     
    listaTitulos = [
      "Lista de Exercícios Entra 21",
      "Portifólio",
      "Pokébola",
      "Bandeira do Japão",
      "Cálculo de Circunferência",
      "Aplicativo de IMC",
      "Aplicativo de Transporte",
      "Aplicativo de Gasolina",
      "Ficha Médica",
      "Aplicativo de Loteria",
      "Botão de Like do Facebook",
      "To-Do",
      "Gerador de Certificado"
    ]
  
    listaOrdenada = ""
    for (i = 0; i < listaLinks.length; i++){
      link = listaLinks[i]
      titulo = listaTitulos[i]
      listaOrdenada = listaOrdenada +
        `<li>${titulo}: <br><a href = ${link} target="_blank">${link.replace("https://" , "")}</a></li>` 
    }
    
    document.body.innerHTML = `${certificadoHTML}
      <ol>
          ${listaOrdenada}
      </ol>`
  }
  