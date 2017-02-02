// Copyright 2017 Sebastian Kuerten
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

import java.util.Iterator;
import java.util.List;

/**
 * Utilities for collections of {@link Character}s.
 * 
 * @author Sebastian Kuerten (sebastian@topobyte.de)
 */
public class CharacterUtil
{

	/**
	 * Convert a {@link List} of {@link Character}s to String.
	 * 
	 * @param chars
	 *            the source of characters.
	 * @return a String containing the chars in the list.
	 */
	public static String listAsString(List<Character> chars)
	{
		StringBuilder builder = new StringBuilder(chars.size());
		for (Character c : chars) {
			builder.append(c);
		}
		return builder.toString();
	}

	/**
	 * Convert an {@link Iterable} of {@link Character}s to String.
	 * 
	 * @param chars
	 *            the source of characters.
	 * @return a String containing the chars the iterable returned.
	 */
	public static String iterableAsString(Iterable<Character> chars)
	{
		StringBuilder builder = new StringBuilder();
		for (Character c : chars) {
			builder.append(c);
		}
		return builder.toString();
	}

	/**
	 * Convert an {@link Iterator} of {@link Character}s to String.
	 * 
	 * @param chars
	 *            the source of characters.
	 * @return a String containing the chars the iterator returned.
	 */
	public static String iteratorAsString(Iterator<Character> chars)
	{
		StringBuilder builder = new StringBuilder();
		while (chars.hasNext()) {
			builder.append(chars.next());
		}
		return builder.toString();
	}

}
