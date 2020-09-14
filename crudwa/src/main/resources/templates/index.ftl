<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>CRUD Estudiantes</title>
    
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
</head>
<body>

	<header>
	  <div class="navbar navbar-dark bg-dark shadow-sm">
	    <div class="container d-flex justify-content-between">
	      <a href="/" class="navbar-brand d-flex align-items-center">
	        <strong>CRUD ESTUDIANTES</strong>
	      </a>
	    </div>
	  </div>
	</header>
	
	<main role="main">
	
	  <section class="text-center">
	    <div class="container mt-3">
	      
		  <form class="form-inline" method="post" action="estudiante/create"> 
			<label class="sr-only" for="matricula">Name</label>
			<input type="text" class="form-control mb-2 mr-sm-2" id="matricula" name="matricula" placeholder="Ingresa la matricula" />
			
			<label class="sr-only" for="nombre">Name</label>
			<input type="text" class="form-control mb-2 mr-sm-2" id="nombre" name="nombre" placeholder="Ingresa el nombre" />
			
			<label class="sr-only" for="telefono">Name</label>
			<input type="text" class="form-control mb-2 mr-sm-2" id="telefono" name="telefono" placeholder="Ingresa el telefono" />
			
			<button type="submit" class="btn btn-primary mb-2">Crear</button>
		  </form>
		  
		  <br/>
		
		<h2>Lista de Estudiantes</h2>
		
		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">Matricula</th>
		      <th scope="col">Nombre</th>
		      <th scope="col">Telefono</th>
		      <th scope="col">Acciones</th>
		    </tr>
		  </thead>
		  <tbody>
		    
		    <#if estudiantes?? && (estudiantes?size > 0) >
		        <#list estudiantes as estudiante>
		            <tr>
		                <th scope="row">${estudiante.id}</td>
		                <td>${estudiante.matricula}</td>
		                <td>${estudiante.nombre}</td>
		                <td>${estudiante.telefono}</td>
		                <td>
		                	<a href="${'estudiante/' + estudiante.id + '/edit'}" class="btn btn-secondary">Editar</a>
		                	<a href="${'estudiante/delete/' + estudiante.id}" class="btn btn-danger">Eliminar</a>
	                	</td>
		            </tr>
		        </#list>
	        <#else>
	        	<tr>
	                <td colspan="5">No existen registros</td>
	            </tr>
	        </#if>
	        
		  </tbody>
		</table>
	      
	    </div>
	  </section>
	
	</main>
    
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    
</body>
</html>