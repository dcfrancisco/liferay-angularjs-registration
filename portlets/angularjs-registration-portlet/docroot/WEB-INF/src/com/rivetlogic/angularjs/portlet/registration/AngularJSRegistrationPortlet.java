package com.rivetlogic.angularjs.portlet.registration;

import java.io.IOException;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;
import javax.portlet.ResourceRequest;
import javax.portlet.ResourceResponse;

import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSONException;
import com.liferay.portal.kernel.json.JSONFactoryUtil;
import com.liferay.portal.kernel.json.JSONObject;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.util.bridges.mvc.MVCPortlet;
import com.rivetlogic.angularjs.model.impl.UsersImpl;
import com.rivetlogic.angularjs.service.UsersLocalServiceUtil;

/**
 * Portlet implementation class AngularJSRegistrationPortlet
 */
public class AngularJSRegistrationPortlet extends MVCPortlet {
    private static final Log LOG = 
            LogFactoryUtil.getLog(AngularJSRegistrationPortlet.class);
    
    /* (non-Javadoc)
     * @see com.liferay.util.bridges.mvc.MVCPortlet#doView(javax.portlet.RenderRequest, javax.portlet.RenderResponse)
     */
    @Override
    public void doView(RenderRequest request, RenderResponse response)
            throws IOException, PortletException {
        super.doView(request, response);
    }
    
    /* (non-Javadoc)
     * @see com.liferay.util.bridges.mvc.MVCPortlet#serveResource(javax.portlet.ResourceRequest, javax.portlet.ResourceResponse)
     */
    @Override
    public void serveResource(ResourceRequest request, ResourceResponse response)
            throws IOException, PortletException {
        
        System.out.println(ParamUtil.getString(request, AngularJSConstants.USER_DATA));
        
        String cmd = ParamUtil.getString(request, AngularJSConstants.CMD);
        if(cmd.equals(AngularJSConstants.CMD_ADD_USER)){
            JSONObject jsonObject;
            try {
                jsonObject = 
                        JSONFactoryUtil.createJSONObject(
                                ParamUtil.getString(request, AngularJSConstants.USER_DATA));
                
                UsersImpl newUser = new UsersImpl();
                newUser.setUserName(jsonObject.getString(AngularJSConstants.USER_NAME));
                newUser.setFullName(jsonObject.getString(AngularJSConstants.USER_FULL_NAME));
                newUser.setCompany(jsonObject.getString(AngularJSConstants.USER_COMPANY));
                newUser.setPosition(jsonObject.getString(AngularJSConstants.USER_POSITION));
                newUser.setEmail(jsonObject.getString(AngularJSConstants.USER_EMAIL));
                newUser.setPassword(jsonObject.getString(AngularJSConstants.USER_PASS));
                newUser.setAge(jsonObject.getInt(AngularJSConstants.USER_AGE));
                newUser.setState(jsonObject.getString(AngularJSConstants.USER_STATE));
                            
                try {
                    if(!UsersLocalServiceUtil.userExist(newUser.getUserName())){
                        UsersLocalServiceUtil.addUser(newUser);
                    }
                    else{
                        System.out.println("Username already on use");
                    }
                } catch (SystemException e) {
                    LOG.error(e);
                }
            } catch (JSONException e) {
                LOG.error(e);
            }
        }
        
        super.serveResource(request, response);
    }
}
