$("#enviar").click("enviarCadastroSoftware");

function enviarCadastroSoftware(){
    let nome = $("#nome").val();
    let exigeLincenca = $("#pago")[0].checked;

    $.ajax({
    type: "POST",
    url:"/Software/Cadastro",
    data:{
        nome: nome,
        pago: exigeLincenca,
    },
    success: function(data){
        alert(data);
    },
    error: function(){
        alert("Deu ruim");
    }
    });
}