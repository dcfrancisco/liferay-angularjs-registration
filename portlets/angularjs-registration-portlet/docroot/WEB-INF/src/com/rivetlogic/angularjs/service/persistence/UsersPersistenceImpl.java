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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import com.rivetlogic.angularjs.NoSuchUsersException;
import com.rivetlogic.angularjs.model.Users;
import com.rivetlogic.angularjs.model.impl.UsersImpl;
import com.rivetlogic.angularjs.model.impl.UsersModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * The persistence implementation for the users service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author charles.rodriguez
 * @see UsersPersistence
 * @see UsersUtil
 * @generated
 */
public class UsersPersistenceImpl extends BasePersistenceImpl<Users>
	implements UsersPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link UsersUtil} to access the users persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = UsersImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(UsersModelImpl.ENTITY_CACHE_ENABLED,
			UsersModelImpl.FINDER_CACHE_ENABLED, UsersImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(UsersModelImpl.ENTITY_CACHE_ENABLED,
			UsersModelImpl.FINDER_CACHE_ENABLED, UsersImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(UsersModelImpl.ENTITY_CACHE_ENABLED,
			UsersModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);

	public UsersPersistenceImpl() {
		setModelClass(Users.class);
	}

	/**
	 * Caches the users in the entity cache if it is enabled.
	 *
	 * @param users the users
	 */
	@Override
	public void cacheResult(Users users) {
		EntityCacheUtil.putResult(UsersModelImpl.ENTITY_CACHE_ENABLED,
			UsersImpl.class, users.getPrimaryKey(), users);

		users.resetOriginalValues();
	}

	/**
	 * Caches the userses in the entity cache if it is enabled.
	 *
	 * @param userses the userses
	 */
	@Override
	public void cacheResult(List<Users> userses) {
		for (Users users : userses) {
			if (EntityCacheUtil.getResult(UsersModelImpl.ENTITY_CACHE_ENABLED,
						UsersImpl.class, users.getPrimaryKey()) == null) {
				cacheResult(users);
			}
			else {
				users.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all userses.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(UsersImpl.class.getName());
		}

		EntityCacheUtil.clearCache(UsersImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the users.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Users users) {
		EntityCacheUtil.removeResult(UsersModelImpl.ENTITY_CACHE_ENABLED,
			UsersImpl.class, users.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	@Override
	public void clearCache(List<Users> userses) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Users users : userses) {
			EntityCacheUtil.removeResult(UsersModelImpl.ENTITY_CACHE_ENABLED,
				UsersImpl.class, users.getPrimaryKey());
		}
	}

	/**
	 * Creates a new users with the primary key. Does not add the users to the database.
	 *
	 * @param userName the primary key for the new users
	 * @return the new users
	 */
	@Override
	public Users create(String userName) {
		Users users = new UsersImpl();

		users.setNew(true);
		users.setPrimaryKey(userName);

		return users;
	}

	/**
	 * Removes the users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param userName the primary key of the users
	 * @return the users that was removed
	 * @throws com.rivetlogic.angularjs.NoSuchUsersException if a users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Users remove(String userName)
		throws NoSuchUsersException, SystemException {
		return remove((Serializable)userName);
	}

	/**
	 * Removes the users with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the users
	 * @return the users that was removed
	 * @throws com.rivetlogic.angularjs.NoSuchUsersException if a users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Users remove(Serializable primaryKey)
		throws NoSuchUsersException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Users users = (Users)session.get(UsersImpl.class, primaryKey);

			if (users == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchUsersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(users);
		}
		catch (NoSuchUsersException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Users removeImpl(Users users) throws SystemException {
		users = toUnwrappedModel(users);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(users)) {
				users = (Users)session.get(UsersImpl.class,
						users.getPrimaryKeyObj());
			}

			if (users != null) {
				session.delete(users);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (users != null) {
			clearCache(users);
		}

		return users;
	}

	@Override
	public Users updateImpl(com.rivetlogic.angularjs.model.Users users)
		throws SystemException {
		users = toUnwrappedModel(users);

		boolean isNew = users.isNew();

		Session session = null;

		try {
			session = openSession();

			if (users.isNew()) {
				session.save(users);

				users.setNew(false);
			}
			else {
				session.merge(users);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		EntityCacheUtil.putResult(UsersModelImpl.ENTITY_CACHE_ENABLED,
			UsersImpl.class, users.getPrimaryKey(), users);

		return users;
	}

	protected Users toUnwrappedModel(Users users) {
		if (users instanceof UsersImpl) {
			return users;
		}

		UsersImpl usersImpl = new UsersImpl();

		usersImpl.setNew(users.isNew());
		usersImpl.setPrimaryKey(users.getPrimaryKey());

		usersImpl.setUserName(users.getUserName());
		usersImpl.setEmail(users.getEmail());
		usersImpl.setFullName(users.getFullName());
		usersImpl.setCompany(users.getCompany());
		usersImpl.setPosition(users.getPosition());
		usersImpl.setPassword(users.getPassword());
		usersImpl.setAge(users.getAge());
		usersImpl.setState(users.getState());

		return usersImpl;
	}

	/**
	 * Returns the users with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the users
	 * @return the users
	 * @throws com.rivetlogic.angularjs.NoSuchUsersException if a users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Users findByPrimaryKey(Serializable primaryKey)
		throws NoSuchUsersException, SystemException {
		Users users = fetchByPrimaryKey(primaryKey);

		if (users == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchUsersException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return users;
	}

	/**
	 * Returns the users with the primary key or throws a {@link com.rivetlogic.angularjs.NoSuchUsersException} if it could not be found.
	 *
	 * @param userName the primary key of the users
	 * @return the users
	 * @throws com.rivetlogic.angularjs.NoSuchUsersException if a users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Users findByPrimaryKey(String userName)
		throws NoSuchUsersException, SystemException {
		return findByPrimaryKey((Serializable)userName);
	}

	/**
	 * Returns the users with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the users
	 * @return the users, or <code>null</code> if a users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Users fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Users users = (Users)EntityCacheUtil.getResult(UsersModelImpl.ENTITY_CACHE_ENABLED,
				UsersImpl.class, primaryKey);

		if (users == _nullUsers) {
			return null;
		}

		if (users == null) {
			Session session = null;

			try {
				session = openSession();

				users = (Users)session.get(UsersImpl.class, primaryKey);

				if (users != null) {
					cacheResult(users);
				}
				else {
					EntityCacheUtil.putResult(UsersModelImpl.ENTITY_CACHE_ENABLED,
						UsersImpl.class, primaryKey, _nullUsers);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(UsersModelImpl.ENTITY_CACHE_ENABLED,
					UsersImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return users;
	}

	/**
	 * Returns the users with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param userName the primary key of the users
	 * @return the users, or <code>null</code> if a users with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Users fetchByPrimaryKey(String userName) throws SystemException {
		return fetchByPrimaryKey((Serializable)userName);
	}

	/**
	 * Returns all the userses.
	 *
	 * @return the userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Users> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
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
	public List<Users> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
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
	@Override
	public List<Users> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Users> list = (List<Users>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_USERS);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_USERS;

				if (pagination) {
					sql = sql.concat(UsersModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Users>)QueryUtil.list(q, getDialect(), start,
							end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Users>(list);
				}
				else {
					list = (List<Users>)QueryUtil.list(q, getDialect(), start,
							end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the userses from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Users users : findAll()) {
			remove(users);
		}
	}

	/**
	 * Returns the number of userses.
	 *
	 * @return the number of userses
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_USERS);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	protected Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	/**
	 * Initializes the users persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.com.rivetlogic.angularjs.model.Users")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Users>> listenersList = new ArrayList<ModelListener<Users>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Users>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(UsersImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_USERS = "SELECT users FROM Users users";
	private static final String _SQL_COUNT_USERS = "SELECT COUNT(users) FROM Users users";
	private static final String _ORDER_BY_ENTITY_ALIAS = "users.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Users exists with the primary key ";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(UsersPersistenceImpl.class);
	private static Set<String> _badColumnNames = SetUtil.fromArray(new String[] {
				"password", "state"
			});
	private static Users _nullUsers = new UsersImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Users> toCacheModel() {
				return _nullUsersCacheModel;
			}
		};

	private static CacheModel<Users> _nullUsersCacheModel = new CacheModel<Users>() {
			@Override
			public Users toEntityModel() {
				return _nullUsers;
			}
		};
}