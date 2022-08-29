package com.cmancode.invoice.web.actions;

import com.cmancode.invoice.service.app.model.Invoice;
import com.cmancode.invoice.service.app.service.InvoiceService;
import com.cmancode.invoice.web.constants.InvoiceFrontPortletKeys;
import com.cmancode.invoice.web.constants.MVCCommandNames;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import java.util.List;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + InvoiceFrontPortletKeys.INVOICEFRONT,
			"mvc.command.name=" + MVCCommandNames.LIST_INVOCE
		},
		service = MVCRenderCommand.class
	)
public class ListInvoiceRenderCommand implements MVCRenderCommand {

	@Reference
	private InvoiceService _invoiceService;
	
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		List<Invoice> invoicies = this._invoiceService.findInvoices();
		
		if(!invoicies.isEmpty()) {
			renderRequest.setAttribute("invoicies", invoicies);
			return "/listInvoicies.jsp";
		}
		
		return "/listInvoicies.jsp";
	}

}
