
<%@page import="com.zhidisoft.crm.vo.TbCrmBusinessVO"%>
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
        <li><a href="${ctxPath}/business/listPage"><span class="am-icon-home"></span> 基本信息</a></li>
        <li><a href="${ctxPath}/business/boost"><span class="am-icon-home"></span> 推进历史</a></li>
        <li><a href="#"><span class="am-icon-home"></span> 沟通日志</a></li>
        <li><a href="#"><span class="am-icon-table"></span> 合同</a></li>
        <li><a href="#"><span class="am-icon-pencil-square-o"></span>任务</a></li>
        <li><a href="#"><span class="am-icon-sign-out"></span> 日程</a></li>
         <li><a href="#"><span class="am-icon-sign-out"></span> 附件</a></li>
      </ul>
			
      
    </div>
  </div>
  
<div class="am-cf admin-main">
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
        <li class="am-active"><a href="#tab1">商机</a></li>
        <li><a href="#tab3">统计</a></li>
        <li><a href="#tab3">帮助</a></li>
      </ul>
       <hr>
		<div class="am-g">
			<a href="#" class="am-btn am-btn-primary am-active" role="button">我负责的</a>
			<a href="#" class="am-btn am-btn-primary am-active" role="button">我创建的</a>
			<a href="#" class="am-btn am-btn-primary am-active" role="button">下属负责的</a>
			 &nbsp; &nbsp; 
			<a href="#" class="am-btn am-btn-primary am-active" role="button">今日需联系</a>
			<a href="#" class="am-btn am-btn-primary am-active" role="button">本周需联系</a>
			<a href="#" class="am-btn am-btn-primary am-active" role="button">本月需联系</a>
			<a href="#" class="am-btn am-btn-primary am-active" role="button">7日未联系</a>
			<a href="#" class="am-btn am-btn-primary am-active" role="button">15日为联系</a>
			<a href="#" class="am-btn am-btn-primary am-active" role="button">30日未联系</a>
			<a href="${ctxPath }/business/listPage?where1=week" class="am-btn am-btn-primary am-active" role="button">最近创建(本周)</a>
			<a href="#" class="am-btn am-btn-primary am-active" role="button">最近更新(本周)</a>
			&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;
			<a href="#" class="am-btn am-btn-primary am-active" role="button">回收站</a>
		</div><br/>
		
          <div class="am-g">
        <div class="am-u-sm-4 am-u-md-3">
          <div class="am-form-group">
         	<button type="button" class="am-btn am-btn-default btnDelete"><span class="am-icon-trash-o"></span> 删除</button>
            <select data-am-selected="{btnSize: 'sm'}">
              <option value="option1">--选择筛选条件--</option>
              <option value="option2">IT业界</option>
            </select>
            <select data-am-selected="{btnSize: 'sm'}">
              <option value="option1">包含</option>
              <option value="option2">IT业界</option>
            </select>
          </div>
        </div>'
      
        <div class="am-u-sm-4 am-u-md-2">
        <form>
	          <div class="am-input-group am-input-group-sm">
	            <input type="text" class="am-form-field"name="searchText" value="${searchText }">
	          <span class="am-input-group-btn">
	            <button class="am-btn am-btn-default" type="submit">搜索</button>
	          </span>
	          </div>
         </form>
        </div>
         <div class="am-u-sm-4 am-u-md-3">
          <div class="am-input-group am-input-group-sm">
              <a href="${ctxPath }/business/save" type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span>添加商机</a>
              &nbsp; &nbsp;
              &nbsp; &nbsp; 
              <a href="#" type="button" class="am-btn am-btn-default"><span class="am-icon-plus"></span>商机工具</a>   
          </div>
        </div>
      </div>
      
		
       <div class="am-g">
        <div class="am-u-sm-12">
          <form class="am-form">
            <table class="am-table am-table-striped am-table-hover table-main">
              <thead>
              <tr>
                <th class="table-check"><input type="checkbox" name="cbAll"/></th>
                <th class="table-id">编号</th>
                <th class="table-id">客户</th>
                <th class="table-title">商机名</th>
                <th class="table-type">商机来源</th>
                <th class="table-author am-hide-sm-only">下次联系时间</th>
                <th class="table-author am-hide-sm-only">下次联系内容</th>
                <th class="table-date am-hide-sm-only">负责人</th>
                <th class="table-set">创建人</th>
                <th class="table-title">创建时间</th>
                <th class="table-title">更新时间</th>
                <th class="table-title">操作</th>
              </tr>
              </thead>
             <tbody>
              <%
                PageVO<TbCrmBusinessVO> businlist = (PageVO<TbCrmBusinessVO>)request.getAttribute("businlist");
              	Integer index = 0;
                for(TbCrmBusinessVO item : businlist.getList()) {
                	index ++;
              %>
              <tr>
                <td><input type="checkbox" name="cbItem" data-id="<%=item.getBusinessid()%>"/></td>
                <td><%=index %></td>
                <td><a href="#"><%=item.getNames() %></a></td>
                <td><a href="#"><%=item.getName() %></a></td>
                <td><a href="#"><%=item.getOrigin() %></a></td>
                <td><a href="#"><%=item.getNextsteptime() %></a></td>
                <td><a href="#"><%=item.getNextstep() %></a></td>
                <td><a href="#"><%=item.getUsername()%></a></td>
                <td><a href="#"><%=item.getUsername() %></a></td>
                <td><a href="#"><%=item.getCreatetime()%></a></td>
                <td><a href="#"><%=item.getUpdatetime() %></a></td>
                
                <td>
                 <div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                      <a href="${ctxPath }/business/check/<%=item.getBusinessid()%>" class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only check" >查看</a>
                      <a href="${ctxPath }/status/update/<%=item.getBusinessid()%>" class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only tuijin" > 推进</a>
                      <a href="${ctxPath }/business/update/<%=item.getBusinessid()%>" class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span> 编辑</a>
                    </div>
                  </div>
                </td>
              </tr>
            <%} %>
              </tbody>
            </table>
            <div class="am-cf">
            
                 共 <%=businlist.getTotalCount() %> 条记录  共 <%=businlist.getTotalPage() %> 页
              <div class="am-fr">
                <ul class="am-pagination">
                 		<!-- 处理上一页 -->
                 <%if(businlist.isFirstPage()) {%>
                  <li class="am-disabled"><a href="#">上一页</a></li>
                  <%}else{ %>
                  <li class=""><a href="<%=ctxPath%>/business/listPage?pageNum=<%=businlist.getPrevPage()%>&searchText=${searchText}">上一页</a></li>
                  <%} %>
                  
                  <!-- 下一页 -->
                    <%if(businlist.isLastPage()) {%>
                  <li class="am-disabled"><a href="#">下一页</a></li>
                   <%}else{ %>
                  <li><a href="<%=ctxPath%>/business/listPage?pageNum=<%=businlist.getNextPage()%>&searchText=${searchText}">下一页</a></li>
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
		var $this = $(this);
		//console.log($this[0].checked); 1.判断是否选中
		var isChecked = $this[0].checked;
		cbItemCheck(isChecked);
	})
	
	//批量删除
	$(".btnDelete").click(function(){
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
		console.log(ids);
		
		$.ajax({
			url:'${ctxPath}/business/deleteAll',
			data: idsStr,
			type:'DELETE',
			success:function(){
				alert("删除成功");
				window.location.reload();
			}
		})
	})
})


function cbItemCheck(isChecked){
	var cbItem = $("input[name='cbItem']");
	
	cbItem.each(function(){
		var $this = $(this);
		 $this[0].checked = isChecked;
	})
}

$(function(){
	$(".tuijin").click(function(){
		var roleId=$(this).attr("data-id");
		layer.open({
			  type: 2,
			  area: ['700px', '450px'],
			  fixed: false, //不固定
			  maxmin: true,
			  content: '${ctxPath}/business/listPage'
			});alse;
	})
})

</script>
</body>
</html>
