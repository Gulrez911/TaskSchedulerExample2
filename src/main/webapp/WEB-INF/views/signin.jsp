<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="google-signin-client_id"
	content="344993853369-ciamc7kscufk610jtqc94e0psli9tr65.apps.googleusercontent.com">
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="https://apis.google.com/js/platform.js"></script>
<title>Insert title here</title>
<style>
.g-signin2 {
	margin-left: 500px;
	margin-top: 200px;
}
.data{
	display: none;
}
</style>
<script>
function onSignIn(googleUser){
	console.log("test")
	var profile = googleUser.getBasicProfile();
	$(".g-signin2").css("display","none");
	$(".data").css("display","block");
	$("#pic").attr('src',profile.getImageUrl());
	$("#email").text(profile.getEmail());
}
function signOut(){
	var auth2 = gapi.auth2.getAuthInstance();
	auth2.signOut().then(function(){
			alert("You have been successfully sign out");
			$(".g-signin2").css("display","block");
			$(".data").css("display","none");
		});
}
</script>
</head>
<body>
	<div class="g-signin2" data-onsuccess="onSignIn"></div>
	<div class="data">
		<p>Profile Details</p>
		<img alt="" src="" id="pic" class="img-circle" width="100" height="100"/>
		<p>Email Address:</p>
		<p id="email" class="aert alert-danger"></p>
		<button onclick="signOut()" class="btn btn-danger"> SignOut</button>
	</div>
</body>
</html>