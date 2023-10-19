function gerar(){
    nome = inputNome.value
    h1.innerHTML = nome
    nasc = inputNasc.value
    idade = inputIdade.value + " anos"
    batidas = ((75 * 60) * 24 ) * (365 * inputIdade.value)
    estadoDeSaude = "Não <li>Não precisa de acompanhamento médico.</li>"
  
    if (inputNome.value == "" || inputNasc.value == "" || inputIdade.value == ""){
        alert("Por favor, preencha todos os campos!")
    }else{
        var checkBox = document.getElementById("sim");
        if (checkBox.checked == true){
            estadoDeSaude = "Sim <li>Precisa de acompanhamento médico.</li>"
        }
        lista.innerHTML = 
        `<li>Data de nascimento: ${nasc}</li>
        <li>Idade: ${idade}</li>
        <li>Seu coração já bateu aproximadamente ${batidas} vezes.</li>
        <li>Tem condição pré-existente: ${estadoDeSaude}</li>`  
    }
}
