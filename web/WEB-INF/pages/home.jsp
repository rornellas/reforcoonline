<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<head>
<title>Reforço Online</title>
<link rel="stylesheet" href="css/style.css" type="text/css">
</head>
<body>
	<form action="/reforcoonline/login" method="post"
		accept-charset="utf-8">
		<div id="header" style="height: 20px">
			<div align="right">
				Ol&aacute; ${sessionController.usuario.nome}
			</div>
		</div>
	</form>
	<div id="adbox">
		<label for="usuario"> <span
					style="font-size: small; font-family: sans-serif;">email</span></label>
		<div class="clearfix">
			<div>
				<ol>
					<li>
					</li>
				</ol>
			</div>
		</div>
	</div>
	<div id="footer">
		<div class="clearfix">
			<div id="connect">
				<a href="http://freewebsitetemplates.com/go/facebook/"
					target="_blank" class="facebook"></a><a
					href="http://freewebsitetemplates.com/go/googleplus/"
					target="_blank" class="googleplus"></a><a
					href="http://freewebsitetemplates.com/go/twitter/" target="_blank"
					class="twitter"></a><a
					href="http://www.freewebsitetemplates.com/misc/contact/"
					target="_blank" class="tumbler"></a>
			</div>
			<p>© 2013 ReforcoOnline. Direitos reservados.</p>
		</div>
	</div>
</body>
</html>