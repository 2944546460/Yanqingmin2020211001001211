<%--
  Created by IntelliJ IDEA.
  User: 29445
  Date: 2022/3/15
  Time: 22:35
  To change this template use File | Settings | File Templates.
--%>
<%@include file="header.jsp"%>>
<form method="post" action="register" >
    name:<input type="text" name="username"></br>
    password:<input type="text" name="password"></br>
    email:<input type="text" name="email"></br>
    gender:<input type="radio" name="gender" value="male">Male <input type="radio" name="gender" value="femal">Female</br>
    birthDate:<input type="text name=" name="birthDate"></br>
    <input type="submit" name="submit" password="submit" email="submit" gender="submit" birthdate="submit" value="Register"/>

</form>
<%@include file="footer.jsp"%>>
