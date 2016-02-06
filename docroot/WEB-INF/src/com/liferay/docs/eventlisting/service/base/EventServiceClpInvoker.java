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

package com.liferay.docs.eventlisting.service.base;

import com.liferay.docs.eventlisting.service.EventServiceUtil;

import java.util.Arrays;

/**
 * @author Fernando Karnagi
 * @generated
 */
public class EventServiceClpInvoker {
	public EventServiceClpInvoker() {
		_methodName24 = "getBeanIdentifier";

		_methodParameterTypes24 = new String[] {  };

		_methodName25 = "setBeanIdentifier";

		_methodParameterTypes25 = new String[] { "java.lang.String" };

		_methodName30 = "getRemoteTotalCount";

		_methodParameterTypes30 = new String[] {  };

		_methodName31 = "addEvent";

		_methodParameterTypes31 = new String[] {
				"long", "java.lang.String", "java.lang.String", "int", "int",
				"int", "int", "int", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName32 = "deleteEvent";

		_methodParameterTypes32 = new String[] { "long" };

		_methodName33 = "getEvent";

		_methodParameterTypes33 = new String[] { "long" };

		_methodName34 = "updateEvent";

		_methodParameterTypes34 = new String[] {
				"long", "long", "java.lang.String", "java.lang.String", "int",
				"int", "int", "int", "int", "long",
				"com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			return EventServiceUtil.getBeanIdentifier();
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			EventServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return EventServiceUtil.getRemoteTotalCount();
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			return EventServiceUtil.addEvent(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				((Integer)arguments[3]).intValue(),
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue(),
				((Long)arguments[8]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[9]);
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			return EventServiceUtil.deleteEvent(((Long)arguments[0]).longValue());
		}

		if (_methodName33.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
			return EventServiceUtil.getEvent(((Long)arguments[0]).longValue());
		}

		if (_methodName34.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes34, parameterTypes)) {
			return EventServiceUtil.updateEvent(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				(java.lang.String)arguments[2], (java.lang.String)arguments[3],
				((Integer)arguments[4]).intValue(),
				((Integer)arguments[5]).intValue(),
				((Integer)arguments[6]).intValue(),
				((Integer)arguments[7]).intValue(),
				((Integer)arguments[8]).intValue(),
				((Long)arguments[9]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[10]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName24;
	private String[] _methodParameterTypes24;
	private String _methodName25;
	private String[] _methodParameterTypes25;
	private String _methodName30;
	private String[] _methodParameterTypes30;
	private String _methodName31;
	private String[] _methodParameterTypes31;
	private String _methodName32;
	private String[] _methodParameterTypes32;
	private String _methodName33;
	private String[] _methodParameterTypes33;
	private String _methodName34;
	private String[] _methodParameterTypes34;
}