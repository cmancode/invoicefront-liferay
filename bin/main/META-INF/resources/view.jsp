<%@ include file="init.jsp" %>

<div>
	<liferay-portlet:renderURL var="addInvoice">
		<liferay-portlet:param name="mvcRenderCommandName" value="<%= MVCCommandNames.ADD_INVOICE %>"/>
	</liferay-portlet:renderURL>
	
	<liferay-portlet:renderURL var="listInvoice">
		<liferay-portlet:param name="mvcRenderCommandName" value="<%= MVCCommandNames.LIST_INVOCE %>"/>
	</liferay-portlet:renderURL>
	
	<aui:a style="padding: 3px; background: blue; color: white;" 
		href="<%= addInvoice %>">Generate Invoice</aui:a>
		
	<aui:a style="padding: 3px; background: blue; color: white; margin-left: 2px;" 
		href="<%= listInvoice %>">List Invoincies</aui:a>
</div>



<%-- <portlet:renderURL var='invoice'>
	<portlet:param name='jspPage' value='/invoice.jsp' />
</portlet:renderURL>

<portlet:renderURL var='listInvoincies'>
	<portlet:param name='jspPage' value='/listInvoicies.jsp' />
</portlet:renderURL>

<div>
	<h2>Welcome to Invoincing App</h2>
	<a style="padding: 3px; background: blue; color: white;" 
		href="${ invoice }">Generate Invoice</a>
	<a style="padding: 3px; background: blue; color: white; margin-left: 2px;" 
		href="${ listInvoincies }">List Invoincies</a>
</div> --%>
