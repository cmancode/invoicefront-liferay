<%@ include file="init.jsp" %>

<h2>List of Invoicies</h2>

<div>
	<table>
		<tr>
			<th>Invoice Number</th>
			<th>Client</th>
			<th>Total</th>
		</tr>
		
		<c:forEach var='invoice' items='${ invoicies }'>
			<tr>
				<td>${ invoice.invoiceNumber }</td>
				<td>${ invoice.client }</td>
				<td>${ invoice.total }</td>
			</tr>
		</c:forEach>
		
	</table>
</div>