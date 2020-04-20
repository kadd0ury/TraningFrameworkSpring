<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
 pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Stores</title>
<link href="<c:url value="/resources/css/bootstrap.min.css" />"
 rel="stylesheet">
<script src="<c:url value="/resources/js/jquery-1.11.1.min.js" />"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js" />"></script>

</head>
<body>

<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="index">Manage Store</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="index">Home</a></li>
      <li><a href="listC">Customer</a></li>
      <li><a href="listS">Stores</a></li>
    </ul>
  </div>
</nav>

 <div class="container">
  <div class="col-md-offset-2 col-md-7">
   <h2 class="text-center">Manage Stores</h2>
   <div class="panel panel-info">
    <div class="panel-heading">
     <div class="panel-title">Add Store</div>
    </div>
    <div class="panel-body">
     <form:form action="saveStoreS" cssClass="form-horizontal"
      method="post" modelAttribute="store">

      <!-- need to associate this data with customer id -->
      <form:hidden path="id" />

      <div class="form-group">
       <label for="nom" class="col-md-3 control-label">Title : </label>
       <div class="col-md-9">
        <form:input path="nom" cssClass="form-control" />
       </div>
      </div>
      <div class="form-group">
       <label for="adresse" class="col-md-3 control-label">Location : </label>
       <div class="col-md-9">
        <form:textarea path="adresse" cssClass="form-control" />
       </div>
      </div>
      
      <div class="form-group">
       <!-- Button -->
       <div class="col-md-offset-3 col-md-9">
        <form:button cssClass="btn btn-primary">Submit</form:button>
       </div>
      </div>

     </form:form>
    </div>
   </div>
  </div>
 </div>
</body>
</html>