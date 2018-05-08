<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String ctxPath = request.getContextPath();
	request.setAttribute("ctxPath", ctxPath);
%>
<!DOCTYPE html>
<html class="no-js">
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

<!-- content start -->
<div class="admin-content">
  <div class="admin-content-body">
    <div class="am-cf am-padding am-padding-bottom-0">
      <div class="am-fl am-cf">
        <strong class="am-text-primary am-text-lg">表单</strong> /
        <small>form</small>
      </div>
    </div>

    <hr>
	<form class="am-form" method="post">
    <div class="am-tabs am-margin">
      <ul class="am-tabs-nav am-nav am-nav-tabs">
        <li class="am-active"><a href="">主要信息</a></li>
      </ul>

      <div class="am-tabs-bd">
        <div class="am-tab-panel am-fade am-in am-active" id="tab1">
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">负责人</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text" name="principal" value="${username}" readonly>
            </div>
          </div>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">客户名称</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text" name="NAME">
            </div>
          </div>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">客户行业</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text" name="INDUSTRY">
            </div>
          </div>
		  <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">客户信息来源</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text" name="ORIGIN">
            </div>
          </div>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">公司性质</div>
            <div class="am-u-sm-8 am-u-md-10">
              <div class="am-btn-group" data-am-button>
                <label class="am-btn am-btn-default am-btn-xs">
                  <input type="radio" name="OWNERSHIP" id="option1"> 合资
                </label>
                <label class="am-btn am-btn-default am-btn-xs">
                  <input type="radio" name="OWNERSHIP" id="option2"> 国企
                </label>
                <label class="am-btn am-btn-default am-btn-xs">
                  <input type="radio" name="OWNERSHIP" id="option3"> 民营
                </label>
              </div>
            </div>
          </div>
		  <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">邮编</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text" name="ZIPCODE">
            </div>
          </div>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">年营业额</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text" name="ANNUALREVENUE">
            </div>
          </div>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">评分</div>
            <div class="am-u-sm-8 am-u-md-10">
              <div class="am-btn-group" data-am-button>
                <label class="am-btn am-btn-default am-btn-xs">
                  <input type="radio" name="RATING" value="一星" id="option1"> 一星
                </label>
                <label class="am-btn am-btn-default am-btn-xs">
                  <input type="radio" name="RATING" value="两星" id="option2"> 二星
                </label>
                <label class="am-btn am-btn-default am-btn-xs">
                  <input type="radio" name="RATING" value="三星" id="option3"> 三星
                </label>
              </div>
            </div>
          </div>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">客户联系地址</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text" name="ADDRESS">
            </div>
          </div>
       <ul class="am-tabs-nav am-nav am-nav-tabs">
        <li class="am-active"><a href="">首要联系人信息</a></li>
       </ul>
      	  <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">姓名</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text">
            </div>
          </div>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">称呼</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text">
            </div>
          </div>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">邮箱</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text">
            </div>
          </div>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">职位</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text">
            </div>
          </div>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">QQ</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text">
            </div>
          </div>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">手机</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="text">
            </div>
          </div>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">备注</div>
            <div class="am-u-sm-8 am-u-md-10">
              <input type="tel">
            </div>
          </div>
          
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">推荐类型</div>
            <div class="am-u-sm-8 am-u-md-10">
              <div class="am-btn-group" data-am-button>
                <label class="am-btn am-btn-default am-btn-xs">
                  <input type="checkbox"> 允许评论
                </label>
                <label class="am-btn am-btn-default am-btn-xs">
                  <input type="checkbox"> 置顶
                </label>
                <label class="am-btn am-btn-default am-btn-xs">
                  <input type="checkbox"> 推荐
                </label>
                <label class="am-btn am-btn-default am-btn-xs">
                  <input type="checkbox"> 热门
                </label>
                <label class="am-btn am-btn-default am-btn-xs">
                  <input type="checkbox"> 轮播图
                </label>
              </div>
            </div>
          </div>
	   <ul class="am-tabs-nav am-nav am-nav-tabs">
        <li class="am-active"><a href="">附加信息</a></li>
       </ul>
          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">
              发布日期
            </div>
            <div class="am-u-sm-8 am-u-md-10">
                <div class="am-form-group am-form-icon">
                  <i class="am-icon-calendar"></i>
                  <input type="date" class="am-form-field am-input-sm" placeholder="日期">
                </div>
            </div>
          </div>

          <div class="am-g am-margin-top">
            <div class="am-u-sm-4 am-u-md-2 am-text-right">
              发布时间
            </div>
            <div class="am-u-sm-8 am-u-md-10">
                <div class="am-form-group am-form-icon">
                  <i class="am-icon-calendar"></i>
                  <input type="datetime-local" class="am-form-field am-input-sm" placeholder="时间">
                </div>
            </div>
          </div>

        </div>
        </div>
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

<footer>
  <hr>
  <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
</footer>
</body>
</html>