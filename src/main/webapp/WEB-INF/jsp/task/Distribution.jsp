<%@page import="java.util.Date"%>
<%@page import="com.zhidisoft.crm.vo.TbCrmTaskVO"%>
<%@page import="com.zhidisoft.crm.entity.TbCrmTask"%>
<%@page import="com.zhidisoft.crm.vo.PageVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String ctxPath = request.getContextPath();
	request.setAttribute("ctxPath", ctxPath);
%>
<!doctype html>
<html class="no-js">
<head>
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Amaze UI Admin form Examples</title>
<jsp:include page="../common/_css.jsp"></jsp:include>
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
		<div class="admin-content">
			<div class="admin-content-body">				
				<div >
				<form class="am-form">	
				
					<ul class="am-tabs-nav am-nav am-nav-tabs">
						<li class="am-active"><a href="${ctxPath}/task/distribution">系统基本设置</a></li>
						<li><a href="">SMTP设置</a></li>
						<li><a href="#tab3">模块字段设置</a></li>
						<li><a href="#tab3">系统菜单设置</a></li>
						<li><a href="#tab3">APP接口配置</a></li>
					</ul>
					<div class="am-g">
				<h5>默认信息</h5>
				</div>
					<div class="am-g am-margin-top">
						<div class="am-u-sm-1 am-u-md-1 am-text-left">系统名称:</div>
						<div class="am-u-sm-1 am-u-md-2">
							<input type="text" class="am-input-sm" value="">
						</div>

						<div class="am-hide-sm-only am-u-md-6"></div>
					</div>

					<div class="am-g am-margin-top">
						<div class="am-u-sm-1 am-u-md-1 am-text-left">系统描述:</div>
						<div class="am-u-sm-1 am-u-md-2">
							<input type="text" class="am-input-sm" value="">
						</div>

						<div class="am-hide-sm-only am-u-md-6"></div>
					</div>

					<div class="am-g am-margin-top">
						<div class="am-u-sm-1 am-u-md-1 am-text-left">系统名称:</div>
						<div class="am-u-sm-1 am-u-md-2">
							<input type="text" class="am-input-sm" value="选择文件">
						</div>

						<div class="am-hide-sm-only am-u-md-6"></div>
					</div>
<h5>
安全与调试
</h5>
                   <div class="am-g am-margin-top">
						<div class="am-u-sm-1 am-u-md-1 am-text-left">允许上传文件</div>
						<div class="am-u-sm-1 am-u-md-2">
							<input type="text" class="am-input-sm" value="选择文件">
						</div>

						<div class="am-hide-sm-only am-u-md-6"></div>
					</div>
					<div class="am-g am-margin-top">
						<div class="am-u-sm-1 am-u-md-1 am-text-left">类型:</div>
						<div class="am-u-sm-1 am-u-md-2">
							<input type="text" class="am-input-sm" value="选择文件">
						</div>

						<div class="am-hide-sm-only am-u-md-6"></div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-1 am-u-md-1 am-text-left">清空缓存:</div>
						<div class="am-u-sm-1 am-u-md-2">
							<input type="text" class="am-input-sm" value="选择文件">
						</div>

						<div class="am-hide-sm-only am-u-md-6"></div>
					</div>
					
					<div class="am-g am-margin-top">
						<div class="am-u-sm-1 am-u-md-1 am-text-left">调试模式</div>
						<div class="am-u-sm-1 am-u-md-2">
							<input type="text" class="am-input-sm" value="选择文件">
						</div>

						<div class="am-hide-sm-only am-u-md-6"></div>
					</div>
					<h5>
					其他设置
					</h5>
					<div class="am-g am-margin-top">
						<div class="am-u-sm-2 am-u-md-2 am-text-left">合同提醒时间: 提前</div>
						<div class="am-u-sm-1 am-u-md-2">
							<input type="text" class="am-input-sm" value="选择文件">
						</div>
						<div class="am-u-sm-1 am-u-md-1 am-text-left">天</div>
						<div class="am-hide-sm-only am-u-md-6"></div>
					</div>
					<div class="am-g am-margin-top">
						<div class="am-u-sm-2 am-u-md-2 am-text-left">设置合同 前缀</div>
						<div class="am-u-sm-1 am-u-md-2">
							<input type="text" class="am-input-sm" value="选择文件">
						</div>
						<div class="am-u-sm-1 am-u-md-1 am-text-left"></div>
						<div class="am-hide-sm-only am-u-md-6"></div>
					</div>
					<div class="am-g am-margin-top">
						<div class="am-u-sm-2 am-u-md-2 am-text-left">客户池回收周期</div>
						<div class="am-u-sm-1 am-u-md-2">
							<input type="text" class="am-input-sm" value="选择文件">
						</div>
						<div class="am-u-sm-1 am-u-md-1 am-text-left">天</div>
						<div class="am-hide-sm-only am-u-md-6"></div>
					</div>
					<div class="am-g am-margin-top">
						<div class="am-u-sm-2 am-u-md-2 am-text-left">合同提醒时 提前</div>
						<div class="am-u-sm-1 am-u-md-1">
							<input type="text" class="am-input-sm" value="选择文件">
						</div>
						<div class="am-u-sm-1 am-u-md-1 am-text-left">天</div>
						<div class="am-hide-sm-only am-u-md-6"></div>
					</div>
					
					<hr />
							</form>
						</div>
					</div>
				</div>
			
			<footer class="admin-content-footer">
				<hr>
				<p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed
					under MIT license.</p>
			</footer>

	<jsp:include page="../common/_js.jsp"></jsp:include>
	
</body>
</html>
