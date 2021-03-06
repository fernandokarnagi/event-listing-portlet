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

package com.liferay.docs.eventlisting.service.impl;

import java.util.List;

import com.liferay.docs.eventlisting.model.Event;
import com.liferay.docs.eventlisting.service.EventLocalServiceUtil;
import com.liferay.docs.eventlisting.service.base.EventServiceBaseImpl;
import com.liferay.docs.eventlisting.service.permission.EventListingPermission;
import com.liferay.docs.eventlisting.service.permission.EventPermission;
import com.liferay.docs.eventlisting.service.persistence.EventFinderUtil;
import com.liferay.docs.eventlisting.util.EventListingActionKeys;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.ServiceContext;

/**
 * The implementation of the event remote service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are
 * added, rerun ServiceBuilder to copy their definitions into the
 * {@link com.liferay.docs.eventlisting.service.EventService} interface.
 *
 * <p>
 * This is a remote service. Methods of this service are expected to have
 * security checks based on the propagated JAAS credentials because this service
 * can be accessed remotely.
 * </p>
 *
 * @author Joe Bloggs
 * @see com.liferay.docs.eventlisting.service.base.EventServiceBaseImpl
 * @see com.liferay.docs.eventlisting.service.EventServiceUtil
 */
public class EventServiceImpl extends EventServiceBaseImpl {

	public int getRemoteTotalCount() {
		return 1;
	}

	public Event addEvent(long groupId, String name, String description, int month, int day, int year, int hour, int minute,
			long locationId, ServiceContext serviceContext) throws PortalException, SystemException {

		EventListingPermission.check(getPermissionChecker(), groupId, EventListingActionKeys.ADD_EVENT);

		return EventLocalServiceUtil.addEvent(getUserId(), groupId, name, description, month, day, year, hour, minute, locationId,
				serviceContext);
	}

	public Event deleteEvent(long eventId) throws PortalException, SystemException {

		EventPermission.check(getPermissionChecker(), eventId, EventListingActionKeys.DELETE_EVENT);

		return EventLocalServiceUtil.deleteEvent(eventId);
	}

	public List<Event> findAll() throws PortalException, SystemException {

		//EventPermission.check(getPermissionChecker(), EventListingActionKeys.VIEW);

		return EventLocalServiceUtil.findAll();
	}

	public Event getEvent(long eventId) throws PortalException, SystemException {

		EventPermission.check(getPermissionChecker(), eventId, EventListingActionKeys.VIEW);

		return EventLocalServiceUtil.getEvent(eventId);
	}

	public Event updateEvent(long userId, long eventId, String name, String description, int month, int day, int year, int hour,
			int minute, long locationId, ServiceContext serviceContext) throws PortalException, SystemException {

		EventPermission.check(getPermissionChecker(), eventId, EventListingActionKeys.UPDATE_EVENT);

		return EventLocalServiceUtil.updateEvent(userId, eventId, name, description, month, day, year, hour, minute, locationId,
				serviceContext);
	}

	public List<Event> findByEventNameEventDescriptionLocationName(String eventName, String eventDescription, String locationName,
			int begin, int end) throws SystemException {

		return EventLocalServiceUtil.findByEventNameEventDescriptionLocationName(eventName, eventDescription, locationName, begin, end);
	}

	/*
	 * NOTE FOR DEVELOPERS:
	 * 
	 * Never reference this interface directly. Always use {@link
	 * com.liferay.docs.eventlisting.service.EventServiceUtil} to access the
	 * event remote service.
	 */
}