<%@page import="com.zhidisoft.crm.entity.TbCrmProductCategory"%>
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
<title>产品列表</title>
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

  
    </div>
  </div>
	<div class="am-cf admin-main">
	</div>
      <div class="am-g">
        <div class="am-u-sm-12 am-u-md-6">
          <div class="am-btn-toolbar">
            <div class="am-btn-group am-btn-group-xs">
            <button  class="am-btn am-btn-default btnDelete"><span class="am-icon-trash-o"></span> 删除</button>
            </div>
        <div class="am-u-sm-12 am-u-md-3">
          <div class="am-form-group">
            	<select data-am-selected="{btnSize: 'sm'}">
              <option value="option1">任意字段</option>
              <option value="option2">产品名称</option>
              <option value="option3">研发时间</option>
              <option value="option3">详情链接</option>
              <option value="option3">开发团队</option>
              <option value="option3">成本价</option>
              <option value="option3">建议售价</option>
              <option value="option3">创建人</option>
              <option value="option3">创建时间</option>
              <option value="option3">修改时间</option>
            </select>
          </div>
        </div>
        		<select data-am-selected="{btnSize: 'sm'}">
              <option value="option1">包含</option>
              <option value="option2">IT业界</option>
            </select>
          <div class="am-u-sm-4 am-u-md-3">
          <div class="am-form-group">
          </div>
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
       <button class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only btnFunc" data-id=""><span class="am-icon-trash-o"></span>添加产品类别</button> 
         
      </div>
		 <div class="am-g"><a href="${ctxPath}/product/lista?where1=week">本周</a></div> 
      <div class="am-g">
        <div class="am-u-sm-12">
          <form class="am-form">
            <table class="am-table am-table-striped am-table-hover table-main">
              <thead>
              <tr>
                <th class="table-check">
                <input type="checkbox" name="cbAll" /></th>
                <th class="table-id">分类编号</th>
                <th class="table-title">父类名</th>
                <th class="table-title">分类名称</th>
                <th class="table-title">描述</th>
                <th class="table-set">操作</th>
              </tr>
              </thead>
              <tbody>
              <%
              	List<TbCrmProductCategory> cateLista = (List<TbCrmProductCategory>)request.getAttribute("cateLista");
              	Integer index = 0;
                for(TbCrmProductCategory item : cateLista) {
                	index ++;
              %>
              <tr>
                <td><input type="checkbox"  name="cbItem" data-id="<%=item.getCategoryid()%>"/></td>
                		<td><%=index %></td>
                		<td><a href="#"><%=item.getParentid()%></a></td>
               		<td><a href="#"><%=item.getName() %></a></td>
                		<td><a href="#"><%=item.getDescription()%></a></td>
                <td>
                  <div class="am-btn-toolbar">
                    <div class="am-btn-group am-btn-group-xs">
                      <a href="${ctxPath }/product/check/<%=item.getCategoryid() %>" class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only procheck " data-id="<%=item.getCategoryid() %>"><span class="am-icon-pencil-square-o"></span>查看</a>
                      <a href="${ctxPath }/product/update/<%=item.getCategoryid() %>" class="am-btn am-btn-default am-btn-xs am-text-secondary"><span class="am-icon-pencil-square-o"></span> 编辑</a>
                      <a class="am-btn am-btn-default am-btn-xs am-text-danger am-hide-sm-only proDelete " data-id="<%=item.getCategoryid() %>"><span class="am-icon-trash-o"></span> 删除</a>
                      
                    </div>
                  </div>
                </td>
              </tr>
            <%} %>
              </tbody>
            </table>
            <div class="am-cf">
            
            <%
            	Integer pageNum = (Integer)request.getAttribute("pageNum");
            	Long totalCount = (Long)request.getAttribute("totalCount");
            	Long totalPage = (Long)request.getAttribute("totalPage");
            %>
              共 <%=totalCount %> 条记录  共 <%=totalPage %> 页
              <div class="am-fr">
                <ul class="am-pagination">
                
                	<!-- 处理上一页 -->
                 <%if(pageNum<=1) {%>
                  <li class="am-disabled"><a href="#">上一页</a></li>
                  <%}else{ %>
                  <li class=""><a href="<%=ctxPath%>/product/lista?pageNum=<%=pageNum-1%>&searchText=${searchText}">上一页</a></li>
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
                  <li><a href="<%=ctxPath%>/product/lista?pageNum=<%=pageNum+1%>&searchText=${searchText}">下一页</a></li>
                    <%} %>
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
      <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
    </footer>

  
  <!-- content end -->


<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>




<jsp:include page="../common/_js.jsp"></jsp:include>
<script type="text/javascript">
	$(function(){
		$(".proDelete").click(function(){
			var dataId = $(this).attr("data-id");
			layer.confirm('您是否要删除？', {
			  btn: ['确定','取消'] //按钮
			}, function(){
				$.ajax({
				url:'${ctxPath}/product/delete/'+dataId,
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
			url:'<%=ctxPath%>/product/deleteAll',
			data:idsStr,
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

function fenPei(idsStr,url,deyo){
	$.ajax({
		url:url,
		type:'POST',
		data: idsStr,
		success:function(){
			deyo();
		}
	})
}
// 打开分配角色弹出框
$(".btnFunc").click(function(){
	var roleId = $(this).attr("data-id");
	layer.open({
		  type: 2,
		  area: ['700px', '450px'],
		  fixed: false, //不固定
		  maxmin: true,
		  content: '${ctxPath}/product/form/'+categoryid
	}); 	
	
	return false; //防止关闭

})
</script>

</body>
</html>