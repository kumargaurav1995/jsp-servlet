<%@ page import="com.pack.jsp.*" %>
<html>

<body>
<jsp:include page="cookie.jsp"></jsp:include>
Thanks! 
So,your name is ${param.firstName} ${param.lastName},class  ${param.class },gender ${param.gender } has applied for following languages:
<ol>
<%
String[] lang=request.getParameterValues("language");
for(String templang : lang){
out.println("<li>"+templang+"</li>");
}
%>
</ol>
Since your marks percentage  is <%=request.getParameter("per")%>.This means<%=MyClass.get_eligiblity(Double.parseDouble(request.getParameter("per")));%>

<a herf="homepage.jsp">Back to HomePage</a>

<% String lang=request.getParameter("language") ;
Cookie cook1=new Cookie("myApp.language",lang);
cook1.setMaxAge(60*60*24);
response.addCookie(cook1);
%>

<% String gen=request.getParameter("gender") ;
Cookie cook2=new Cookie("myApp.gender",gen);
cook2.setMaxAge(60*60*24);
response.addCookie(cook2);
%>


<% String clas=request.getParameter("class") ;
Cookie cook3=new Cookie("myApp.class",clas);
cook3.setMaxAge(60*60*24);
response.addCookie(cook3);
%>



</body>



</html>