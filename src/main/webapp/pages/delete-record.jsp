<%@include file="nav-bar.jsp"%>
<body onload='activeLink("vishesh")'>
	<form action="delete">
		<table class='ta'>
			<tr>
				<th class='td'>Enter User id:</th>
				<td class='td'><input type="text" name='uid' class='tb'
					value='${uid}' required></td>
				<td class='td'><button class='btn btn-primary'>Delete
						Record</button></td>
			</tr>

		</table>

		<div class='dv'>
			<h2>${msg}</h2>
		</div>
</body>