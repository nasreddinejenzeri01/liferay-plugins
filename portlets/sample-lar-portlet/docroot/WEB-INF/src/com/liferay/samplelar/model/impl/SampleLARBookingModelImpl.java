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

package com.liferay.samplelar.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.lar.StagedModelType;
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

import com.liferay.samplelar.model.SampleLARBooking;
import com.liferay.samplelar.model.SampleLARBookingModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the SampleLARBooking service. Represents a row in the &quot;SampleLARBooking&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.liferay.samplelar.model.SampleLARBookingModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link SampleLARBookingImpl}.
 * </p>
 *
 * @author Mate Thurzo
 * @see SampleLARBookingImpl
 * @see com.liferay.samplelar.model.SampleLARBooking
 * @see com.liferay.samplelar.model.SampleLARBookingModel
 * @generated
 */
public class SampleLARBookingModelImpl extends BaseModelImpl<SampleLARBooking>
	implements SampleLARBookingModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sample l a r booking model instance should use the {@link com.liferay.samplelar.model.SampleLARBooking} interface instead.
	 */
	public static final String TABLE_NAME = "SampleLARBooking";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "sampleLARBookingId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "bookingNumber", Types.VARCHAR }
		};
	public static final String TABLE_SQL_CREATE = "create table SampleLARBooking (uuid_ VARCHAR(75) null,sampleLARBookingId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,bookingNumber VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table SampleLARBooking";
	public static final String ORDER_BY_JPQL = " ORDER BY sampleLARBooking.bookingNumber ASC";
	public static final String ORDER_BY_SQL = " ORDER BY SampleLARBooking.bookingNumber ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.liferay.samplelar.model.SampleLARBooking"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.liferay.samplelar.model.SampleLARBooking"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.liferay.samplelar.model.SampleLARBooking"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long UUID_COLUMN_BITMASK = 4L;
	public static long BOOKINGNUMBER_COLUMN_BITMASK = 8L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.liferay.samplelar.model.SampleLARBooking"));

	public SampleLARBookingModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sampleLARBookingId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSampleLARBookingId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sampleLARBookingId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return SampleLARBooking.class;
	}

	@Override
	public String getModelClassName() {
		return SampleLARBooking.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("sampleLARBookingId", getSampleLARBookingId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("bookingNumber", getBookingNumber());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long sampleLARBookingId = (Long)attributes.get("sampleLARBookingId");

		if (sampleLARBookingId != null) {
			setSampleLARBookingId(sampleLARBookingId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String bookingNumber = (String)attributes.get("bookingNumber");

		if (bookingNumber != null) {
			setBookingNumber(bookingNumber);
		}
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getSampleLARBookingId() {
		return _sampleLARBookingId;
	}

	@Override
	public void setSampleLARBookingId(long sampleLARBookingId) {
		_sampleLARBookingId = sampleLARBookingId;
	}

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

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

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

	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	@Override
	public String getBookingNumber() {
		if (_bookingNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _bookingNumber;
		}
	}

	@Override
	public void setBookingNumber(String bookingNumber) {
		_columnBitmask = -1L;

		_bookingNumber = bookingNumber;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(PortalUtil.getClassNameId(
				SampleLARBooking.class.getName()));
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			SampleLARBooking.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public SampleLARBooking toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (SampleLARBooking)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		SampleLARBookingImpl sampleLARBookingImpl = new SampleLARBookingImpl();

		sampleLARBookingImpl.setUuid(getUuid());
		sampleLARBookingImpl.setSampleLARBookingId(getSampleLARBookingId());
		sampleLARBookingImpl.setGroupId(getGroupId());
		sampleLARBookingImpl.setCompanyId(getCompanyId());
		sampleLARBookingImpl.setUserId(getUserId());
		sampleLARBookingImpl.setUserName(getUserName());
		sampleLARBookingImpl.setCreateDate(getCreateDate());
		sampleLARBookingImpl.setModifiedDate(getModifiedDate());
		sampleLARBookingImpl.setBookingNumber(getBookingNumber());

		sampleLARBookingImpl.resetOriginalValues();

		return sampleLARBookingImpl;
	}

	@Override
	public int compareTo(SampleLARBooking sampleLARBooking) {
		int value = 0;

		value = getBookingNumber().compareTo(sampleLARBooking.getBookingNumber());

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

		if (!(obj instanceof SampleLARBooking)) {
			return false;
		}

		SampleLARBooking sampleLARBooking = (SampleLARBooking)obj;

		long primaryKey = sampleLARBooking.getPrimaryKey();

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
		SampleLARBookingModelImpl sampleLARBookingModelImpl = this;

		sampleLARBookingModelImpl._originalUuid = sampleLARBookingModelImpl._uuid;

		sampleLARBookingModelImpl._originalGroupId = sampleLARBookingModelImpl._groupId;

		sampleLARBookingModelImpl._setOriginalGroupId = false;

		sampleLARBookingModelImpl._originalCompanyId = sampleLARBookingModelImpl._companyId;

		sampleLARBookingModelImpl._setOriginalCompanyId = false;

		sampleLARBookingModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<SampleLARBooking> toCacheModel() {
		SampleLARBookingCacheModel sampleLARBookingCacheModel = new SampleLARBookingCacheModel();

		sampleLARBookingCacheModel.uuid = getUuid();

		String uuid = sampleLARBookingCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			sampleLARBookingCacheModel.uuid = null;
		}

		sampleLARBookingCacheModel.sampleLARBookingId = getSampleLARBookingId();

		sampleLARBookingCacheModel.groupId = getGroupId();

		sampleLARBookingCacheModel.companyId = getCompanyId();

		sampleLARBookingCacheModel.userId = getUserId();

		sampleLARBookingCacheModel.userName = getUserName();

		String userName = sampleLARBookingCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			sampleLARBookingCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			sampleLARBookingCacheModel.createDate = createDate.getTime();
		}
		else {
			sampleLARBookingCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			sampleLARBookingCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			sampleLARBookingCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		sampleLARBookingCacheModel.bookingNumber = getBookingNumber();

		String bookingNumber = sampleLARBookingCacheModel.bookingNumber;

		if ((bookingNumber != null) && (bookingNumber.length() == 0)) {
			sampleLARBookingCacheModel.bookingNumber = null;
		}

		return sampleLARBookingCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(19);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", sampleLARBookingId=");
		sb.append(getSampleLARBookingId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", bookingNumber=");
		sb.append(getBookingNumber());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(31);

		sb.append("<model><model-name>");
		sb.append("com.liferay.samplelar.model.SampleLARBooking");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>sampleLARBookingId</column-name><column-value><![CDATA[");
		sb.append(getSampleLARBookingId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
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
			"<column><column-name>bookingNumber</column-name><column-value><![CDATA[");
		sb.append(getBookingNumber());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = SampleLARBooking.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			SampleLARBooking.class
		};
	private String _uuid;
	private String _originalUuid;
	private long _sampleLARBookingId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _bookingNumber;
	private long _columnBitmask;
	private SampleLARBooking _escapedModel;
}