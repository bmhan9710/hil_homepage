<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE>
<html>
<head>
<meta charset="EUC-KR">
<title>HIL</title>

</head>

<body>
    Hello ${name}
	This is the main page.

<frameset cols="30%, 70%">
	<frame src="'main/frame_i" name="frame1">
	<frame src="frame_m" name="frame2">
</frameset>


<div class="form-group">
	<div class="divison_class">
		<button type="button" class="btn btn-default" onclick="location.href='userlistview'">Enter</button>
	</div>
</div>


</body>
</html>