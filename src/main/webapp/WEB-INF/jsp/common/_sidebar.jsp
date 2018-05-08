
<%@page import="com.zhidisoft.crm.entity.TbSystemFunction"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	
<div class="admin-sidebar am-offcanvas" id="admin-offcanvas">
    <div class="am-offcanvas-bar admin-offcanvas-bar">
      <ul class="am-list admin-sidebar-list">
        <% 
            List<TbSystemFunction> functions = (List<TbSystemFunction>)session.getAttribute("functions");
        %>
        
        <%
            for(TbSystemFunction function : functions){%>
           <li><a href="${ctxPath}/<%=function.getFuncurl()%>"><span class="am-icon-sign-out"></span><%=function.getFuncname() %></a></li>
        <%} %>
        
      </ul>

      <div class="am-panel am-panel-default admin-sidebar-panel">
        <div class="am-panel-bd">
          <p><span class="am-icon-bookmark"></span> 公告</p>
          <p>时光静好，与君语；细水流年，与君同。—— Amaze UI</p>
        </div>
      </div>
    </div>
  </div>