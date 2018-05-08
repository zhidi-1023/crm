<%@page import="java.util.List"%>
<%@page import="com.zhidisoft.crm.vo.PageVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>	
<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
<%@page import="com.zhidisoft.crm.entity.TbCrmProduct"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>	
	
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
    <strong>京唐国际客户管理</strong> <small>管理</small>
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

<div class="am-cf admin-main">
  <!-- sidebar start -->
  <div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
    <div class="am-offcanvas-bar admin-offcanvas-bar">
      <ul class="am-list admin-sidebar-list">
        <li><a><h2>产品详情</h2></a></li>
        <li><a href="${ctxPath}/product/list"><span class="am-icon-home"></span>产品列表</a></li>
        <li><a href="#"><span class="am-icon-home"></span> 产品分类</a></li>
        <li><a href="${ctxPath}/product/list"><span class="am-icon-home"></span> 产品搜索</a></li>
    
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

    <div class="am-tabs am-margin" data-am-tabs>
      <ul class="am-tabs-nav am-nav am-nav-tabs">
        <li class="am-active"><a href="#tab1">基本信息</a></li>
      </ul>
      
		<div class="admin-content-body">
				<div class="am-cf am-padding am-padding-bottom-0">
					<div class="am-fl am-cf">
						<strong class="am-text-primary am-text-lg">查看列表</strong> / <small>${method == 'save'?'添加商机':'编辑' }</small>
					</div>
				</div>

				<hr>
				   <%
    		List<TbSystemUser> userList =(List<TbSystemUser>) request.getAttribute("userList");
  		List<TbCrmProduct> productList = (List<TbCrmProduct>)request.getAttribute("productList");

    %>

				${errorMsg }
				<form class="am-form" method="post">
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">产品名称</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="name"
								value="${product.name }">
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">产品类别</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="cname"
								value="${product.cname }">
						</div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">成本价</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="costprice"
								value="${product.costprice }">
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">创建者</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="username"
								value="${product.username }">
						</div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">详情链接</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="link"
								value="${product.link}">
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">研发时间</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="developmenttime"
								value="<fmt:formatDate pattern = "yyyy-MM-dd" value ="${product.developmenttime}"/>">
						</div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right"> 开发团队</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="developmentteam"
								value="${product.developmentteam }">
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">建议售价</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="suggestedprice"
								value="${product.suggestedprice }">
						</div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right"> 创建时间</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="createtime"
								value="<fmt:formatDate pattern = "yyyy-MM-dd" value ="${product.createtime}"/>">
						</div>
						<div class="am-u-sm-4 am-u-md-2 am-text-right">更新时间</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="text" class="am-input-sm" name="updatetime"
								value="<fmt:formatDate pattern = "yyyy-MM-dd" value ="${product.updatetime}"/>">
						</div>
					</div>
					
					<%-- <div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">下次联系时间</div>
						<div class="am-u-sm-8 am-u-md-4">
							<input type="date" class="am-input-sm" name="nextsteptime"
								value="${product.nextsteptime }">
						</div>
						</div> --%>
					
				
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-4 am-u-md-2 am-text-right">备注</div>
							<input type="text" style="height: 200px;width: 580px;" class="am-input-sm" name="description"
								value="${product.description }">
					</div>
     
    			<!-- <div class="am-margin">
						<button type="submit" class="am-btn am-btn-primary am-btn-xs">修改</button>
						<button type="button" class="am-btn am-btn-primary am-btn-xs">删除</button>
						<button type="button" class="am-btn am-btn-primary am-btn-xs">返回</button>
					</div> -->

</form>
  </div>

  <footer class="admin-content-footer">
    <hr>
    <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
  </footer>
</div>
<!-- content end -->

</div>
</div>
<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

<footer>
  <hr>
  <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
</footer>
</body>
</html>
