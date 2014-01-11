<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<style type="text/css">
.navigation {
	overflow: auto;
	display: block;
	float: left;
}

.navigation * {
	padding: 0;
	margin: 0;
	font-family: "Helvetica Neue", Helvetica, Arial, sans-serif;
	font-size: 13px;
	text-transform: uppercase;
}

.navigation ul {
	display: block;
	float: left;
	padding: 10px 0 0 0;
}

.navigation ul li {
	list-style: none;
	float: left;
	margin: 0 15px 0 5px;
}
</style>
<div id="header" style="height: 20px">
	<div align="right">${sessionController.usuario.nome} - <a href="${pageContext.request.contextPath}/logout">logout</a></div>
	<div>
	  <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
	      <div class="container">
	        <div class="navbar-header">
	          <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
	            <span class="sr-only">Ativar Navegação</span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	            <span class="icon-bar"></span>
	          </button>
	          <!-- You'll want to use a responsive image option so this logo looks good on devices - I recommend using something like retina.js (do a quick Google search for it and you'll find it) -->
	          <a class="navbar-brand" href="index.html">Reforço Online</a>
	        </div>
	
	        <!-- Collect the nav links, forms, and other content for toggling -->
	        <div class="collapse navbar-collapse navbar-ex1-collapse">
	          <ul class="nav navbar-nav navbar-right">
	            <li><a href="${pageContext.request.contextPath}/professor">Cadastrar Ensinador</a></li>
	          </ul>
	        </div><!-- /.navbar-collapse -->
	      </div><!-- /.container -->
	    </nav>
	</div>
</div>
