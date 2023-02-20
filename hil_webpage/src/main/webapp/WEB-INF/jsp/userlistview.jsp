<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE>

<!-- Add JQuery library -->
<script src="https://code.jquery.com/jquery-3.6.0.slim.js" integrity="sha256-HwWONEZrpuoh951cQD1ov2HUK5zA5DwJ1DNUXaM6FsY=" crossorigin="anonymous"></script>


<html>
<title>HIL_member</title>
<body>

<header>
	<jsp:include page="header.jsp" flush="false"/>
</header>

	
	<script type="text/javascript">
		$(document).ready(function() {
		    console.log( "ready!" );
		});
		
		$(document).on("click", "#insertMemberBtn", function(){
	    	console.log( "Click event occurred!" );
	    	
	    	var addHtml="";
	    	addHtml+="<tr>"
	    	       + "<td><input type='hidden' name='userIdx' value=''></td>"
	               + "<td><input name='name' value='' class='form-control'></td>"
	               + "<td><input name='part' value='' class='form-control'></td>"
	    	       + "</tr>";
	    	$("#userListTable").append(addHtml);
	    });
		
		$(document).on("click", "#saveMemberBtn", function(){
	    	$("#userTblForm").submit(function() {
	    		var name = $("#name").val();
	    		var part = $("#part").val();
	    		alert("form submitted.");
	    	});
	
	    });
	
	</script>



	Welcome to our Homepage.
	<br>
	<form id="userTblForm" method="post" action="/useradd.do">
		<table id="userListTable" border="1" width="1" bordercolor="#17202A">
			<tbody>
				<tr>
					<td>No.</td>
					<td>Name</td>
					<td>Part</td>
				</tr>
				
				<c:forEach var="userListVo" items="${userList}" varStatus="status">
					<tr>
						<td>${status.count}</td>
						<td>${userListVo.name}</td>
						<td>${userListVo.part}</td>
					</tr>
				
				</c:forEach>
				
				
			</tbody>
		</table>
	
		<br>
		<div class="form-group">
			
			<div class="divison_class">
				<button type="button" id="insertMemberBtn" class="btn btn-default">Add User</button>
				<button type="submit" id="saveMemberBtn" class="btn btn-default">Save</button>
				<button type="button" class="btn btn-default" onclick="history.back()">Back</button>
			</div>
			
		</div>
	</form>

	<footer>
		<jsp:include page="footer.jsp" flush="false"/>
	</footer>

</body>
</html>
