<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%
	String ctxPath  = request.getContextPath();
    request.setAttribute("ctxPath", ctxPath);
%>
<!DOCTYPE html>
<html class="no-js">
<head>
<title>Insert title here</title>
<jsp:include page="common/_css.jsp"></jsp:include>
<style>
.header {
	text-align: center;
}

.header h1 {
	font-size: 200%;
	color: #333;
	margin-top: 30px;
}

.header p {
	font-size: 14px;
}
</style>
</head>
<body>
	<div class="header">
		<div class="am-g">
			<h1>京唐国际客户关系管理系统</h1>
		</div>
	</div>
	<br>
	<br>
	<br>
	<div class="am-g">
		<div class="am-u-lg-6 am-u-md-8 am-u-sm-centered">
			${errorMsg}
			<form method="post" class="am-form">
				<label for="username">用&nbsp;&nbsp;户&nbsp;&nbsp;名 :</label> 
				<input type="text" name="username" id="username" value=""> <br>
				<label for="password">密&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;码:</label> 
				<input type="password" name="password" id="password" value=""><br>
				<label for="remember-me"> 
				<input id="remember-me" type="checkbox" name="remember-me"> 记住密码
				</label> <br />
				<br />
				<div class="am-cf">
					<input type="submit" name="" value="登 录" class="am-btn am-btn-primary am-btn-sm am-fl"> 
					<input type="submit" name="" value="忘记密码 ^_^? " class="am-btn am-btn-default am-btn-sm am-fr">
				</div>
			</form>
			<hr>
			<p>© 2018 京唐国际</p>
		</div>
	</div>

	<jsp:include page="common/_js.jsp"></jsp:include>
	<script type="text/javascript">
		$(function(){
			$("input[name='remember-me']").click(function(){
				
			})
		})
	</script>

</body>
</html>