<%@ include file="init.jsp" %>
<h2>Update Invoice</h2>

<liferay-portlet:actionURL var="updateInvoice" name="<%= MVCCommandNames.UPDATE_INVOCE %>">
</liferay-portlet:actionURL>

<% Invoice invoice = (Invoice) renderRequest.getAttribute("invoice"); %>

<aui:form action="${ updateInvoice }" >
	
	<aui:model-context bean="<%= invoice %>"  model="<%= Invoice.class %>"></aui:model-context>

	<aui:input name="invoiceId" type="hidden"></aui:input>

	<aui:input label="Invoice Number" name="invoiceNumber" type="text" style="width: 50%;"
		placeholder="No. Invoice"></aui:input>
		
	<aui:input label="Full Name Client" name="client" type="text" style="width: 50%;"
		placeholder="Name Client"></aui:input>

	<aui:input label="Total" name="total" type="text" style="width: 50%;"
		placeholder="Total"></aui:input>
		
	<aui:button-row>
		<aui:button type="submit" value="Generate Invoice"></aui:button>
	</aui:button-row>
</aui:form>