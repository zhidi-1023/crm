<%@page import="com.zhidisoft.crm.vo.LeadsVO"%>
<%@page import="com.zhidisoft.crm.entity.TbCrmLeads"%>
<%@page import="com.zhidisoft.crm.entity.TbSystemRole"%>
<%@page import="com.zhidisoft.crm.vo.PageVO"%>
<%@page import="com.zhidisoft.crm.entity.TbSystemRole"%>
<%@page import="java.util.List"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"
%>
<%
	String ctxPath  = request.getContextPath();
    request.setAttribute("ctxPath", ctxPath);
%>

<%
    String username = (String)session.getAttribute("username");
    PageVO<LeadsVO> leadPage = (PageVO<LeadsVO>)request.getAttribute("leadPage");
%>
<!DOCTYPE html>
<html class="no-js">
<head>
<title>线索</title>
<jsp:include page="../common/_css.jsp"></jsp:include>
</head>
<body>
<jsp:include page="../common/_head.jsp"></jsp:include>
<div class="am-tabs" data-am-tabs>
  <ul class="am-tabs-nav am-nav am-nav-tabs">
    <li class="am-active"><a href="#tab1">线索</a></li>
    <li><a href="#tab2">线索池</a></li>
    <li><a href="#tab3">统计</a></li>
  </ul>

  <div class="am-tabs-bd">
    <div class="am-tab-panel am-fade am-in am-active" id="tab1">
		<div class="am-cf admin-main">
		  <div class="admin-content">
		    <div class="admin-content-body">
		        <!-- 模糊查询 -->
		      <div class="am-g">
				<div class="am-u-sm-12 am-u-md-12">
					<div class="am-btn-toolbar">
						<div class="am-btn-group am-btn-group-xs">
							<button type="button" class="am-btn am-btn-default">试图:</button>
							<a class="am-btn am-btn-default">全部</a>
							<a class="am-btn am-btn-default" href="${ctxPath }/leads/list?mycharge=${username}">我负责的</a>
							<a class="am-btn am-btn-default">下属负责的</a>
							<a class="am-btn am-btn-default">下属创建</a>
							<a class="am-btn am-btn-default">已转换线索</a>
							<a class="am-btn am-btn-default" href="${ctxPath }/leads/list?where1=today">今日需联系</a>
							<a class="am-btn am-btn-default" href="${ctxPath }/leads/list?where1=thisweek">本周需联系</a>
							<a class="am-btn am-btn-default" href="${ctxPath }/leads/list?where1=thismonth">本月需联系</a>
							<a class="am-btn am-btn-default" href="${ctxPath }/leads/list?where1=nocontact7">7日未联系</a>
							<a class="am-btn am-btn-default" href="${ctxPath }/leads/list?where1=nocontact15">15日未联系</a>
							<a class="am-btn am-btn-default" href="${ctxPath }/leads/list?where1=nocontact30">30日未联系</a>
							<a class="am-btn am-btn-default" href="${ctxPath }/leads/list?where1=week">最近创建</a>
							<a class="am-btn am-btn-default" href="${ctxPath }/leads/list?where1=update">最近修改</a>
							<a class="am-btn am-btn-default">回收站</a>
						</div>
					</div>
				</div>
			</div><br> 
			
			<div class="am-g"> 
			<div class="am-dropdown am-u-sm-1 am-u-md-1" data-am-dropdown>
			<div class="am-btn am-btn-default am-dropdown-toggle" style="height: 34px;">
				批量操作<div class="am-icon-caret-down"></div>
			</div>
			<ul class="am-dropdown-content">
				<li><a id="btnDelete">批量删除</a></li>
				<li><a href="#">批量放入线索池</a></li>
			</ul>
		    </div>
		    
		    <div class="am-dropdown am-u-sm-2 am-u-md-2" data-am-dropdown>
			<div class="am-btn am-btn-default am-dropdown-toggle" style="height: 34px;">
				--请选择筛选条件--<div class="am-icon-caret-down"></div>
			</div>
			<ul class="am-dropdown-content">
			</ul>
		    </div>
		    
		    <div class="am-dropdown am-u-sm-1 am-u-md-1" data-am-dropdown>
			<div class="am-btn am-btn-default am-dropdown-toggle" style="height: 34px;">
				包含<div class="am-icon-caret-down"></div>
			</div>
			<ul class="am-dropdown-content">
			</ul>
		    </div>
		     
	        <form>
	        <div class="am-u-sm-3 am-u-md-3">
	          <div class="am-input-group am-input-group-sm">
	            <input type="text" class="am-form-field" name="searchText" value="${searchText }">
	          <span class="am-input-group-btn">
	            <button class="am-btn am-btn-default" type="submit">搜索</button>
	          </span>
	          </div>
	        </div>
	        </form>
		    
		    <div class="am-dropdown am-u-sm-1 am-u-md-1" data-am-dropdown>
			<div class="am-btn am-btn-default am-dropdown-toggle" style="height: 34px;">
				发送短信<div class="am-icon-caret-down"></div>
			</div>
			<ul class="am-dropdown-content">
			</ul>
		    </div>
		    
		     <div class="am-dropdown am-u-sm-1 am-u-md-1" data-am-dropdown>
			<div class="am-btn am-btn-default am-dropdown-toggle" style="height: 34px;">
				发送邮件<div class="am-icon-caret-down"></div>
			</div>
			<ul class="am-dropdown-content">
			</ul>
		    </div>
		    
	        <div class="am-u-sm-1 am-u-md-1">
	            <a class="am-btn am-btn-default" style="height: 34px;" href="${ctxPath }/leads/save">新建线索</a>
	        </div>
	        
	        <div class="am-u-sm-2 am-u-md-2">
	            <button class="am-btn am-btn-default" style="height: 34px;" type="submit">线索工具</button>
	        </div>
	        </div>
		    <br>
		
		      <div class="am-g">
		        <div class="am-u-sm-12">
		          <form class="am-form">
		            <table class="am-table am-table-striped am-table-hover table-main">
		              <thead>
		              <tr>
		                <th class="table-check">
		                <input type="checkbox" name="cbAll"/></th>
		                <th class="table-id">编号</th>
		                <th class="table-title">公司名</th>
		                <th class="table-title">联系人姓名</th>
		                <th class="table-title">尊称</th>
		                <th class="table-title">手机</th>
		                <th class="table-set">下次联系内容</th>
		                <th class="table-set">负责人</th>
		                <th class="table-set">创建人</th>
		                <th class="table-set">创建时间</th>
		                <th class="table-set">操作</th>
		              </tr>
		              </thead>
		              <tbody>
		              <%
		              	Integer index = 0;
		                for(LeadsVO item : leadPage.getList()) {
		                	index ++;
		              %>
		              <tr>
		                <td><input type="checkbox" name="cbItem" data-id="<%=item.getLeadsid() %>"/></td>
		                <td><%=index %></td>
		                <td><%=item.getName() %></td>
		                <td><%=item.getContactsname() %></td>
		                <td><%=item.getSaltname() %></td>
		                <td><%=item.getMobile() %></td>
		                <td><%=item.getNextstep() %></td>
		                <td><%=item.getUsername() %></td>
		                <td><%=item.getUsername() %></td>
		                <td><%=item.getCreatetime() %></td>
		                <td>
		                  <div class="am-btn-toolbar">
		                    <div class="am-btn-group am-btn-group-xs">
		                      <a href="${ctxPath }/leads/info/<%=item.getLeadsid() %>" class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span> 查看</a>
		                      <button class="am-btn am-btn-default am-btn-xs am-hide-sm-only"><span class="am-icon-copy"></span> 转换</button>
		                      <a href="${ctxPath }/leads/update/<%=item.getLeadsid() %>" class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only"><span class="am-icon-trash-o"></span> 修改</a>
		                     </div>
		                  </div>
		                </td>
		              </tr>
		            <%} %>
		              </tbody>
		            </table>
		            <div class="am-cf">  
		                                   共 <%=leadPage.getTotalCount() %> 条记录  共 <%=leadPage.getTotalPage() %> 页
		              <div class="am-fr">
		                <ul class="am-pagination">
		                	<!-- 处理上一页 -->
		                 <%if(leadPage.isFirstPage()) {%>
		                  <li class="am-disabled"><a href="#">上一页</a></li>
		                  <%}else{ %>
		                  <li class=""><a href="<%=ctxPath%>/leads/list?pageNum=<%=leadPage.getPrevPage()%>&searchText=${searchText}">上一页</a></li>
		                  <%} %>
		                  <!-- 下一页 -->
		                    <%if(leadPage.isLastPage()) {%>
		                  <li class="am-disabled"><a href="#">下一页</a></li>
		                   <%}else{ %>
		                  <li><a href="<%=ctxPath%>/leads/list?pageNum=<%=leadPage.getNextPage()%>&searchText=${searchText}">下一页</a></li>
		                    <%} %>
		                </ul>
		              </div>
		            </div>
		          </form>
		        </div>
		      </div>
		    </div>
		  </div>
		</div>
    </div>
    <div class="am-tab-panel am-fade" id="tab2">
   线索池
    </div>
    <div class="am-tab-panel am-fade" id="tab3">
  统计
    </div>
  </div>
</div>
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
	$("#btnDelete").click(function(){
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
			url:'<%=ctxPath%>/leads/deleteAll', 
			data : idsStr,
			type : 'DELETE',
			success : function(){
				 layer.msg('删除成功', {icon: 1});
				 window.location.reload();
			}
		})
	})
	//打开分配菜单弹出框
	$(".btnFunc").click(function(){
		var roleId = $(this).attr("data-id");
		layer.open({
			  type: 2,
			  area: ['700px', '450px'],
			  fixed: false, //不固定
			  maxmin: true,
			  content: '${ctxPath}/role/func/'+roleId
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