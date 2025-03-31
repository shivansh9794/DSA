package Basic_Ques_GFG;

import java.util.Scanner;

public class printWithouSpace {

    @SuppressWarnings("resource")
    public static void Add() {

        Scanner scn = new Scanner(System.in);
        String a = scn.nextLine();
        String b = scn.nextLine();
        // Write your code below that prints ab

        System.out.println("data==>"+a.trim()+b.trim());
    }

    public static void main(String[] args) {
        Add();
    }
}
