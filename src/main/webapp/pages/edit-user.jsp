<%@ include file="nav-bar.jsp" %>
<body  onload='activeLink("jitendraindia")'>
<div class='container'>
 <div class='card mx-auto col-md-8'>
  <div class='card-body'>
   <form action="update-record" method="post">
    <div class='row form-group'>
     <div class='col-md-12'>
      <label for="uid" class='cl'>user id</label><span> *</span>
       <input type='text' value="${user.uid}" name='uid' id='uid' class='form-control' required>
     </div>
    </div>
    <div class='row form-group'>
      <div class='col-md-6'>
       <label for="firstname" class='cl'>user First name</label><span> *</span>
       <input type='text' value="${user.firstname}" name='firstname' id='firstname' class='form-control' required>
      </div>
      <div class='col-md-6'>
      <label for="lastname" class='cl'>user Last name</label><span> *</span>
       <input type='text' value="${user.lastname}" name='lastname' id='lastname' class='form-control' required>
     </div>
    </div>
    <div class='row form-group'>
      <div class='col-md-6'>
       <label for="phone" class='cl'>user Phone number</label><span> *</span>
       <input type='text' value="${user.phone}" name='phone' id='phone' class='form-control' required>
      </div>
      <div class='col-md-6'>
      <label for="email" class='cl'>user Email id</label><span> *</span>
       <input type='text' value="${user.emailid}" name='emailid' id='email' class='form-control' required>
     </div>
    </div>
    <div class='row form-group'>
     <div class='col-md-12'>
      <label for="address" class='cl'>user address</label><span> *</span>
       <input type='text' value="${user.address}" name='address' id='address' class='form-control' required>
     </div>
     </div>
     <div class='row form-group'>
     <div class='col-md-12'>
       <button class='btn btn-primary'>Update Record</button>
     </div>
    </div>
    <div class='row form-group'>
     <div>
       <span>* </span><label>Mandatory field</label>
     </div>
    </div>
   </form>
  </div>
 </div>
</div>
</body>