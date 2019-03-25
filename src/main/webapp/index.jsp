<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<a href="http://localhost:8080/ssm1/test.action">点我啊啊</a>
	<form action="http://localhost:8080/ssm1/testquery.action">
		<p>输入查询的部门编号：</p>
		<input type="number" step="1" min="1" max="10" name="deptno"/>
		<input type="submit" value="查询"/>
	</form>
	<form action="http://localhost:8080/ssm1/testdelete.action">
		<p>输入删除的部门编号：</p>
		<input type="number" step="1" min="1" max="10" name="deptno"/>
		<input type="submit" value="删除"/>
	</form>
</body>
</html>