package com.offer;

/**
 * Created by nanzhou on 2017/10/12.
 */
public class Solution1 {

    /**
     * 在一个二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
     * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
     */

    public boolean Find(int target, int[][] array) {

        boolean flag = false;

        for (int i = 0; i < array.length; i++) {

            for (int j = 0; j < array[i].length; j++) {

                if (target == array[i][j]) {

                    flag = true;
                    break;
                }

            }
        }
        return flag;
    }

}
