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
package org.bimserver.models.ifc2x3tc1.impl;

import org.bimserver.models.ifc2x3tc1.Ifc2x3tc1Package;
import org.bimserver.models.ifc2x3tc1.IfcLibraryInformation;
import org.bimserver.models.ifc2x3tc1.IfcLibraryReference;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ifc Library Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.bimserver.models.ifc2x3tc1.impl.IfcLibraryReferenceImpl#getReferenceIntoLibrary <em>Reference Into Library</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IfcLibraryReferenceImpl extends IfcExternalReferenceImpl implements IfcLibraryReference {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IfcLibraryReferenceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Ifc2x3tc1Package.Literals.IFC_LIBRARY_REFERENCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<IfcLibraryInformation> getReferenceIntoLibrary() {
		return (EList<IfcLibraryInformation>) eGet(Ifc2x3tc1Package.Literals.IFC_LIBRARY_REFERENCE__REFERENCE_INTO_LIBRARY, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void unsetReferenceIntoLibrary() {
		eUnset(Ifc2x3tc1Package.Literals.IFC_LIBRARY_REFERENCE__REFERENCE_INTO_LIBRARY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSetReferenceIntoLibrary() {
		return eIsSet(Ifc2x3tc1Package.Literals.IFC_LIBRARY_REFERENCE__REFERENCE_INTO_LIBRARY);
	}

} //IfcLibraryReferenceImpl
