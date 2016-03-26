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

class ListWithAppendedElement<T> extends AbstractList<T>
{

	private final T last;
	private final List<T> list;

	ListWithAppendedElement(List<T> list, T last)
	{
		this.last = last;
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
		return (index == list.size()) ? last : list.get(index);
	}

}