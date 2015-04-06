<%@page import="java.util.ArrayList"%>
<%@page import="DAO.SupplierDAO"%>
<%@page import="DAO.SupplierDAO"%>
<%@page import="Beans.SupplierBean"%>
<%@page import="Beans.SupplierBean"%>
<html>


<title> Procurement</title>
	<meta name = "viewport" content = "width=device-width, initial-scale=1", user-scalable="no">
	<meta charset = "utf-8">

<link href="css/bootstrap.min.css" rel="stylesheet">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">

<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

 <script scr="js/bootstrap.min.js"</script>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
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
          <form class="navbar-form pull-left">
              <div class="input-group" style="max-width:470px;">
                <input type="text" class="form-control" placeholder="Search" name="srch-term" id="srch-term">
                <div class="input-group-btn">
                  <button class="btn btn-default btn-primary" type="submit"><i class="glyphicon glyphicon-search"></i></button>
                </div>
              </div>
    
        </li>
      </ul>
    </div><!-- /.navbar-collapse -->
  </div><!-- /.container-fluid -->
</nav>
</div>
    </div>
    </div>
    </nav>
    </div>

    
<ol class="breadcrumb">
  <li><a href="Homepage.html">Home</a></li>
</ol>
</div>

</form>
</div>

<div class="container">
<ol class="breadcrumb">
  <li><a href="proctransaction.jsp">Go back</a></li>
</ol>
<div class="page-header">
    <h1>Procure items</h1>
</div>

<!-- Registration form - START -->
<div class="container">
    <div class="row">
        <form role="form" method="POST" action="ProcureServlet">
            <div class="col-lg-6">
                        <td>Supplier Name
                            
                            <select class = "form-control" id="supplierdropdown" name="supplierdropdown" onchange="updateHidden(this.value)">
                                
                                <option></option>
                                <% ArrayList<SupplierBean> supplierList = new SupplierDAO().getAllSuppliers();
                                for(int i = 0 ; i < supplierList.size(); i++){
                                %>
                                   <option value="<%=supplierList.get(i).getSupplierID()%>"><%=supplierList.get(i).getSupplierName()%></option>
            <%}%>
                                
                            </select><div class="panel-options">
                <a href="#" data-rel="collapse"><i class="glyphicon glyphicon-refresh"></i></a>
                
                
              </div>
                     <div class="row">
   <label for="dropdown">Add Item</label>
                          <select class="form-control " id="dropdown" name="dropdown">
                                              </select>
                          <input type="text" class="form-control" id="quantity" placeholder="quantity">
                          <br>
                          <br>
                          <button type="button" class="form-control" onclick="addItem()">Add this item</button>
                      </div>
          <div class="row">
          <div class="col-lg-12">
            <div class="content-box-large">
             
              
              
            </div>
             
              <div class="panel-body " >
                <table class="table" id="tableid" name="tableid">
                      <thead>
                        <tr >
                            <th> Item Code</th>
                            <th> Item Name </th>
                          <th>Item Description</th>
                      
                      

                          <th>Qty</th>
                          
                        </tr>
                      </thead>
                      <tbody>
                        
                      </tbody>
                    </table>
              </div>
            </div>
          </div>
            <% int userID = (Integer)session.getAttribute("userID"); %>
            <input type="hidden" name="suppliervalue" id="suppliervalue">
            <input type="hidden" name="userID" id="userID" value="<%=userID%>">
            <input type="hidden" name="quantityArray" id="quantityArray">
            <input type="hidden" name="cartArray" id="cartArray">
                <input type="submit" name="submit" id="submit" value="Submit" class="btn btn-info pull-right">
            </div></center>
        </form>

      </div>
    </div>
    </div>

               
                
             
        
        </div>
    </div>
</div>
 


<script>
    var quantityArray = new Array();
    var cartArray = new Array();
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
         $("#dropdown option").remove();
         for(var i = 0; i < data.length; i++){
        $("#dropdown").append("<option value='"+data[i].ItemID+"'>"+data[i].ItemName+"</option>"); 
        }
           
        },

        error: function(XMLHttpRequest, textStatus, exception) {
            alert(XMLHttpRequest.responseText);
        }
    });}

     function addItem(){
        var item_id = $("#dropdown").val();
        var quantity = $("#quantity").val();
        
        $.ajax({

        url: "GenerateItem",

        type: 'POST',

        dataType: "json",

        data: {
            itemID : item_id
        },

        success: function (data) {
            if(quantity){
            $("#tableid").append("<tr><td>"+data.ItemID+"</td><td>"+data.ItemName +"</td><td>"+ data.ItemDesc + "</td><td>"+ quantity +"</td></tr>");
            cartArray.push(data.ItemID);
            quantityArray.push(quantity);
            $("#cartArray").val(cartArray);
            $("#supplierdropdown").attr("disabled", "disabled");
            $("#quantityArray").val(quantityArray);
            }else
            $("#quantity").attr("placeholder", "Input quantity first!");
           
        },

        error: function(XMLHttpRequest, textStatus, exception) {
            alert(XMLHttpRequest.responseText);
        }
    });
    }
</script>
	  



</body>


</html>