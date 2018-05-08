<%@page import="com.zhidisoft.crm.vo.CustomerUserNameVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String ctxPath  = request.getContextPath();
    request.setAttribute("ctxPath", ctxPath);
    CustomerUserNameVO customer=(CustomerUserNameVO)request.getAttribute("customer");
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
  <legend>客户池信息展示</legend>
</fieldset>
 
<form class="layui-form" action="">
  <div class="layui-form-item">
    <label class="layui-form-label">拥有者</label>
    <div class="layui-input-block">
      <input type="text" name="owneruserid"  lay-verify="title" autocomplete="off" placeholder="请选择拥有者" class="layui-input" >
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">创建者</label>
    <div class="layui-input-block">
      <input type="text" name="creatoruserid"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">是否被删除</label>
    <div class="layui-input-block">
      <input type="text" name="isdeleted"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">是否被锁定</label>
    <div class="layui-input-block">
      <input type="text" name="islocked"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">删除人</label>
    <div class="layui-input-block">
      <input type="text" name="deleteuserid"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">删除时间</label>
    <div class="layui-input-block">
      <input type="text" name="deletetime"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">公司性质</label>
    <div class="layui-input-block">
      <input type="text" name="ownership"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">年营业额</label>
    <div class="layui-input-block">
      <input type="text" name="annualrevenue"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">客户信息来源</label>
    <div class="layui-input-block">
      <input type="text" name="origin"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">邮编</label>
    <div class="layui-input-block">
      <input type="text" name="zipcode"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">客户名称</label>
    <div class="layui-input-block">
      <input type="text" name="name"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">客户行业</label>
    <div class="layui-input-block">
      <input type="text" name="industry"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">评分</label>
    <div class="layui-input-block">
      <input type="text" name="rating"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">客户联系地址</label>
    <div class="layui-input-block">
      <input type="text" name="address"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">创建时间</label>
    <div class="layui-input-block">
      <input type="text" name="createtime" lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>
  
  <div class="layui-form-item">
    <label class="layui-form-label">更新时间</label>
    <div class="layui-input-block">
      <input type="text" name="updatetime"  lay-verify="title" autocomplete="off" placeholder="请输入标题" class="layui-input">
    </div>
  </div>

  <div class="layui-form-item">
    <div class="layui-input-block">
      <button class="layui-btn" lay-submit="" id="sub" lay-filter="demo1">立即提交</button>
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
	  			url: '${ctxPath}/customer/save', 
	  			data :$("#cus_form").serialize(), 
	  			type : 'POST',
	  			dataType:"json",
	  			success:function(resp){
	  				if(resp.errorCode!='400000'){
	  					layer.alert(resp.errorMsg)
	  					return;
	  				}
	  				
	  				layer.alert('添加成功')
	  				return false;
	  	         }
	  		}) 
			
		})
		 
	}) 
  </script>
</body>
</html>