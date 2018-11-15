<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: java_tsi08
  Date: 15.11.2018
  Time: 20:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>shipplacement</title>
</head>
<body>
<form>
<table>
    <tr>
     <td>&nbsp;</td>
    <c:forEach items="A,B,C,D,E,F,G,H,I,J" var="col">
        <td>${col}</td>
    </c:forEach>
    </tr>

   <c:forEach begin="1" end="10" var="row">
       <tr>
           <td>${row}</td>
           <c:forEach items="A,B,C,D,E,F,G,H,I,J" var="col">
               <td>
                   <input type ="checkbox">
               </td>
           </c:forEach>
       </tr>
   </c:forEach>

</table>
    <button type="submit">i'm ready</button>
</form>
</body>
</html>
