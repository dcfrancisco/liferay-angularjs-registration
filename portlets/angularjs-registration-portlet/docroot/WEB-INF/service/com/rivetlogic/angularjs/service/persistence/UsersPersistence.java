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

package com.rivetlogic.angularjs.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import com.rivetlogic.angularjs.model.Users;

/**
 * The persistence interface for the users service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author charles.rodriguez
 * @see UsersPersistenceImpl
 * @see UsersUtil
 * @generated
 */
public interface UsersPersistence extends BasePersistence<Users> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link UsersUtil} to access the users persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the users in the entity cache if it is enabled.
	*
	* @param users the users
	*/
	public void cacheResult(com.rivetlogic.angularjs.model.Users users);

	/**
	* Caches the userses in the entity cache if it is enabled.
	*
	* @param userses the userses
	*/
	public void cacheResult(
		java.util.List<com.rivetlogic.angularjs.model.Users> userses);

	/**
	* Creates a new users with the primary key. Does not add the users to the database.
	*
	* @param userName the primary key for the new users
	* @return the new users
	*/
	public com.rivetlogic.angularjs.model.Users create(
		java.lang.String userName);

	/**
	* Removes the users with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userName the primary key of the users
	* @return the users that was removed
	* @throws com.rivetlogic.angularjs.NoSuchUsersException if a users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.angularjs.model.Users remove(
		java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.angularjs.NoSuchUsersException;

	public com.rivetlogic.angularjs.model.Users updateImpl(
		com.rivetlogic.angularjs.model.Users users)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the users with the primary key or throws a {@link com.rivetlogic.angularjs.NoSuchUsersException} if it could not be found.
	*
	* @param userName the primary key of the users
	* @return the users
	* @throws com.rivetlogic.angularjs.NoSuchUsersException if a users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.angularjs.model.Users findByPrimaryKey(
		java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.angularjs.NoSuchUsersException;

	/**
	* Returns the users with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userName the primary key of the users
	* @return the users, or <code>null</code> if a users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public com.rivetlogic.angularjs.model.Users fetchByPrimaryKey(
		java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the userses.
	*
	* @return the userses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.angularjs.model.Users> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the userses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.angularjs.model.impl.UsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of userses
	* @param end the upper bound of the range of userses (not inclusive)
	* @return the range of userses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.angularjs.model.Users> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the userses.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.angularjs.model.impl.UsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of userses
	* @param end the upper bound of the range of userses (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of userses
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<com.rivetlogic.angularjs.model.Users> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the userses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of userses.
	*
	* @return the number of userses
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}