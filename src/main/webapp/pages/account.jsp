<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet"  href="../css/style.css" media="screen">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<div class="navigation-bar">
		<ul class="navigation-list">
			<li class="icon8"><img src="../images/icon8.png" alt="icon8"></li>
			<li><a href="../home.html">Home</a></li>
			<li><a href="../pages/visualizer.jsp">Visualizer</a></li>
			<li><a href="../pages/account.jsp" media="screen">Login/Sign-Up</a></li>
		</ul>
	</div>


	<div class="loginContainer">
	
		<form action="../LoginServlet" method="post">
		<h1>Login</h1>
		<div>
			<label class="form-label">First name:</label>
			<input class="form-control" type="text" name="userId"> <br>
		</div>
		
		<div>
			<label class="form-label">Last name:</label>
			<input class="form-control" type="password" name="password"> <br>
		</div>
		
			<button  class="submit" type="submit">Login</button>

		</form>
		
		
		
	</div>


</body>
</html>