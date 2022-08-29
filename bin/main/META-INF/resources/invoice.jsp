<%@ include file="init.jsp" %>
<h2>Generate Invoice</h2>

<liferay-portlet:actionURL var="addInvoice" name="<%= MVCCommandNames.ADD_INVOICE %>">
</liferay-portlet:actionURL>

<% Invoice invoice = null; %>

<aui:form action="${ addInvoice }" >
	
	<aui:model-context bean="<%= invoice %>"  model="<%= Invoice.class %>"></aui:model-context>

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

<%-- <portlet:actionURL name="addInvoice" var="sentInvoiceURL" />

<form method="post" action="${ sentInvoiceURL }">
	<div>
		<div style="padding: 5px 5px;">
			<label>No. Invoice</label>
			<input type="text" placeholder="Invoice Number" 
				name="<portlet:namespace />invoiceNumber" />
		</div>
		
		<div style="padding: 5px 5px;">
			<label>Client</label>
			<input style="margin-left: 35px;" type="text" placeholder="Name Client" 
				name="<portlet:namespace />client"  />
		</div>
		
		<div style="padding: 5px 5px;">
			<label>Total</label>
			<input style="margin-left: 40px;" type="text" placeholder="Total" 
				name="<portlet:namespace />total"  />
		</div>
		
		<div>
			<input style="padding: 6px; background: blue; color: white; border: none; border-radius: 3px;"
			 type="submit" value="Generate Invoice" />
		</div>	
	</div>

</form> --%>
