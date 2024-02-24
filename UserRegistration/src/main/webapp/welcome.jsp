<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">
<title>Welcome</title>
<style>
body {
	font-family: Arial, sans-serif;
	background-color: #f2f2f2;
	padding: 20px;
}

.container {
	max-width: 600px;
	margin: 0 auto;
	background-color: #fff;
	border-radius: 10px;
	padding: 20px;
	box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
}

.container {
	text-align: center;
	margin-top: 50px;
}

.welcome-message {
	font-size: 20px;
	margin-bottom: 20px;
}

.home-button, .show-button {
	padding: 10px 10px;
	background-color: green;
	color: #fff;
	text-decoration: none;
	border: none;
	border-radius: 5px;
	margin-right: 5px;
}

.home-button:hover, .show-button:hover {
	background-color: #0056b3;
}
</style>
</head>
<body>
	<div class="container">
		<h1>Welcome</h1>
		<p class="welcome-message"> Hello, &#128100;${username.toUpperCase()}! Hoping You're Having A Great Day!</p>
		<a href="/register" class="home-button">Home</a>
		<a href="/show" class="show-button">Show</a>

	</div>
</body>
</html>
