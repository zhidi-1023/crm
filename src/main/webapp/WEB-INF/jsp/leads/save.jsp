<%@page import="com.zhidisoft.crm.entity.TbCrmLeadsPool"%>
<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<%
	String ctxPath  = request.getContextPath();
    request.setAttribute("ctxPath", ctxPath);
    String username=(String)session.getAttribute("username");
    TbCrmLeadsPool leads=(TbCrmLeadsPool)request.getAttribute("leads");
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
        <strong class="am-text-primary am-text-lg">${method == 'save' ? '添加线索' : '修改线索' }</strong>
      </div>
    </div>

    <hr>
    <hr>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;主要信息
    <form class="am-form" method="post">
            <div class="am-g am-margin-top">
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
                负责人:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="username" value="${username}">
              </div>
              <div class="am-u-sm-2 am-u-md-2">
              	<button type="submit" class="am-btn am-btn-default btnPut" >放入线索池</button>
                <!-- <input type="button" class="am-input-sm" name="username" value="放入线索池"> -->
              </div>
              <a href="#" class="am-u-sm-2 am-u-md-2">什么是线索池?</a>
              <div class="am-u-sm-4 am-u-md-4"></div>
            
            </div>
            
            <div class="am-g am-margin-top">
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
                来源:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="source" value="${leads.source }">
              </div>
             
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
                联系人姓名:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="contactsname" value="${leads.contactsname}">
              </div>
              <div class="am-hide-sm-only am-u-md-4">*必填</div>
            </div>
            
           <div class="am-g am-margin-top">
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
               职位:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="position" value="${leads.position}">
              </div>
             
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
                尊称:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="saltname" value="${leads.saltname}">
              </div>
              <div class="am-hide-sm-only am-u-md-4"></div>
            </div>
            <div class="am-g am-margin-top">
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
               手机:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="mobile" value="${leads.mobile}">
              </div>
             
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
               邮箱:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="email" class="am-input-sm" name="email" value="${leads.email}">
              </div>
              <div class="am-hide-sm-only am-u-md-4"></div>
            </div>
            
     <div class="am-g am-margin-top">
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
               下次联系时间:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="date" class="am-input-sm" name="nextsteptime" value="<fmt:formatDate pattern = "yyyy-MM-dd" value = "${leads.nextsteptime}" />">
              </div>
             
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
                下次联系内容:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="nextstep" value="${leads.nextstep}">
              </div>
              <div class="am-hide-sm-only am-u-md-4"></div>
            </div>
             <div class="am-g am-margin-top">
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
               公司名:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="name" value="${ leads.name} ">
              </div>
             
              <div class="am-u-sm-2 am-u-md-2 am-text-right">
                地址:
              </div>
              <div class="am-u-sm-2 am-u-md-2">
                <input type="text" class="am-input-sm" name="address" value="${leads.address}">
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
                <input type="text" class="am-input-sm" name="leadnote" value="${leads.leadnote}">
              </div>
              <div class="am-hide-sm-only am-u-md-6"></div>
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
<jsp:include page="../common/_js.jsp"></jsp:include>
<script type="text/javascript">
	$(function(){
		$(".btnPut").click(function(){
			$.ajax({
				url:'${ctxPath}/lead/putLeadsPoor',
				data: {"leadsVO":$(".am-form").serialize()},
				type:'POST',
				success:function(){
					alert("放入线索池成功");
				} 
			})
		})
	})
</script>
</body>
</html>