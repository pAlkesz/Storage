package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int length;
        int width;
        int colcount;
        int packagecount;
        ArrayList<Package> packages = new ArrayList<Package>();
        length = input.nextInt();
        width = input.nextInt();
        Storage storage = new Storage(length, width);
        colcount = input.nextInt();
        packagecount = input.nextInt();
        int colx;
        int coly;
        for(int i = 0; i < colcount; i++){
            coly = input.nextInt();
            colx = input.nextInt();
            storage.columns.add(new Column(colx, coly));
        }
        int pacx;
        int pacy;
        for(int i = 0; i < packagecount; i++){
            pacy = input.nextInt();
            pacx = input.nextInt();
            packages.add(new Package(pacx, pacy, i+1));
        }

        storage.Algorythm(packages);
        for (int i = 0; i < storage.y; i++){
            for (int j = 0; j < storage.x; j++){
                if(j != storage.x-1)
                System.out.print(storage.reserved[j][i] + "\t");
                else if(j == storage.x-1)
                    System.out.println(storage.reserved[j][i]);
            }
        }


    }
}
