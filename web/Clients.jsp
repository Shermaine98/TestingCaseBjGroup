<html>



<title>Clients</title>
	<meta name = "viewport" content = "width=device-width, initial-scale=1", user-scalable=no">
	<meta charset = "utf-8">

<link href="css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">

 <script src="js/jquery.js"></script>
 <script src="js/bootstrap.js"></script>
 <script scr="js/bootstrap.min.js"</script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<link>
</head>

<body>

	  <div class="col-sm-9 col-sm-offset-3 col-md-6 col-md-offset-1 main project-container">


	<center>
  <img src= "img/inden.png" alt=" " style="margin:auto;" display="block;"><br></center>
<p>

<ol class="breadcrumb">
  <li><a href="Sales.jsp">Go back</a></li>
</ol>
<form action="AddClientServlet" method="POST">
<div class="panel panel-success">
  <div class="panel-heading">
    <h3 class="panel-title">CLIENT'S INFORMATION</h3>
  </div>
  <div class="panel-body">
    <p>


   <div class="row">
  <div class=" col-md-10">
<label>Company Name:</label>
<input type="text" class="form-control" placeholder="" name="companyName">
<label>Company Address:</label>
<input type="text" class="form-control" placeholder=" No. Street, City Mun., Province" name="companyAddress">

<label>Zip:</label>
<input type="text" class="form-control" placeholder="" name="zip">
<label>Country:</label>
<input type="text" class="form-control" placeholder="" name="country">
<label>Phone:</label>
<input type="text" class="form-control" placeholder="" name="phone">
<label>Company E-mail:</label>
<input type="text" class="form-control" placeholder="" name="companyEmail">
<hr class = "divider">
<label>Contact Person:</label>
<input type="text" class="form-control" placeholder="" name="contactPerson">
<label>Contact Number:</label>
<input type="text" class="form-control" placeholder="" name="contactNumber">
<label>Contact E-mail:</label>
<input type="text" class="form-control" placeholder="" name="contactEmail">
</div>
</div>

<hr class = "divider">
<center>
    <div class="col-sm-offset-1 col-sm-10">
      <button type="submit" class="btn btn-success">SAVE</button>
    </div></center>
</div>
</div>
   <center><img src= "img/POWER.png" alt=" " style="margin:auto;" display="block;"</center>

</form>
  </html>