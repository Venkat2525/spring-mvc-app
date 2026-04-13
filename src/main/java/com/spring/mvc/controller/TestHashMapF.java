package com.spring.mvc.controller;

import java.util.HashSet;
import java.util.Set;

public class TestHashMapF {

	public static void main(String[] args) {
		
		
		int[] nums = new int[] {1,2,3,5,6,9,9,4,10};

		int res = 0;
        Set<Integer> store = new HashSet<>();
        for (int num : nums) {
            store.add(num);
        }

        for (int num : nums) {
            int streak = 0, curr = num;
            while (store.contains(curr)) {
                streak++;
                curr++;
            }
            res = Math.max(res, streak);
        }
       
        System.out.print(res);
		
	}

}
