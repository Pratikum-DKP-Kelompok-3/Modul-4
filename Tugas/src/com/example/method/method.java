package com.example.method;

import java.util.Scanner;

public class method {
    //method menu 1
    public void menu1(){
        System.out.println(" _______________________________________");
        System.out.println("|     Program Bilangan Aritmatika       |");
        System.out.println("|_______________________________________|");
        System.out.println("|______________Menu Pilihan_____________|");
        System.out.println("|  1. Mencari Bilangan Genap & Ganjil   |");
        System.out.println("|  2. Mengurutkan Bilangan              |");
        System.out.println("|_______________________________________|");
        System.out.print("Pilihan anda: ");
    }
    //method menu 2
    public static void menu2(){
        System.out.println(" __________________________________________");
        System.out.println("|     Program Bilangan Genap & Ganjil      |");
        System.out.println("|__________________________________________|");
        System.out.println("|______________Menu Pilihan________________|");
        System.out.println("|  1. Mencari Bilangan Genap               |");
        System.out.println("|  2. Mencari Bilangan Ganjil              |");
        System.out.println("|__________________________________________|");
        System.out.print("Pilihan anda: ");
    }
    //method menu 3
    public static void menu3() {
        System.out.println(" _______________________________________");
        System.out.println("|     Program Mengurutkan Bilangan      |");
        System.out.println("|_______________________________________|");
        System.out.println("|______________Menu Pilihan_____________|");
        System.out.println("|  1. Mengurutkan Bilangan              |");
        System.out.println("|_______________________________________|");
    }

    // method angkaganjil
    public static void angkaganjil(Scanner s){
        boolean f;
        do {
            System.out.print("Masukan Jumlah Baris Angka (MAX JUMLAH BARIS 20): ");
            int n;
            n = s.nextInt();
            int array[] = new int[n];
            int x = 1;
            System.out.println("Masukan Deret Angka: ");
            for(int i = 0; i < n; i++)
            {
                System.out.print("Angka " + x + "= ");
                array[i] = s.nextInt();
                System.out.println();
                x++;
            }
            System.out.print("Angka yang Ganjil adalah: ");
            for(int i = 0; i < n; i++)
            {
                if (array[i] % 2 != 0){
                    System.out.print(array[i] + ", ") ;
                }
            }
            System.out.print("\ningin lanjut?(y/t) ");
            char a = s.next().charAt(0);
            if (a == 'y' || a == 'Y'){
                f = true;
            }else {
                f = false;
            }
        }while(f);
    }
    //method angkagenap
    public static void angkagenap (Scanner s){
        boolean f;
        do {
            System.out.print("Masukan Jumlah Baris Angka (MAX JUMLAH BARIS 20): ");
            int n;
            n = s.nextInt();
            int array[] = new int[n];
            int x = 1;
            System.out.println("Masukan Deret Angka: ");
            for(int i = 0; i < n; i++)
            {
                System.out.print("Angka " + x + "= ");
                array[i] = s.nextInt();
                System.out.println();
                x++;
            }
            System.out.print("Angka yang Genap adalah ");
            for(int i = 0; i < n; i++)
            {
                if (array[i] % 2 == 0){
                    System.out.print(array[i] + ", ") ;
                }
            }
            System.out.print("\ningin lanjut?(y/t) ");
            char a = s.next().charAt(0);
            if (a == 'y' || a == 'Y'){
                f = true;
            }else {
                f = false;
            }

        }while(f);
    }
    //method sortingangka
    public static void sortingangka( Scanner s){
        boolean f;
        do {
            System.out.print("Masukan Jumlah Baris Angka (MAX JUMLAH BARIS 20): ");
            int n;
            int temp = 0;
            n = s.nextInt();
            int array[] = new int[n];
            int x = 1;
            System.out.println("Masukan Deret Angka: ");
            for(int i = 0; i < n; i++)
            {
                System.out.print("Angka " + x + "= ");
                array[i] = s.nextInt();
                System.out.println();
                x++;
            }
            System.out.print("Deret angka yang telah diurutkan: ");
            for (int i = 0; i < ( n - 1 ); i++) {
                for (int j = 0; j < n - i - 1; j++) {
                    if (array[j] > array[j+1])
                    {
                        //tukar nilai
                        temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp;
                    }
                }
            }

            for(int i = 0; i < n; i++)
            {
                System.out.print(array[i] + ", ") ;

            }
            System.out.print("\ningin lanjut?(y/t) ");
            char a = s.next().charAt(0);
            if (a == 'y' || a == 'Y'){
                f = true;
            }else {
                f = false;
            }
        }while(f);
    }

    public static void pressAnyKey(Scanner s) {
        System.out.println("Press Any Key to continue");
        s.next();
    }

}
