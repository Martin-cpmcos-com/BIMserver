/**
 * Copyright (C) 2009-2014 BIMserver.org
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.bimserver.models.store.impl;

import org.bimserver.models.store.QueryEnginePluginConfiguration;
import org.bimserver.models.store.StorePackage;
import org.bimserver.models.store.UserSettings;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Query Engine Plugin Configuration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.store.impl.QueryEnginePluginConfigurationImpl#getUserSettings <em>User Settings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class QueryEnginePluginConfigurationImpl extends PluginConfigurationImpl implements QueryEnginePluginConfiguration {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryEnginePluginConfigurationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return StorePackage.Literals.QUERY_ENGINE_PLUGIN_CONFIGURATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserSettings getUserSettings() {
		return (UserSettings) eGet(StorePackage.Literals.QUERY_ENGINE_PLUGIN_CONFIGURATION__USER_SETTINGS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserSettings(UserSettings newUserSettings) {
		eSet(StorePackage.Literals.QUERY_ENGINE_PLUGIN_CONFIGURATION__USER_SETTINGS, newUserSettings);
	}

} //QueryEnginePluginConfigurationImpl
