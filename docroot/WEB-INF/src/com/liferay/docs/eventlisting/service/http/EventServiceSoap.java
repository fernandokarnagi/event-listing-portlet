/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.docs.eventlisting.service.http;

import com.liferay.docs.eventlisting.service.EventServiceUtil;

import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;

import java.rmi.RemoteException;

/**
 * Provides the SOAP utility for the
 * {@link com.liferay.docs.eventlisting.service.EventServiceUtil} service utility. The
 * static methods of this class calls the same methods of the service utility.
 * However, the signatures are different because it is difficult for SOAP to
 * support certain types.
 *
 * <p>
 * ServiceBuilder follows certain rules in translating the methods. For example,
 * if the method in the service utility returns a {@link java.util.List}, that
 * is translated to an array of {@link com.liferay.docs.eventlisting.model.EventSoap}.
 * If the method in the service utility returns a
 * {@link com.liferay.docs.eventlisting.model.Event}, that is translated to a
 * {@link com.liferay.docs.eventlisting.model.EventSoap}. Methods that SOAP cannot
 * safely wire are skipped.
 * </p>
 *
 * <p>
 * The benefits of using the SOAP utility is that it is cross platform
 * compatible. SOAP allows different languages like Java, .NET, C++, PHP, and
 * even Perl, to call the generated services. One drawback of SOAP is that it is
 * slow because it needs to serialize all calls into a text format (XML).
 * </p>
 *
 * <p>
 * You can see a list of services at http://localhost:8080/api/axis. Set the
 * property <b>axis.servlet.hosts.allowed</b> in portal.properties to configure
 * security.
 * </p>
 *
 * <p>
 * The SOAP utility is only generated for remote services.
 * </p>
 *
 * @author Fernando Karnagi
 * @see EventServiceHttp
 * @see com.liferay.docs.eventlisting.model.EventSoap
 * @see com.liferay.docs.eventlisting.service.EventServiceUtil
 * @generated
 */
public class EventServiceSoap {
	public static int getRemoteTotalCount() throws RemoteException {
		try {
			int returnValue = EventServiceUtil.getRemoteTotalCount();

			return returnValue;
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.eventlisting.model.EventSoap addEvent(
		long groupId, java.lang.String name, java.lang.String description,
		int month, int day, int year, int hour, int minute, long locationId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.docs.eventlisting.model.Event returnValue = EventServiceUtil.addEvent(groupId,
					name, description, month, day, year, hour, minute,
					locationId, serviceContext);

			return com.liferay.docs.eventlisting.model.EventSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.eventlisting.model.EventSoap deleteEvent(
		long eventId) throws RemoteException {
		try {
			com.liferay.docs.eventlisting.model.Event returnValue = EventServiceUtil.deleteEvent(eventId);

			return com.liferay.docs.eventlisting.model.EventSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.eventlisting.model.EventSoap[] findAll()
		throws RemoteException {
		try {
			java.util.List<com.liferay.docs.eventlisting.model.Event> returnValue =
				EventServiceUtil.findAll();

			return com.liferay.docs.eventlisting.model.EventSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.eventlisting.model.EventSoap getEvent(
		long eventId) throws RemoteException {
		try {
			com.liferay.docs.eventlisting.model.Event returnValue = EventServiceUtil.getEvent(eventId);

			return com.liferay.docs.eventlisting.model.EventSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.eventlisting.model.EventSoap updateEvent(
		long userId, long eventId, java.lang.String name,
		java.lang.String description, int month, int day, int year, int hour,
		int minute, long locationId,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws RemoteException {
		try {
			com.liferay.docs.eventlisting.model.Event returnValue = EventServiceUtil.updateEvent(userId,
					eventId, name, description, month, day, year, hour, minute,
					locationId, serviceContext);

			return com.liferay.docs.eventlisting.model.EventSoap.toSoapModel(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	public static com.liferay.docs.eventlisting.model.EventSoap[] findByEventNameEventDescriptionLocationName(
		java.lang.String eventName, java.lang.String eventDescription,
		java.lang.String locationName, int begin, int end)
		throws RemoteException {
		try {
			java.util.List<com.liferay.docs.eventlisting.model.Event> returnValue =
				EventServiceUtil.findByEventNameEventDescriptionLocationName(eventName,
					eventDescription, locationName, begin, end);

			return com.liferay.docs.eventlisting.model.EventSoap.toSoapModels(returnValue);
		}
		catch (Exception e) {
			_log.error(e, e);

			throw new RemoteException(e.getMessage());
		}
	}

	private static Log _log = LogFactoryUtil.getLog(EventServiceSoap.class);
}