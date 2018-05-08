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
<%
   String username = (String)session.getAttribute("username");
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
						<li class="am-active"><a href="${ctxPath}/task/index">任务</a></li>
						<li><a href="${ctxPath}/task/list">统计</a></li>
						<li><a href="#tab3">帮助</a></li>
					</ul>
					
					<hr>
					<div class="am-g">
						
							<div class="am-u-sm-15 am-u-md-15">
								<div class="am-btn-toolbar">
									<div class="am-btn-group am-btn-group-xs">
										<button type="button" class="am-btn am-btn-default">
											<span>试图:</span>
										</button>
										<a href="${ctxPath}/task/index" class="am-btn am-btn-default"><span>全部</span></a>
										
										<a class="am-btn am-btn-default" href="${ctxPath}/task/index?username=${username}">
											<span>我的任务</span>
										</a>
										
										<%-- <a href="${ctxPath}/task/index?where1=mycreate" class="am-btn am-btn-default" ><span>我分配的任务</span></a>
									 --%>
										<a class="am-btn am-btn-default" href="${ctxPath}/task/index?status=not_start"><span>未启动</span></a>										
										<a class="am-btn am-btn-default" href="${ctxPath}/task/index?status=delay"><span>推迟</span></a>									
										 <a class="am-btn am-btn-default" href="${ctxPath}/task/index?status=running"><span>进行中</span></a> 									
										<a class="am-btn am-btn-default" href="${ctxPath}/task/index?status=finished"><span>已完成</span></a>										
										<a class="am-btn am-btn-default" href="${ctxPath}/task/index?status=closed"><span>关闭的</span></a>
										
										<button class="am-btn am-btn-default" type="submit"><span>今日截止</span></button>
										
										<a class="am-btn am-btn-default" href="${ctxPath}/task/index?date1=week"><span>本周截止</span></a>
										
										<button class="am-btn am-btn-default" type="submit"><span>本月截止</span></button>
										
										<button class="am-btn am-btn-default" type="submit"><span>最近分配</span></button>
										
										<button class="am-btn am-btn-default" type="submit"><span>最近更新</span></button>
										
										<button class="am-btn am-btn-default" type="submit"><span>回收站</span></button>
									</div>
								</div>
							</div>
						
					</div>
					<hr>
					<div class="am-g">
					<div class="am-u-sm-2 am-u-md-1">
			          <div class="am-btn-toolbar">
			            <div class="am-btn-group am-btn-group-xs">
<%-- 			              <a type="button" class="am-btn am-btn-default btnDelete" data-id="<%=item.getId() %>"><span class="am-icon-trash-o"></span> 删除</a>
 --%>			            </div>
			          </div>
			        </div>
						<div class="am-u-sm-6 am-u-md-3">
							<div class="am-form-group">
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

						</div>
						
							<div class="am-u-sm-12 am-u-md-3">
								<div class="am-input-group am-input-group-sm">
									<input type="text" class="am-form-field" name="searchText"
										value="${searchText }"> <span
										class="am-input-group-btn">
										<button class="am-btn am-btn-default" type="submit">搜索</button>
									</span>
								</div>
							</div>
						

						<div class="am-u-sm-4 am-u-md-3">
							<div class="am-input-group am-input-group-sm">
								<a href="${ctxPath}/task/save" class="am-btn am-btn-default"><span
									class="am-icon-plus"></span> 新增任务</a>
							</div>

						</div>
						<div class="am-u-sm-1 am-u-md-3">
							<div class="am-input-group am-input-group-sm">
								<button type="button" class="am-btn am-btn-default">
									<span class="am-icon-plus"></span> 任务工具
								</button>
							</div>
						</div>
					
					</div>
					<hr>
					<div class="am-g">
						<div class="am-u-sm-12">
																				
								<table
									class="am-table am-table-striped am-table-hover table-main">
									<thead>
										<tr>
											<th class="table-check"><input type="checkbox"
												name="cbAll" /></th>
											<th class="table-title">ID</th>
											<th class="table-title">主题</th>
											<th class="table-title">关联信息</th>
											<th class="table-title">负责人</th>
											<th class="table-title">状态</th>
											<th class="table-title">优先级</th>
											<th class="table-title">创建人</th>
											<th class="table-title">截止时间</th>
											<th class="table-set">操作</th>
										</tr>
									</thead>
									<tbody>
										<%
										PageVO<TbCrmTaskVO> taskPage = (PageVO<TbCrmTaskVO>) request.getAttribute("taskPage");
										
										Integer index = 0;
										for (TbCrmTaskVO item : taskPage.getList()) {
											index++;
											
										%>
									
										<tr>
											<td><input type="checkbox" name="cbItem"
												data-id="<%=item.getTaskid()%>" /></td>
											<td><%=index%></td>
											
											<td><a href="#"><%=item.getSubject()%></a></td>
											<td><a href="#"><%=item.getAboutUser()%></a></td>
											<td><a href="#"><%=item.getUsername()%></a></td>
											<td><a href="#"><%=item.getStatus()%></a></td>
											<td><a href="#"><%=item.getPriority()%></a></td>
											<td><a href="#"><%=item.getUsername()%></a></td>
											<td><a href="#">
											<%  
											Date date =new Date();
											if(item.getDuedate()!=null){
												 long diff=item.getDuedate().getTime()-date.getTime();
												 long enddiff=diff;
												 long nd = 1000 * 24 * 60 * 60;
											    long nh = 1000 * 60 * 60;
											    long nm = 1000 * 60;
											 // 计算差多少天
											    long day = enddiff / nd;
											    // 计算差多少小时
											    long hour = enddiff % nd / nh;
											    // 计算差多少分钟
											    long min = enddiff % nd % nh / nm;
											    if(diff>0){
											
											
											 
										 
											    	
											   
											%>
											<%-- <%=item.getDuedate()%> --%>
											
											
											<%=day%>天<%=hour%>时<%=min%>分
											<%}else{ %>
											已截止
											<%}
											    }%>
											</a></td>
										

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
								<div class="am-cf">

									共
									<%=taskPage.getTotalCount()%>
									条记录 共<%=taskPage.getPrevPage() + 1%>/<%=taskPage.getTotalPage()%>
									页
									<div class="am-fr">
										<ul class="am-pagination">
											<!-- 首页 -->
											<%
												if (taskPage.isFirstPage()) {
											%>
											<li class="am-disabled"><a href="#">首页</a></li>
											<%
												} else {
											%>
											<li class=""><a
												href="<%=ctxPath%>/task/index?pageNum=<%=1%>&searchText=${searchText}">首页</a></li>
											<%
												}
											%>
											<!-- 上一页 -->
											<%
												if (taskPage.isFirstPage()) {
											%>
											<li class="am-disabled"><a href="#">上一页</a></li>
											<%
												} else {
											%>
											<li class=""><a
												href="<%=ctxPath%>/task/index?pageNum=<%=taskPage.getPrevPage()%>&searchText=${searchText}">上一页</a></li>
											<%
												}
											%>

											<!-- 下一页 -->
											<%
												if (taskPage.isLastPage()) {
											%>
											<li class="am-disabled"><a href="#">下一页</a></li>
											<%
												} else {
											%>
											<li><a
												href="<%=ctxPath%>/task/index?pageNum=<%=taskPage.getNextPage()%>&searchText=${searchText}">下一页</a></li>
											<%
												}
											%>
											<!-- 尾页-->
											<%
												if (taskPage.isLastPage()) {
											%>
											<li class="am-disabled"><a href="#">尾页</a></li>
											<%
												} else {
											%>
											<li><a
												href="<%=ctxPath%>/task/index?pageNum=<%=taskPage.getTotalPage()%>&searchText=${searchText}">尾页</a></li>
											<%
												}
											%>
										</ul>
									</div>
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
	<script type="text/javascript">
	$(function(){
		$(".btnDelete").click(function(){
			var dataId=$(this).attr("data-id");
			layer.confirm('是否要删除？', {
				  btn: ['确定','取消'] //按钮
			}, function(){
				$.ajax({
					url:'${ctxPath }/task/delete/'+dataId,
					type:'DELETE',
					success:function(){
						layer.msg('删除成功', {icon: 1});
						window.location.reload();
					}
					
				})
			 
			}, function(){
			  layer.msg('取消删除', {
			    time: 20000, //20s后自动关闭
			    btn: ['明白了', '知道了']
			  });
			});
			
		})
		
	})
</script>
</body>
</html>
