package com.capg.devops;

import java.util.Arrays;
import java.util.List;

public class SalesClass{
	
	List<Integer> list=Arrays.asList(54,56,213,35,65,7,6,2,4,65);
	
	public void display() {
		System.out.println("****** List****");
		for(int num:list) {
			System.out.println(num);
		}
	}
}

