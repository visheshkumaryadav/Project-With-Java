function activeLink(linkid)
{
	document.getElementById(linkid).style.color='red';
}
function searchAction(radio)
{
	if(radio.id=="sbid")
		document.getElementById("fr").action="searchrecord-byid";
	else
		document.getElementById("fr").action="searchrecord-byname";
}
