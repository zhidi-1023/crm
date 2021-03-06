<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
	
<%
	String ctxPath  = request.getContextPath();
    request.setAttribute("ctxPath", ctxPath);
    String username =(String) session.getAttribute("username");
%>
<!DOCTYPE html>
<html class="no-js">
<head>
<title>京唐国际</title>
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
<div class="admin-content">
  <div class="admin-content-body">
    <div class="am-cf am-padding am-padding-bottom-0">
      <div class="am-fl am-cf">
        <strong class="am-text-primary am-text-lg">线索信息</strong>
      </div>
    </div>

    <hr>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;主要信息
    
    <form class="am-form" method="post">
            <div class="am-g am-margin-top">
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
                负责人:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="username" value="${username }" readonly>
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" value="放入线索池">
              </div>
              <div class="am-u-sm-2 am-u-md-2">什么是线索</div>
              <div class="am-u-sm-4 am-u-md-4"></div>
            
            </div>
            
            <div class="am-g am-margin-top">
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
                来源:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="source" value="${leads.source }" readonly>
              </div>
             
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
                联系人姓名:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="contactsname" value="${leads.contactsname }" readonly>
              </div>
              <div class="am-hide-sm-only am-u-md-4">*必填</div>
            </div>
            
           <div class="am-g am-margin-top">
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
               职位:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="position" value="${leads.position }" readonly>
              </div>
             
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
                尊称:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="saltname" value="${leads.saltname }" readonly>
              </div>
              <div class="am-hide-sm-only am-u-md-4"></div>
            </div>
            <div class="am-g am-margin-top">
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
               手机:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="mobile" value="${leads.mobile }" readonly>
              </div>
             
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
               邮箱:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="email" class="am-input-sm" name="email" value="${leads.email }" readonly>
              </div>
              <div class="am-hide-sm-only am-u-md-4"></div>
            </div>
            
     <div class="am-g am-margin-top">
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
               下次联系时间:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="date" class="am-input-sm" name="nextsteptime" value="<fmt:formatDate pattern = "yyyy-MM-dd" value="${leads.nextsteptime }"/>" readonly>
              </div>
             
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
                下次联系内容:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="nextstep" value="${leads.nextstep }" readonly>
              </div>
              <div class="am-hide-sm-only am-u-md-4"></div>
            </div>
             <div class="am-g am-margin-top">
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
               公司名:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="name" value="${leads.name }" readonly>
              </div>
             
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
                地址:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="address" value="${leads.address }" readonly>
              </div>
              <div class="am-hide-sm-only am-u-md-4"></div>
            </div>
     <hr>       
     &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;附加信息
            <div class="am-g am-margin-top">
              <div class="am-u-sm-4 am-u-md-2 am-text-right">
                备注:
              </div>
              <div class="am-u-sm-8 am-u-md-4">
                <input type="text" class="am-input-sm" name="leadnote" value="${leads.leadnote }" readonly>
              </div>
              <div class="am-hide-sm-only am-u-md-6"></div>
            </div>
    <div class="am-margin am-u-sm-4 am-u-md-4 am-text-right">
      <button type="button" style="width: 100px;" class="am-btn am-btn-primary am-btn-xs btnGiveUp">关&nbsp;&nbsp;&nbsp;&nbsp;闭</button>
    </div>
    <br><br><br>
</form>
  </div>

  <footer class="admin-content-footer">
    <hr>
    <p class="am-padding-left">© 2014 AllMobilize, Inc. Licensed under MIT license.</p>
  </footer>
</div>
<jsp:include page="../common/_js.jsp"></jsp:include>
<script type="text/javascript">
$(function(){
	$(".btnGiveUp").click(function(){
		location.href = "${ctxPath}/leads/list";
	})
}) 
</script>
</body>
</html>