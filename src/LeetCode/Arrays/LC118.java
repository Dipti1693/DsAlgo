package LeetCode.Arrays;

import java.util.ArrayList;
import java.util.List;

public class LC118 {
    public static void main(String[]args){
        int numRow =5;
        List<List<Integer>>finalArrayList=generate(numRow);
        System.out.println(finalArrayList.toString());
    }

    public static  List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> temp = null;
        for (int i = 0; i < numRows; i++) {
            temp=new ArrayList<>();
            if (i == 0)
                temp.add(1);
            else if(i==1){
                temp.add(1);
                temp.add(1);
            }
            else{
                temp.add(1);
                for(int j=0;j<i-1;j++){
                    int a=result.get(i-1).get(j);
                    int b=result.get(i-1).get(j+1);
                    temp.add(a+b);
                }
                temp.add(1);
            }
            result.add(new ArrayList<>(temp));
        }
        return result;
    }

}
