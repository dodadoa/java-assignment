package com.company;

public class Main {

    public static void printAsterisk(int numberOfAsterisk) {
        for(int asterisk = 1; asterisk <= numberOfAsterisk; asterisk++) {
            System.out.print('*');
        };
    }

    public static void printLineAsterisk(int numberOfLine) {
        System.out.print('\n');
        for(int line = 1; line <= numberOfLine; line++) {
            System.out.println('*');
        }
    }

    public static void printRightTriangleAsterisk(int numberOfLine) {
        for(int line = 1; line <= numberOfLine; line++) {
            String repeatedAsterisk = new String(new char[line]).replace("\0", "*");
            System.out.print(repeatedAsterisk + '\n');
        }

    }

    public static void main(String[] args) {
        System.out.println('*');
        printAsterisk(3);
        printLineAsterisk(4);
        printRightTriangleAsterisk(4);
    }
}
