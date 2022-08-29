package com.cmancode.invoice.web.actions;

import com.cmancode.invoice.service.app.model.Invoice;
import com.cmancode.invoice.service.app.service.InvoiceService;
import com.cmancode.invoice.web.constants.InvoiceFrontPortletKeys;
import com.cmancode.invoice.web.constants.MVCCommandNames;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + InvoiceFrontPortletKeys.INVOICEFRONT,
			"mvc.command.name=" + MVCCommandNames.UPDATE_INVOCE
		},
		service = MVCRenderCommand.class
	)
public class InvoiceUpdateRenderCommand implements MVCRenderCommand {

	@Reference
	private InvoiceService _invoiceService;
	
	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		
		// Capture the value ID of invoice 
		long invoiceId = ParamUtil.getLong(renderRequest, "invoiceId");
		if(invoiceId != 0) {
			Invoice invoice = this._invoiceService.findInvoiceById(invoiceId);
			renderRequest.setAttribute("invoice", invoice);
		}
		

		 
		return "/updateInvoice.jsp";
	}

}
