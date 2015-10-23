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
public class InstanceCreator
{

	public static String create(String template, PrimitiveType type)
	{
		String primitiveName = type.getPrimitiveName();
		String objectName = type.getObjectName();
		String primitiveName2 = primitiveName.substring(0, 1).toUpperCase()
				+ primitiveName.substring(1);

		String instance = template;
		instance = instance.replaceAll("\\$primitive\\$", primitiveName);
		instance = instance.replaceAll("\\$Primitive\\$", primitiveName2);
		instance = instance.replaceAll("\\$Object\\$", objectName);
		return instance;
	}

}
