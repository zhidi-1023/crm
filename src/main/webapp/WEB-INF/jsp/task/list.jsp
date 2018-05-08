<%@page import="com.zhidisoft.crm.vo.TaskStatusVO"%>
<%@page import="com.zhidisoft.crm.vo.TbCrmTaskVO"%>
<%@page import="com.zhidisoft.crm.vo.PageVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
		
<%
	String ctxPath  = request.getContextPath();
    request.setAttribute("ctxPath", ctxPath);
%>
<!doctype html>
<html class="no-js fixed-layout">
<head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>Amaze UI Admin index Examples</title>
  <meta name="description" content="这是一个 index 页面">
  <meta name="keywords" content="index">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp" />
  <link rel="icon" type="image/png" href="${ctxPath }/static/amazeui/i/favicon.png">
  <link rel="apple-touch-icon-precomposed" href="${ctxPath }/static/amazeui/i/app-icon72x72@2x.png">
  <meta name="apple-mobile-web-app-title" content="Amaze UI" />
  <link rel="stylesheet" href="${ctxPath }/static/amazeui/css/amazeui.min.css"/>
  <link rel="stylesheet" href="${ctxPath }/static/amazeui/css/admin.css">
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

<div class="am-cf admin-main">
<div class="admin-content">
			<div class="admin-content-body">				
				<div >
				<div><hr>
					</div>
				<form class="am-form">	
	<ul class="am-tabs-nav am-nav am-nav-tabs">
						<li ><a href="${ctxPath}/task/index">任务</a></li>
						<li class="am-active"><a href="${ctxPath}/task/list">统计</a></li>
						<li><a href="#tab3">帮助</a></li>
					</ul>
						<div class="am-g">
					<div class="am-u-sm-1 am-u-md-1">				
							选择部门:
							</div>
							<div class="am-u-sm-2 am-u-md-2">
								<select >
									<option value="option1">所有类别</option>
									<option value="option2">IT业界</option>									
								</select>
						</div>
						<div class="am-u-sm-1 am-u-md-1">
							选择员工:
							</div>
							<div class="am-u-sm-1 am-u-md-1">
								<select data-am-selected="{btnSize: 'sm'}">
									<option value="option1">所有类别</option>
									<option value="option2">IT业界</option>
									
								</select>
						</div>
						<div class="am-u-sm-1 am-u-md-1">
							选择日期:
							</div>
							<div class="am-u-sm-1 am-u-md-1">
							从
							</div>
							<div class="am-u-sm-1 am-u-md-1">
								<input type="date" class="am-input-sm" name="duedate"
									value="">
							</div>
							<div class="am-u-sm-1 am-u-md-1">
							至
							</div>
							<div class="am-u-sm-1 am-u-md-1">
								<input type="date" class="am-input-sm" name="duedate"
									value="">
							</div>
							<div class="am-u-sm-1 am-u-md-1">
								搜索
							</div>
							<div class="am-u-sm-4 am-u-md-4">
							
							</div>
						</div>
						<hr>
  <!-- sidebar start -->
  <div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
    <div class="am-offcanvas-bar admin-offcanvas-bar">
      <ul class="am-list admin-sidebar-list">
               <li class="admin-parent">
          <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 选择统计内容 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
         <li class="admin-parent">
          <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 任务统计报表 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
         
         <li class="admin-parent">
          <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 任务完成情况统计 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
       </ul>
     </div>
  </div>
  <!-- sidebar end -->

  <!-- content start -->
  <div class="admin-content">
    <div class="admin-content-body">
            <div class="am-g">
        <div class="am-u-sm-12">
          <table 
            class="am-table am-table-striped am-table-hover table-main">
									<thead>
										<tr>
											<th class="table-check"><input type="checkbox"
												name="cbAll" /></th>
											<th class="table-title">ID</th>
											<th class="table-title">员工</th>
											<th class="table-title">任务总数</th>
											<th class="table-title">未启动任务</th>
											<th class="table-title">推迟中任务</th>
											<th class="table-title">进行中任务</th>
											<th class="table-title">完成的任务</th>
											
											<th class="table-set">操作</th>
										</tr>
									</thead>
									<tbody>
										<%
										PageVO<TaskStatusVO> taskPage = (PageVO<TaskStatusVO>) request.getAttribute("taskPage");
										
										Integer index = 0;
										for (TaskStatusVO item : taskPage.getList()) {
											index++;
											
										%>
									
										<tr>
											<td><input type="checkbox" name="cbItem"
												data-id="<%=item.getTaskid()%>" /></td>
											<td><%=index%></td>
											
											<td><a href="#"><%=item.getUsername()%></a></td>
											<td><a href="#"><%=item.getAllcount()%></a></td>
											<td><a href="#"><%=item.getNot_start()%></a></td>
											<td><a href="#"><%=item.getDelays()%></a></td>
											
											<td><a href="#"><%=item.getFinished()%></a></td>
											<td><a href="#"><%=item.getClosed()%></a></td>
											
										

											<td>
												<div class="am-btn-toolbar">
													<div class="am-btn-group am-btn-group-xs">
														<a href="${ctxPath}/task/update/<%=item.getTaskid() %>"
															class="am-btn am-btn-default am-btn-xs am-text-secondary"><span
															class="am-icon-pencil-square-o"></span> 查看</a>
														<a href="${ctxPath}/task/update/<%=item.getTaskid() %>"
															class="am-btn am-btn-default am-btn-xs am-hide-sm-only">
															<span class="am-icon-copy"></span> 修改
														</a>
														<a
															class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only "
															data-id="<%=item.getTaskid()%>"><span
															class="am-icon-trash-o"></span> 关闭</a>
															<!-- TODO -->
															<a
															class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only btnDelete"
															data-id="<%=item.getTaskid()%>"><span
															class="am-icon-trash-o"></span> 删除</a>

													</div>
												</div>
											</td>
										</tr>
										<%
											}
										%>
									</tbody>
          </table>
        </div>
      </div>

      <div class="am-g">
        <div class="am-u-md-6">
          <div class="am-panel am-panel-default">
           
            
          </div>
          </div>
         </div>
         </div>
         </div>
         </form>
         </div>
         </div>
         </div>
         </div>
         

<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

<!--[if lt IE 9]>
<script src="http://libs.baidu.com/jquery/1.11.1/jquery.min.js"></script>
<script src="http://cdn.staticfile.org/modernizr/2.8.3/modernizr.js"></script>
<script src="assets/js/amazeui.ie8polyfill.min.js"></script>
<![endif]-->

<!--[if (gte IE 9)|!(IE)]><!-->
<script src="assets/js/jquery.min.js"></script>
<!--<![endif]-->
<script src="assets/js/amazeui.min.js"></script>
<script src="assets/js/app.js"></script>
</body>
</html>
