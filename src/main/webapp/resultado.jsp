<%@page import="model.Pessoa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
        
        <%
		Pessoa pessoa = (Pessoa) request.getAttribute("pessoa");
		%>
        
        <h1>Successo!</h1>
        <p>Cadastro realizado</p>
        
        <h2>${resultado} ${pessoa.nome} ${pessoa.sobrenome} ${dia}</h2>
        <h2>${mensagem}</h2> 
          
    	<% out.write("Obrigado por realizar o cadastro em nosso site.");%>
     
        
    </div>
</body>
</html>