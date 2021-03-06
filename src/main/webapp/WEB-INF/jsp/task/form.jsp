<%@page import="com.zhidisoft.crm.entity.TbCrmTask"%>
<%@page import="java.util.List"%>
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
        <li><a href="admin-index.html"><span class="am-icon-home"></span> 首页</a></li>
        <li class="admin-parent">
          <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 页面模块 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
          <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav">
            <li><a href="admin-user.html" class="am-cf"><span class="am-icon-check"></span> 个人资料<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
            <li><a href="admin-help.html"><span class="am-icon-puzzle-piece"></span> 帮助页</a></li>
            <li><a href="admin-gallery.html"><span class="am-icon-th"></span> 相册页面<span class="am-badge am-badge-secondary am-margin-right am-fr">24</span></a></li>
            <li><a href="admin-log.html"><span class="am-icon-calendar"></span> 系统日志</a></li>
            <li><a href="admin-404.html"><span class="am-icon-bug"></span> 404</a></li>
          </ul>
        </li>
        <li><a href="admin-table.html"><span class="am-icon-table"></span> 表格</a></li>
        <li><a href="admin-form.html"><span class="am-icon-pencil-square-o"></span> 表单</a></li>
        <li><a href="#"><span class="am-icon-sign-out"></span> 注销</a></li>
      </ul>

      <div class="am-panel am-panel-default admin-sidebar-panel">
        <div class="am-panel-bd">
          <p><span class="am-icon-bookmark"></span> 公告</p>
          <p>时光静好，与君语；细水流年，与君同。—— Amaze UI</p>
        </div>
      </div>

      <div class="am-panel am-panel-default admin-sidebar-panel">
        <div class="am-panel-bd">
          <p><span class="am-icon-tag"></span> wiki</p>
          <p>Welcome to the Amaze UI wiki!</p>
        </div>
      </div>
    </div>
  </div>
  <!-- sidebar end -->

<!-- content start -->
<div class="admin-content">
  <div class="admin-content-body">
    <div class="am-cf am-padding am-padding-bottom-0">
      <div class="am-fl am-cf">
        <strong class="am-text-primary am-text-lg">添加任务</strong> 
       <%--  <small>${method == 'save'?'新增':'编辑' }</small> --%>
      </div>
    </div>

    <hr>

       ${errorMsg }
    <form class="am-form" method="post">
     <%
				String method = (String)request.getAttribute("method");
				
			%>
     <div class="am-g am-margin-top">            
              
              <div class="am-u-sm-1 am-u-md-2">
                <input type="text" class="am-input-sm" value="">
              </div>
              <div class="am-u-sm-1 am-u-md-1 am-text-left" >保存</div>            
              <div class="am-hide-sm-only am-u-md-6"></div>
            </div> 
            <hr>
     <div class="am-g am-margin-top">            
              <div class="am-u-sm-4 am-u-md-1 am-text-right">基本信息 </div>            
              <div class="am-hide-sm-only am-u-md-6"></div>
            </div> 
             <hr>

			  <div class="am-g am-margin-top">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
               主题
              </div>
              <div class="am-u-sm-8 am-u-md-2">
                <input type="text" class="am-input-sm" name="subject" value="${task.subject }">
              </div>
               <div class="am-u-sm-4 am-u-md-2 am-text-right">发送通知</div>
               
               <div class="am-u-sm-4 am-u-md-2 am-text-right">站内信</div>
                
               <div class="am-u-sm-4 am-u-md-2 am-text-right">邮件</div>
              
              <div class="am-hide-sm-only am-u-md-6"></div>
            </div>
              <div class="am-g am-margin-top">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
               负责人
              </div>
              <div class="am-u-sm-8 am-u-md-4">
                <input type="text" class="am-input-sm" name="owneruserid" value="${task.owneruserid }">
              </div>
              <div class="am-hide-sm-only am-u-md-6"></div>
            </div>
              <div class="am-g am-margin-top">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
               任务相关人
              </div>
              <div class="am-u-sm-8 am-u-md-4">
                <input type="text" class="am-input-sm" name="aboutUser"value="${task.aboutUser }">
              </div>
              <div class="am-hide-sm-only am-u-md-6"></div>
            </div>
              <div class="am-g am-margin-top ">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
               选择相关
              </div>
              <div  class="am-u-sm-8 am-u-md-2">
            <select data-am-selected="{btnSize: 'sm'}">
              <option value="option1">所有类别</option>
              <option value="option2">IT业界</option>
              <option value="option3">数码产品</option>
              <option value="option3">笔记本电脑</option>
              <option value="option3">平板电脑</option>
              <option value="option3">只能手机</option>
              <option value="option3">超极本</option>
            </select>
             
          </div>
              <div class="am-u-sm-8 am-u-md-2">
                <input type="text" class="am-input-sm" >
              </div>
              <div class="am-u-sm-8 am-u-md-2 am-text-right">
                截止时间
              </div>
              <div class="am-u-sm-8 am-u-md-2">
                <input type="date" class="am-input-sm" name="duedate" value="${task.duedate }">
              </div>
              <div class="am-hide-sm-only am-u-md-6"></div>
            </div>
              <div class="am-g am-margin-top">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
               状态
              </div>
              <div  class="am-u-sm-8 am-u-md-2">
            <select data-am-selected="{btnSize: 'sm'}" name="status" >
              <option value="not_start">未启动</option>
              <option value="delay">推迟</option>
              <option value="running">进行中</option>
              <option value="finished">已完成</option>
              <option value="closed">关闭的</option>
              
            </select>
             
          </div>
               <div class="am-u-sm-4 am-u-md-4 am-text-right">
                优先级
              </div>
              <div  class="am-u-sm-8 am-u-md-2">
            <select data-am-selected="{btnSize: 'sm'}"name="priority">
              <option value="0">低</option>
              <option value="1">普通</option>
              <option value="2">高</option>
              
            </select>
             
          </div>
              <div class="am-hide-sm-only am-u-md-6"></div>
            </div>
            
            <div class="am-g am-margin-top">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
               描述
              </div>
              <div class="am-u-sm-8 am-u-md-8">
                <input type="text" class="am-input-sm" name="description" value="${task.description }">
              </div>
              <div class="am-hide-sm-only am-u-md-6"></div>
            </div>
             
          
              
            
       <div class="am-margin">
		      <button type="submit" class="am-btn am-btn-primary am-btn-xs">提交保存</button>
		      <button type="button" class="am-btn am-btn-primary am-btn-xs">放弃保存</button>
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
</body>
</html>