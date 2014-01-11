<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Cadastro de Ensinador</title>

    <!-- Bootstrap core CSS -->
    <link href="css/bootstrap.css" rel="stylesheet">

    <!-- Add custom CSS here -->
    <link href="css/modern-business.css" rel="stylesheet">
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">
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

	<jsp:include page="adminHomeHeader.jsp"></jsp:include>
	
    <!-- Page Content -->

    <div class="container">
      
      <div class="row">

        <div class="col-sm-13">
          <h3>Cadastro de ensinador</h3>

			<div id="message">
				<c:if teste="${not empty message}">
					<div class="alert alert-success">
						${message}
					</div>
				</c:if>
			</div>			
			
            <form role="form" method="POST" id="form" action="/professor/salvar">
	            <div class="row">
	              <div class="form-group col-lg-12">
	                <label for="input1">Nome</label>
	                <input type="text" name="nome" id="nome" size="100" />
	              </div>
	              <div class="clearfix"></div>
	              <div class="form-group col-lg-2">
	                <label for="input2">CPF</label>
	                <input type="text" name="cpf" id="cpf" size="15" />
	              </div>
	              <div class="form-group col-lg-11">
	                <label for="input3">Email</label>
	                <input type="text" name="email" id="email" size="100" />
	              </div>
	              <div class="clearfix"></div>
	              <div class="form-group col-lg-3">
	                <label for="input4">Nome Usuário</label>
	                <input type="text" name="nomeUsuario" id="nomeUsuario" size="20" />
	              </div>
	              <div class="form-group col-lg-7">
	                <label for="input4">Senha</label>
	                <input type="password" name="senha" id="senha" size="20" />
	              </div>
	              <div class="form-group col-lg-3">
	                <input type="button" id="salvar" name="salvar" value="salvar" />
	              </div>
              </div>
            </form>
        </div>

      </div><!-- /.row -->

    </div><!-- /.container -->

    <div class="container">

      <hr>

      <footer>
        <div class="row">
          <div class="col-lg-12">
            <p>Copyright &copy; Company 2013</p>
          </div>
        </div>
      </footer>

    </div><!-- /.container -->

    <!-- JavaScript -->
    <script src="js/jquery.js"></script>
    <script src="js/bootstrap.js"></script>
    <script src="js/modern-business.js"></script>

  </body>
</html>
