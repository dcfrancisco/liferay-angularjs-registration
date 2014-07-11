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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.List;

/**
 * This class is used by SOAP remote services.
 *
 * @author charles.rodriguez
 * @generated
 */
public class UsersSoap implements Serializable {
	public static UsersSoap toSoapModel(Users model) {
		UsersSoap soapModel = new UsersSoap();

		soapModel.setUserName(model.getUserName());
		soapModel.setEmail(model.getEmail());
		soapModel.setFullName(model.getFullName());
		soapModel.setCompany(model.getCompany());
		soapModel.setPosition(model.getPosition());
		soapModel.setPassword(model.getPassword());
		soapModel.setAge(model.getAge());
		soapModel.setState(model.getState());

		return soapModel;
	}

	public static UsersSoap[] toSoapModels(Users[] models) {
		UsersSoap[] soapModels = new UsersSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static UsersSoap[][] toSoapModels(Users[][] models) {
		UsersSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new UsersSoap[models.length][models[0].length];
		}
		else {
			soapModels = new UsersSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static UsersSoap[] toSoapModels(List<Users> models) {
		List<UsersSoap> soapModels = new ArrayList<UsersSoap>(models.size());

		for (Users model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new UsersSoap[soapModels.size()]);
	}

	public UsersSoap() {
	}

	public String getPrimaryKey() {
		return _userName;
	}

	public void setPrimaryKey(String pk) {
		setUserName(pk);
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public String getEmail() {
		return _email;
	}

	public void setEmail(String email) {
		_email = email;
	}

	public String getFullName() {
		return _fullName;
	}

	public void setFullName(String fullName) {
		_fullName = fullName;
	}

	public String getCompany() {
		return _company;
	}

	public void setCompany(String company) {
		_company = company;
	}

	public String getPosition() {
		return _position;
	}

	public void setPosition(String position) {
		_position = position;
	}

	public String getPassword() {
		return _password;
	}

	public void setPassword(String password) {
		_password = password;
	}

	public int getAge() {
		return _age;
	}

	public void setAge(int age) {
		_age = age;
	}

	public String getState() {
		return _state;
	}

	public void setState(String state) {
		_state = state;
	}

	private String _userName;
	private String _email;
	private String _fullName;
	private String _company;
	private String _position;
	private String _password;
	private int _age;
	private String _state;
}