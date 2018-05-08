<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
<%@page import="com.zhidisoft.crm.vo.CustomerUserNameVO"%>
<%
	String ctxPath  = request.getContextPath();
    request.setAttribute("ctxPath", ctxPath);
    CustomerUserNameVO customer=(CustomerUserNameVO)request.getAttribute("customer");
    List<TbSystemUser> userlist=(List<TbSystemUser>)request.getAttribute("userlist"); 
%>
<!DOCTYPE html PUBLIC >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="${ctxPath}/static/layui/css/layui.css"  media="all">
</head>
<body>
	<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>客户池信息展示</legend>
</fieldset>

     <form action="">
     <div>
	客户名:<input type="text" name="name" value="<%=customer.getName() %>"  ><br/><br/>
     
     </div>
     <div>
      	<select id="sel" >
     <option value="">请选择要分配的用户</option>
        <% for(TbSystemUser  itme:userlist) {%>
          <option class="opt" value="<%=itme.getId()%>" <%=itme.getId().equals(customer.getOwneruserid())?"selected":"" %>><%=itme.getUsername() %></option>
          <%} %> 
        </select>
     </div>
    <div class="layui-input-block">
      <button id="sub"class="layui-btn"  lay-filter="demo1">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
    </form>
</body>
<jsp:include page="../common/_js.jsp"></jsp:include>
<script src="${ctxPath}/static/layui/layui.js" charset="utf-8"></script>
	<script type="text/javascript">
		$(function(){
			$("#sub").click(function(){
				var customerid="<%=customer.getCustomerid()%>";
				var userid = $("#sel").val(); // 选中值
				 $.ajax({
			  			url: '${ctxPath}/customer/allocation', 
			  			data :{"id":customerid,"userid":userid} , 
			  			type : 'POST',
			  			dataType:"json",
			  			success:function(resp){
			  				if(resp.errorCode!='400000'){
			  					layer.alert(resp.errorMsg)
			  					return;
			  				}
			  				layer.alert('领取成功')
			  	         }
			  		}) 
			})
		})
		
	</script>
</html>