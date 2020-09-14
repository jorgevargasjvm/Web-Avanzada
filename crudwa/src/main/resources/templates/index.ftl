<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CRUD Estudiantes</title>
</head>
<body>
	<form method="post" action="/create">
		<input type="text" id="matricula" name="matricula" placeholder="Ingresa la matricula" />
		<input type="text" id="nombre" name="nombre" placeholder="Ingresa el nombre" />	
		<input type="text" id="telefono" name="telefono" placeholder="Ingresa el telefono" />

		<button type="submit" class="btn btn-primary">Crear</button>
	</form>
	
	<br/>
	
	<h2>Lista de Estudiantes</h2>

    <table border="1">
        <tr>
            <th>Matricula</th>
            <th>Nombre</th>
            <th>Telefono</th>
        </tr>

		<#if estudiantes?? && (estudiantes?size > 0) >
	        <#list estudiantes as estudiante>
	            <tr>
	                <td>${estudiante.matricula}</td>
	                <td>${estudiante.nombre}</td>
	                <td>${estudiante.telefono}</td>
	            </tr>
	        </#list>
        <#else>
        	<tr>
                <td colspan="3">No existen registros</td>
            </tr>
        </#if>
    </table>
</body>
</html>