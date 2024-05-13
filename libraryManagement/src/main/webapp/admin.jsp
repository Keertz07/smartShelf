<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Book Information Form</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 0;
            padding: 0;
            background-image: url(https://acornlibrary.org/wp-content/uploads/2020/04/unnamed-6-scaled.jpg);
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }
        .container {
            max-width: 400px; /* Reduced width */
            margin: 50px auto;
            background-color: rgba(255, 255, 255, 0.8); /* Translucent white background */
            padding: 30px; /* Added padding */
            border-radius: 10px; /* Increased border radius for rounded corners */
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.3); /* Increased shadow */
        }
        h2 {
            text-align: center;
            margin-bottom: 30px; /* Added margin bottom for spacing */
        }
        label {
            font-weight: bold;
            display: block;
            margin-bottom: 5px; /* Added margin bottom for spacing */
        }
        input[type="text"],
        input[type="date"],
        input[type="number"],
        input[type="submit"] {
            width: 100%;
            padding: 10px;
            margin-bottom: 15px;
            border: 1px solid #ccc;
            border-radius: 5px;
            box-sizing: border-box;
        }
        input[type="submit"] {
    background-color: lightblue;
    color: #fff;
    cursor: pointer;
    font-size: 16px;
    width: 100px;
    margin: 0 auto; /* Center the button */
    display: block; /* Ensure it's a block element */
}
        
        input[type="submit"]:hover  {
            background-color: lightblue;
            
        }
    </style>
</head>
<body>
    <div class="container">
   <h2 style="color: white; text-align: center;">${message}</h2>
        <h2>Add Books To The Library</h2>
        <form action="addBook" method="post" onsubmit="return validateForm()" modelAttribute="bookBo">
            <input type="text" id="title" name="title" placeholder="Title"required>

            <input type="text" id="author" name="author" placeholder="Author" required>

            <input type="text" id="subject" name="subject" placeholder="Subject"required>

          	<input type="text" id="date" name="date" placeholder="Publish Year" required>

            <input type="number" id="quantity" name="quantity"placeholder="Quantity of Books" required>

            <input type="submit" value="Submit">
        </form>
    </div>    <a style="text-decoration:none;color:white;font-weight:bold;margin-left:550px;" href="index.jsp">Log Out</a>
    
</body>
</html>
