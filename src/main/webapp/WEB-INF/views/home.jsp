<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<title>Home</title>
<head>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<link href='./resources/css/fontGoogle.css' rel='stylesheet'
	type='text/css'>
<style>
body {
	font-family: 'Georgia', sherif;
}
</style>
</head>
<body>
	<div class="container">
		<button onclick="window.location.href='list'" class="btn btn-primary">Student
			List</button>
		<table>
			<form:form action="save" modelAttribute="student" method="post">
				<form:hidden path="id" />
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="fName">First Name:</label>
						<form:input path="fname" class="form-control"
							placeholder="First Name" id="fName" />
					</div>
					<div class="form-group col-md-6">
						<label for="lName">Last Name:</label>
						<form:input path="lname" class="form-control"
							placeholder="Last Name" id="lName" />
					</div>
				</div>
				<div class="form-row">
					<div class="form-group col-md-6">
						<label for="email">Email</label>
						<form:input path="email" class="form-control" placeholder="Email"
							id="email" />
					</div>
					<div class="form-group col-md-6">
						<label for="pass">First Name:</label>
						<form:input path="password" class="form-control"
							placeholder="Password" id="pass" />
					</div>
				</div>
				<button class="btn btn-primary">Submit</button>
			</form:form>

		</table>

	</div>
</body>
</html>
