package Memo.codingtest.leetcode;

import java.util.ArrayList;
import java.util.List;

public class Solution118 {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> item = new ArrayList<>();
        List<Integer> num = new ArrayList<>();
        for(int i=0;i<numRows+1;i++){
            num.add(1);
            if(numRows != 0 || numRows != 1){
                for(int j=i;j<numRows+1;j++){
                    num.add(num.get(j)+num.get(j-1));
                }
            }
            num.add(1);
        }
        item.add(num);
        return item;
    }
}
