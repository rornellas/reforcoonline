<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.0.3/css/bootstrap.min.css">
<!-- Optional theme -->
<script type="text/javascript" src="js/jquery.js"></script>
<div id="header" class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	<form id="form" action="/reforcoonline/login" class="navbar-form navbar-right" role="form">
		<div class="form-group" id="mensagem" style="color: white">
			${message}
		</div>
		<div class="form-group">
			<input class="form-control" placeholder="Email/Usuario" type="text" name="login" id="login" size="30px" /> 
		</div>
		<div class="form-group">
			<input class="form-control" type="password" placeholder="Senha" name="senha" id="login" size="10px" /> 
		</div>
		<input type="submit" id="btnLogin" value="Entrar" class="btn btn-success"/>
	</form>
</div>