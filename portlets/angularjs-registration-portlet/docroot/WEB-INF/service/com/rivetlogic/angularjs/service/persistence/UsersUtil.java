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

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.ReferenceRegistry;
import com.liferay.portal.service.ServiceContext;

import com.rivetlogic.angularjs.model.Users;

import java.util.List;

/**
 * The persistence utility for the users service. This utility wraps {@link UsersPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author charles.rodriguez
 * @see UsersPersistence
 * @see UsersPersistenceImpl
 * @generated
 */
public class UsersUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(Users users) {
		getPersistence().clearCache(users);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Users> findWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Users> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Users> findWithDynamicQuery(DynamicQuery dynamicQuery,
		int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel)
	 */
	public static Users update(Users users) throws SystemException {
		return getPersistence().update(users);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, ServiceContext)
	 */
	public static Users update(Users users, ServiceContext serviceContext)
		throws SystemException {
		return getPersistence().update(users, serviceContext);
	}

	/**
	* Caches the users in the entity cache if it is enabled.
	*
	* @param users the users
	*/
	public static void cacheResult(com.rivetlogic.angularjs.model.Users users) {
		getPersistence().cacheResult(users);
	}

	/**
	* Caches the userses in the entity cache if it is enabled.
	*
	* @param userses the userses
	*/
	public static void cacheResult(
		java.util.List<com.rivetlogic.angularjs.model.Users> userses) {
		getPersistence().cacheResult(userses);
	}

	/**
	* Creates a new users with the primary key. Does not add the users to the database.
	*
	* @param userName the primary key for the new users
	* @return the new users
	*/
	public static com.rivetlogic.angularjs.model.Users create(
		java.lang.String userName) {
		return getPersistence().create(userName);
	}

	/**
	* Removes the users with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param userName the primary key of the users
	* @return the users that was removed
	* @throws com.rivetlogic.angularjs.NoSuchUsersException if a users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.angularjs.model.Users remove(
		java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.angularjs.NoSuchUsersException {
		return getPersistence().remove(userName);
	}

	public static com.rivetlogic.angularjs.model.Users updateImpl(
		com.rivetlogic.angularjs.model.Users users)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(users);
	}

	/**
	* Returns the users with the primary key or throws a {@link com.rivetlogic.angularjs.NoSuchUsersException} if it could not be found.
	*
	* @param userName the primary key of the users
	* @return the users
	* @throws com.rivetlogic.angularjs.NoSuchUsersException if a users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.angularjs.model.Users findByPrimaryKey(
		java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.rivetlogic.angularjs.NoSuchUsersException {
		return getPersistence().findByPrimaryKey(userName);
	}

	/**
	* Returns the users with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param userName the primary key of the users
	* @return the users, or <code>null</code> if a users with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.rivetlogic.angularjs.model.Users fetchByPrimaryKey(
		java.lang.String userName)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(userName);
	}

	/**
	* Returns all the userses.
	*
	* @return the userses
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.rivetlogic.angularjs.model.Users> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
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
	public static java.util.List<com.rivetlogic.angularjs.model.Users> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

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
	public static java.util.List<com.rivetlogic.angularjs.model.Users> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the userses from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Returns the number of userses.
	*
	* @return the number of userses
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	public static UsersPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (UsersPersistence)PortletBeanLocatorUtil.locate(com.rivetlogic.angularjs.service.ClpSerializer.getServletContextName(),
					UsersPersistence.class.getName());

			ReferenceRegistry.registerReference(UsersUtil.class, "_persistence");
		}

		return _persistence;
	}

	/**
	 * @deprecated As of 6.2.0
	 */
	public void setPersistence(UsersPersistence persistence) {
	}

	private static UsersPersistence _persistence;
}