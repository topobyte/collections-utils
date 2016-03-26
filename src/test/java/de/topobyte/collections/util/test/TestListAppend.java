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

package de.topobyte.collections.util.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import de.topobyte.collections.util.ListUtil;

public class TestListAppend
{

	@Test
	public void test()
	{
		test(0);
		test(1);
		test(4);
	}

	private void test(int n)
	{
		List<Integer> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}

		List<Integer> appended = ListUtil.appended(list, -1);
		for (int i = 0; i < n; i++) {
			assertEquals(i, (int) appended.get(i));
		}
		assertEquals(-1, (int) appended.get(n));
	}

}
