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
			"mvc.command.name=" + MVCCommandNames.ADD_INVOICE
		},
		service = MVCRenderCommand.class
	)
public class InvoiceAddRenderCommand implements MVCRenderCommand {

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		return "/invoice.jsp";
	}

}
