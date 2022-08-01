package com.cwa.task;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NewMap {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Map<String,Integer> map = new HashMap<>();
		
		System.out.println("Enter the number of fruits you have");
		int a1 = sc.nextInt();
		for (int i = 0; i < a1; i++) {
			String a = sc.next();
			if(map.containsKey(a)) {
				map.computeIfPresent(a, (k,v)->v+1);
			}else {
				map.put(a, 1);
			}
		}

		System.out.println(map);
	}
}