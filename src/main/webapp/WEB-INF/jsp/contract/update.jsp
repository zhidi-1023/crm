<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.zhidisoft.crm.entity.TbCrmBusiness"%>
<%@page import="com.zhidisoft.crm.entity.TbCrmContract"%>
<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String ctxPath = request.getContextPath();
	request.setAttribute("ctxPath", ctxPath);
	List<TbCrmBusiness> businessList=(List<TbCrmBusiness>)request.getAttribute("business");
	TbCrmContract contract=(TbCrmContract)request.getAttribute("contract");
	Date duetime=contract.getDuetime();
	Date startdate=contract.getStartdate();
	Date enddate=contract.getEnddate();
	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd");
	 
%>
<!DOCTYPE html>
<html class="no-js">
<head>
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
	<div class="am-cf admin-main">
		<!-- content start -->
		<div class="admin-content">
			<div class="admin-content-body">
				<div class="am-cf am-padding am-padding-bottom-0">
					<div class="am-fl am-cf">
						<strong class="am-text-primary am-text-lg">合同管理</strong> / <small>编辑 </small>
					</div>
				</div>
				<hr>
				 
				${errorMsg }
				<form class="am-form" method="post">

					<div class="am-g am-margin-top">
						 <div class="am-u-sm-4 am-u-md-2 am-text-right">合同编号</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="contractnumber"
								value="${contract.contractnumber }">
						</div>
						
						<div class="am-u-sm-4 am-u-md-2 am-text-right">签约时间</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="date" class="easyui-datetimebox" name="duetime"
								value="<%=sdf.format(duetime)%>">
						</div>
					 	 
						<div class="am-u-sm-4 am-u-md-2 am-text-right">来源商机</div>
						<div class="am-u-sm-8 am-u-md-4">
							<select name="businessid">
							<%
								for ( TbCrmBusiness business : businessList) {
							%>
							<option value="<%=business.getBusinessid()%>"
							<%=business.getBusinessid().equals(contract.getBusinessid())?"selected":"" %>
							><%=business.getName()%></option>
							<%
								}
							%>
						</select>
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">联系人</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="rolename"
								disabled="disabled"  >
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">来源客户</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="rolename"
								disabled="disabled" >
						</div>
						<br>
						<br />
						<div class="am-u-sm-4 am-u-md-2 am-text-right">负责人</div>
						<div class="am-u-sm-8 am-u-md-4">
						<input type="text" class="am-input-sm"  value="<%=session.getAttribute("username")%>">
						</div>
					 
						<div class="am-u-sm-4 am-u-md-2 am-text-right">合同金额</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="price" value="${contract.price}">
						</div>

						<div class="am-u-sm-4 am-u-md-2 am-text-right">合同生效时间</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="date" class="am-input-sm" name=startdate value="<%=sdf.format(startdate)%>">
						</div>
					 <div class="am-u-sm-4 am-u-md-2 am-text-right">合同到期时间</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="date" class="am-input-sm" name="enddate" value="<%=sdf.format(enddate)%>">
						</div> 
						  <div class="am-u-sm-4 am-u-md-2 am-text-right">条件和条款</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="contractcontent"
								value="${contract.contractcontent }">
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">合同描述</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="description"
								value="${contract.description }">
						</div>  
					</div>
					<div class="am-margin">
						<button type="submit" class="am-btn am-btn-primary am-btn-xs">提交保存</button>
						<button type="button" class="am-btn am-btn-primary am-btn-xs">放弃保存</button>
					</div>
				</form>
			</div>
		</div>
		<!-- content end -->
	</div>

	<jsp:include page="../common/_js.jsp"></jsp:include>
  
   
</body>
</html>