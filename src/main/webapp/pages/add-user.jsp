<%@ taglib uri="http://www.springframework.org/tags/form" prefix="spring"%>
<%@ include file="nav-bar.jsp" %>
<body  onload='activeLink("save")'>
<div class='container'>
 <div class='card mx-auto col-md-10'>
  <h4 style="text-align:center" class='text-danger'>${msg}</h4>
  <div class='card-body'>
   <spring:form action="save-record" method="post">
   <div class='row form-group'>
     <div class='col-md-12'>
      <label for="uid">Enter user id</label><span> *</span>
       <spring:input type='text' path='uid' id='uid' class='form-control' />
     </div>
    </div>
    <div class='row form-group'>
      <div class='col-md-6'>
       <label for="firstname">Enter first name</label><span> *</span>
       <spring:input type='text' path='firstname' id='firstname' class='form-control' />
      </div>
      <div class='col-md-6'>
      <label for="lastname">Enter last name</label><span> *</span>
       <spring:input type='text' path='lastname' id='lastname' class='form-control' />
     </div>
    </div>
    <div class='row form-group'>
      <div class='col-md-6'>
       <label for="phone">Enter phone number</label><span> *</span>
       <spring:input type='text'  path='phone' id='phone' class='form-control' />
      </div>
      <div class='col-md-6'>
      <label for="address">Enter address</label><span> *</span>
       <spring:input type='text' path='address' id='address' class='form-control' />
     </div>
    </div>
    <div class='row form-group'>
     <div class='col-md-12'>
      <label for="emailid">Enter email id</label><span> *</span>
       <spring:input type='text' path='emailid' id='emailid' class='form-control' />
     </div>
     </div>
     <div class='row form-group'>
     <div class='col-md-12'>
       <button class='btn btn-primary'>Save Record</button>
     </div>
    </div>
    <div class='row form-group'>
     <div>
       <span>* </span><label>Mandatory field</label>
     </div>
    </div>
   </spring:form>
  </div>
 </div>
</div>
</body>