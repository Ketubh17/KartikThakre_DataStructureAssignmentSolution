package com.gradedproject1;

import java.util.LinkedList;

public class Skyscraper 
{
	
	
	public static int j;
	public static LinkedList<Integer> temp = new LinkedList<Integer>();
	public static void skyscraperbuilt(LinkedList<Integer> noOfFloor , int floors)

	{

		
		System.out.println("The order of construction is as follows :-");
		for (int i = 0; i < noOfFloor.size(); i++) {

			if (noOfFloor.get(i) == floors) {
				System.out.println("Day :" + (i+1));
				System.out.println(noOfFloor.get(i));

				floors = floors - 1;
				if (temp.isEmpty()) {

					int value = noOfFloor.getFirst();
					for (int k = 0; k < noOfFloor.size(); k++)

					{
						if (noOfFloor.get(i) == value) {
							continue;
						}
						temp.add(noOfFloor.get(i));
					}

				} else {

					if (temp.isEmpty()) {
						return;
					}

					for ( j = 0; j < temp.size(); j++) {

						if (temp.get(j) == floors) {
							System.out.println(temp.remove(j));
							floors = floors - 1;
							j = 0;

						}
					}
				}
				j++;
			}

			else {
				System.out.println("Day :"+(i+1));
				System.out.println();
				temp.add(noOfFloor.get(i));
				j++;
			}
		}
		if (!temp.isEmpty()) {
			if (temp.getFirst() == 1) {
				System.out.println(temp.poll());
			}
		}

	}
}
