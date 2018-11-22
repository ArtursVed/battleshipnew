<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>shipplacement</title>
</head>
<body>
${errorHolder.message}

<form method="post" action="shipplacement">
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
                   <c:set var="addr" value="${col}${row}"/>
                   <input type="checkbox"
                          name="cell"
                          value="${addr}"
                          <c:if test="${tempShipsHolder.ships[addr]}">checked</c:if>
                   >
               </td>
           </c:forEach>
       </tr>
   </c:forEach>

</table>
    <button type="submit">i'm ready</button>
</form>
</body>
</html>
