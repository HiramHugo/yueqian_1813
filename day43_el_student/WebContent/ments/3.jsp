<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%--使用<jsp:forward>标签跳转到4.jsp--%>
<%--使用<jsp:param>标签向4.jsp传递参数--%>
<jsp:forward page="/4.jsp">
    <jsp:param name="ref1" value="hello" />
    <jsp:param name="ref2" value="gacl" />
</jsp:forward>