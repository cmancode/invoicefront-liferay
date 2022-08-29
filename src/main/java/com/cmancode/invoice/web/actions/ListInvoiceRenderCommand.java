package com.cmancode.invoice.web.actions;

import com.cmancode.invoice.web.constants.InvoiceFrontPortletKeys;
import com.cmancode.invoice.web.constants.MVCCommandNames;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;


@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + InvoiceFrontPortletKeys.INVOICEFRONT,
			"mvc.command.name=" + MVCCommandNames.LIST_INVOCE
		},
		service = MVCRenderCommand.class
	)
public class ListInvoiceRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		return "/listInvoicies.jsp";
	}

}
