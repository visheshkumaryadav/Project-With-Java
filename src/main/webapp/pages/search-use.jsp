<%@ include file="nav-bar.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body onload='activeLink("search")'>
<form  id='fr' action="searchrecord-byid"> 
<table class='sta' cellpadding='20px'>
 <tr>
  <td><input  checked style='margin-left:50px' type='radio' id='sbid' onclick="searchAction(this)" name='search'>Search by id</td>
  <c:choose>
   <c:when test='${rb=="byname"}'>	
  	<td><input checked type='radio' id=sbna' onclick="searchAction(this)" name='search'>Search by first name</td>
   </c:when>
   <c:otherwise>
    <td><input type='radio' id=sbna' onclick="searchAction(this)" name='search'>Search by first name</td>
   </c:otherwise>
  </c:choose>
 </tr>
 <tr>
  <td colspan="2" align="center">
  	<input  type='text' name='tv' value="${str}" style='text-align: center' class='tb' placeholder='Type value here' required>
  </td>
 </tr>
 <tr>
  <td colspan="2" align="center">
   <button  style='width:60%' class='bt'>Show Record</button>
  </td>	
 </tr>
</table>
<div class='dvv'>
 <h3 style='color:red'>${msg}</h3>
</div>
</form>
</body>