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
	
	  <section>
	    <div class="container mt-3">
	      
		  <form method="post" name="estudiante" action="${'/estudiante/' + estudiante.id + '/update'}">
			  <div class="form-group">
			    <label for="exampleInputEmail1">Matricula</label>
			    <input type="text" class="form-control" id="matricula" name="matricula" value="${estudiante.matricula}" aria-describedby="matricula">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputEmail1">Nombre</label>
			    <input type="text" class="form-control" id="nombre" name="nombre" value="${estudiante.nombre}" aria-describedby="nombre">
			  </div>
			  <div class="form-group">
			    <label for="exampleInputEmail1">Telefono</label>
			    <input type="text" class="form-control" id="telefono" name="telefono" value="${estudiante.telefono}" aria-describedby="telefono">
			  </div>

			  <a href="/" class="btn btn-secondary">Volver</a>
			  <button type="submit" class="btn btn-primary">Guardar</button>
			</form>
		  
		  <br/>
	      
	    </div>
	  </section>
	
	</main>
    
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    
</body>
</html>