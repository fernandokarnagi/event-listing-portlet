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

package com.liferay.docs.eventlisting.model.impl;

import com.liferay.docs.eventlisting.model.Location;
import com.liferay.docs.eventlisting.model.LocationModel;
import com.liferay.docs.eventlisting.model.LocationSoap;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the Location service. Represents a row in the &quot;Location&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.docs.eventlisting.model.LocationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LocationImpl}.
 * </p>
 *
 * @author Fernando Karnagi
 * @see LocationImpl
 * @see com.liferay.docs.eventlisting.model.Location
 * @see com.liferay.docs.eventlisting.model.LocationModel
 * @generated
 */
@JSON(strict = true)
public class LocationModelImpl extends BaseModelImpl<Location>
	implements LocationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a location model instance should use the {@link com.liferay.docs.eventlisting.model.Location} interface instead.
	 */
	public static final String TABLE_NAME = "Location";
	public static final Object[][] TABLE_COLUMNS = {
			{ "locationId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "name", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "streetAddress", Types.VARCHAR },
			{ "city", Types.VARCHAR },
			{ "stateOrProvince", Types.VARCHAR },
			{ "country", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table Location (locationId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,createDate DATE null,modifiedDate DATE null,name VARCHAR(75) null,description VARCHAR(75) null,streetAddress VARCHAR(75) null,city VARCHAR(75) null,stateOrProvince VARCHAR(75) null,country VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table Location";
	public static final String ORDER_BY_JPQL = " ORDER BY location.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY Location.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.docs.eventlisting.model.Location"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.docs.eventlisting.model.Location"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.docs.eventlisting.model.Location"),
			true);
	public static long GROUPID_COLUMN_BITMASK = 1L;
	public static long NAME_COLUMN_BITMASK = 2L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Location toModel(LocationSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Location model = new LocationImpl();

		model.setLocationId(soapModel.getLocationId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setGroupId(soapModel.getGroupId());
		model.setUserId(soapModel.getUserId());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setName(soapModel.getName());
		model.setDescription(soapModel.getDescription());
		model.setStreetAddress(soapModel.getStreetAddress());
		model.setCity(soapModel.getCity());
		model.setStateOrProvince(soapModel.getStateOrProvince());
		model.setCountry(soapModel.getCountry());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Location> toModels(LocationSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Location> models = new ArrayList<Location>(soapModels.length);

		for (LocationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.docs.eventlisting.model.Location"));

	public LocationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _locationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setLocationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _locationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Location.class;
	}

	@Override
	public String getModelClassName() {
		return Location.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("locationId", getLocationId());
		attributes.put("companyId", getCompanyId());
		attributes.put("groupId", getGroupId());
		attributes.put("userId", getUserId());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("description", getDescription());
		attributes.put("streetAddress", getStreetAddress());
		attributes.put("city", getCity());
		attributes.put("stateOrProvince", getStateOrProvince());
		attributes.put("country", getCountry());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long locationId = (Long)attributes.get("locationId");

		if (locationId != null) {
			setLocationId(locationId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String streetAddress = (String)attributes.get("streetAddress");

		if (streetAddress != null) {
			setStreetAddress(streetAddress);
		}

		String city = (String)attributes.get("city");

		if (city != null) {
			setCity(city);
		}

		String stateOrProvince = (String)attributes.get("stateOrProvince");

		if (stateOrProvince != null) {
			setStateOrProvince(stateOrProvince);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}
	}

	@JSON
	@Override
	public long getLocationId() {
		return _locationId;
	}

	@Override
	public void setLocationId(long locationId) {
		_locationId = locationId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask = -1L;

		_name = name;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@JSON
	@Override
	public String getStreetAddress() {
		if (_streetAddress == null) {
			return StringPool.BLANK;
		}
		else {
			return _streetAddress;
		}
	}

	@Override
	public void setStreetAddress(String streetAddress) {
		_streetAddress = streetAddress;
	}

	@JSON
	@Override
	public String getCity() {
		if (_city == null) {
			return StringPool.BLANK;
		}
		else {
			return _city;
		}
	}

	@Override
	public void setCity(String city) {
		_city = city;
	}

	@JSON
	@Override
	public String getStateOrProvince() {
		if (_stateOrProvince == null) {
			return StringPool.BLANK;
		}
		else {
			return _stateOrProvince;
		}
	}

	@Override
	public void setStateOrProvince(String stateOrProvince) {
		_stateOrProvince = stateOrProvince;
	}

	@JSON
	@Override
	public String getCountry() {
		if (_country == null) {
			return StringPool.BLANK;
		}
		else {
			return _country;
		}
	}

	@Override
	public void setCountry(String country) {
		_country = country;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Location.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Location toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Location)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		LocationImpl locationImpl = new LocationImpl();

		locationImpl.setLocationId(getLocationId());
		locationImpl.setCompanyId(getCompanyId());
		locationImpl.setGroupId(getGroupId());
		locationImpl.setUserId(getUserId());
		locationImpl.setCreateDate(getCreateDate());
		locationImpl.setModifiedDate(getModifiedDate());
		locationImpl.setName(getName());
		locationImpl.setDescription(getDescription());
		locationImpl.setStreetAddress(getStreetAddress());
		locationImpl.setCity(getCity());
		locationImpl.setStateOrProvince(getStateOrProvince());
		locationImpl.setCountry(getCountry());

		locationImpl.resetOriginalValues();

		return locationImpl;
	}

	@Override
	public int compareTo(Location location) {
		int value = 0;

		value = getName().compareTo(location.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Location)) {
			return false;
		}

		Location location = (Location)obj;

		long primaryKey = location.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		LocationModelImpl locationModelImpl = this;

		locationModelImpl._originalGroupId = locationModelImpl._groupId;

		locationModelImpl._setOriginalGroupId = false;

		locationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Location> toCacheModel() {
		LocationCacheModel locationCacheModel = new LocationCacheModel();

		locationCacheModel.locationId = getLocationId();

		locationCacheModel.companyId = getCompanyId();

		locationCacheModel.groupId = getGroupId();

		locationCacheModel.userId = getUserId();

		Date createDate = getCreateDate();

		if (createDate != null) {
			locationCacheModel.createDate = createDate.getTime();
		}
		else {
			locationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			locationCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			locationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		locationCacheModel.name = getName();

		String name = locationCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			locationCacheModel.name = null;
		}

		locationCacheModel.description = getDescription();

		String description = locationCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			locationCacheModel.description = null;
		}

		locationCacheModel.streetAddress = getStreetAddress();

		String streetAddress = locationCacheModel.streetAddress;

		if ((streetAddress != null) && (streetAddress.length() == 0)) {
			locationCacheModel.streetAddress = null;
		}

		locationCacheModel.city = getCity();

		String city = locationCacheModel.city;

		if ((city != null) && (city.length() == 0)) {
			locationCacheModel.city = null;
		}

		locationCacheModel.stateOrProvince = getStateOrProvince();

		String stateOrProvince = locationCacheModel.stateOrProvince;

		if ((stateOrProvince != null) && (stateOrProvince.length() == 0)) {
			locationCacheModel.stateOrProvince = null;
		}

		locationCacheModel.country = getCountry();

		String country = locationCacheModel.country;

		if ((country != null) && (country.length() == 0)) {
			locationCacheModel.country = null;
		}

		return locationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{locationId=");
		sb.append(getLocationId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", streetAddress=");
		sb.append(getStreetAddress());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", stateOrProvince=");
		sb.append(getStateOrProvince());
		sb.append(", country=");
		sb.append(getCountry());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("com.liferay.docs.eventlisting.model.Location");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>locationId</column-name><column-value><![CDATA[");
		sb.append(getLocationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>streetAddress</column-name><column-value><![CDATA[");
		sb.append(getStreetAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>stateOrProvince</column-name><column-value><![CDATA[");
		sb.append(getStateOrProvince());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>country</column-name><column-value><![CDATA[");
		sb.append(getCountry());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Location.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			Location.class
		};
	private long _locationId;
	private long _companyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private String _userUuid;
	private Date _createDate;
	private Date _modifiedDate;
	private String _name;
	private String _description;
	private String _streetAddress;
	private String _city;
	private String _stateOrProvince;
	private String _country;
	private long _columnBitmask;
	private Location _escapedModel;
}