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

package com.rivetlogic.angularjs.service.impl;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.rivetlogic.angularjs.model.Users;
import com.rivetlogic.angularjs.service.base.UsersLocalServiceBaseImpl;

/**
 * The implementation of the users local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the {@link com.rivetlogic.angularjs.service.UsersLocalService} interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author charles.rodriguez
 * @see com.rivetlogic.angularjs.service.base.UsersLocalServiceBaseImpl
 * @see com.rivetlogic.angularjs.service.UsersLocalServiceUtil
 */
public class UsersLocalServiceImpl extends UsersLocalServiceBaseImpl {
    /*
     * NOTE FOR DEVELOPERS:
     *
     * Never reference this interface directly. Always use {@link com.rivetlogic.angularjs.service.UsersLocalServiceUtil} to access the users local service.
     */
    private static final Log LOG = 
            LogFactoryUtil.getLog(UsersLocalServiceImpl.class);
    
    public Users addUser(Users newUser) {
        Users user =
                usersPersistence.create(newUser.getUserName());
        user.setEmail(newUser.getEmail());
        user.setFullName(newUser.getFullName());
        user.setCompany(newUser.getCompany());
        user.setPosition(newUser.getPosition());
        user.setPassword(newUser.getPassword());
        user.setAge(newUser.getAge());
        user.setState(newUser.getState());
        
        try {
            usersPersistence.update(user);
        } catch (SystemException e) {
            LOG.error(e);
        }

        return user;
    }
    
    public boolean userExist(String userName) throws SystemException {
        if(usersPersistence.fetchByPrimaryKey(userName) != null){
            return true;
        }
        return false;
    }
}