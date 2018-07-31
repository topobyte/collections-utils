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

package de.topobyte.collections.util.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

import de.topobyte.collections.util.SetUtil;

public class TestSets
{

	@Test
	public void test()
	{
		test(new ArrayList<Integer>(), new ArrayList<Integer>(),
				new ArrayList<Integer>());
		test(Arrays.asList(1, 2), new ArrayList<Integer>(),
				new ArrayList<Integer>());
		test(Arrays.asList(1, 2), Arrays.asList(1), Arrays.asList(1));
		test(Arrays.asList(1, 2), Arrays.asList(2), Arrays.asList(2));
		test(Arrays.asList(1, 2), Arrays.asList(1, 2), Arrays.asList(1, 2));
		test(Arrays.asList(1, 2, 3), Arrays.asList(1, 2), Arrays.asList(1, 2));
		test(Arrays.asList(1, 2, 3), Arrays.asList(2), Arrays.asList(2));
	}

	private void test(List<Integer> a, List<Integer> b, List<Integer> c)
	{
		test(new HashSet<>(a), new HashSet<>(b), new HashSet<>(c));
	}

	private void test(Set<Integer> a, Set<Integer> b, Set<Integer> c)
	{
		Set<Integer> d = SetUtil.intersection(a, b);
		Set<Integer> e = SetUtil.intersection(b, a);
		Assert.assertEquals(c, d);
		Assert.assertEquals(c, e);
	}

}
