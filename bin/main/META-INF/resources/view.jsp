<%@ include file="init.jsp" %>

<portlet:renderURL var='invoice'>
	<portlet:param name='jspPage' value='/invoice.jsp' />
</portlet:renderURL>

<portlet:renderURL var='listInvoincies'>
	<portlet:param name='jspListPage' value='/listInvoicies.jsp' />
</portlet:renderURL>

<div>
	<h2>Welcome to Invoincing App</h2>
	<a style="padding: 3px; background: blue; color: white;" href="${ invoice }">Generate Invoice</a>
	<a style="padding: 3px; background: blue; color: white; margin-left: 2px;" href="${ listInvoincies }">List Invoincies</a>
</div>
