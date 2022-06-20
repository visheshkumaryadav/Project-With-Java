<%@ include file="nav-bar.jsp"%>
<body onload='activeLink("search")'>
	<table border='1' class='tar'>
		<tr style='background-color: #8866FF' align="center">
			<th class='la' colspan="2">user Details</th>
		</tr>
		<tr>
			<th align='left'>user id</th>
			<td>${user.uid}</td>
		</tr>
		<tr>
			<th align='left'>user first name</th>
			<td>${user.firstname}</td>
		</tr>
		<tr>
			<th align='left'>user last name</th>
			<td>${user.lastname}</td>
		</tr>
		<tr>
			<th align='left'>user phone</th>
			<td>${user.phone}</td>
		</tr>
		<tr>
			<th align='left'>user address</th>
			<td>${user.address}</td>
		</tr>
		<tr>
			<th align='left'>user email id</th>
			<td>${user.emailid}</td>
		</tr>
	</table>
</body>