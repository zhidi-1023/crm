<%@page import="java.text.SimpleDateFormat"%>
<%@page import="java.util.Date"%>
<%@page import="com.zhidisoft.crm.vo.CustomerUserNameVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.zhidisoft.crm.entity.TbSystemUser"%>
<%@page import="com.zhidisoft.crm.vo.CustomerUserNameVO"%>
<%
	String ctxPath  = request.getContextPath();
    request.setAttribute("ctxPath", ctxPath);
    CustomerUserNameVO customer=(CustomerUserNameVO)request.getAttribute("customer");
    List<TbSystemUser> userlist=(List<TbSystemUser>)request.getAttribute("userlist"); 
    Date date=new Date();
    String sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);
%>

<!DOCTYPE html PUBLIC >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
 <meta name="renderer" content="webkit">
  <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
  <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link rel="stylesheet" href="${ctxPath}/static/layui/css/layui.css"  media="all">
</head>
<body>      
<fieldset class="layui-elem-field layui-field-title" style="margin-top: 20px;">
  <legend>客户池信息编辑</legend>
</fieldset>

<form action=""  id="cus_form">
<input type="hidden" name="customerid" value="<%=customer.getCustomerid()%>">
    <label class="layui-form-label">拥有者</label>
      <select name="owneruserid">
      <option value="null">暂无</option>
        <% for(TbSystemUser  itme:userlist) {%>
          <option class="opt" value="<%=itme.getId()%>" <%=itme.getId().equals(customer.getOwneruserid())?"selected":"" %>> <%=itme.getUsername() %></option>
          <%} %> 
      </select><br/><br/>
      <div class="layui-input-block"></div>
    <label class="layui-form-label">创建者</label>
      <select name="creatoruserid">
      	<option value="null">暂无</option>
        <% for(TbSystemUser  itme:userlist) {%>
          <option class="opt" value="<%=itme.getId()%>" <%=itme.getId().equals(customer.getCreatoruserid())?"selected":"" %>> <%=itme.getUsername() %></option>
          <%} %> 
      </select>
      
  <div class="layui-form-item">
    <label class="layui-form-label">是否被删除</label>
    <div class="layui-input-block">
      <input type="text" name="isdeleted" value="<%=customer.getIsdeleted()%>" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">是否被锁定</label>
    <div class="layui-input-block">
      <input type="text" name="islocked" value="<%=customer.getIslocked()%>" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
 <%--  <label class="layui-form-label">删除人</label>
      <select name="deleteuserid">
      <option value="null">暂无</option>
        <% for(TbSystemUser  itme:userlist) {%>
          <option class="opt" value="<%=itme.getId()%>" <%=itme.getId().equals(customer.getDeleteuserid())?"selected":"" %>> <%=itme.getUsername() %></option>
          <%} %> 
      </select>
  <div class="layui-form-item">
    <label class="layui-form-label">删除时间</label>
    <div class="layui-input-block">
      <input type="text" name="deletetime" value="<%=customer.getDeletetime()%>" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div> --%>
  
  <div class="layui-form-item">
    <label class="layui-form-label">公司性质</label>
    <div class="layui-input-block">
      <input type="text" name="ownership" value="<%=customer.getOwnership()%>" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">年营业额</label>
    <div class="layui-input-block">
      <input type="text" name="annualrevenue" value="<%=customer.getAnnualrevenue()%>" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">客户信息来源</label>
    <div class="layui-input-block">
      <input type="text" name="origin" value="<%=customer.getOrigin()%>" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">邮编</label>
    <div class="layui-input-block">
      <input type="text" name="zipcode" value="<%=customer.getZipcode()%>" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">客户名称</label>
    <div class="layui-input-block">
      <input type="text" name="name" value="<%=customer.getName()%>" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">客户行业</label>
    <div class="layui-input-block">
      <input type="text" name="industry" value="<%=customer.getIndustry()%>" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">评分</label>
    <div class="layui-input-block">
      <input type="text" name="rating" value="<%=customer.getRating()%>" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">客户联系地址</label>
    <div class="layui-input-block">
      <input type="text" name="address" value="<%=customer.getAddress()%>" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
<%--   <div class="layui-form-item">
    <label class="layui-form-label">创建时间</label>
    <div class="layui-input-block">
      <input type="text" name="createtime" value="<%=customer.getCreatetime()%>" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div> --%>
  
  <div class="layui-form-item">
    <label class="layui-form-label">更新时间</label>
    <div class="layui-input-block">
      <input type="text" name="updatetime" value="<%=sdf%>" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" id="sub" lay-submit="" lay-filter="demo1">立即提交</button>
      <button type="reset" class="layui-btn layui-btn-primary">重置</button>
    </div>
  </div>
</form>
<jsp:include page="../common/_js.jsp"></jsp:include>
<script src="${ctxPath}/static/layui/layui.js" charset="utf-8"></script>
  <script type="text/javascript">
	
	$(function(){
		$("#sub").click(function(){
			$.ajax({
	  			url: '${ctxPath}/customer/update', 
	  			data :$("#cus_form").serialize(), 
	  			type : 'POST',
	  			dataType:"json",
	  			success:function(resp){
	  				if(resp.errorCode!='400000'){
	  					layer.alert(resp.errorMsg)
	  					return;
	  				}
	  				
	  				layer.alert('领取成功')
	  				return false;
	  	         }
	  		}) 
			
		})
		 
	}) 
	
	</script>
</body>
</html>