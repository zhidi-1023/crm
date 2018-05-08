<%@page import="com.zhidisoft.crm.vo.MessListVO"%>
<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String ctxPath = request.getContextPath();
	request.setAttribute("ctxPath", ctxPath);
%>
<!DOCTYPE html>
<html class="no-js">
<head>
<title>Insert title here</title>
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

	<!--[if lte IE 9]>
<p class="browsehappy">你正在使用<strong>过时</strong>的浏览器，Amaze UI 暂不支持。 请 <a href="http://browsehappy.com/" target="_blank">升级浏览器</a>
  以获得更好的体验！</p>
<![endif]-->

	<header class="am-topbar am-topbar-inverse admin-header">
		<div class="am-topbar-brand">
			<strong>Amaze UI</strong> <small>后台管理模板</small>
		</div>

		<button
			class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only"
			data-am-collapse="{target: '#topbar-collapse'}">
			<span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
		</button>

		<div class="am-collapse am-topbar-collapse" id="topbar-collapse">

			<ul
				class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
				<li><a href="javascript:;"><span class="am-icon-envelope-o"></span>
						收件箱 <span class="am-badge am-badge-warning">5</span></a></li>
				<li class="am-dropdown" data-am-dropdown><a
					class="am-dropdown-toggle" data-am-dropdown-toggle
					href="javascript:;"> <span class="am-icon-users"></span> 管理员 <span
						class="am-icon-caret-down"></span>
				</a>
					<ul class="am-dropdown-content">
						<li><a href="#"><span class="am-icon-user"></span> 资料</a></li>
						<li><a href="#"><span class="am-icon-cog"></span> 设置</a></li>
						<li><a href="#"><span class="am-icon-power-off"></span>
								退出</a></li>
					</ul></li>
				<li class="am-hide-sm-only"><a href="javascript:;"
					id="admin-fullscreen"><span class="am-icon-arrows-alt"></span>
						<span class="admin-fullText">开启全屏</span></a></li>
			</ul>
		</div>
	</header>


		<!-- content start -->
		<div class="admin-content">
			<div class="admin-content-body">
				<div class="am-cf am-padding am-padding-bottom-0">
					<div class="am-fl am-cf">
						<strong class="am-text-primary am-text-lg">写信</strong> / <small>${method == 'save'?'新增':'编辑' }</small>
					</div>
				</div>

				<hr>

				${errorMsg }
				<form class="am-form" method="post">
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">内容</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="content"
								value="${message.content }">
						</div>
						<div class="am-hide-sm-only am-u-md-6">*必填，不可重复</div>
					</div>
					 <%
					     	MessListVO messageReq = (MessListVO)request.getAttribute("message");
					            List<TbSystemUser>  userList= (List<TbSystemUser>)request.getAttribute("users");
					     		
					     %>
         
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">发件人</div>
						<div class="am-u-sm-8 am-u-md-4">
						
						 <select class="am-input-sm" data-am-selected="{btnSize: 'sm'}" name="fromuserid">
						 <%for(TbSystemUser item : userList) {%>
			              <option value="<%=item.getId()%>"
			              <%
			              	if(messageReq!=null && item.getId().equals(messageReq.getFromuserid())){
			              		out.print("selected");
			              	}%> 
			              	><%=item.getUsername() %></option>
			               <%} %>
			            </select>
			          
			            
						</div>
						<div class="am-hide-sm-only am-u-md-6">*必填，不可重复</div>
					</div>
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">收件人</div>
						<div class="am-u-sm-8 am-u-md-4">
					 
						 <select class="am-input-sm" data-am-selected="{btnSize: 'sm'}" name="touserid">
						 <%for(TbSystemUser item : userList) {%>
			              <option value="<%=item.getId()%>"
			              <%
			              	if(messageReq!=null && item.getId().equals(messageReq.getTouserid())){
			              		out.print("selected");
			              	}%> 
			              	><%=item.getUsername() %></option>
			               <%} %>
			            </select>
			          
			            
						</div>
						<div class="am-hide-sm-only am-u-md-6">*必填，不可重复</div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">阅读时间</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="date" class="am-input-sm" name="readtime"
								value="<fmt:formatDate pattern = "yyyy-MM-dd" value = "${message.readtime }"/>">
						</div>
						<div class="am-hide-sm-only am-u-md-6">*必填，不可重复</div>
					</div>
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">发送时间</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="date" class="am-input-sm" name="sendtime"
								value="<fmt:formatDate pattern = "yyyy-MM-dd" value = "${message.sendtime }"/>">
						</div>
						<div class="am-hide-sm-only am-u-md-6">*必填，不可重复</div>
					</div>
					
					<div class="am-margin">
						<button type="submit" class="am-btn am-btn-primary am-btn-xs">提交保存</button>
						<button type="button" class="am-btn am-btn-primary am-btn-xs">放弃保存</button>
					</div>
				</form>



			</div>

			<footer class="admin-content-footer">
				<hr>
				<p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed
					under MIT license.</p>
			</footer>
		</div>
		<!-- content end -->

	<a href="#"
		class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu"
		data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

	<jsp:include page="../common/_js.jsp"></jsp:include>
</body>
</html>