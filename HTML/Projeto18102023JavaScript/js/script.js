function formataAltura(altura){
    return altura.replace(",",".")
}

function formataIMC(imc){
    return imc.replace(".",",")
}
function calcular(){
    peso = inputPeso.value;
    altura = inputAltura.value;

    if(peso == "" || altura == ""){
        resultado.innerHTML = "<p> Por favor, preencha os dados</p>"
    }else{
        const imc = (peso / (Math.pow(formataAltura(altura), 2))).toFixed(2);

    
        if(imc<17){
            msg = "muito abaixo do peso";
        }else if(imc >=17 && imc <= 18.49){
            msg="abaixo do peso";
        }else if(imc >=18.50 && imc <= 24.49){
            msg="com peso normal";
    }else if(imc >=24.50 && imc <= 29.49){
        msg="Acima do peso";
}else if(imc >=29.50 && imc <= 34.99){
    msg="com obsidade nivel 1";
}else {
    msg="com obsidade nivel 2";
}
        
resultado.innerHTML = `<p> Seu IMC é ${formataIMC(imc)} e você está ${msg}.</p>`;


}

}