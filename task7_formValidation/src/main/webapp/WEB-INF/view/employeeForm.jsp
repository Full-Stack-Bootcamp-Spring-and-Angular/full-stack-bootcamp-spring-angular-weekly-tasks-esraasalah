<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Styled Form</title>

    <!-- Link to custom stylesheet -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

 <style>
 .card-size {
 width : 40vw ;
 }
 </style>




</head>
<body class="container my-4" >
  <div class=" d-flex justify-content-center">
      <h1> Employee Form</h1>
  </div>


   <form:form  action="employeeData" modelAttribute ="employee" >
    <div class="d-flex justify-content-center">
      <div class=" card p-4 card-size " >
      <div class="row gap-2">


      <div class="col-12 m-1">
      <label for="empName">Employee Name</label>
      <form:input class="form-control"
                   path="name"
                   type="text"
                   placeholder="Enter Employee Name"
                   id="empName"
                   aria-label="default input example" />
       <form:errors path="name" cssClass="error"/>

      </div>

<div class="col-12  m-1 ">
       <label for="empName">Employee Email</label>
      <form:input class="form-control"
                   path="email"
                   type="text"
                   placeholder="Enter Employee Email "
                   id="empEmail"
                   aria-label="default input example"
                    name="employeeName"/>
         <form:errors path="email" cssClass="error"/>

      </div>

        <div class="col-12 m-1 ">
             <label for="empPassword">Employee Password</label>
          <form:input type="password"
                       path="password"
                      class="form-control"
                      placeholder="Enter Password"
                      id="empPassword"
                      aria-describedby="passwordHelpBlock"/>

          </div>

             <div class="col-12 m-1 ">
                       <label for="empConfirmPassword">Confirm Password</label>
                         <input type="password"

                                     class="form-control"
                                     placeholder="Confirm Password"
                                     id="empConfirmPassword"
                                     aria-describedby="passwordHelpBlock"/>

                         </div>

              <div class="col-12 mx-1 my-4 ">
              <input  type = "submit"  class="btn btn-primary"  >Submit</button>
              </div>
</div>



        </form:form>




</body>
</html>