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

package de.topobyte.collections.util.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import de.topobyte.collections.util.CharacterUtil;

public class TestCharacterUtil
{

	private static class Case
	{

		private List<Character> input;
		private String expected;

		public Case(List<Character> input, String expected)
		{
			this.input = input;
			this.expected = expected;
		}

	}

	private static List<Case> cases = new ArrayList<>();
	static {
		add(new ArrayList<Character>(), "");
		add(Arrays.asList('a'), "a");
		add(Arrays.asList('a', 'b'), "ab");
		add(Arrays.asList('a', 'b', 'c'), "abc");
	}

	private static void add(List<Character> list, String expected)
	{
		cases.add(new Case(list, expected));
	}

	@Test
	public void testList()
	{
		for (Case testCase : cases) {
			testList(testCase.input, testCase.expected);
		}
	}

	@Test
	public void testIterable()
	{
		for (Case testCase : cases) {
			testIterable(testCase.input, testCase.expected);
		}
	}

	@Test
	public void testIterator()
	{
		for (Case testCase : cases) {
			testIterator(testCase.input.iterator(), testCase.expected);
		}
	}

	private void testList(List<Character> list, String expected)
	{
		String result = CharacterUtil.listAsString(list);
		assertEquals(expected, result);
	}

	private void testIterable(Iterable<Character> list, String expected)
	{
		String result = CharacterUtil.iterableAsString(list);
		assertEquals(expected, result);
	}

	private void testIterator(Iterator<Character> list, String expected)
	{
		String result = CharacterUtil.iteratorAsString(list);
		assertEquals(expected, result);
	}

}
