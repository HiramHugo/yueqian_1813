<%@page contentType="text/html;charset=GBK"%>
<%@page import="java.util.*"%>
<%
    //ʹ��request�����ȡ����
    String refName = (String)request.getAttribute("name");
    Date refDate = (Date)request.getAttribute("date");
    //Ҳ����ʹ��pageContext�����ȡ���ԣ�ֻҪ�ڻ�ȡʱָ����������Է�Χ����
    String refName2 = (String)pageContext.getAttribute("name", PageContext.REQUEST_SCOPE);
    Date refDate2 = (Date)pageContext.getAttribute("date", PageContext.REQUEST_SCOPE);
%>
ʹ��request�����ȡ���ԣ�
<h1>������<%=refName%></h1>
<h1>���ڣ�<%=refDate%></h1>
ʹ��pageContext�����ȡ���ԣ�
<h1>������<%=refName2%></h1>
<h1>���ڣ�<%=refDate2%></h1>