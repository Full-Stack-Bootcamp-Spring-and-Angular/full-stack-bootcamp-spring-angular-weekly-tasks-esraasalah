<html>
    <head>

        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">

        <%--        import Bootstrap--%>
        <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">

    </head>
    <body background="${pageContext.request.contextPath}/resources/images/background.jpg">
        <form action="userData">
            <label for ="firstName" > First Name</label>
            <input type="text"  placeholder="Enter first name" name="firstName">
            <label for="lastName" > Last Name </label>
            <input type="text" placeholder="Enter last name" name="lastName">
            <label for="dateOfBirth" > Date of Birth  </label>
            <input type="date"  placeholder="Enter date of birth" name = "dateOfBirth">
             <label for="city" >City</label>
            <input type="text" placeholder="Enter city" name="city">
            <button type="submit" class="btn btn-primary"> </button>
        </form>
    </body>
</html>
