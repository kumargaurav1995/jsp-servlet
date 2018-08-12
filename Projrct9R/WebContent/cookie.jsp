<html>

<body>
<% String lang="java";
Cookie[] cook1=request.getCookies();
if(cook1 !=null){
for(Cookie tempCookie : cook1){
if("myApp.language".equals(tempCookie.getName())){
lang=tempCookie.getName();
break;
}
}
} %>

<% String gen="male";
Cookie[] cook2=request.getCookies();
if(cook2 !=null){
for(Cookie tempCookie : cook2){
if("myApp.gender".equals(tempCookie.getName())){
gen=tempCookie.getName();
break;
}
}
} %>

<% String clas="10th";
Cookie[] cook3=request.getCookies();
if(cook3 !=null){
for(Cookie tempCookie : cook3){
if("myApp.class".equals(tempCookie.getName())){
clas=tempCookie.getName();
break;
}
}
} %>

</body>

</html>