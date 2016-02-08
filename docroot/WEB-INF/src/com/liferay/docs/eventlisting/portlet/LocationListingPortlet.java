package com.liferay.docs.eventlisting.portlet;

import java.io.IOException;
import java.util.List;

import javax.portlet.ActionRequest;
import javax.portlet.ActionResponse;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import com.liferay.docs.eventlisting.model.Location;
import com.liferay.docs.eventlisting.service.LocationServiceUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.model.Role;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.service.UserServiceUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;

/**
 * Portlet implementation class LocationListingPortlet
 */
public class LocationListingPortlet extends MVCPortlet {

	@Override
	public void doView(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		System.out.println("LocationListingPortlet.doView");

		System.out.println("user principal: " + renderRequest.getUserPrincipal().getName());
		System.out.println("user name: " + renderRequest.getRemoteUser());

		try {
			List<Role> roles = UserServiceUtil.getCurrentUser().getRoles();
			System.out.println("Printing roles:...");
			for (Role role: roles) {
				System.out.println(role);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("is approver role: " + renderRequest.isUserInRole("approver"));
		System.out.println("is requester role: " + renderRequest.isUserInRole("requester"));

		super.doView(renderRequest, renderResponse);
	}

	public void addLocation(ActionRequest request, ActionResponse response) throws Exception {

		_updateLocation(request);

		sendRedirect(request, response);
	}

	public void deleteLocation(ActionRequest request, ActionResponse response) throws Exception {

		long locationId = ParamUtil.getLong(request, "locationId");

		LocationServiceUtil.deleteLocation(locationId);

		sendRedirect(request, response);
	}

	public void updateLocation(ActionRequest request, ActionResponse response) throws Exception {

		_updateLocation(request);

		sendRedirect(request, response);
	}

	private Location _updateLocation(ActionRequest request) throws PortalException, SystemException {

		long locationId = (ParamUtil.getLong(request, "locationId"));
		String name = (ParamUtil.getString(request, "name"));
		String description = (ParamUtil.getString(request, "description"));
		String streetAddress = (ParamUtil.getString(request, "streetAddress"));
		String city = (ParamUtil.getString(request, "city"));
		String stateOrProvince = (ParamUtil.getString(request, "stateOrProvince"));
		String country = (ParamUtil.getString(request, "country"));

		ServiceContext serviceContext = ServiceContextFactory.getInstance(Location.class.getName(), request);

		Location location = null;

		if (locationId <= 0) {

			System.out.println("serviceContext.getScopeGroupId(): " + serviceContext.getScopeGroupId());
			System.out.println("name: " + name);
			System.out.println("description: " + description);
			System.out.println("streetAddress: " + streetAddress);
			System.out.println("city: " + city);
			System.out.println("country: " + country);
			location = LocationServiceUtil.addLocation(serviceContext.getScopeGroupId(), name, description, streetAddress, city,
					stateOrProvince, country, serviceContext);
		} else {
			location = LocationServiceUtil.getLocation(locationId);

			location = LocationServiceUtil.updateLocation(locationId, name, description, streetAddress, city, stateOrProvince, country,
					serviceContext);
		}

		return location;
	}

	private static Log _log = LogFactoryUtil.getLog(LocationListingPortlet.class);
}
