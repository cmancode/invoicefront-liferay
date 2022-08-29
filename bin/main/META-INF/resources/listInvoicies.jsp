<%@page import="java.util.List"%>
<%@ include file="init.jsp" %>

<h2>List of Invoicies</h2>

<% List<Invoice> invoicies = (List<Invoice>) renderRequest.getAttribute("invoicies"); %>

<div>
	<table>
		<tr>
			<th style="padding: 5px;">Invoice Number</th>
			<th style="padding: 5px;">Client</th>
			<th style="padding: 5px;">Total</th>
		</tr>
		
		<% for(Invoice invoice: invoicies) {%>
			<tr>
				<td style="padding: 5px;"> <%= invoice.getInvoiceNumber() %> </td>
				<td style="padding: 5px;"> <%= invoice.getClient() %> </td>
				<td style="padding: 5px;"> <%= invoice.getTotal() %> </td>
				<td style="padding: 5px;"> 
					<liferay-portlet:renderURL var="updateInvoice">
						<liferay-portlet:param name="mvcRenderCommandName" value="<%= MVCCommandNames.UPDATE_INVOCE %>"/>
						<liferay-portlet:param name="invoiceId" value="<%= String.valueOf(invoice.getInvoiceId()) %>"/>
					</liferay-portlet:renderURL>
					
					<aui:a style="padding: 3px; background: blue; color: white;" 
						href="<%= updateInvoice %>">Update</aui:a>
				</td>
			</tr>
		<% } %>
		
	</table>
</div>