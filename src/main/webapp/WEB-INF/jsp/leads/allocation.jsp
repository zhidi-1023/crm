<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
	<%@page import="com.zhidisoft.crm.entity.TbCrmLeadsPool"%>
	<%@page import="java.util.List"%>
	<%
	String ctxPath  = request.getContextPath();
    request.setAttribute("ctxPath", ctxPath);
    TbCrmLeadsPool leads=(TbCrmLeadsPool)request.getAttribute("leads");
    List<TbSystemUser> userlist=(List<TbSystemUser>)request.getAttribute("userlist"); 
%>
<!DOCTYPE html>
<html class="no-js">
<head>
<title>线索分配</title>
<jsp:include page="../common/_css.jsp"></jsp:include>
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
	<form class="am-form" method="post">
		<div class="am-g am-margin-top">
	     <div class="am-u-sm-8 am-u-md-4">
		     <select class="sel">
		     <option >请选择要重新分配的用户</option>
		        <% for(TbSystemUser  itme:userlist) {%>
		          			<option  value="<%=itme.getId()%>" <%=itme.getId().equals(leads.getOwneruserid())?"selected":"" %> data_id="<%=itme.getId()%>">
		          						<%=itme.getUsername() %>
		          			</option>
		          <%} %> 
		     </select>
	     </div>
	     </div>
	     <div class="am-margin">
		      <button type="submit" class="am-btn am-btn-primary am-btn-xs btnSave">提交保存</button>
		      <button type="button" class="am-btn am-btn-primary am-btn-xs">放弃保存</button>
	     </div>
    </form>

<jsp:include page="../common/_js.jsp"></jsp:include>
<script type="text/javascript">
	$(".btnSave").click(function(){
		var userid=$(".sel").val();
		var leadsId="<%=leads.getLeadsid()%>";
		$.ajax({
			url:"${ctxPath}/lead/allocation/"+leadsId,
			type:"POST",
			data:{"id":leadsId,"userid":userid},
			dataType:"json"
		})
	})
</script>
</body>
</html>