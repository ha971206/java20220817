package Memo.codingtest.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution1200 {
	List<List<Integer>> minimumAbsDifference(int[] arr) {
		List<List<Integer>> end = new ArrayList<>();
		List<Integer> result = new ArrayList<>();
		
		for(int i=1;i<arr.length+1;i++) {
			int a = Math.abs(arr[i]-arr[i-1]);
			int abc = 1400;
			if(abc>a) {
				abc = a;			
			}
			
			if(abc == Math.abs(arr[i]-arr[i-1])) {
				result.add(arr[i]);
                result.add(arr[i-1]);
                end.add(result);
			}
		}        
        return end;
    }
}