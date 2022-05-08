package com.gradedproject;

import java.util.LinkedList;
import java.util.Scanner;
import com.gradedproject1.Skyscraper;
public class main {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the no of floors in the building:-  ");
		int floors= scan.nextInt();
		
		LinkedList<Integer>  noOfFloor = new LinkedList<Integer>();
		int i ;
		for ( i=0 ; i < floors ; i++)
		{
			System.out.println("Enter the floor size given on day :"+ (i+1));
			noOfFloor.add(scan.nextInt());
		}
	
		
		Skyscraper.skyscraperbuilt(noOfFloor ,floors);
	}

}
