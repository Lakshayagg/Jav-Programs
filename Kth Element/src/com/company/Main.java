package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        for (int i = 0; i < n; i++) {
            String str = s.next();
            String decode = "";
            String st = "";
            for (int j = 0; j < str.length(); j++) {
                char a = str.charAt(j);

                if (a >= 48 && a <= 57) {
                    decode = "";
                    int no = Character.getNumericValue(a);
                    for (int k = 0; k < no; k++) {
                        decode += st;
                    }
                    st = decode;
                } else {
                    st = st + a;
                }
            }
            System.out.println(decode);
        }
    }
}
