package com.cmancode.invoice.web.portlet;

import com.cmancode.invoice.service.app.model.Invoice;
import com.cmancode.invoice.service.app.service.InvoiceService;
import com.cmancode.invoice.web.constants.InvoiceFrontPortletKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextFactory;
import com.liferay.portal.kernel.util.ParamUtil;

import java.io.IOException;
import java.util.Hashtable;
import java.util.List;
import java.util.Vector;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

/**
 * @author Carlos Alberto
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=InvoiceFront",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + InvoiceFrontPortletKeys.INVOICEFRONT,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class InvoiceFrontPortlet extends MVCPortlet {
	
	@Reference
	private InvoiceService _invoiceService;
	
		public void addInvoice(ActionRequest actionRequest, ActionResponse actionResponse) throws IOException, PortletException {
			
			// Capturing data sent from from
			String invoiceNumber = ParamUtil.getString(actionRequest, "invoiceNumber", "");
			String client = ParamUtil.getString(actionRequest, "client", "");
			String total = ParamUtil.getString(actionRequest, "total", "");
			
			ServiceContext serviceContext = null;
			try {
				serviceContext = ServiceContextFactory.getInstance(actionRequest);
				_invoiceService.addInvoice(invoiceNumber, client, total, serviceContext);
			} catch (PortalException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	
	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse)
			throws IOException, PortletException {
		String page = ParamUtil.getString(renderRequest, "jspPage", "");

		if(page.equals("/listInvoicies.jsp")) {
			List<Invoice> invoicies = this._invoiceService.findInvoices();
			if(!invoicies.isEmpty()) {
				renderRequest.setAttribute("invoicies", invoicies);
			}
		}
		
				
		super.render(renderRequest, renderResponse);		
	}
	
	
}