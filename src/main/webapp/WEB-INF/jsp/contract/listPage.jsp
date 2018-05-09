<%@page import="com.zhidisoft.crm.vo.ContractVO"%>
<%@page import="com.zhidisoft.crm.vo.PageVO"%>
<%@page import="com.zhidisoft.crm.entity.TbCrmContract"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String ctxPath = request.getContextPath();
	request.setAttribute("ctxPath", ctxPath);
%>
<!DOCTYPE html>
<html class="no-js">
<head>
<jsp:include page="../common/_js.jsp"></jsp:include>
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
	 
	<div class="am-cf admin-main">							 
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
								<a href="<%=ctxPath%>/contract/save"
									class="am-btn am-btn-default"><span class="am-icon-plus"></span>
									新增</a>
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
					<form>
						<div class="am-u-sm-12 am-u-md-3">
							<div class="am-input-group am-input-group-sm">
								<input type="text" class="am-form-field" name="searchText"
									value="${searchText }"> <span
									class="am-input-group-btn">
									<button class="am-btn am-btn-default" type="submit">搜索</button>
								</span>
							</div>
						</div>
					</form>
				</div>

				<div class="am-g">
					<div class="am-u-sm-12">
						<form class="am-form">
							<table
								class="am-table am-table-striped am-table-hover table-main">
								<thead>
									<tr>
										<th class="table-check"><input type="checkbox"
											name="cbAll" /></th>
										<th class="table-id">ID</th>
										<th class="table-set">合同编号</th>
										<th class="table-set">客户</th>
										<th class="table-set">联系人</th>																		
										<th class="table-set">创建人</th>																		
										<th class="table-set">签约日期</th>
										<th class="table-set">合同金额</th>							                         	
										<th class="table-set">状态</th>
								        <th class="table-set">距离到期时间</th>
								        <th class="table-set">操作</th>	
									</tr>
								</thead>
								<tbody>
									<%
								        PageVO<ContractVO> contractPage = (PageVO<ContractVO>) request.getAttribute("page");
										Integer index = 0;
										for (ContractVO item : contractPage.getList()){
											index++;
									%>
									<tr>
											
										<td><input type="checkbox" name="cbItem"
											data-id="<%=item.getContractid()%>" /></td>
										<td><%=index%></td>
										<td><%=item.getContractnumber()%></td>
										<td><%=item.getCusname()%></td>
										<td><%=item.getContName()%></td>
										<td><%=session.getAttribute("username")%></td>
										<td><%=item.getDuetime() %></td>
										<td><%=item.getPrice()%></td>
										<td><%=item.getStatus()%></td>
										<td><%=item.getEnddate()%></td>
										<td>
											<div class="am-btn-toolbar">
												<div class="am-btn-group am-btn-group-xs">
													<a href="<%=ctxPath%>/contract/update/<%=item.getContractid()%>"
														class="am-btn am-btn-default am-btn-xs am-text-secondary">
														<span class="am-icon-pencil-square-o"></span> 编辑
													</a>
													 
													<a
														class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only
														contractDelete"
														data-id="<%=item.getContractid()%>"> <span
														class="am-icon-trash-o "></span> 删除
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
							<div class="am-cf">

								共
								<%=contractPage.getTotalCount()%>
								条记录 共
								<%=contractPage.getTotalPage()%>
								页
								<div class="am-fr">
									<ul class="am-pagination">

										<!-- 处理上一页 -->
										<%
											if (contractPage.isFirstPage()) {
										%>
										<li class="am-disabled"><a href="#">上一页</a></li>
										<%
											} else {
										%>
										<li class=""><a
											href="<%=ctxPath%>/contract/listPage?pageNum=<%=contractPage.getPrevPage()%>&searchText=${searchText}">上一页</a></li>
										<%
											}
										%>
										<!-- 下一页 -->
										<%
											if (contractPage.isLastPage()) {
										%>
										<li class="am-disabled"><a href="#">下一页</a></li>
										<%
											} else {
										%>
										<li><a
											href="<%=ctxPath%>/contract/listPage?pageNum=<%=contractPage.getNextPage()%>&searchText=${searchText}">下一页</a></li>
										<%
											}
										%>
									</ul>
								</div>
							</div>
							<hr />
							<p>注：.....</p>
						</form>
					</div>

				</div>
			</div>

			 

		</div>
		<!-- content end -->
	</div>
	<jsp:include page="../common/_css.jsp"></jsp:include>
	<script type="text/javascript">
	var index = parent.layer.getFrameIndex(window.name); //获取窗口索引
	 $(function(){
		 $(".contractDelete").click(function(){
			 var id=$(this).attr("data-id")
			 
			 layer.confirm('您是否要删除？', {
				  btn: ['确定','取消'] //按钮
				}, function(){
					 $.ajax({
						 url:'<%=ctxPath%>/contract/deleteId/'+id,
						 type:'DELETE',
						  success:function(){
								layer.msg('删除成功', {icon: 1});
							  window.location.reload();
						  }
					 })  
				}, function(){
				  layer.msg('也可以这样', {
				    time: 20000, //20s后自动关闭
				    btn: ['明白了', '知道了']
				  });
				});
		 })
		 	/* 全选中时 */
	 $("input[name='cbAll']").click(function(){
		 var $this=$(this);
		 var isChecked=$this[0].checked
		 cbItemChecked(isChecked);
		console.log( $this[0].checked);
	 })
		  /* 全部选中进行删除 */
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
				    url:'<%=ctxPath%>/contract/deleteAll',
					data : idsStr,
					type : 'DELETE',
					success : function() {
						alert("删除成功");
					 	window.location.reload();
					}
				})
			})
		 
	 })
	 /*全部选中或不选中  */
		function cbItemChecked(isChecked) {
			var cbItem = $("input[name=cbItem]")
			cbItem.each(function() {
				var $this = $(this);
				$this[0].checked = isChecked;
			})
		}
	</script>
</body>
</html>