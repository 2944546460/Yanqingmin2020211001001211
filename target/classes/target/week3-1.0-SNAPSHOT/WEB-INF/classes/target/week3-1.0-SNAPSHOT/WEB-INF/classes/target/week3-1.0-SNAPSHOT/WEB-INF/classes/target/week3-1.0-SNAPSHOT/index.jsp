<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="header.jsp"%>
<%--<h1><%= "Hello World!!!"%></h1><br/>
<a href="/hello-servlet">Hello Servlet</a>
<form>
    <span style="...">New User Registration</span><br/><br/>
    <span style="...">Username</span><input type="text" name="name" required="true" style="..."><br/><br/>
    <span style="...">Password</span><input type="password" name="password" required="true" style="..."><br/><br/>
    <span style="...">Email</span><input type="email" name="email" required="true" style="..."><br/><br/>
    <span style="...">Gender</span>
    <span style="...">Male</span>
    <span style="...">Female</span><input type="radio"><br/><br/>
    <span style="...">Date of birth(yyyy-mm-dd)</span><input type="date" pattern="yyyy-mm-dd" required="true" style="..."><br/><br/>
    <input type="submit" value="register" style="...">
</form>--%>
<h2>Welcome to my online shop home page.</h2><br/>
<form method="get" target='_blank' action="search">
    <!--<url-pattern>/search</url-pattern>-->
    <input type="text" name="txt" size="30">
    <select name="search">
        <option value="baidu">Baidu</option>
        <option value="bing">Bing</option>
        <option value="google">Google</option>
    </select>
    <input type="submit" value="Search"/>
</form>
<%@include file="footer.jsp"%>
