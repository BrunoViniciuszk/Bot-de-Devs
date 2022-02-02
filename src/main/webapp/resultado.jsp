<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Sucesso</title>
  <link href="https://fonts.googleapis.com/css?family=Nunito+Sans:400,400i,700,900&display=swap" rel="stylesheet">
  <link rel="stylesheet" type="text/css" href="sucesso.css">
</head>
<body>
	<div class="card">
        <div style="border-radius:200px; height:200px; width:200px; background: #F8FAF5; margin:0 auto;">
            <!-- <img class="checkmark" src=""> -->
             <i class="checkmark">✓</i>
        </div>
        
        <h1>Successo!</h1>
        <p>Cadastro realizado<</p>
        
        ${pessoa.sexo} 
        ${pessoa.nome} 
        ${pessoa.sobrenome} 
    	<% out.write("Obrigado por realizar o cadastro em nosso site.");
    	%>
     
        
    </div>
</body>
</html>