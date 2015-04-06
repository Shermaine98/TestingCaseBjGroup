<%@page import="java.util.ArrayList"%>
<%@page import="DAO.SupplierDAO"%>
<%@page import="Beans.SupplierBean"%>
<%@page import="Beans.SupplierBean"%>
<html>


<title>Product List</title>
	<meta name = "viewport" content = "width=device-width, initial-scale=1", user-scalable="no">
	<meta charset = "utf-8">

<link href="css/bootstrap.min.css" rel="stylesheet">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">



 <script src="js/bootstrap.min.js"></script>

	<link>
</head>

<body>

	  <div class="col-sm-9 col-sm-offset-3 col-md-10 col-md-offset-1 main project-container">

	<center>
  <img src= "img/inden.png" alt=" " style="margin:auto;" display="block;"><br></center>



<nav class="navbar navbar-default" role="navigation">
  <div class="container-fluid">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
        <span class="sr-only">Toggle navigation</span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
  
    </div>

<div class="col-sm-9 col-sm-offset-3 col-md-5 col-md-offset-8 main project-container"> 
      <div class="collapse navbar-collapse" id="navbar-collapse1">
         
              <div class="input-group" style="max-width:470px;">
                <input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
                <div class="input-group-btn">
                  <button class="btn btn-default btn-primary" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                </div>
              </div>
    
      
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
</div>
   


<ol class="breadcrumb">
  <li><a href="Homepage.html">Home</a></li>
</ol>


<div class="container">
<ol class="breadcrumb">
  <li><a href="proctransaction.jsp">Go back</a></li>
</ol>
<div class="page-header">
    <h1>Product List</h1>
</div>

<!-- Registration form - START -->
<div class="container">
    
    <div class="row">
        
        Supplier Name<select class = "form-control" onchange="updateHidden(this.value)">
            <option value="-1"></option>
            <%ArrayList<SupplierBean> supplierList = new SupplierDAO().getAllSuppliers();
            
            for(int i = 0 ; i < supplierList.size();i++){%>
           
            <option value="<%=supplierList.get(i).getSupplierID()%>"><%=supplierList.get(i).getSupplierName()%></option>
            <%}%>
        </select>
          <div class="row">
          <div class="col-md-6">
            <div class="content-box-large">
             
              
              <div class="panel-options">
                <a href="#" data-rel="collapse"><i class="glyphicon glyphicon-refresh"></i></a>
                
              </div>
            </div>
              <div class="panel-body">
                <table class="table" id="itemtable">
                      <thead>
                        <tr>
                          <th>Item Code</th>
                          <th>Item Name</th>
                          <th>Model</th>
                          <th>Price</th>
                        </tr>
                      </thead>
                      <tbody>
                     
                       
                      </tbody>
                    </table>
              </div>
            </div>
          </div>
          
<div class="row">
      <div class="col-sm-6">
        <div class="input-group">

          
      </div>
    </div>
  </div>

<center></div>
                <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#myModal">Add Item</button>

<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal"><span aria-hidden="true">&times;</span><span class="sr-only">Close</span></button>
        <h4 class="modal-title" id="myModalLabel">Add Item</h4>
      </div>
        <form action="AddItemServlet" method="POST">
      <div class="modal-body">
         
          
        
<label>Item Name:</label>
<input type="text" class="form-control" placeholder="" name="itemname" id="itemname">
<label>Model:</label>
<input type="text" class="form-control" placeholder="" name="itemmodel" id="itemmodel">
<label>Price:</label>
<input type="text" class="form-control" placeholder="" name="itemprice" id="itemprice">
<input type="hidden" name="suppliervalue" id="suppliervalue" value="">
         
      </div>
            
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        <button type="submit" class="btn btn-primary">Submit</button>
         
      </div>
        </form>
    </div>
  </div>
</div>
                </div>


      </div>
  


        <script>
            function updateHidden(x){
                $("#suppliervalue").val(x);
               ajaxShow(x);
    }
    
           function ajaxShow(supplierID){

             $.ajax({

        url: "ItemsOfSupplier",

        type: 'POST',

        dataType: "json",

        data: {
            supplierID : supplierID
        },

        success: function (data) {
         $("#itemtable tbody tr").remove();
         for(var i = 0; i < data.length; i++){
         $('#itemtable').append('<tr><td>' + data[i].ItemID + '</td><td>' + data[i].ItemName +'</td><td>' + data[i].ItemDesc +'</td><td>' + data[i].ItemPrice + '</td></tr>');
        }
           
        },

        error: function(XMLHttpRequest, textStatus, exception) {
            alert(XMLHttpRequest.responseText);
        }
    });}
            </script>
	  



</body>


</html>