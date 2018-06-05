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
            int numberOfRepeatedAsterisk = line;
            String repeatedAsterisk = new String(new char[numberOfRepeatedAsterisk]).replace("\0", "*");
            System.out.print(repeatedAsterisk + '\n');
        }

    }

    public static void printTriangle (int numberOfLine) {
        int space = numberOfLine - 1;
        int numberOfRepeatedAsterisk = 1;
        while(space >= 0) {
            String repeatedAsterisk = new String(new char[numberOfRepeatedAsterisk]).replace("\0", "*");
            String repeatedSpace = new String(new char[space]).replace("\0", " ");
            System.out.println(repeatedSpace + repeatedAsterisk + repeatedSpace);
            space--;
            numberOfRepeatedAsterisk = numberOfRepeatedAsterisk + 2;
        }
    }

    public static void printDiamond (int numberOfLine) {
        int startLine = 1;
        int space = numberOfLine - 1;
        int numberOfRepeatedAsterisk = 1;
        int totalLine = (numberOfLine * 2) - 1;
        while(startLine <= totalLine) {
            String repeatedAsterisk = new String(new char[numberOfRepeatedAsterisk]).replace("\0", "*");
            String repeatedSpace = new String(new char[space]).replace("\0", " ");
            System.out.println(repeatedSpace + repeatedAsterisk + repeatedSpace);
            if(startLine >= numberOfLine) {
                space++;
                numberOfRepeatedAsterisk = numberOfRepeatedAsterisk - 2;
                startLine++;
            } else {
                space--;
                if (space < 0) {
                    space = 0;
                }
                numberOfRepeatedAsterisk = numberOfRepeatedAsterisk + 2;
                startLine++;
            }
        }
    }

    public static void printDiamondWithName (int numberOfLine, String name) {
        int startLine = 1;
        int space = numberOfLine - 1;
        int numberOfRepeatedAsterisk = 1;
        int totalLine = (numberOfLine * 2) - 1;
        while(startLine <= totalLine) {
            String repeatedAsterisk = new String(new char[numberOfRepeatedAsterisk]).replace("\0", "*");
            String repeatedSpace = new String(new char[space]).replace("\0", " ");
            if (startLine == numberOfLine) {
                System.out.println(name);
            } else {
                System.out.println(repeatedSpace + repeatedAsterisk + repeatedSpace);
            }

            if(startLine >= numberOfLine) {
                space++;
                numberOfRepeatedAsterisk = numberOfRepeatedAsterisk - 2;
                startLine++;
            } else {
                space--;
                if (space < 0) {
                    space = 0;
                }
                numberOfRepeatedAsterisk = numberOfRepeatedAsterisk + 2;
                startLine++;
            }
        }
    }

    public static void fizzBuzz() {
        // NOTE: DRY in this one maybe make it read harder
        for(int num = 1; num <= 100; num++) {
            if(num % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if(num % 3 == 0) {
                System.out.println("Fizz");
            } else if(num % 5 ==0) {
                System.out.println("Buzz");
            } else {
                System.out.println(num);
            }
        }
    }

    public static void generate(int num) {
        
    }

    public static void main(String[] args) {
        System.out.println('*');
        printAsterisk(3);
        printLineAsterisk(4);
        printRightTriangleAsterisk(4);
        printTriangle(3);
        printDiamond(4);
        printDiamondWithName(5, "Kiang");
        fizzBuzz();

    }
}
