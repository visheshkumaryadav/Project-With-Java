<%@ include file="nav-bar.jsp" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<body  onload='activeLink("search")'>
<div class='container my-2'>
 <div class='card'>
  <h3 style='text-align: center;color:orange'>user List by First name</h3>
  <div class='card-body'>
   <div class='table'>
    <table class='table table-hover'>
     <thead>
     	<tr>
      		<th>user id</th><th>First name</th><th>Last name</th><th>Address</th>
      		<th>Phone number</th><th>Email Id</th>
      	</tr>
     </thead>
     <tbody>
      <c:forEach var="user" items="${userlist}">
       <tr>
        <td>${user.uid}</td>
        <td>${user.firstname}</td>
        <td>${user.lastname}</td>
        <td>${user.address}</td>
        <td>${user.phone}</td>
        <td>${user.emailid}</td>
       </tr>
      </c:forEach>
     </tbody>
    </table>
   </div>
  </div>
 </div>
</div>
</body>