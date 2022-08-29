<%@ include file="init.jsp" %>

<h2>List of Invoicies</h2>

<%-- <div>
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
				<td> 
					<portlet:renderURL var='updateInvoice'>
						<portlet:param name='jspPage' value='/editInvoice.jsp' />
						<portlet:param name='invoiceId' value='${ invoice.invoiceId }' />
					</portlet:renderURL>
					<a style="padding: 3px; background: blue; color: white; margin-left: 2px;" 
							href="${ updateInvoice }">List Invoincies</a>
				</td>
			</tr>
		</c:forEach>
		
	</table>
</div> --%>