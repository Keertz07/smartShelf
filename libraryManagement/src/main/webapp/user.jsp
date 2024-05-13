<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored = "false" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="ISO-8859-1">
<title>Book List</title>
<style>
    table {
        border-collapse: collapse;
        width: 100%;
    }

    th, td {
        border: 2px solid black;
        border-radius:5px;
        padding: 8px;
        text-align: left;
        color:black;
        font-weight:bold;            
    }

    th {
        background-color: #f2f2f2;
        color:black;
        font-weight:bold;
    }
    .navbar {
        height:70px;
        margin-top: -10px;
        margin-right:-10px;    
        background-color: #333;
        overflow: hidden;
        width: 100%;
    }

    .navbar a {
        float: left;
        display: block;
        color: white;
        text-align: center;
        padding: 24px 16px;
        text-decoration: none;
    }

    .navbar a:hover {
        background-color: #ddd;
        color: black;
    }
    
    /* Style for search forms */
    .search-form {
        display: flex;
        margin-bottom: 20px;
    }

    .search-form input[type="text"] {
        width: 200px;
        padding: 5px;
        margin-right: 5px;
    }

    .search-form input[type="submit"] {
        padding: 5px 10px;
        margin-right: 5px;
    }
</style>
</head>
<body>
<div class="search-form">
    <form action="searchTitle" method="post">
        <input type="text" name="title" placeholder="Title">
        <input type='submit' value='Search'>
    </form>
    <form action="searchAuthor" method="post">
        <input type="text" name="author" placeholder="Author">
        <input type='submit' value='Search'>
    </form>
    <form action="searchSubject" method="post">
        <input type="text" name="subject" placeholder="Subject">
        <input type='submit' value='Search'>
    </form>
</div>

<display:table name="${list}" requestURI="/viewbook" pagesize="10">
<display:column title="Sno" property="sno"></display:column>
<display:column title="Title" property="title"></display:column>
<display:column title="Author" property="author"></display:column>
<display:column title="Subject" property="subject"></display:column>
<display:column title="Date" property="date"></display:column>
<display:column title="Quantity" property="quantity"></display:column>
</display:table>
    <a style="text-decoration:none;color:white;font-weight:bold;margin-left:550px;" href="index.jsp">Log Out</a>

</body>
</html>
