<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>
<html>
<title>Home</title>
<head>
<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<link rel="stylesheet" href="./resources/css/bootstrap.min.css">
<link href='./resources/css/fontGoogle.css' rel='stylesheet'
	type='text/css'>
<style>
body {
	font-family: 'Georgia', sherif;
}
</style>
<script type="text/javascript">
	function submitForm() {

		var paperElement = document.getElementById("modalPapers");

		if (!paperElement.value) {
			console.log("No files selected.")
			return;
		}
		var form = document.getElementById("myForm");
		var formData = new FormData(form);
		var xhr = getXMLHTTP();
		xhr.open('POST', "submitFiles");
		xhr.onreadystatechange = function() {
			if (xhr.readyState == 4 && xhr.status == 200) {
				console.log("Files Uploaded")
			}
		}
		xhr.send(formData);
	}

	 function getXMLHTTP() {
         var x = false;
         try {
            x = new XMLHttpRequest();
         }catch(e) {
           try {
              x = new ActiveXObject("Microsoft.XMLHTTP");
           }catch(ex) {
              try {
                  req = new ActiveXObject("Msxml2.XMLHTTP");
              }
              catch(e1) {
                  x = false;
              }
           }
        }
        return x;
      }
</script>
</head>
<body>
	<div class="container">
		<form class="form-horizontal" id="myForm" method="POST"
			enctype="multipart/form-data">
			<fieldset>
				<!-- File Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="papers"> Add
						Files </label>
					<div class="col-md-4">
						<input name="papers" id="modalPapers" type="file"
							class="filestyle" multiple data-input="false">
					</div>
				</div>
				<!-- Button -->
				<div class="form-group">
					<label class="col-md-4 control-label" for="submit"></label>
					<div class="col-md-4">
						<input type="button" value="Submit" name="submit"
							onclick="submitForm()" class="btn btn-success">
					</div>
				</div>
			</fieldset>
		</form>
	</div>
</body>
</html>
