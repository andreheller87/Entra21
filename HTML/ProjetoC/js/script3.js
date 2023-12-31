// Selecionando o botão corretamente
let button = document.getElementById("botao");

// Adicionando um evento de clique ao botão
button.addEventListener("click", sorteiaNumeros);

function sorteia() {
    return Math.floor(Math.random() * 60) + 1;
}

function sorteiaNumeros() {
    let megaSena = [];
    let numero = 1;
    let quantidadeMaximaDeNumeros = 6;

    while (numero <= quantidadeMaximaDeNumeros) {
        let numerosSorteados = sorteia();
        let achou = false;
        for (let posicao = 0; posicao < megaSena.length; posicao++) {
            if (megaSena[posicao] === numerosSorteados) {
                achou = true;
                break;
            }
        }
        if (!achou) {
            megaSena.push(numerosSorteados);
            numero++;
        }
    }

    megaSena.sort(function (a, b) {
        return a - b;
    });

 
    alert("Números sorteados: " + megaSena.join(", "));
}