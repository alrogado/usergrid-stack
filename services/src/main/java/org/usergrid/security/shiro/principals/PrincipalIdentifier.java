/*******************************************************************************
 * Copyright 2012 Apigee Corporation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.usergrid.security.shiro.principals;

import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.usergrid.management.UserInfo;
import org.usergrid.security.shiro.auth.UsergridAuthorizationInfo;
import org.usergrid.security.shiro.credentials.AccessTokenCredentials;

public abstract class PrincipalIdentifier {

	AccessTokenCredentials accessTokenCredentials;

	public UserInfo getUser() {
		return null;
	}

	public boolean isDisabled() {
		return false;
	}

	public boolean isActivated() {
		return true;
	}

	public AccessTokenCredentials getAccessTokenCredentials() {
		return accessTokenCredentials;
	}

	public void setAccessTokenCredentials(
			AccessTokenCredentials accessTokenCredentials) {
		this.accessTokenCredentials = accessTokenCredentials;
	}

  /**
   * Generate the authorization info for this principal
   *
   * @param info The information object that should be populated
   * @return
   */
  public abstract void populateAuthorizatioInfo(UsergridAuthorizationInfo info);

}
