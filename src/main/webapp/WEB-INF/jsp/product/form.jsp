<%@page import="java.util.List"%>
<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
<%@page import="com.zhidisoft.crm.vo.ProductVO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>	
	
<%
	String ctxPath  = request.getContextPath();
    request.setAttribute("ctxPath", ctxPath);
%>
<!DOCTYPE html>
<html class="no-js">
<head>
<title>产品新增</title>
<jsp:include page="../common/_css.jsp"></jsp:include>
<link rel="stylesheet" type="text/css" href="${ctxPath}/static/webuploader/webuploader.css">

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
  </div>
</div>
<div class="admin-content">
  <div class="admin-content-body">
    <div class="am-cf am-padding am-padding-bottom-0">
      <div class="am-fl am-cf">
        <strong class="am-text-primary am-text-lg">添加产品</strong> /
        <small>${method == 'save'?'新增':'编辑' }</small>
      </div>
    </div>

    <hr>
    <%
    		List<TbSystemUser> userList =(List<TbSystemUser>) request.getAttribute("userList");
  	List<ProductVO> productList = (List<ProductVO>)request.getAttribute("productList");

    %>

       ${errorMsg }
    <form class="am-form" method="post">
            <div class="am-g am-margin-top">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
                产品名称
              </div>
              <div class="am-u-sm-8 am-u-md-4">
                <input type="text" class="am-input-sm" name="name" value="${product.name }">
                <input type="hidden"  name="productid" value="${product.productid }">
              </div>
            
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
                产品类别
              </div>
              <div class="am-u-sm-8 am-u-md-4 am-u-end col-end">
              <select data-am-selected="{btnSize: 'sm'}">
              	<option value="option1">默认</option>
              	<option class="am-input-sm" name="categoryid" value="${product.categoryid }">
				</option>
             </select>
            </div>
            <div>
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
                成本价
              </div>
              <div class="am-u-sm-8 am-u-md-4 am-u-end col-end">
                <input type="text" class="am-input-sm" name="costprice" value="${product.costprice }">
              </div>
              
               <div class="am-u-sm-4 am-u-md-2 am-text-right">
                创建者
              </div>
              <div class="am-u-sm-8 am-u-md-4 am-u-end col-end">
                <input type="text" class="am-input-sm" name="creatoruserid" value="<%=session.getAttribute("username") %>">	
              </div>
           </div>
            
               <div class="am-u-sm-4 am-u-md-2 am-text-right">
                详情链接
              </div>
              <div class="am-u-sm-8 am-u-md-4 am-u-end col-end">
                <input type="text" class="am-input-sm" name="link" value="${product.link }">
              </div>
             	<div class="am-hide-sm-only am-u-md-6"></div>
            </div>
			<%-- <%
				String method = (String)request.getAttribute("method");
				if(!"update".equals(method)){
			%> --%>
            <div class="am-g am-margin-top">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
                研发时间
              </div>
              <div class="am-u-sm-8 am-u-md-4 am-u-end col-end">
                <input type="date" class="am-input-sm" name="developmenttime" value="<fmt:formatDate pattern = "yyyy-MM-dd" value ="${product.developmenttime}"/>">
              </div>
              <div class="am-hide-sm-only am-u-md-6"></div>
            </div>
            
             <div class="am-g am-margin-top">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
                开发团队
              </div>
              <div class="am-u-sm-8 am-u-md-4 am-u-end col-end">
                <input type="text" class="am-input-sm" name="developmentteam" value="${product.developmentteam }">
              </div>
             	<div class="am-hide-sm-only am-u-md-6">*必选项</div>
            </div>
            
              <div class="am-g am-margin-top">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
                建议售价
              </div>
              <div class="am-u-sm-8 am-u-md-4 am-u-end col-end">
                <input type="text" class="am-input-sm" name="suggestedprice" value="${product.suggestedprice }">
              </div>
  				<div class="am-u-sm-4 am-u-md-2 am-text-right">
                创建时间
              	</div>
              	<div class="am-u-sm-8 am-u-md-4 am-u-end col-end">
                <input type="date" class="am-input-sm" name="createtime" value="<fmt:formatDate pattern = "yyyy-MM-dd" value ="${product.createtime}"/>">
              </div>  
                         	
            </div>
            <div class="am-u-sm-4 am-u-md-2 am-text-right">
                更新时间
              	</div>
              	<div class="am-u-sm-8 am-u-md-4 am-u-end col-end">
                <input type="date" class="am-input-sm" name="updatetime" value="<fmt:formatDate pattern = "yyyy-MM-dd" value ="${product.updatetime}"/>">
              <div class="am-g am-margin-right">
				<h2>产品图片</h2>
					<!--dom结构部分-->
					<div id="uploader-demo">
					    <!--用来存放item-->
					    <div id="fileList" class="uploader-list"></div>
					    <div id="filePicker">选择图片</div>
					</div>
					<img id ="previewImg" alt="" src=""><input type="hidden" name="">
              </div>
              
           </div>
           
	<%-- 	<%} 
		%> --%>

	<div class="am-g am-margin-top">
		<div class="am-u-sm-4 am-u-md-2 am-text-right">备注</div>
		<input type="text" style="height: 200px;width: 580px;" class="am-input-sm" name="description"
				value="${product.description }">
		</div>
	<div class="am-margin">
    		<button type="submit" class="am-btn am-btn-primary am-btn-xs">提交保存</button>
    		<button type="button" class="am-btn am-btn-primary am-btn-xs">放弃保存</button>
  	</div>
     </form>
  </div>

  <footer class="admin-content-footer">
    <hr>
    <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
  </footer>
</div>
<!-- content end -->



<a href="#" class="am-icon-btn am-icon-th-list am-show-sm-only admin-menu" data-am-offcanvas="{target: '#admin-offcanvas'}"></a>



<jsp:include page="../common/_js.jsp"></jsp:include>
<!-- 图片上传初始化 -->
<script type="text/javascript" src="${ctxPath}/static/webuploader/webuploader.min.js">

</script>
<script type="text/javascript">
//初始化Web Uploader
var uploader = WebUploader.create({

    // 选完文件后，是否自动上传。
    auto: true,

    // swf文件路径
    swf:   '${ctxPath}/static/webuploader/Uploader.swf',

    // 文件接收服务端。
    server: '${ctxPath}/product/upload',

    // 选择文件的按钮。可选。
    // 内部根据当前运行是创建，可能是input元素，也可能是flash.
    pick: '#filePicker',

    // 只允许选择图片文件。
    accept: {
        title: 'Images',
        extensions: 'gif,jpg,jpeg,bmp,png',
        mimeTypes: 'image/*'
    }
});
uploader.on( 'fileQueued', function( file ) {
    // 创建缩略图
    // 如果为非图片文件，可以不用调用此方法。
    // thumbnailWidth x thumbnailHeight 为 100 x 100
    uploader.makeThumb( file, function( error, src ) {
        if ( error ) {
            $img.replaceWith('<span>不能预览</span>');
            return;
        }

        $("#previewImg").attr( 'src', src );
    }, 100, 100 );
});
//文件上传成功，给item添加成功class, 用样式标记上传成功。
uploader.on( 'uploadSuccess', function( file , resp) {
	console.log(resp);
	$("input[name='']").val(resp);
});

</script>

</body>
</html>