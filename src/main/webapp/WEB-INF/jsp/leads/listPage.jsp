<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
<%@page import="com.zhidisoft.crm.vo.TbCrmLeadsVO"%>
<%@page import="com.zhidisoft.crm.entity.TbCrmLeadsPool"%>
<%@page import="java.util.List"%>
<%@page import="com.zhidisoft.crm.vo.PageVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>	
<%
	String ctxPath  = request.getContextPath();
    request.setAttribute("ctxPath", ctxPath);
    TbSystemUser user=(TbSystemUser)request.getSession().getAttribute("dbUser"); 
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
  <!-- <div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
    <div class="am-offcanvas-bar admin-offcanvas-bar">
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
  </div> -->
  <!-- sidebar end -->
 
<!-- content start -->
<div class="admin-content">
  <div class="admin-content-body">
    <div class="am-cf am-padding am-padding-bottom-0">
      <div class="am-fl am-cf">
        <strong class="am-text-primary am-text-lg">表单</strong> /
        <small>form</small>
      </div>
    </div>

    <hr>

    <div class="am-tabs am-margin" data-am-tabs>
      <ul class="am-tabs-nav am-nav am-nav-tabs">
        <li class="am-active"><a href="#tab1">线索</a></li>
        <li><a href="#tab2">线索池</a></li>
        <li><a href="#tab3">统计</a></li>
        <li><a href="#tab3">帮助</a></li>
      </ul>
       <hr>
      <div class="am-g">
        <div class="am-u-sm-6 am-u-md-4">
          <div class="am-form-group">
            <select id="select" data-am-selected="{btnSize: 'sm'}">
              <option value="option1">批量操作</option>
              <option value="option2" id="btnDelete">批量删除</option>
            </select>
            <select data-am-selected="{btnSize: 'sm'}">
              <option value="option1">--选择筛选条件--</option>
              <option value="option2">IT业界</option>
            </select>
            <select data-am-selected="{btnSize: 'sm'}">
              <option value="option1">包含</option>
              <option value="option2">IT业界</option>
            </select>
          </div>
        </div>
        <form >
        <div class="am-u-sm-4 am-u-md-3">
          <div class="am-input-group am-input-group-sm">
            <input type="text" class="am-form-field" name="searchText" value="${searchText }">
          <span>
            <button class="am-btn am-btn-default" type="submit">搜索</button>
          </span>
          </div>
        </div>
        </form>
        <div class="am-u-sm-4 am-u-md-3">
          <div class="am-form-group">
            <select data-am-selected="{btnSize: 'sm'}">
              <option value="option1">发送短信</option>
              <option value="option2">IT业界</option>
            </select>
            <select data-am-selected="{btnSize: 'sm'}">
              <option value="option1">发送邮箱</option>
              <option value="option2">IT业界</option>
            </select>
          </div>
        </div>
        
         <div class="am-u-sm-6 am-u-md-2">
          <div class="am-input-group am-input-group-sm">
              <a href="${ctxPath }/lead/save" type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新建线索</a>           
              <select data-am-selected="{btnSize: 'sm'}">
	              <option value="option1">线索工具</option>
	              <option value="option2">IT业界</option>
              </select>
          </div>
        </div>
      </div>

      <div class="am-g">
        <div class="am-u-sm-12">
          <form class="am-form">
            <table class="am-table am-table-striped am-table-hover table-main">
              <thead>
              <tr>
                <th class="table-check">
                <input type="checkbox" name="cbAll"/></th>
					<th class="table-title">公司名</th>
	                <th class="table-title">联系人姓名</th>
	                <th class="table-title">尊称</th>
	                <th class="table-title">手机</th>
	                <th class="table-title">下次联系时间</th>
	                <th class="table-title">下次联系内容</th>
	                <th class="table-title">创建人</th>
	                <th class="table-title">创建时间</th>
					<th class="table-set">操作</th>
              </tr>
              </thead>
              <tbody>
             <%
             PageVO<TbCrmLeadsVO> listLeads = (PageVO<TbCrmLeadsVO>)request.getAttribute("leadsPage");
              	Integer index = 0;
                for(TbCrmLeadsVO item : listLeads.getList()) {
                	index ++;
              %>
              <tr>
                <td><input type="checkbox" name="cbItem" data-id="<%=item.getLeadsid() %>"/></td>
                <td><a href="#"><%=item.getName() %></a></td>
                <td><a href="#"><%=item.getContactsname() %></a></td>
                <td><a href="#"><%=item.getSaltname() %></a></td>
                <td><a href="#"><%=item.getMobile() %></a></td>
                <td><a href="#"><%=item.getNextsteptime() %></a></td>
                <td><a href="#"><%=item.getNextstep() %></a></td>
                <td><a href="#"><%=item.getUsername() %></a></td>
                <td><a href="#"><%=item.getCreatetime() %></a></td>
                            
                <td>
                  <div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                     <a href="${ctxPath }/lead/info/<%=item.getLeadsid() %>">查看</a>
                     <a href="#">转换</a>
                     <a href="${ctxPath }/lead/update/<%=item.getLeadsid() %>">修改</a>
                     <a  class="draw" data-id="<%=item.getLeadsid() %>">领取</a>
                     <%-- onclick="draw('<%=item.getLeadsid() %>')" --%>
                     <a href="${ctxPath }/lead/allocation/<%=item.getLeadsid() %>">分配</a>
                    </div>
                  </div>
                </td>
              </tr>
            <%} %>
              </tbody>
            </table>
            <div class="am-cf">
               
              共 <%=listLeads.getTotalCount() %> 条记录  共<%=listLeads.getPrevPage()+1%>/<%=listLeads.getTotalPage() %> 页
              <div class="am-fr">
                <ul class="am-pagination">
                 <!-- 首页 -->
                <%if(listLeads.isFirstPage()) {%>
                  <li class="am-disabled"><a href="#">首页</a></li>
                  <%}else{ %>
                  <li class=""><a href="<%=ctxPath%>/lead/listPage?pageNum=<%=1%>&searchText=${searchText}">首页</a></li>
                  <%} %>
                   <!-- 上一页 -->
                <%if(listLeads.isFirstPage()) {%>
                  <li class="am-disabled"><a href="#">上一页</a></li>
                  <%}else{ %>
                  <li class=""><a href="<%=ctxPath%>/lead/listPage?pageNum=<%=listLeads.getPrevPage()%>&searchText=${searchText}">上一页</a></li>
                  <%} %>
              
                  <!-- 下一页 -->
                    <%if(listLeads.isLastPage()) {%>
                  <li class="am-disabled"><a href="#">下一页</a></li>
                   <%}else{ %>
                  <li><a href="<%=ctxPath%>/lead/listPage?pageNum=<%=listLeads.getNextPage()%>&searchText=${searchText}">下一页</a></li>
                    <%} %>
                     <!-- 尾页-->
                      <%if(listLeads.isLastPage()) {%>
                  <li class="am-disabled"><a href="#">尾页</a></li>
                   <%}else{ %>
                  <li><a href="<%=ctxPath%>/lead/listPage?pageNum=<%=listLeads.getTotalPage()%>&searchText=${searchText}">尾页</a></li>
                    <%} %>
                  </ul>
            </div>
            </div>
            <hr/> 
            </form>
            </div>
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

<footer>
  <hr>
  <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
</footer>
<jsp:include page="../common/_js.jsp"></jsp:include>
<script type="text/javascript">
	$(function(){
		//$("input[name='cbAll']")[0].checked=true; //设置选中
		//全选/反选
		$("input[name='cbAll']").click(function(){
			var $this=$(this);
			//console.log($this[0].checked); 1.判断是否选中
			var isChecked=$this[0].checked;
			cbItemCheck(isChecked);
		})
	})
	function cbItemCheck(isChecked){
		var cbItem = $("input[name='cbItem']");
		
		cbItem.each(function(){
			var $this = $(this);
			 $this[0].checked = isChecked;
		})
	}
	//批量删除
	$("#select").change(function(){
		 var cbItemChecked = $("input[name='cbItem']:checked");
		//console.log(cbItemChecked.length);
		if(cbItemChecked.length < 1 ){
			alert("未选中");
			return;
		}
		var ids = new Array();  //数组
		var idsStr = "";
		cbItemChecked.each(function(index,item){   //javascript 封装好的jquery对象的关系
			ids[index] = $(item).attr("data-id");
			idsStr+=$(item).attr("data-id")+",";
		})
		//console.log(ids);
		layer.confirm('是否删除？', {
			  btn: ['确定','取消'] //按钮
			}, function(){
				$.ajax({
					url:'${ctxPath}/lead/deleteAll',
					data: idsStr,
					type:'DELETE',
					success:function(){
			  			layer.msg('删除成功', {icon: 1});
			  			window.location.reload();
					}
				})
			}, function(){
			  layer.msg('确认取消', {
			    time: 20000, //20s后自动关闭
			    btn: ['确定', '取消']
			  });
			});
		return false;
	})
	$(".draw").click(function(){
		var dataId=$(this).attr("data-id");
		layer.confirm('是否领取？', {
			  btn: ['确定','取消'] //按钮
			}, function(){
				$.ajax({
					url:'${ctxPath}/lead/assign',
					data: {"id":dataId,"userid":"<%=user.getId() %>"},
					type:'POSt',
					success:function(){
			  			layer.msg('领取成功', {icon: 1});
			  			window.location.reload();
					}
				})
			}, function(){
			  layer.msg('确认取消', {
			    time: 20000, //20s后自动关闭
			    btn: ['确定', '取消']
			  });
			});
		return false;
	})
		<%-- $.ajax({
			url:'${ctxPath}/lead/assign',
			data: {"userid":"<%=user.getId() %>"},
			type:'POSt',
			success:function(){
				alert("领取成功");
	  			/* layer.msg('领取成功', {icon: 1}); */
	  			window.location.reload();
			}
		}) --%>
		<%-- layer.confirm('是否领取？', {
			  btn: ['确定','取消'] //按钮
			}, function(){
				$.ajax({
					url:'${ctxPath}/lead/assign',
					data: {"userid":"<%=user.getId() %>"},
					type:'POSt',
					success:function(){
			  			layer.msg('领取成功', {icon: 1});
			  			window.location.reload();
				})
			}, function(){
			  layer.msg('确认取消', {
			    time: 20000, //20s后自动关闭
			    btn: ['确定', '取消']
			  });
			});
		return false;
	}) --%>
</script>
</body>
</html>
