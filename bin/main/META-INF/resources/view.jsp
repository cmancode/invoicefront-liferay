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
