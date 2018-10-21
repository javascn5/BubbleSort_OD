package com.sda.sort;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int tab[] = {1, 33, 54, 23, 65, 23, 65, -2, 2};
        for (int i = 0; i < tab.length; i++) {
            System.out.println(tab[i]);
        }

        for (int i = 0; i < tab.length - 1; i++) {
            for (int j = 0; j < tab.length - 1; j++) {
                if (tab[j] > tab[j + 1]) {
                    int tmp = tab[j];
                    tab[j] = tab[j + 1];
                    tab[j + 1] = tmp;
                }
            }

        }

        System.out.println("=======");
        for (int k = 0; k < tab.length; k++) {
            System.out.println(tab[k]);
        }
    }


}

