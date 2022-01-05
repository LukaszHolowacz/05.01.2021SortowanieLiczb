package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        int n;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Ile liczb chcesz posortować? ");
        n = Integer.parseInt(br.readLine());
        int [] liczby = new int[n];
        sortowanie s = new sortowanie();
        s.czytaj(liczby, n);
        s.przetworz(liczby ,n);
        s.wypisz(liczby ,n);
    }
}
