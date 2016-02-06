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

import com.liferay.docs.eventlisting.service.LocationServiceUtil;

import java.util.Arrays;

/**
 * @author Fernando Karnagi
 * @generated
 */
public class LocationServiceClpInvoker {
	public LocationServiceClpInvoker() {
		_methodName24 = "getBeanIdentifier";

		_methodParameterTypes24 = new String[] {  };

		_methodName25 = "setBeanIdentifier";

		_methodParameterTypes25 = new String[] { "java.lang.String" };

		_methodName30 = "addLocation";

		_methodParameterTypes30 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};

		_methodName31 = "deleteLocation";

		_methodParameterTypes31 = new String[] { "long" };

		_methodName32 = "getLocation";

		_methodParameterTypes32 = new String[] { "long" };

		_methodName33 = "updateLocation";

		_methodParameterTypes33 = new String[] {
				"long", "java.lang.String", "java.lang.String",
				"java.lang.String", "java.lang.String", "java.lang.String",
				"java.lang.String", "com.liferay.portal.service.ServiceContext"
			};
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName24.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes24, parameterTypes)) {
			return LocationServiceUtil.getBeanIdentifier();
		}

		if (_methodName25.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes25, parameterTypes)) {
			LocationServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName30.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes30, parameterTypes)) {
			return LocationServiceUtil.addLocation(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(com.liferay.portal.service.ServiceContext)arguments[7]);
		}

		if (_methodName31.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes31, parameterTypes)) {
			return LocationServiceUtil.deleteLocation(((Long)arguments[0]).longValue());
		}

		if (_methodName32.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes32, parameterTypes)) {
			return LocationServiceUtil.getLocation(((Long)arguments[0]).longValue());
		}

		if (_methodName33.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes33, parameterTypes)) {
			return LocationServiceUtil.updateLocation(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1], (java.lang.String)arguments[2],
				(java.lang.String)arguments[3], (java.lang.String)arguments[4],
				(java.lang.String)arguments[5], (java.lang.String)arguments[6],
				(com.liferay.portal.service.ServiceContext)arguments[7]);
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
}