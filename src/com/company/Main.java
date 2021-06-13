/*
 *  UCF COP3330 Summer 2021 Assignment 38 Solution
 *  Copyright 2021 Jeremy Bouhadana
 */
package com.company;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner jb = new Scanner(System.in);

        System.out.print("Enter a list of numbers, separated by spaces: ");
        String listed = jb.nextLine();

        String sonk[] = listed.split(" ");
        Integer evens[] = filterEvenNumbers(sonk);

        System.out.print("The even numbers are ");
        for(int i=0; i<evens.length; i++){
            if(i < evens.length-1){
                System.out.print(evens[i] + " ");
            }
            else
            {
                System.out.print(evens[i] + ".");
            }
        }
    }

    public static Integer[] filterEvenNumbers(String sonk[]) {
        ArrayList<Integer> listTwo = new ArrayList<>();

        for(int i=0; i<sonk.length; i++){
            int num = Integer.parseInt(sonk[i]);
            if(num % 2 == 0){
                listTwo.add(num);
            }
        }

        Integer[] jer = new Integer[listTwo.size()];
        jer = listTwo.toArray(jer);

        return jer;
    }
}
