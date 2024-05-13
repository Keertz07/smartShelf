<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ page isELIgnored = "false" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
    <title>Login </title>
    <style>
    	*{
    margin:0;
    padding:0;
    font-family:sans-serif;
}

.hero{
    height:100%;
    width:100%;
    background-image:linear-gradient(rgba(0,0,0,0.4),rgba(0,0,0,0.4)),url(https://acornlibrary.org/wp-content/uploads/2020/04/unnamed-6-scaled.jpg);
    background-position: center;
    background-size:cover;
	background-repeat:no-repeat;
    position:absolute;
}
.form-box{
    width:380px;
    height: 460px;
    position:relative;
    margin:6% auto;
    padding:5px; 
    border-radius:15px;
    overflow:hidden;
    background:lightcyan;
}
.button-boxes{
    width:220px;
    margin:35px auto;
    position:relative;
    box-shadow: 0 0 20px 9px #ff61241f;
    border-radius:30px;
}
.toggle-btn{
    padding: 8px ; /* Adjusted padding */
    cursor:pointer;
    background:transparent;
    border:0;
    outline:none;
    position:relative;
    color:black;
}

#btns{
    top:0;
    left:0;
    position:absolute;
    width:110px;
    height: 100%;
    background:linear-gradient(to right,grey,grey);
    border-radius:30px;
    transition:.5s;

}
.social-icons{
    margin:30px auto;
    text-align:center;
}
.social-icons img{
    width:30px;
    margin:0 12px;
    box-shadow:0 0 20px 0 #7f7f7f3d;
    cursor:pointer;
    border-radius:50%;
}
.input-group{
    top:180px;
    position:absolute;
    width:280px;
    transition: .5s;
}
.input-field{
    width:100%;
    padding:10px 0;
    margin: 5px 0;
    border-left:0;
    border-top:0;
    border-right:0;
    border-bottom:1px solid black;
    outline:none;
    background: transparent;
    color:black;
}
.submit-btns{
    width:85%;
    padding:10px 30px;
    display:block;
    cursor :pointer;
    margin:auto;
    background:linear-gradient(to right,grey,grey);
    border:0;
    outline:none;
    border-radius:30px;

}
.check-box{
    margin:30px 10px 30px 0;

}

.span{
    color:#777;
    font-size:12px;
    bottom:68px;
    position:absolute;
}
#loginss{
    left:50px;
}
#registerss{
    left:450px;
}
h1 {
text-align: center; /* You can use 'left', 'center', 'right', or 'justify' */
}
    </style>
</head>
<body>
	
    <div class="hero">
    
        <div class="form-box">
        <h1>${message}</h1>
            <div class="button-boxes">
                <div id="btns"></div>
                <button type="button" class="toggle-btn" onclick="loginss()">UserLogIn </button>
                
                <button type="button" class="toggle-btn" onclick="registerss()">AdminLogin</button>
            </div>
            <div class="social-icons">
                <img src="https://clipart-library.com/new_gallery/410617_facebook-icon-transparent-png.jpg">
                <img src="https://news.topusainsights.com/wp-content/uploads/2023/07/twitter-x-logo.jpg">
                <img src="https://www.actiondatatel.com/wp-content/uploads/2022/07/Google-icon.jpg">
            </div>
            <form action="loginUser" method="post" id="loginss" class="input-group">
                <input type="text" class="input-field" name="email" placeholder="User-Id" required>
                <input type="text" class="input-field" name="password"  placeholder="Enter Password" required>
                <br>
                <br>
                <button type="submit" class="submit-btns">Log In</button>
                
            </form>
            <form action="loginAdmin" method="post" id="registerss" class="input-group">
                <input type="text" class="input-field" name="email" placeholder="User-Id" required>
                <input type="text" class="input-field" name="password"  placeholder="Enter Password" required>
                <br>
                <br>
                <button type="submit" class="submit-btns">Log In</button>
                
            </form>
        </div>
        
    </div>
    <script>
        var x = document.getElementById("loginss");
        var y = document.getElementById("registerss");
        var z = document.getElementById("btns");

        function registerss(){
            x.style.left="-400px";
            y.style.left="50px";
            z.style.left="110px";
        }
        function loginss(){
            x.style.left="50px";
            y.style.left="450px";
            z.style.left="0px";
        }

    </script>

</body>
</html>