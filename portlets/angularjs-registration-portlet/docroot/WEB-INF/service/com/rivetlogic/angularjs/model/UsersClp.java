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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;

import com.rivetlogic.angularjs.service.ClpSerializer;
import com.rivetlogic.angularjs.service.UsersLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.HashMap;
import java.util.Map;

/**
 * @author charles.rodriguez
 */
public class UsersClp extends BaseModelImpl<Users> implements Users {
	public UsersClp() {
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
	public String getPrimaryKey() {
		return _userName;
	}

	@Override
	public void setPrimaryKey(String primaryKey) {
		setUserName(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _userName;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey((String)primaryKeyObj);
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

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_usersRemoteModel != null) {
			try {
				Class<?> clazz = _usersRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_usersRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmail() {
		return _email;
	}

	@Override
	public void setEmail(String email) {
		_email = email;

		if (_usersRemoteModel != null) {
			try {
				Class<?> clazz = _usersRemoteModel.getClass();

				Method method = clazz.getMethod("setEmail", String.class);

				method.invoke(_usersRemoteModel, email);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFullName() {
		return _fullName;
	}

	@Override
	public void setFullName(String fullName) {
		_fullName = fullName;

		if (_usersRemoteModel != null) {
			try {
				Class<?> clazz = _usersRemoteModel.getClass();

				Method method = clazz.getMethod("setFullName", String.class);

				method.invoke(_usersRemoteModel, fullName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCompany() {
		return _company;
	}

	@Override
	public void setCompany(String company) {
		_company = company;

		if (_usersRemoteModel != null) {
			try {
				Class<?> clazz = _usersRemoteModel.getClass();

				Method method = clazz.getMethod("setCompany", String.class);

				method.invoke(_usersRemoteModel, company);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPosition() {
		return _position;
	}

	@Override
	public void setPosition(String position) {
		_position = position;

		if (_usersRemoteModel != null) {
			try {
				Class<?> clazz = _usersRemoteModel.getClass();

				Method method = clazz.getMethod("setPosition", String.class);

				method.invoke(_usersRemoteModel, position);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPassword() {
		return _password;
	}

	@Override
	public void setPassword(String password) {
		_password = password;

		if (_usersRemoteModel != null) {
			try {
				Class<?> clazz = _usersRemoteModel.getClass();

				Method method = clazz.getMethod("setPassword", String.class);

				method.invoke(_usersRemoteModel, password);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getAge() {
		return _age;
	}

	@Override
	public void setAge(int age) {
		_age = age;

		if (_usersRemoteModel != null) {
			try {
				Class<?> clazz = _usersRemoteModel.getClass();

				Method method = clazz.getMethod("setAge", int.class);

				method.invoke(_usersRemoteModel, age);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getState() {
		return _state;
	}

	@Override
	public void setState(String state) {
		_state = state;

		if (_usersRemoteModel != null) {
			try {
				Class<?> clazz = _usersRemoteModel.getClass();

				Method method = clazz.getMethod("setState", String.class);

				method.invoke(_usersRemoteModel, state);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getUsersRemoteModel() {
		return _usersRemoteModel;
	}

	public void setUsersRemoteModel(BaseModel<?> usersRemoteModel) {
		_usersRemoteModel = usersRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _usersRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_usersRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			UsersLocalServiceUtil.addUsers(this);
		}
		else {
			UsersLocalServiceUtil.updateUsers(this);
		}
	}

	@Override
	public Users toEscapedModel() {
		return (Users)ProxyUtil.newProxyInstance(Users.class.getClassLoader(),
			new Class[] { Users.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		UsersClp clone = new UsersClp();

		clone.setUserName(getUserName());
		clone.setEmail(getEmail());
		clone.setFullName(getFullName());
		clone.setCompany(getCompany());
		clone.setPosition(getPosition());
		clone.setPassword(getPassword());
		clone.setAge(getAge());
		clone.setState(getState());

		return clone;
	}

	@Override
	public int compareTo(Users users) {
		String primaryKey = users.getPrimaryKey();

		return getPrimaryKey().compareTo(primaryKey);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof UsersClp)) {
			return false;
		}

		UsersClp users = (UsersClp)obj;

		String primaryKey = users.getPrimaryKey();

		if (getPrimaryKey().equals(primaryKey)) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{userName=");
		sb.append(getUserName());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", company=");
		sb.append(getCompany());
		sb.append(", position=");
		sb.append(getPosition());
		sb.append(", password=");
		sb.append(getPassword());
		sb.append(", age=");
		sb.append(getAge());
		sb.append(", state=");
		sb.append(getState());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(28);

		sb.append("<model><model-name>");
		sb.append("com.rivetlogic.angularjs.model.Users");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>company</column-name><column-value><![CDATA[");
		sb.append(getCompany());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>position</column-name><column-value><![CDATA[");
		sb.append(getPosition());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>password</column-name><column-value><![CDATA[");
		sb.append(getPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>age</column-name><column-value><![CDATA[");
		sb.append(getAge());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private String _userName;
	private String _email;
	private String _fullName;
	private String _company;
	private String _position;
	private String _password;
	private int _age;
	private String _state;
	private BaseModel<?> _usersRemoteModel;
}