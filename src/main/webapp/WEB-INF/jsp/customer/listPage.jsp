<%@page import="com.zhidisoft.crm.vo.PageVO"%>
<%@page import="java.util.List"%>
<%@page import="com.zhidisoft.crm.entity.TbCrmCustomer"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String ctxPath = request.getContextPath();
	request.setAttribute("ctxPath", ctxPath);
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
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
						<li><a href="#"><span class="am-icon-power-off"></span>退出</a></li>
					</ul></li>
				<li class="am-hide-sm-only"><a href="javascript:;"
					id="admin-fullscreen"><span class="am-icon-arrows-alt"></span>
						<span class="admin-fullText">开启全屏</span></a></li>
			</ul>
		</div>
	</header>

	<!-- content start -->
	<div class="admin-content">
		<div class="admin-content-body">
			<div class="am-cf am-padding am-padding-bottom-0">
				<div class="am-fl am-cf">
					<strong class="am-text-primary am-text-lg">表格</strong> / <small>Table</small>
				</div>
			</div>

			<hr>

			<div class="am-g">
				<div class="am-u-sm-12 am-u-md-6">
					<div class="am-btn-toolbar">
						<div class="am-btn-group am-btn-group-xs">
							<a  href="${ctxPath}/customer/save"
								type="button" class="am-btn am-btn-default">
								<span class="am-icon-plus"></span> 新增
							</a>
							<button type="button" class="am-btn am-btn-default">
								<span class="am-icon-save"></span> 保存
							</button>
							<button type="button" class="am-btn am-btn-default">
								<span class="am-icon-archive"></span> 审核
							</button>
							<button type="button" class="am-btn am-btn-default btnDelete">
								<span class="am-icon-trash-o"></span> 删除
							</button>
						</div>
					</div>
				</div>
				<div class="am-u-sm-12 am-u-md-3">
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
									value="${searchText}"> <span
							class="am-input-group-btn">
							<button class="am-btn am-btn-default" type="button">搜索</button>
						</span>
					</div>
				</div>
			</div>

			<div class="am-g">
				<div class="am-u-sm-12">
					<form class="am-form">
						<table class="am-table am-table-striped am-table-hover table-main">
							<thead>
								<tr>
									<th class="table-check"><input type="checkbox"
										name="cbAll" /></th>
									<th class="table-id">ID</th>
									<th class="table-title">客户名称</th>
									<th class="table-title">客户行业</th>
									<th class="table-title">客户星级</th>
									<th class="table-title">客户联系地址</th>
									<th class="table-title">负责人</th>
									<th class="table-title">创建人</th>
									<th class="table-title">创建时间</th>
									<th class="table-title">更新时间</th>
									<th class="table-set">操作</th>
								</tr>
							</thead>
							<tbody>
								<%
									PageVO<TbCrmCustomer> customerPage = (PageVO<TbCrmCustomer>) request.getAttribute("customerList");
									Integer index = 0;
									for (TbCrmCustomer item : customerPage.getList()) {
										index++;
								%>
								<tr>
									<td><input type="checkbox" name="cbItem"
										data-id="<%=item.getCustomerid()%>" /></td>
									<td><%=index%></td>
									<td><a href="#"><%=item.getName()%></a></td>
									<td><a href="#"><%=item.getIndustry()%></a></td>
									<td><a href="#"><%=item.getRating()%></a></td>
									<td><a href="#"><%=item.getAddress()%></a></td>
									<td><a href="#"><%=session.getAttribute("username")%></a></td>
									<td><a href="#"><%=session.getAttribute("username")%></a></td>
									<td><a href="#"><%=item.getCreatetime()%></a></td>
									<td><a href="#"><%=item.getUpdatetime()%></a></td>
									<td>
										<div class="am-btn-toolbar">
											<div class="am-btn-group am-btn-group-xs">
												<a
													href="${ctxPath}/customer/list/<%=item.getCustomerid()%>"
													class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only">
													<span class="am-icon-trash-o "></span> 查看
												</a> 
												<a
													href="${ctxPath}/customer/update/<%=item.getCustomerid()%>"
													class="am-btn am-btn-default am-btn-xs am-text-secondary">
													<span class="am-icon-pencil-square-o"></span> 编辑
												</a>
											</div>
										</div>
									</td>
								</tr>
								<%
									}
								%>
							</tbody>
						</table>
						共 <%=customerPage.getTotalCount()%> 条记录
						共 <%=customerPage.getTotalPage() %> 页
						<div class="am-fr">
							<ul class="am-pagination">
								<!-- 处理上一页 -->
								<%
									if (customerPage.isFirstPage()) {
								%>
								<li class="am-disabled"><a href="#">上一页</a></li>
								<%
									} else {
								%>
								<li class=""><a
									href="<%=ctxPath%>/customer/listPage?pageNum=<%=customerPage.getPrevPage()%>&searchText=${searchText}">上一页</a></li>
								<%
									}
								%>
								<!-- 下一页 -->
								<%
									if (customerPage.isLastPage()) {
								%>
								<li class="am-disabled"><a href="#">下一页</a></li>
								<%
									} else {
								%>
								<li><a
									href="<%=ctxPath%>/customer/listPage?pageNum=<%=customerPage.getNextPage()%>&searchText=${searchText}">下一页</a></li>
								<%
									}
								%>
							</ul>
						</div>
					</form>
				</div>
				<hr />
				<p>注：.....</p>

			</div>

			<footer class="admin-content-footer">
				<hr>
				<p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed
					under MIT license.</p>
			</footer>

		</div>
		<!-- content end -->
	</div>

	<a href="#"
		class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu"
		data-am-offcanvas="{target: '#admin-offcanvas'}"></a>

	<footer>
		<hr>
		<p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under
			MIT license.</p>
	</footer>

	<jsp:include page="../common/_js.jsp"></jsp:include>
	<script type="text/javascript">
		//全选和反选
		$("input[name=cbAll]").click(function(){
			var $this = $(this);
			var isChecked = $this[0].checked;
			cbItemCheck(isChecked);
		});
		function cbItemCheck(isChecked){
			var cbItem = $("input[name=cbItem]")
			cbItem.each(function(){
				var $this = $(this);
				$this[0].checked = isChecked;
			})
		}
		//批量删除
		$(".btnDelete").click(function(){
			var cbItemChecked = $("input[name=cbItem]:checked");
			if(cbItemChecked.length < 1){
				layer.confirm("未选中");
				return;
			}
			var ids = new Array(); //数组
			var idsStr = "";
			cbItemChecked.each(function(index, item) { //javascript 封装好的jquery对象的关系
				ids[index] = $(item).attr("data-id");
				idsStr += $(item).attr("data-id") + ",";
			})
			console.log(ids);

			$.ajax({
				url : '${ctxPath}/customer/delete',
				data : idsStr,
				type : 'DELETE',
				success : function() {
					layer.msg("删除成功");
					window.location.reload();
				}
			})
		});
	</script>
</body>
</html>