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

package com.rivetlogic.angularjs.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link UsersLocalService}.
 *
 * @author charles.rodriguez
 * @see UsersLocalService
 * @generated
 */
public class UsersLocalServiceWrapper implements UsersLocalService,
	ServiceWrapper<UsersLocalService> {
	public UsersLocalServiceWrapper(UsersLocalService usersLocalService) {
		_usersLocalService = usersLocalService;
	}

	/**
	* Adds the users to the database. Also notifies the appropriate model listeners.
	*
	* @param users the users
	* @return the users that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.angularjs.model.Users addUsers(
		com.rivetlogic.angularjs.model.Users users)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.addUsers(users);
	}

	/**
	* Creates a new users with the primary key. Does not add the users to the database.
	*
	* @param userName the primary key for the new users
	* @return the new users
	*/
	@Override
	public com.rivetlogic.angularjs.model.Users createUsers(
		java.lang.String userName) {
		return _usersLocalService.createUsers(userName);
	}

	/**
	* Deletes the users with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userName the primary key of the users
	* @return the users that was removed
	* @throws PortalException if a users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.angularjs.model.Users deleteUsers(
		java.lang.String userName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.deleteUsers(userName);
	}

	/**
	* Deletes the users from the database. Also notifies the appropriate model listeners.
	*
	* @param users the users
	* @return the users that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.angularjs.model.Users deleteUsers(
		com.rivetlogic.angularjs.model.Users users)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.deleteUsers(users);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _usersLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.angularjs.model.impl.UsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.rivetlogic.angularjs.model.impl.UsersModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.dynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public com.rivetlogic.angularjs.model.Users fetchUsers(
		java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.fetchUsers(userName);
	}

	/**
	* Returns the users with the primary key.
	*
	* @param userName the primary key of the users
	* @return the users
	* @throws PortalException if a users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.angularjs.model.Users getUsers(
		java.lang.String userName)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.getUsers(userName);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.getPersistedModel(primaryKeyObj);
	}

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
	@Override
	public java.util.List<com.rivetlogic.angularjs.model.Users> getUserses(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.getUserses(start, end);
	}

	/**
	* Returns the number of userses.
	*
	* @return the number of userses
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getUsersesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.getUsersesCount();
	}

	/**
	* Updates the users in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param users the users
	* @return the users that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public com.rivetlogic.angularjs.model.Users updateUsers(
		com.rivetlogic.angularjs.model.Users users)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.updateUsers(users);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _usersLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_usersLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _usersLocalService.invokeMethod(name, parameterTypes, arguments);
	}

	@Override
	public com.rivetlogic.angularjs.model.Users addUser(
		com.rivetlogic.angularjs.model.Users newUser) {
		return _usersLocalService.addUser(newUser);
	}

	@Override
	public boolean userExist(java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _usersLocalService.userExist(userName);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public UsersLocalService getWrappedUsersLocalService() {
		return _usersLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedUsersLocalService(UsersLocalService usersLocalService) {
		_usersLocalService = usersLocalService;
	}

	@Override
	public UsersLocalService getWrappedService() {
		return _usersLocalService;
	}

	@Override
	public void setWrappedService(UsersLocalService usersLocalService) {
		_usersLocalService = usersLocalService;
	}

	private UsersLocalService _usersLocalService;
}