// Copyright 2015 Sebastian Kuerten
//
// This file is part of collections-utils.
//
// collections-utils is free software: you can redistribute it and/or modify
// it under the terms of the GNU Lesser General Public License as published by
// the Free Software Foundation, either version 3 of the License, or
// (at your option) any later version.
//
// collections-utils is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
// GNU Lesser General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public License
// along with collections-utils. If not, see <http://www.gnu.org/licenses/>.

package de.topobyte.collections.util.gen;

/**
 * @author Sebastian Kuerten (sebastian@topobyte.de)
 */
public enum PrimitiveType {

	BYTE("byte", "Byte"),
	SHORT("short", "Short"),
	INT("int", "Integer"),
	LONG("long", "Long"),
	FLOAT("float", "Float"),
	DOUBLE("double", "Double"),
	CHAR("char", "Character"),
	BOOLEAN("boolean", "Boolean");

	private String primitiveName;
	private String objectName;

	private PrimitiveType(String primitiveName, String objectName)
	{
		this.primitiveName = primitiveName;
		this.objectName = objectName;
	}

	public String getPrimitiveName()
	{
		return primitiveName;
	}

	public String getObjectName()
	{
		return objectName;
	}

}
