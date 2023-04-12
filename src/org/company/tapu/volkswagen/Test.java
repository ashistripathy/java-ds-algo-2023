package org.company.tapu.volkswagen;

public class Test {
    public static void main(String[] args) {
        String test = "a1b2c3";
        String [] tokens = test.split("\\d");

        for(String s: tokens){
            System.out.println(s+" ");
        }

        int [] arr = new int[10];
        int i =5;
        arr[i++] = ++i + i++;
        System.out.println(arr[5] + ":" + arr[6]);

        Character cha = new Character('Z');
        System.out.println(cha+"\t"+(int)cha);

        final char ch='A';
        switch(65)
        {
            case ch:
                System.out.println("65"); //65
            case 66:
                System.out.println("66"); //66
        }
    }
}
