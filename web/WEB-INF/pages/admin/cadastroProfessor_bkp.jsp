<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Reforço Online - Cadastro Professor</title>
<link rel="stylesheet" href="css/style.css" type="text/css">
<script type="text/javascript" src="js/jquery.js"></script>
<script type="text/javascript" src="js/reforcoonline.js"></script>
<script type="text/javascript">

	$(document).ready(function() {
		$("#salvar").on("click", function(event) {
			doAjaxPost("/reforcoonline/professor/salvar", "form");
		});
	});
</script>
</head>
<body>
	<jsp:include page="adminHomeHeader.jsp" />
	<div id="adbox" align="left">
		<form action="/professor/salvar" style="width: 80%; margin: auto;">
			<span id="message"
				style="font-size: x-small;font-family: sans-serif;">${message}</span>
			<label for="usuario"> 
			<span
				style="font-size: small; font-family: sans-serif;">Nome</span>
			</label>
			<br/>
			<input type="text" name="nome" id="nome" size="100" />
			<br/>
			<label for="usuario"> 
			<span
				style="font-size: small; font-family: sans-serif;">Cpf</span>
			</label>
			<br/>
			<input type="text" name="cpf" id="cpf" size="15" />
			<br/>
			<label for="usuario"> 
			<span
				style="font-size: small; font-family: sans-serif;">Email</span>
			</label>
			<br/>
			<input type="text" name="email" id="email" size="100" />
			<br/>
			<label for="usuario"> 
			<span
				style="font-size: small; font-family: sans-serif;">Nome de Usuario</span>
			</label>
			<br/>
			<input type="text" name="nomeUsuario" id="nomeUsuario" size="20" />
			<br/>
			<label for="usuario"> 
			<span
				style="font-size: small; font-family: sans-serif;">Senha</span>
			</label>
			<br/>
			<input type="password" name="senha" id="senha" size="20" />
			<br/>
			<input type="button" id="salvar" name="salvar" value="salvar" />
		</form>
	</div>
	<jsp:include page="adminFooter.jsp" />
</body>
</html>