package com.in28minutes.spring.basics.Springin10steps;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("quick")
public class QuickSortAlgorithm implements SortAlgorithm {

	public int[] sort(int[] numbers) {
		// logic for quick sort
		return numbers;
	}

}
