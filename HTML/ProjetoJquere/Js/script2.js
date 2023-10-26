$(document).ready(function(){
function exemplo1() {
    $("div").filter(".alfa").css("border", "2px solid red");

var meuFiltro = function(index) {
    return index == 4 || $(this).attr("id") == "d6";
  };
};

  $("div").filter(meuFiltro).css("border", "2px solid blue");
  function exemplo2() {
    $("#grupo").children("div.alfa").css("background-color", "tan");
    $("#d2").prev().html("Primeiro");
    $("#d5").next().html("Último");
  };

  function exemplo3() {
    $("#d1").append("<b>-inicio</b>");
    $("#d6").prepend("<b>fim-</b>");

    $("#grupo").before("<br>Antes do grupo");
    $("#grupo").after("<br>Depois do grupo");
  };

  function exemplo4() {
    $("div.alfa").wrap("");
    $("#d5").replaceWith("5");
    $("#d6").wrapInner("");
  };

  $("div").filter(".alfa").css("border", "2px solid red");

var meuFiltro = function(index) {
return index == 4 || $(this).attr("id") == "d6";
};
$("div").filter(meuFiltro).css("border", "2px solid blue");


});