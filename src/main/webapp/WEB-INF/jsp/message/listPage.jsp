<%@page import="com.zhidisoft.crm.vo.MessListVO"%>
<%@page import="com.zhidisoft.crm.vo.PageVO"%>
<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
<%@page import="com.zhidisoft.crm.entity.TbCrmMessage"%>
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

</head>
<body>
  <div class="am-topbar-brand">
    <strong>Amaze UI</strong> <small>站内信息模块</small>
  </div>

<div class="am-cf admin-main">
  <!-- sidebar start -->
  <div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
    <div class="am-offcanvas-bar admin-offcanvas-bar">
          <a class="am-cf" data-am-collapse="{target: '#collapse-nav'}"><span class="am-icon-file"></span> 页面模块 <span class="am-icon-angle-right am-fr am-margin-right"></span></a>
          <ul class="am-list am-collapse admin-sidebar-sub am-in" id="collapse-nav">
            <li><a href="admin-user.html" class="am-cf"><span class="am-icon-check"></span> 个人资料<span class="am-icon-star am-fr am-margin-right admin-icon-yellow"></span></a></li>
            <li><a href="admin-help.html"><span class="am-icon-puzzle-piece"></span> 帮助页</a></li>
            <li><a href="admin-gallery.html"><span class="am-icon-th"></span> 相册页面<span class="am-badge am-badge-secondary am-margin-right am-fr">24</span></a></li>
            <li><a href="admin-log.html"><span class="am-icon-calendar"></span> 系统日志</a></li>
            <li><a href="admin-404.html"><span class="am-icon-bug"></span> 404</a></li>
          </ul>
    </div>
  </div>
  <!-- sidebar end -->

  <!-- content start -->
  <div class="admin-content">
    <div class="admin-content-body">
      <div class="am-cf am-padding am-padding-bottom-0">
        <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">短消息</strong> / <small>Table</small></div>
      </div>

      <hr>

      <div class="am-g">
        <div class="am-u-sm-12 am-u-md-6">
          <div class="am-btn-toolbar">
            <div class="am-btn-group am-btn-group-xs">
              <a href="${ctxPath}/message/save" class="am-btn am-btn-default"><span class="am-icon-plus"></span> 新增</a>
              <button type="button" class="am-btn am-btn-default btnDelete"><span class="am-icon-trash-o"></span> 批量删除</button>
            </div>
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
                 <th class="table-title">编号</th>
                <th class="table-title">内容</th>
                 <th class="table-title">发件人</th>
                 <th class="table-title">阅读日期</th>
                  <th class="table-title">发送日期</th>
                <th class="table-set">操作</th>
              </tr>
              </thead>
              <tbody>
              <%
              PageVO<MessListVO>  messageList= (PageVO<MessListVO>)request.getAttribute("messageList");
              	Integer index = 0;
                for(MessListVO item : messageList.getList()) {
                	index ++;
              %>
              <tr>
                <td><input type="checkbox" name="cbItem"  data-id="<%=item.getMessageid()%>"/></td>
                <td><%=index %></td>
	                <td><a href="#"><%=item.getContent()%></a></td>
	                 <td><a href="#"><%=item.getUsername()%></a></td>
	                 <td><a href="#"><%=item.getReadtime()%></a></td>
	                <td><a href="#"><%=item.getSendtime()%></a></td>
                <td>
                  <div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                      <a href="${ctxPath }/message/update/<%=item.getMessageid() %>" class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span> 编辑</a>
                      <a class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only messDelete" data-Id="<%=item.getMessageid() %>" ><span class="am-icon-trash-o"></span> 删除</a>
                    </div>
                  </div>
                </td>
              </tr>
            <%} %>
              </tbody>
            </table>
 <div class="am-cf">
            <%
            	Integer pageNum = messageList.getPageNum();
            	Long totalCount = messageList.getTotalCount();
            	Long totalPage = messageList.getTotalPage();
            %>
              共 <%=totalCount %> 条记录  共 <%=totalPage %> 页
              <div class="am-fr">
                <ul class="am-pagination">
                	<!-- 处理上一页 -->
                 <%if(pageNum<=1){%>
                  <li class="am-disabled"><a href="#">上一页</a></li>
                  <%}else{ %>
                  <li class=""><a href="<%=ctxPath%>/message/list?pageNum=<%=pageNum-1%>&searchText=${searchText}">上一页</a></li>
                  <%} %>
                  
                  <%-- <%for(int i=1;i<=totalPage;i++) {%>
                  <%if(i==pageNum){ %>
                  <li class="am-active"><a href="<%=ctxPath%>/user/list?pageNum=<%=i%>"><%=i %></a></li>
                  <%}else{ %>
                  <li><a href="<%=ctxPath%>/user/list?pageNum=<%=i%>"><%=i %></a></li>
                  <%} %>
                  <%} %> --%>
                  
                  <!-- 下一页 -->
                    <%if(pageNum>=totalPage) {%>
                  <li class="am-disabled"><a href="#">下一页</a></li>
                   <%}else{ %>
                  <li><a href="<%=ctxPath%>/message/list?pageNum=<%=pageNum+1%>&searchText=${searchText}">下一页</a></li>
                    <%} %>
                </ul>
              </div>
            </div>
            <hr />
          </form>
        </div>

      </div>
    </div>
  </div>
</div>

<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>
<jsp:include page="../common/_css.jsp"></jsp:include>
<jsp:include page="../common/_js.jsp"></jsp:include>
<script type="text/javascript">
	$(function(){
		$(".messDelete").click(function(){
			var dataId=$(this).attr("data-id");
			layer.confirm('确认要删除？', {
				  btn: ['确定','取消'] //按钮
			}, function(){
				$.ajax({
					url:'${ctxPath}/message/delete/'+dataId,
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
			url:'<%=ctxPath%>/message/deleteAll', 
			data : idsStr ,
			type : 'DELETE',
			success : function(){
				 layer.msg('删除成功', {icon: 1});
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
</script>
</body>
</html>