<%@page import="com.zhidisoft.crm.vo.PageVO"%>
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
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">表格</strong> / <small>Table</small></div>
      </div>

      <hr>

      <div class="am-g">
        <div class="am-u-sm-12 am-u-md-6">
          <div class="am-btn-toolbar">
            <div class="am-btn-group am-btn-group-xs">
              <a href="${ctxPath }/user/save" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</a>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-save"></span> 保存</button>
              <button type="button" class="am-btn am-btn-default"><span class="am-icon-archive"></span> 审核</button>
              <button type="button" class="am-btn am-btn-default btnDelete"><span class="am-icon-trash-o"></span> 删除</button>
            </div>
          </div>
        </div>
        <div class="am-u-sm-12 am-u-md-3">
          <div class="am-form-group">
          </div>
        </div>
        <form>
        <div class="am-u-sm-12 am-u-md-3">
          <div class="am-input-group am-input-group-sm">
            <input type="text" class="am-form-field" name="searchText" value="${searchText }">
          <span class="am-input-group-btn">
            <button class="am-btn am-btn-default" type="submit">搜索</button>
          </span>
          </div>
        </div>
        </form>
      </div>

      <div class="am-g">
        <div class="am-u-sm-12">
          <form class="am-form">
            <table class="am-table am-table-striped am-table-hover table-main">
              <thead>
              <tr>
                <th class="table-check">
                <input type="checkbox" name="cbAll"/></th>
                <th class="table-id">ID</th>
                <th class="table-title">用户名</th>
                <th class="table-title">创建时间</th>
                <th class="table-title">用户说明</th>
                <th class="table-title">邮箱</th>
                <th class="table-set">操作</th>
              </tr>
              </thead>
              <tbody>
              <%
                PageVO<TbSystemUser> userPage = (PageVO<TbSystemUser>)request.getAttribute("userPage");
              	Integer index = 0;
                for(TbSystemUser item : userPage.getList()) {
                	index ++;
              %>
              <tr>
                <td><input type="checkbox" name="cbItem" data-id="<%=item.getId() %>"/></td> 
                <td><%=index %></td>
                <td><%=item.getUsername() %></td>
                <td><%=item.getCreatetime() %></td>
                <td><%=item.getUsernote() %></td>
                <td><%=item.getEmail() %></td>
                <td>
                  <div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                      <a href="${ctxPath }/user/update/<%=item.getId() %>" class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span> 编辑</a>
                      <button class="am-btn am-btn-default am-btn-xs am-hide-sm-only"><span class="am-icon-copy"></span> 复制</button>
                      <a class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only userDelete" data-id="<%=item.getId() %>"><span class="am-icon-trash-o"></span> 删除</a>
                      <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only btnRole" data-id="<%=item.getId() %>"><span class="am-icon-trash-o"></span> 分配角色</button>           
                    </div>
                  </div>
                </td>
              </tr>
            <%} %>
              </tbody>
            </table>
            <div class="am-cf">
            
              共 <%=userPage.getTotalCount() %> 条记录  共 <%=userPage.getTotalPage() %> 页
              <div class="am-fr">
                <ul class="am-pagination">
                
                	<!-- 处理上一页 -->
                 <%if(userPage.isFirstPage()) {%>
                  <li class="am-disabled"><a href="#">上一页</a></li>
                  <%}else{ %>
                  <li class=""><a href="<%=ctxPath%>/user/listPage?pageNum=<%=userPage.getPrevPage()%>&searchText=${searchText}">上一页</a></li>
                  <%} %>
                  
                  <!-- 下一页 -->
                    <%if(userPage.isLastPage()) {%>
                  <li class="am-disabled"><a href="#">下一页</a></li>
                   <%}else{ %>
                  <li><a href="<%=ctxPath%>/user/listPage?pageNum=<%=userPage.getNextPage()%>&searchText=${searchText}">下一页</a></li>
                    <%} %>
                </ul>
              </div>
            </div>
            <hr />
            <p>注：.....</p>
          </form>
        </div>

      </div>
    </div>
    
    <footer class="admin-content-footer">
      <hr>
      <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
    </footer>
  </div>
  <!-- content end -->
</div>

<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

<jsp:include page="../common/_js.jsp"></jsp:include>
<script type="text/javascript">
$(function(){
	//全选,反选
	$("input[name='cbAll']").click(function(){
		var $this = $(this);
		var isChecked = $this[0].checked;
		cbItemCheck(isChecked);
	})
	//批量删除
	$(".btnDelete").click(function(){
		var cbItemChecked = $("input[name='cbItem']:checked");
		if(cbItemChecked.length < 1){
			alert("未选中");
			return;
		}
		var idsStr = "";
		cbItemChecked.each(function(index,item){
			idsStr += $(item).attr("data-id") + ",";
		})
		$.ajax({
			url:'<%=ctxPath%>/user/deleteAll', 
			data : idsStr ,
			type : 'DELETE',
			success : function(){
				 layer.msg('删除成功', {icon: 1});
				 window.location.reload();
			}
		})
	})
	//打开分配角色弹出框
	$(".btnRole").click(function(){
		var userId = $(this).attr("data-id");
		layer.open({
			  type: 2,
			  area: ['700px', '450px'],
			  fixed: false, //不固定
			  maxmin: true,
			  content: '${ctxPath}/user/role/'+userId
		});
		return false;
	})
})
function cbItemCheck(isChecked){
	var cbItem = $("input[name='cbItem']");
	cbItem.each(function(){
		var $this = $(this);
		$this[0].checked = isChecked;
	})
}
</script>

<script type="text/javascript">
    //单条删除
	$(function(){
		$(".userDelete").click(function(){
			var dataId=$(this).attr("data-id");
			layer.confirm('确认要删除？', {
				  btn: ['确定','取消'] //按钮
			}, function(){
				$.ajax({
					url:'${ctxPath}/user/delete/'+dataId,
					type:'DELETE',
					success:function(){
						 layer.msg('删除成功', {icon: 1});
						 window.location.reload();
					}
				})
			 
			}, function(){
			  layer.msg('确定取消?', {
			    time: 20000, //20s后自动关闭
			    btn: ['确定', '知道了']
			  });
				});
		})
	})
</script>
</body>
</html>