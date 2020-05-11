package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(points(new String[]{"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));
    }

    public static int points(String[] games) {
        int sumaPunkt = 0;
        for (int i = 0; i < games.length; i++) {
            String element = games[i];
            String[] arrOfStr = element.split(":");
            int[] arrOfInt = {0, 0};

            for (int a = 0; a < arrOfStr.length; a++) {
                arrOfInt[a] = Integer.parseInt(arrOfStr[a]);
            }

            if (arrOfInt[0] == arrOfInt[1]) {
                sumaPunkt += 1;
            } else if (arrOfInt[0] > arrOfInt[1]) {
                sumaPunkt += 3;
            } else {
                sumaPunkt += 0;
            }
        }
        return sumaPunkt;
    }
}
