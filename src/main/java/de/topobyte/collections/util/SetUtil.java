// Copyright 2018 Sebastian Kuerten
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

package de.topobyte.collections.util;

import java.util.HashSet;
import java.util.Set;

public class SetUtil
{

	/**
	 * Compute the intersection of sets <code>set1</code> and <code>set2</code>.
	 * 
	 * @return all elements contained in the intersection of both sets
	 */
	public static <T> Set<T> intersection(Set<T> set1, Set<T> set2)
	{
		Set<T> result = new HashSet<>();
		for (T element : set1) {
			if (set2.contains(element)) {
				result.add(element);
			}
		}
		return result;
	}

}
