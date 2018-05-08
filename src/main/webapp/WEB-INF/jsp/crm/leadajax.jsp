<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
   String ctxPath  = request.getContextPath();
   request.setAttribute("ctxPath", ctxPath);
%>
<!DOCTYPE html>
<html class="no-js">
<head>
<jsp:include page="../common/_css.jsp"></jsp:include>
</head>
<meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
  <link rel="stylesheet" href="${ctxPath}/static/layui/css/layui.css"  media="all">
<body>

<header class="am-topbar am-topbar-inverse admin-header">
  <div class="am-topbar-brand">
    <strong>京唐国际 CRM</strong> <small>后台管理模板</small>
  </div>
  <button class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only" data-am-collapse="{target: '#topbar-collapse'}"><span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span></button>
</header>
  <div data-am-widget="tabs" class="am-tabs am-tabs-default">
      <ul class="am-tabs-nav am-cf">
          <li class="am-active"><a href="[data-tab-panel-0]">线索</a></li>
          <li class=""><a href="[data-tab-panel-1]">线索池</a></li>
          <li class=""><a href="[data-tab-panel-2]">统计</a></li>
      </ul>
      <div class="am-tabs-bd">
       <div data-tab-panel-0 class="am-tab-panel am-active">
				<div class="am-g">
					<div class="am-u-sm-15 am-u-md-15">
						<div class="am-btn-toolbar">
							<div class="am-btn-group am-btn-group-xs">
								<button type="button" class="am-btn am-btn-default">试图:</button>
								<a class="am-btn am-btn-default">全部</a>
								<a class="am-btn am-btn-default" >我负责的</a>
								<a class="am-btn am-btn-default">下属负责的</a>
								<a class="am-btn am-btn-default">下属创建</a>
								<a class="am-btn am-btn-default">已转换线索</a>
								<a class="am-btn am-btn-default">今日需联系</a>
								<a class="am-btn am-btn-default">本周需联系</a>
								<a class="am-btn am-btn-default">本月需联系</a>
								<a class="am-btn am-btn-default">7日未联系</a>
								<a class="am-btn am-btn-default">15日未联系</a>
								<a class="am-btn am-btn-default">30日未联系</a>
								<a class="am-btn am-btn-default">最近创建</a>
								<a class="am-btn am-btn-default">最近修改</a>
								<a class="am-btn am-btn-default">回收站</a>
							</div>
						</div>
					</div>
				</div>
				<br>
		<div class="am-dropdown am-u-sm-2 am-u-md-2" data-am-dropdown>
			<div class="am-btn am-btn-primary am-dropdown-toggle" style="height: 34px;" data-am-dropdown-toggle>
				批量操作<div class="am-icon-caret-down"></div>
			</div>
			<ul class="am-dropdown-content">
				<li><a href="#">批量删除</a></li>
				<li><a href="#">批量放入线索池</a></li>
			</ul>
		</div>
		<div class="am-dropdown am-u-sm-2 am-u-md-2" data-am-dropdown>
			<div class="am-btn am-btn-primary am-dropdown-toggle" style="height: 34px;" data-am-dropdown-toggle>
				请选择筛选条件<div class="am-icon-caret-down"></div>
			</div>
			<ul class="am-dropdown-content">
				<li><a href="#">我负责的</a></li>
				<li><a href="#">下属负责的</a></li>
				<li><a href="#">下属创建</a></li>
			</ul>
		</div>
		<div class="am-dropdown am-u-sm-1 am-u-md-1" data-am-dropdown>
			<div class="am-btn am-btn-primary am-dropdown-toggle" style="height: 34px;" data-am-dropdown-toggle>
				包含<div class="am-icon-caret-down"></div>
			</div>
			<ul class="am-dropdown-content">
				<li><a href="#">线索</a></li>
			</ul>
		</div>
        <div class="am-u-sm-2 am-u-md-2">
          <div class="am-input-group am-input-group-sm">
            <input type="text" class="am-form-field" name="searchText" value="${searchText }">
          <span class="am-input-group-btn">
            <a  class="am-btn am-btn-default" type="submit">搜索</a>
          </span>
          </div>
        </div>
        <div class="am-dropdown am-u-sm-1 am-u-md-1" data-am-dropdown>
			<div class="am-btn am-btn-primary am-dropdown-toggle" style="height: 34px;" data-am-dropdown-toggle>
			               新建线索
			</div>
			
		</div>
       
            <table class="layui-table" id="leads" lay-filter="barDemo" title="【线索】"></table>
            <script type="text/html" id="barDemo">
 				 <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="info" >查看</a>
  				 <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="trans">转换</a>
  				 <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="update">修改</a>
			</script>
     			<div class="layui-btn-group demoTable">
				</div>
          </div>
          <div data-tab-panel-1 class="am-tab-panel ">
            【彩虹】
          </div>
          <div data-tab-panel-2 class="am-tab-panel ">
            【歌唱】
          </div>
      </div>
  </div>

<jsp:include page="../common/_js.jsp"></jsp:include>
<script src="${ctxPath}/static/layui/layui.js" charset="utf-8"></script>
<script>
layui.use('table', function(){
  var table = layui.table;
  table.render({
    elem: '#leads',
    url:'${ctxPath}/leads/list',
    cols: [[
      {type:'checkbox', fixed: 'left'},
      {field:'name', width:100, title: '公司名称'},
      {field:'mobile', width:100, title: '手机'},
      {field:'email', width:160, title: '邮箱', sort: true},
      {field:'address', width:200, title: '地址', sort: true},
      {field:'source', width:100, title: '来源', sort: true},
      {field:'createtime', width:190, title: '创建时间', sort: true},
      {field:'updatetime', width:190, title: '更新时间', sort: true},
      {fixed: 'right', width:230, align:'center',title:'操作', toolbar: '#barDemo'}
    ]],
    id: 'testReload',
    page: true
  });
	//绑定查询功能
		$('.btnsearch').click(function() {
			var demoReload = $('#demoReload');
			table.reload('testReload', {
				where : {
					keyword : demoReload.val()
				}
			});
			return false;
		});

		//监听工具条
		table.on('tool(barDemo)', function(obj) {
			var data = obj.data;
			console.log(data);
			if (obj.event === 'info') {
				location.href = "${ctxPath}/leads/info/" + data.leadsid;
			} else if (obj.event === 'trans') {
				layer.confirm('真的删除行么', function(index) {
					obj.del();
					layer.close(index);
				});
			} else if (obj.event === 'update') {
				location.href = "${ctxPath}/leads/update/" + data.leadsid;
			}
		});
	});
</script>
</body>
</html>