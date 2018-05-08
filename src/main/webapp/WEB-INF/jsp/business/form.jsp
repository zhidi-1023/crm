<%@page import="com.zhidisoft.crm.entity.TbCrmCustomer"%>
<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
<%@page import="com.zhidisoft.crm.entity.TbCrmBusiness"%>
<%@page import="com.zhidisoft.crm.entity.TbCrmBusinessStatus"%>
<%@page import="com.zhidisoft.crm.entity.TbCrmContacts"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@page import="java.util.List"%>
<%@page import="com.zhidisoft.crm.vo.PageVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>	
<%
	String ctxPath  = request.getContextPath();
    request.setAttribute("ctxPath", ctxPath);
%>
<!doctype html>
<html class="no-js">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Amaze UI Admin form Examples</title>
  <meta name="description" content="这是一个form页面">
  <meta name="keywords" content="form">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="icon" type="image/png" href="${ctxPath}/static/amazeui/i/favicon.png">
  <link rel="apple-touch-icon-precomposed" href="${ctxPath}/static/amazeui/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <link rel="stylesheet" href="${ctxPath}/static/amazeui/css/amazeui.min.css"/>
  <link rel="stylesheet" href="${ctxPath}/static/amazeui/css/admin.css">
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

  <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>

  <div class="am-collapse am-topbar-collapse" id="topbar-collapse">

    <ul class="am-nav am-nav-pills am-topbar-nav am-topbar-right admin-header-list">
      <li><a href="javascript:;"><span class="am-icon-envelope-o"></span> 收件箱 <span class="am-badge am-badge-warning">5</span></a></li>
      <li class="am-dropdown" data-am-dropdown>
        <a class="am-dropdown-toggle" data-am-dropdown-toggle href="javascript:;">
          <span class="am-icon-users"></span> 管理员 <span class="am-icon-caret-down"></span>
        </a>
        <ul class="am-dropdown-content">
          <li><a href="#"><span class="am-icon-user"></span> 资料</a></li>
          <li><a href="#"><span class="am-icon-cog"></span> 设置</a></li>
          <li><a href="#"><span class="am-icon-power-off"></span> 退出</a></li>
        </ul>
      </li>
      <li class="am-hide-sm-only"><a href="javascript:;" id="admin-fullscreen"><span class="am-icon-arrows-alt"></span> <span class="admin-fullText">开启全屏</span></a></li>
    </ul>
  </div>
</header>

  <!-- sidebar start -->
  <div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
    <div class="am-offcanvas-bar admin-offcanvas-bar">
      <ul class="am-list admin-sidebar-list">
        <li><a><h2> 商机详情</h2></a></li>
        <li><a href="#"><span class="am-icon-home"></span> 基本信息</a></li>
        <li><a href="#"><span class="am-icon-home"></span> 推进历史</a></li>
        <li><a href="#"><span class="am-icon-home"></span> 沟通日志</a></li>
        <li><a href="#"><span class="am-icon-table"></span> 合同</a></li>
        <li><a href="#"><span class="am-icon-pencil-square-o"></span>任务</a></li>
        <li><a href="#"><span class="am-icon-sign-out"></span> 日程</a></li>
         <li><a href="#"><span class="am-icon-sign-out"></span> 附件</a></li>
      </ul>

      
    </div>
  </div>
  <!-- sidebar end -->

<!-- content start -->
<div class="admin-content">
  <div class="admin-content-body">
    <div class="am-cf am-padding am-padding-bottom-0">
      <div class="am-fl am-cf">
        <strong class="am-text-primary am-text-lg">基本信息</strong> 
      </div>
    </div>
</div>
    <hr>
	
					<% 
						TbCrmBusiness business=(TbCrmBusiness) request.getAttribute("business");
					   List<TbSystemUser>  userList =(List<TbSystemUser>) request.getAttribute("userList");  
						List<TbCrmCustomer>  customerList =(List<TbCrmCustomer>) request.getAttribute("customerList"); 
						List<TbCrmBusinessStatus>  businessstatusList =(List<TbCrmBusinessStatus>) request.getAttribute("businessstatusList"); 
						List<TbCrmContacts>  contactssList =(List<TbCrmContacts>) request.getAttribute("contactssList"); 
                  	%>
	
    <div class="am-tabs am-margin" data-am-tabs>
      <ul class="am-tabs-nav am-nav am-nav-tabs">
        <li class="am-active"><a href="#tab1">基本信息</a></li>
      </ul>
      
		<div class="admin-content-body">
				<div class="am-cf am-padding am-padding-bottom-0">
					<div class="am-fl am-cf">
						<strong class="am-text-primary am-text-lg">菜单管理</strong> / <small>${method == 'save'?'添加商机':'编辑' }</small>
					</div>
				</div>

				<hr>

				${errorMsg }
				<form class="am-form" method="post">
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">负责人</div>
						<div class="am-u-sm-8 am-u-md-4">
						    <select name="owneruserid">
			                    <option value=""><%="请选择负责人" %></option>	
			                  	<%for(TbSystemUser item:userList) {%>
						        <option value="<%=item.getId()%>" <%=item.getId().equals(business.getOwneruserid())?"selected":"" %> name="owneruserid"><%=item.getUsername()%></option>	
						        <%} %>		       
						      </select>
		      
							<%-- <input type="text" class="am-input-sm" name="username"
								value="${business.username}"> --%>
						</div>
						
						<div class="am-u-sm-4 am-u-md-2 am-text-right">创建时间</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="date" class="am-input-sm" name="createtime"
								value="<fmt:formatDate pattern = "yyyy-MM-dd" value = "${business.createtime}" />">
						</div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">商机金额</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="totalprice"
								value="${business.totalprice }">
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">客户</div>
						<div class="am-u-sm-8 am-u-md-4">
							<select name="Customerid">
			                    <option value=""><%="请选择客户" %></option>	
			                  	<%for(TbCrmCustomer item:customerList) {%>
						        <option value="<%=item.getCustomerid() %>" <%=item.getCustomerid().equals(business.getCustomerid())?"selected":"" %>><%=item.getName()%></option>	
						        <%} %>		       
						     </select>
							<%-- <input type="text" class="am-input-sm" name="customername"
								value="${business.customername }"> --%>
						</div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">联系人</div>
						<div class="am-u-sm-8 am-u-md-4">
							<select name="Contactsid">
			                    <option value=""><%="请选择联系人" %></option>	
			                  	<%for(TbCrmContacts item:contactssList) {%>
						        <option value="<%=item.getContactsid() %>" <%=item.getContactsid().equals(business.getContactsid())?"selected":"" %> name="Contactsid"><%=item.getName()%></option>	
						        <%} %>		       
						     </select>
							<%-- <input type="text" class="am-input-sm" name="contactsname"
								value="${business.contactsname}"> --%>
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">商机名</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="name"
								value="${business.name }">
						</div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">状态</div>
						<div class="am-u-sm-8 am-u-md-4">
							<select name="Statusid">
								<option value=""><%="请选择状态" %></option>
			                  	<%for(TbCrmBusinessStatus item:businessstatusList) {%>
					              		 <option value="<%=item.getStatusid() %>" <%=item.getStatusid().equals(business.getStatusid())?"selected":"" %> name="Statusid"><%=item.getName()%></option>
						        <%} %>		       
						     </select>
							<%-- <input type="text" class="am-input-sm" name="statusname"
								value="${business.statusname }"> --%>
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">商机类型</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="type"
								value="${business.type }">
						</div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">赢单率</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="gainrate"
								value="${business.gainrate }">
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">商机来源</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="origin"
								value="${business.origin }">
						</div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">下次联系时间</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="date" class="am-input-sm" name="nextsteptime"
								value="<fmt:formatDate pattern = "yyyy-MM-dd" value = "${business.nextsteptime}" /> ">
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">预成交价</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="estimateprice"
								value="${business.estimateprice }">
						</div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">地址</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="nextstep"
								value="${business.contractaddress }">
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">下次联系内容</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="nextstep"
								value="${business.nextstep }">
						</div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">备注</div>
							<input type="text" style="height: 200px;width: 580px;" class="am-input-sm" name="description"
								value="${business.description }">
					</div>
     
    			<div class="am-margin">
						<button type="submit" class="am-btn am-btn-primary am-btn-xs">修改</button>
						<a class="am-btn am-btn-primary am-btn-xs businessDelete"  data-id="${business.businessid }"><span class="am-icon-trash-o"></span> 删除</a>
						<a href="${ctxPath }/business/listPage" class="am-btn am-btn-primary am-btn-xs"><span class="am-icon-pencil-square-o"></span> 返回</a>
					</div>

</form>
  </div>

  <footer class="admin-content-footer">
    <hr>
    <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
  </footer>
</div>
<!-- content end -->

</div>

<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

<footer>
  <hr>
  <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
</footer>
<jsp:include page="../common/_js.jsp"></jsp:include>
<script type="text/javascript">
	$(function(){
		$(".businessDelete").click(function(){
			var dataId=$(this).attr("data-Id");
		layer.confirm('是否删除？', {
			  btn: ['确定','取消'] //按钮
			}, function(){
				$.ajax({
					url:'${ctxPath}/business/delete/'+ dataId,
					type:'DELETE',
					 success : function(data){
						   window.location.href="${ctxPath}/business/listPage";
						  }
				})
			});
		})
	})
</script>
</body>
</html>
