<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="resources/style.css" />
<title>Demo Spring MVC</title>
</head>
<body>
	<div class="container">
		<div class="table-student">
			<h1>LIST STUDENTS</h1>
			<table>
				<thead>
					<th>ID</th>
					<th>NAME</th>
					<th>BIRTHDAY</th>
					<th>CLASSNAME</th>
				</thead>
				<tbody>
					<c:forEach var="student" items="${students}" varStatus="status">
						<tr>
							<td>${student.id}</td>
							<td>${student.name}</td>
							<td>${student.birthday}</td>
							<td>${student.className}</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>
</body>
</html>