<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String ctxPath = request.getContextPath();
	request.setAttribute("ctxPath", ctxPath);
	TbSystemUser user = (TbSystemUser) session.getAttribute("dbUser");
%>
<!DOCTYPE html>
<html class="no-js">
<head>
<jsp:include page="../common/_css.jsp"></jsp:include>
</head>
<meta name="renderer" content="webkit">
<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="${ctxPath}/static/layui/css/layui.css"
	media="all">
<body>
	<!--[if lte IE 9]>
<p class="browsehappy">你正在使用<strong>过时</strong>的浏览器，Amaze UI 暂不支持。 请 <a href="http://browsehappy.com/" target="_blank">升级浏览器</a>
  以获得更好的体验！</p>
<![endif]-->

	<header class="am-topbar am-topbar-inverse admin-header">
		<div class="am-topbar-brand">
			<strong>京唐国际 CRM</strong> <small>后台管理模板</small>
		</div>
		<button
			class="am-topbar-btn am-topbar-toggle am-btn am-btn-sm am-btn-success am-show-sm-only"
			data-am-collapse="{target: '#topbar-collapse'}">
			<span class="am-sr-only">导航切换</span> <span class="am-icon-bars"></span>
		</button>
	</header>
	<div data-am-widget="tabs" class="am-tabs am-tabs-default">
		<ul class="am-tabs-nav am-cf">
			<li class="am-active"><a href="[data-tab-panel-0]">客户池</a></li>
			<li class=""><a href="[data-tab-panel-1]">彩虹</a></li>
			<li class=""><a href="[data-tab-panel-2]">歌唱</a></li>
		</ul>
		<div class="am-tabs-bd">
			<div data-tab-panel-0 class="am-tab-panel am-active">
				<div class="am-g">
					<div class="am-u-sm-12 am-u-md-6">
						<div class="am-btn-toolbar">
							<div class="am-u-sm-12 am-u-md-3">
								<div class="am-form-group">
									<select data-am-selected="{btnSize: 'sm'}">
										<option value="option1">客户名称</option>
										<option value="option2">客户行业</option>
										<option value="option3">创建时间</option>
										<option value="option4">更新时间</option>
										<option value="option5">创建人</option>
									</select>
								</div>
							</div>
							<!-- <select data-am-selected="{btnSize: 'sm'}">
								<option value="option1">包含</option>
								<option value="option2">IT业界</option>
							</select>
							<div class="am-u-sm-4 am-u-md-3">
								<div class="am-form-group"></div>
							</div> -->
						</div>
					</div>
					<form>
						<div class="am-u-sm-12 am-u-md-3 demoTable">
							<div class="am-input-group am-input-group-sm layui-inline">
								<input class="layui-input" name="keyword" id="demoReload"
									autocomplete="off">
									<button class="am-btn am-btn-default  btnsearch">搜索</button>
								</span>
							</div>
						</div>
						<button class="layui-btn layui-btn-normal btnsave">新建客户</button>
					</form>
				</div>
				<table class="layui-table" id="test" lay-filter="barDemo"
					title="【客户池】"></table>

				<script type="text/html" id="barDemo">
 				 <a class="layui-btn layui-btn-primary layui-btn-xs" lay-event="query" >查看</a>
 				 <a class="layui-btn layui-btn-xs update" lay-event="update">编辑</a>
  				 <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="allocation">分配</a>
  				 <a class="layui-btn layui-btn-danger layui-btn-xs" lay-event="assign">领取</a>
			</script>

				<div class="layui-btn-group demoTable"></div>
			</div>
			<div data-tab-panel-1 class="am-tab-panel ">【】</div>
			<div data-tab-panel-2 class="am-tab-panel ">【】</div>
		</div>
	</div>

	<jsp:include page="../common/_js.jsp"></jsp:include>
	<script src="${ctxPath}/static/layui/layui.js" charset="utf-8"></script>
	<script>
layui.use('table', function(){
  var table = layui.table;
  
  table.render({
    elem: '#test'
      ,url:'${ctxPath}/customer/list'
      ,cols: [[
       {type:'checkbox', fixed: 'left'}
      ,{field:'name', width:180, title: '客户名称'}
      ,{field:'industry', width:100, title: '客户行业'}
      ,{field:'rating', width:135, title: '评分', sort: true}
      ,{field:'address', width:220, title: '客户联系地址', sort: true}
      ,{field:'createtime', width:190, title: '创建时间', sort: true}
      ,{field:'updatetime', width:190, title: '更新时间', sort: true}
      ,{fixed: 'right', width:230, align:'center',title:'操作', toolbar: '#barDemo'}
    ]]
    ,id: 'testReload'
    ,page: true
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
	
	//绑定添加客户功能
	$('.btnsave').click(function() {
		//打开添加的内联窗口
    	layer.open({
    	      type: 2,
    	      title: '客户详情。',
    	      shadeClose: true,
    	      shade: false,
    	      maxmin: true, //开启最大化最小化按钮
    	      area: ['893px', '600px'],
    	      content: '${ctxPath}/customer/save'
    	    });
		return false;
	});
//监听工具条
  table.on('tool(barDemo)', function(obj){
    var data = obj.data;
    console.log(data);
    if(obj.event === 'query'){
    	//打开查看的内联窗口
    	layer.open({
    	      type: 2,
    	      title: '客户详情。',
    	      shadeClose: true,
    	      shade: false,
    	      maxmin: true, //开启最大化最小化按钮
    	      area: ['893px', '600px'],
    	      content: '${ctxPath}/customer/query/'+data.customerid
    	    });
    	
      //layer.msg('ID：'+ data.id + ' 的查看操作');
      //领取操作
    } else if(obj.event === 'assign'){
      layer.confirm('确定领取吗', function(index){
    	  $.ajax({
  			url: '${ctxPath}/customer/assign', 
  			data :{"id":data.customerid,"userid":"<%=user.getId()%>"
							},
							type : 'POST',
							dataType : "json",
							success : function(resp) {
								if (resp.errorCode != '400000') {
									layer.alert(resp.errorMsg)
									return;
								}

								layer.alert('领取成功')
							}
						})
					});
				} else if (obj.event === 'allocation') {
					//打开分配的内联窗口
					layer.open({
						type : 2,
						title : '客户分配。',
						shadeClose : true,
						shade : false,
						maxmin : true, //开启最大化最小化按钮
						area : [ '893px', '600px' ],
						content : '${ctxPath}/customer/allocation/'
								+ data.customerid
					});
				}else if (obj.event === 'update') {
					//打开编辑的内联窗口
			    	layer.open({
			    	      type: 2,
			    	      title: '客户编辑。',
			    	      shadeClose: true,
			    	      shade: false,
			    	      maxmin: true, //开启最大化最小化按钮
			    	      area: ['893px', '600px'],
			    	      content: '${ctxPath}/customer/update/'+data.customerid
			    	    });
				}
			});
		});
	</script>

</body>
</html>