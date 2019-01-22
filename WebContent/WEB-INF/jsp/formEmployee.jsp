<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
	integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
	integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp"
	crossorigin="anonymous">
</head>
<body>

	<h3>Formulario registro empleado</h3>
	<form:form method="POST"
		action="${pageContext.request.contextPath}/addEmployee"
		modelAttribute="employee">

		<!-- 		<div class="form-group controls col-md-2"> -->
		<%-- 			<form:label path="id">Id</form:label> --%>
		<%-- 			<form:input class="form-control" path="id" /> --%>
		<!-- 		</div> -->
		<!-- 		<div class="clearfix"></div> -->
		<div class="form-group controls col-md-2">
			<form:label path="name">Nombre</form:label>
			<form:input class="form-control" path="name" />
		</div>
		<div class="clearfix"></div>
		<div class="form-group controls col-md-2">
			<form:label path="lastName">Apellidos</form:label>
			<form:input class="form-control" path="lastName" />
		</div>
		<div class="clearfix"></div>
		<div class="form-group controls col-md-2">
			<form:label path="birthDate">Fecha nacimiento</form:label>
			<form:input type="date" class="form-control" path="birthDate" />
		</div>
		<div class="clearfix"></div>
		<div class="form-group controls col-md-2">
			<form:label path="role">Rol</form:label>
			<div class="clearfix"></div>
			<form:select path="role">
				<form:option value="PROGRAMADOR" />
				<form:option value="ANALISTA" />
				<form:option value="JEFE PROYECTO" />
				<form:option value="ARQUITECTO" />
				<form:option value="MANAGER" />
			</form:select>

		</div>
		<div class="clearfix"></div>
		<div class="form-group controls col-md-2">
			<form:label path="department">Departamento</form:label>
			<form:input class="form-control" path="department" />
		</div>
		<div class="clearfix"></div>
		<div class="form-group controls col-md-2">
			<form:label path="email">Email</form:label>
			<form:input class="form-control" path="email" />
		</div>

		<div class="clearfix"></div>
		<div class="form-group controls col-md-2">
			<input type="submit" class="btn btn-primary" value="Submit" />
		</div>
	</form:form>
	<!-- Latest compiled and minified JavaScript -->
	<script
		src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
		integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
		crossorigin="anonymous"></script>
</body>
</html>