package main;

import java.util.ArrayList;
import java.util.List;


import logic.GenericWildCards;

public class Main {

	public static void main(String[] args) {
		
		GenericWildCards genericWildCards = new GenericWildCards();
		System.out.println(genericWildCards.<String>nCopies(3,"x"));
		
		List<Integer> intList = new ArrayList<>();
		intList.add(1);
		intList.add(2);
		intList.add(3);
		intList.add(4);
		intList.add(5);
		
		genericWildCards.reverse(intList);
		
		genericWildCards.<Integer>fill(intList, new Integer(10));
		
		
	}

}
