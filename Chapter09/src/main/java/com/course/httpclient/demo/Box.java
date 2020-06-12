package com.course.httpclient.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by zero on 2020-05-28
 */
public class Box {
    public static void main(String[] args) {
        String s ;
        String s1;
        String a;
        int total;

        Map<String,Integer> map = new HashMap<>();
        String[] strs = new String[map.size()];
        int[] ints = new int[map.size()];

        System.out.println("请输入字段：");
        Scanner scanner = new Scanner(System.in);
        s = scanner.nextLine();

        while (s.length() >= 0) {
            if (s.length() == 0) {
                break;
            } else {
                a = s.substring(0, 1);
                s1 = s.replaceAll(a, "");
                total = s.length() - s1.length();
                s = s1;
                map.put(a,total);
            }

        }
        int index = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()){

            strs[index] = entry.getKey();
            ints[index] = entry.getValue();
            index++;
        }

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints.length - i -1; j++) {
                if (ints[j] > ints[j + 1]) {
                    int temp = ints[j];
                    String temp1 = strs[j];
                    ints[j] = ints[j + 1];
                    strs[j] = strs[j + 1];
                    ints[j + 1] = temp;
                    strs[j + 1] =temp1;
                }
            }
        }
        System.out.println("请输入需要查看的位次：");
        int index1 = scanner.nextInt();
        System.out.println(strs[index1]);
    }
}
