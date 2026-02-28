<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>

<head>
    <link href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css" rel="stylesheet">
    <link href="${pageContext.request.contextPath}/resources/css/style.css" rel="stylesheet">
    <style>
    .card-size{
    width:30vw;
    }
    body{
    background:lightGray;
    }
    </style>

</head>

<body class="container my-4">
    <div class=" d-flex justify-content-center">
      <h1> User Form</h1>
    </div>



  <form>
  <div class="d-flex justify-content-center">
    <div class=" card p-4 card-size " >
    <div class="row gap-2">
    <div clas="col-12">
    <input class="form-control" type="text" placeholder="User Name" aria-label="default input example">
    </div>
    <div clas="col-12">
    <input type="password" id="inputPassword5" class="form-control" placeholder="Password" aria-describedby="passwordHelpBlock">
    </div>
    <div clas="col-12">
    <select class="form-select" aria-label="Default select example">
      <option value="1" selected >Brazil</option>
      <option value="2">London</option>
      <option value="3">Paris</option>
    </select>
    </div>
    <div clas="col-12">

    <p>
    <strong>
        Preferred Programming Language
    </strong>
    </p>

    <div class="form-check form-check-inline">
      <input class="form-check-input" type="radio" name="lang" id="Java" value="1" checked >
      <label class="form-check-label" for="Java">Java</label>
    </div>
    <div class="form-check form-check-inline">
      <input class="form-check-input" type="radio" name="lang" id="C" value="2">
      <label class="form-check-label" for="C">C</label>
    </div>
    <div class="form-check form-check-inline">
      <input class="form-check-input" type="radio" name="lang" id="PHP" value="3" >
      <label class="form-check-label" for="PHP">PHP</label>
    </div>
    <div class="form-check form-check-inline">
      <input class="form-check-input" type="radio" name="lang" id="Ruby" value="4" >
      <label class="form-check-label" for="Ruby">Ruby</label>
    </div>
    </div>


    <div clas="col-12">
      <p>
        <strong>
            Preferred Operating System
        </strong>
      </p>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="checkbox" id="Linux" value="Linux" checked>
        <label class="form-check-label" for="Linux">Linux</label>
      </div>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="checkbox" id="Mac_OS" value="Mac_OS" checked>
        <label class="form-check-label" for="Mac_OS">Mac OS</label>
      </div>
      <div class="form-check form-check-inline">
        <input class="form-check-input" type="checkbox" id="MS_Windows" value="MS_Windows">
        <label class="form-check-label" for="MS_Windows"> MS Windows</label>
      </div>

    </div>
    <div clas="col-12" >
    <button type="button" class="btn btn-danger w-100"  >Submit</button>
    </div>
    </div>




  </div>
  </div>

  </form>



</body>
</html>