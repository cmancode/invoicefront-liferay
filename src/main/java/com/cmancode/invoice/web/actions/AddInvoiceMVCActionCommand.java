package com.cmancode.invoice.web.actions;

import com.cmancode.invoice.service.app.service.InvoiceService;
import com.cmancode.invoice.web.constants.InvoiceFrontPortletKeys;
import com.cmancode.invoice.web.constants.MVCCommandNames;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCActionCommand;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;


@Component(
		immediate = true,
		property = {
			"javax.portlet.name=" + InvoiceFrontPortletKeys.INVOICEFRONT,
			"mvc.command.name=" + MVCCommandNames.ADD_INVOICE
		},
		service = MVCActionCommand.class
	)
public class AddInvoiceMVCActionCommand implements MVCActionCommand {

	@Reference
	private InvoiceService _invoiceService;
	
	@Override
	public boolean processAction(ActionRequest actionRequest, ActionResponse actionResponse) throws PortletException {
		
		String invoiceNumber = ParamUtil.getString(actionRequest, "invoiceNumber", "");
		String client = ParamUtil.getString(actionRequest, "client", "");
		String total = ParamUtil.getString(actionRequest, "total", "");
		
		try {
			ServiceContext serviceContext = ServiceContextFactory.getInstance(actionRequest);
			this._invoiceService.addInvoice(invoiceNumber, client, total, serviceContext);
			return true;
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
		

	}

}
