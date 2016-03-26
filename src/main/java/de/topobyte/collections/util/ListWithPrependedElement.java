// Copyright 2016 Sebastian Kuerten
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

import java.util.AbstractList;
import java.util.List;

class ListWithPrependedElement<T> extends AbstractList<T>
{

	private final T first;
	private final List<T> list;

	ListWithPrependedElement(T first, List<T> list)
	{
		this.first = first;
		this.list = list;
	}

	@Override
	public int size()
	{
		return list.size() + 1;
	}

	@Override
	public T get(int index)
	{
		return (index == 0) ? first : list.get(index - 1);
	}

}