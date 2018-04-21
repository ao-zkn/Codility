package com.sample.Lesson1.Iterations;

import java.util.Comparator;
import java.util.stream.Stream;

/**
 * @author masato_arihara
 */
class BinaryGap {

    int solution1(int N) {

        // 2進数に変更する
        char[] chars = Integer.toBinaryString(N).toCharArray();

        int gap = 0;
        int count = 0;
        for (char num : chars) {
            if (num == '0') {
                count++;
            } else {
                if (count > gap) {
                    gap = count;
                }
                count = 0;
            }
        }
        return gap;
    }

    int solution2(int N) {

        String[] strings = Integer.toBinaryString(N)
                // 文字列の最後「0」を全て削除
                .replaceAll("0+$", "")
                // 「1」で分割
                .split("1");

        int gap = 0;
        for (String str : strings) {
            int count = str.length();
            if (count > gap) {
                gap = count;
            }
        }
        return gap;
    }

    int solution3(int N) {

        // Java8
        int result = Stream.of(Integer.toBinaryString(N)
                .replaceAll("0+$", "")
                .split("1"))
                // .max((e1, e2) -> Integer.compare(e1.length(), e2.length()))
                // .max((e1, e2) -> e1.compareTo(e2))
                .max(Comparator.comparing(String::length))
                //.map(e -> e.length())
                .map(String::length)
                .orElse(0);

        return result;
    }
}
