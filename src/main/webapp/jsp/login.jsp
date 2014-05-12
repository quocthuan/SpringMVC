<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
</head>
<body>
	<div style="text-align: center">
		<h2>Login</h2>
		<form action="contacts" method="post">
			Username:<input type="text" name="username"> <br />
			Password:<input type="password" name="password"> <br /> <input
				type="submit" value="Submit">
		</form>

		<%-- <%
         	String errorString = (String)request.getAttribute("error");
         	if(errorString != null && errorString.trim().equals("true")) {
           		out.println("Incorrect login name or password. Please retry using correct login name and password.");
         	}
         %> --%>
	</div>
</body>
</html>