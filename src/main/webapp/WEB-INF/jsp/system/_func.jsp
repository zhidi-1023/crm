<%@page import="com.zhidisoft.crm.entity.TbSystemRoleFunctionKey"%>
<%@page import="com.zhidisoft.crm.entity.TbSystemFunction"%>
<%@page import="com.zhidisoft.crm.vo.UserRoleVO"%>
<%@page import="com.zhidisoft.crm.entity.TbSystemRole"%>
<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
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
        <strong class="am-text-primary am-text-lg">角色管理</strong> /
        <small>分配菜单</small>
      </div>
    </div>

    <hr>
		<% 
            TbSystemRole role = (TbSystemRole)request.getAttribute("role");
		    List<TbSystemFunction> funcList = (List<TbSystemFunction>)request.getAttribute("funcList");
		    List<TbSystemRoleFunctionKey> funcBySelect = ( List<TbSystemRoleFunctionKey>)request.getAttribute("funcBySelect");
         %>
                  	
    <form class="am-form" method="post">
            <div class="am-g am-margin-top">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
                角色名
              </div>
              <div class="am-u-sm-8 am-u-md-4">
                <input type="text" class="am-input-sm" name="username" value="${role.rolename }" readonly>
              </div>
              <div class="am-hide-sm-only am-u-md-6"></div>
            </div>
            
            <div class="am-g am-margin-top">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
                菜单列表
              </div>
              <div class="am-u-sm-8 am-u-md-4">
              <%for(TbSystemFunction item : funcList){ %>
			   <label class="am-checkbox-inline">
			     <input type="checkbox" name="cbItem" value="<%=item.getId() %>" 
			     <%for(TbSystemRoleFunctionKey funcId : funcBySelect){ %>
			     <%if(item.getId().equals(funcId.getFuncid())){ %>
			     checked="checked" 
			     <%} %>
			     <%} %>
			     ><%=item.getFuncname() %>
			   </label>
			  <%} %>
              </div>
              <div class="am-hide-sm-only am-u-md-6"></div>
            </div>
            
			 <div class="am-margin">
		      <button type="button" class="am-btn am-btn-primary am-btn-xs btnSave">提交保存</button>
		      <button type="button" class="am-btn am-btn-primary am-btn-xs btnGiveUp">放弃保存</button>
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
var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
$(function(){
	
	$(".btnSave").click(function(){
		var cbItemChecked = $("input[name='cbItem']:checked");
		if(cbItemChecked.length < 1 ){
			alert("未选中");
			return;
		}
		var funcIds = "";
		cbItemChecked.each(function(index,item){   //javascript 封装好的jquery对象的关系
			funcIds+=$(item).val()+",";
		})
		$.ajax({
			type:'POST',
			data:{"funcIds":funcIds},
			success:function(){
			  parent.layer.close(index);
			}
		})
		return false;
	})
	
	$(".btnGiveUp").click(function(){
		parent.layer.close(index);
	})
}) 
</script>
</body>
</html>