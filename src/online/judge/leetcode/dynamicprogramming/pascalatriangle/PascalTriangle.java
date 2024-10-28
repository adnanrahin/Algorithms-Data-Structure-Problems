package online.judge.leetcode.dynamicprogramming.pascalatriangle;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static void main(String[] args) {

        System.out.println(generate(2));

    }

    public static List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        if (numRows == 1) return new ArrayList<>(List.of(new ArrayList<>(List.of(1))));

        List<List<Integer>> result = new ArrayList<>(List.of(
                new ArrayList<>(List.of(1)),
                new ArrayList<>(List.of(1, 1))
        ));

        for (int i = 3; i <= numRows; i++) {

            List<Integer> localList = new ArrayList<>();

            for (int j = 0; j < i; j++) {
                if (j == 0 || j == i - 1) {
                    localList.add(1);
                } else {
                    int num2 = result.get(i - 2).get(j - 1);
                    int num1 = result.get(i - 2).get(j);
                    localList.add(num1 + num2);
                }
            }
            result.add(localList);
        }


        return result;
    }

}
