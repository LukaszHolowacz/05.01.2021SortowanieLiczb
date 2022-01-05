package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sortowanie {
    public void czytaj(int[] liczby, int n) throws IOException {
        int a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < n; i++) {
            System.out.println("Podaj liczbę ");
            a = Integer.parseInt(br.readLine());
            liczby[i] = a;
        }
    }

    public void przetworz(int[] liczby, int n) {
        int x;
        for (int i = 1; i <= n - 1; i++) {
            for (int j = n - 1; j >= i; j--) {
                if (liczby[j - 1] > liczby[j]) {
                    x = liczby[j - 1];
                    liczby[j - 1] = liczby[j];
                    liczby[j] = x;
                }
            }
        }
    }

    public void wypisz(int[] liczby, int n) {
        System.out.println("Posortowałem twoje liczby");
        for (int i = 0; i < n; i++) {
            System.out.println(liczby[i]);
        }
    }
}
