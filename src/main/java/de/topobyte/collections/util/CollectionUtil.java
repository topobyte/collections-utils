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

package de.topobyte.collections.util;

import java.util.Collection;
import java.util.Iterator;

/**
 * Utilities for collections.
 * 
 * @author Sebastian Kuerten (sebastian@topobyte.de)
 */
public class CollectionUtil
{

	/*
	 * Generated by GenCollectionToArray
	 */

	public static byte[] asByteArray(Collection<Byte> collection)
	{
		byte[] array = new byte[collection.size()];
		Iterator<Byte> iterator = collection.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			array[i++] = iterator.next();
		}
		return array;
	}

	public static short[] asShortArray(Collection<Short> collection)
	{
		short[] array = new short[collection.size()];
		Iterator<Short> iterator = collection.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			array[i++] = iterator.next();
		}
		return array;
	}

	public static int[] asIntArray(Collection<Integer> collection)
	{
		int[] array = new int[collection.size()];
		Iterator<Integer> iterator = collection.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			array[i++] = iterator.next();
		}
		return array;
	}

	public static long[] asLongArray(Collection<Long> collection)
	{
		long[] array = new long[collection.size()];
		Iterator<Long> iterator = collection.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			array[i++] = iterator.next();
		}
		return array;
	}

	public static float[] asFloatArray(Collection<Float> collection)
	{
		float[] array = new float[collection.size()];
		Iterator<Float> iterator = collection.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			array[i++] = iterator.next();
		}
		return array;
	}

	public static double[] asDoubleArray(Collection<Double> collection)
	{
		double[] array = new double[collection.size()];
		Iterator<Double> iterator = collection.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			array[i++] = iterator.next();
		}
		return array;
	}

	public static char[] asCharArray(Collection<Character> collection)
	{
		char[] array = new char[collection.size()];
		Iterator<Character> iterator = collection.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			array[i++] = iterator.next();
		}
		return array;
	}

	public static boolean[] asBooleanArray(Collection<Boolean> collection)
	{
		boolean[] array = new boolean[collection.size()];
		Iterator<Boolean> iterator = collection.iterator();
		int i = 0;
		while (iterator.hasNext()) {
			array[i++] = iterator.next();
		}
		return array;
	}

}
