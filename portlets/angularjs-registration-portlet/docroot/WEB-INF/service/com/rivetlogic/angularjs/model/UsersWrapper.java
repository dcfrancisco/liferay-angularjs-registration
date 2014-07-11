/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.rivetlogic.angularjs.model;

import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.ModelWrapper;

import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Users}.
 * </p>
 *
 * @author charles.rodriguez
 * @see Users
 * @generated
 */
public class UsersWrapper implements Users, ModelWrapper<Users> {
	public UsersWrapper(Users users) {
		_users = users;
	}

	@Override
	public Class<?> getModelClass() {
		return Users.class;
	}

	@Override
	public String getModelClassName() {
		return Users.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("userName", getUserName());
		attributes.put("email", getEmail());
		attributes.put("fullName", getFullName());
		attributes.put("company", getCompany());
		attributes.put("position", getPosition());
		attributes.put("password", getPassword());
		attributes.put("age", getAge());
		attributes.put("state", getState());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		String email = (String)attributes.get("email");

		if (email != null) {
			setEmail(email);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String company = (String)attributes.get("company");

		if (company != null) {
			setCompany(company);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		String password = (String)attributes.get("password");

		if (password != null) {
			setPassword(password);
		}

		Integer age = (Integer)attributes.get("age");

		if (age != null) {
			setAge(age);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}
	}

	/**
	* Returns the primary key of this users.
	*
	* @return the primary key of this users
	*/
	@Override
	public java.lang.String getPrimaryKey() {
		return _users.getPrimaryKey();
	}

	/**
	* Sets the primary key of this users.
	*
	* @param primaryKey the primary key of this users
	*/
	@Override
	public void setPrimaryKey(java.lang.String primaryKey) {
		_users.setPrimaryKey(primaryKey);
	}

	/**
	* Returns the user name of this users.
	*
	* @return the user name of this users
	*/
	@Override
	public java.lang.String getUserName() {
		return _users.getUserName();
	}

	/**
	* Sets the user name of this users.
	*
	* @param userName the user name of this users
	*/
	@Override
	public void setUserName(java.lang.String userName) {
		_users.setUserName(userName);
	}

	/**
	* Returns the email of this users.
	*
	* @return the email of this users
	*/
	@Override
	public java.lang.String getEmail() {
		return _users.getEmail();
	}

	/**
	* Sets the email of this users.
	*
	* @param email the email of this users
	*/
	@Override
	public void setEmail(java.lang.String email) {
		_users.setEmail(email);
	}

	/**
	* Returns the full name of this users.
	*
	* @return the full name of this users
	*/
	@Override
	public java.lang.String getFullName() {
		return _users.getFullName();
	}

	/**
	* Sets the full name of this users.
	*
	* @param fullName the full name of this users
	*/
	@Override
	public void setFullName(java.lang.String fullName) {
		_users.setFullName(fullName);
	}

	/**
	* Returns the company of this users.
	*
	* @return the company of this users
	*/
	@Override
	public java.lang.String getCompany() {
		return _users.getCompany();
	}

	/**
	* Sets the company of this users.
	*
	* @param company the company of this users
	*/
	@Override
	public void setCompany(java.lang.String company) {
		_users.setCompany(company);
	}

	/**
	* Returns the position of this users.
	*
	* @return the position of this users
	*/
	@Override
	public java.lang.String getPosition() {
		return _users.getPosition();
	}

	/**
	* Sets the position of this users.
	*
	* @param position the position of this users
	*/
	@Override
	public void setPosition(java.lang.String position) {
		_users.setPosition(position);
	}

	/**
	* Returns the password of this users.
	*
	* @return the password of this users
	*/
	@Override
	public java.lang.String getPassword() {
		return _users.getPassword();
	}

	/**
	* Sets the password of this users.
	*
	* @param password the password of this users
	*/
	@Override
	public void setPassword(java.lang.String password) {
		_users.setPassword(password);
	}

	/**
	* Returns the age of this users.
	*
	* @return the age of this users
	*/
	@Override
	public int getAge() {
		return _users.getAge();
	}

	/**
	* Sets the age of this users.
	*
	* @param age the age of this users
	*/
	@Override
	public void setAge(int age) {
		_users.setAge(age);
	}

	/**
	* Returns the state of this users.
	*
	* @return the state of this users
	*/
	@Override
	public java.lang.String getState() {
		return _users.getState();
	}

	/**
	* Sets the state of this users.
	*
	* @param state the state of this users
	*/
	@Override
	public void setState(java.lang.String state) {
		_users.setState(state);
	}

	@Override
	public boolean isNew() {
		return _users.isNew();
	}

	@Override
	public void setNew(boolean n) {
		_users.setNew(n);
	}

	@Override
	public boolean isCachedModel() {
		return _users.isCachedModel();
	}

	@Override
	public void setCachedModel(boolean cachedModel) {
		_users.setCachedModel(cachedModel);
	}

	@Override
	public boolean isEscapedModel() {
		return _users.isEscapedModel();
	}

	@Override
	public java.io.Serializable getPrimaryKeyObj() {
		return _users.getPrimaryKeyObj();
	}

	@Override
	public void setPrimaryKeyObj(java.io.Serializable primaryKeyObj) {
		_users.setPrimaryKeyObj(primaryKeyObj);
	}

	@Override
	public com.liferay.portlet.expando.model.ExpandoBridge getExpandoBridge() {
		return _users.getExpandoBridge();
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.model.BaseModel<?> baseModel) {
		_users.setExpandoBridgeAttributes(baseModel);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portlet.expando.model.ExpandoBridge expandoBridge) {
		_users.setExpandoBridgeAttributes(expandoBridge);
	}

	@Override
	public void setExpandoBridgeAttributes(
		com.liferay.portal.service.ServiceContext serviceContext) {
		_users.setExpandoBridgeAttributes(serviceContext);
	}

	@Override
	public java.lang.Object clone() {
		return new UsersWrapper((Users)_users.clone());
	}

	@Override
	public int compareTo(com.rivetlogic.angularjs.model.Users users) {
		return _users.compareTo(users);
	}

	@Override
	public int hashCode() {
		return _users.hashCode();
	}

	@Override
	public com.liferay.portal.model.CacheModel<com.rivetlogic.angularjs.model.Users> toCacheModel() {
		return _users.toCacheModel();
	}

	@Override
	public com.rivetlogic.angularjs.model.Users toEscapedModel() {
		return new UsersWrapper(_users.toEscapedModel());
	}

	@Override
	public com.rivetlogic.angularjs.model.Users toUnescapedModel() {
		return new UsersWrapper(_users.toUnescapedModel());
	}

	@Override
	public java.lang.String toString() {
		return _users.toString();
	}

	@Override
	public java.lang.String toXmlString() {
		return _users.toXmlString();
	}

	@Override
	public void persist()
		throws com.liferay.portal.kernel.exception.SystemException {
		_users.persist();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UsersWrapper)) {
			return false;
		}

		UsersWrapper usersWrapper = (UsersWrapper)obj;

		if (Validator.equals(_users, usersWrapper._users)) {
			return true;
		}

		return false;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedModel}
	 */
	public Users getWrappedUsers() {
		return _users;
	}

	@Override
	public Users getWrappedModel() {
		return _users;
	}

	@Override
	public void resetOriginalValues() {
		_users.resetOriginalValues();
	}

	private Users _users;
}