<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>返回查询结果</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
<script
	src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<div class="container">
		<h2>表格</h2>
		<table class="table">
			<thead>
				<tr>
					<th>部门编号</th>
					<th>部门名称</th>
					<th>办公地点</th>
				</tr>
			</thead>
			<tbody>
				<tr>
					<td>${dno}</td>
					<td>${dname}</td>
					<td>${dloc}</td>
				</tr>
			</tbody>
		</table>
	</div>
</body>
</html>