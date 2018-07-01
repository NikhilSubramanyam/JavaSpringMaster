package com.in28minutes.spring.basics.Springin10steps;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

	@Autowired
	private SortAlgorithm sortAlgorithm;

	/*public binarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}*/

	/*public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}*/

	public int binarySearch(int[] numbers, int numberToSearch) {

		// Implementing Sorting Logic
		// Bubble Sort Algorithm
		int[] sortedNumbers = sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);

		return 3;
	}
}
