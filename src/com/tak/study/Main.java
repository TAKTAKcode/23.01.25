package com.tak.study;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //입력할 갯수
        int a = sc.nextInt();

        //한 행
        for (int i = 1; i <= a; i++) {

            //한 행당 반복할 횟수
            for (int j = 0; j < i; j++) {

                System.out.print("*");
            }

            System.out.println();

        }

    }

}