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

package com.rivetlogic.angularjs.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import com.rivetlogic.angularjs.model.Users;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * The cache model class for representing Users in entity cache.
 *
 * @author charles.rodriguez
 * @see Users
 * @generated
 */
public class UsersCacheModel implements CacheModel<Users>, Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(17);

		sb.append("{userName=");
		sb.append(userName);
		sb.append(", email=");
		sb.append(email);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", company=");
		sb.append(company);
		sb.append(", position=");
		sb.append(position);
		sb.append(", password=");
		sb.append(password);
		sb.append(", age=");
		sb.append(age);
		sb.append(", state=");
		sb.append(state);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Users toEntityModel() {
		UsersImpl usersImpl = new UsersImpl();

		if (userName == null) {
			usersImpl.setUserName(StringPool.BLANK);
		}
		else {
			usersImpl.setUserName(userName);
		}

		if (email == null) {
			usersImpl.setEmail(StringPool.BLANK);
		}
		else {
			usersImpl.setEmail(email);
		}

		if (fullName == null) {
			usersImpl.setFullName(StringPool.BLANK);
		}
		else {
			usersImpl.setFullName(fullName);
		}

		if (company == null) {
			usersImpl.setCompany(StringPool.BLANK);
		}
		else {
			usersImpl.setCompany(company);
		}

		if (position == null) {
			usersImpl.setPosition(StringPool.BLANK);
		}
		else {
			usersImpl.setPosition(position);
		}

		if (password == null) {
			usersImpl.setPassword(StringPool.BLANK);
		}
		else {
			usersImpl.setPassword(password);
		}

		usersImpl.setAge(age);

		if (state == null) {
			usersImpl.setState(StringPool.BLANK);
		}
		else {
			usersImpl.setState(state);
		}

		usersImpl.resetOriginalValues();

		return usersImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		userName = objectInput.readUTF();
		email = objectInput.readUTF();
		fullName = objectInput.readUTF();
		company = objectInput.readUTF();
		position = objectInput.readUTF();
		password = objectInput.readUTF();
		age = objectInput.readInt();
		state = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		if (email == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(email);
		}

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (company == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(company);
		}

		if (position == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(position);
		}

		if (password == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(password);
		}

		objectOutput.writeInt(age);

		if (state == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(state);
		}
	}

	public String userName;
	public String email;
	public String fullName;
	public String company;
	public String position;
	public String password;
	public int age;
	public String state;
}