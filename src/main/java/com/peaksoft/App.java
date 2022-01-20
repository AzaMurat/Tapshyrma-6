package com.peaksoft;

import dao.City;
import dao.Country;
import dao.Mayer;
import servis.Transcreption;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws SQLException {
        System.out.println(Transcreption.printCity());
        System.out.println(Transcreption.printMayer());
        System.out.println(Transcreption.printCountry());
        while (true) {
            System.out.println(" ----------ID менен табуу---------- ");
            Scanner scanner = new Scanner(System.in);
            int a = scanner.nextInt();
            switch (a) {
                case 1:
                    Transcreption.printId1(Integer.parseInt(scanner.next()));
                    break;
                case 2 :
                    Transcreption.printId2(Integer.parseInt(scanner.next()));
                    break;
                case 3 :
                    Transcreption.printId3(Integer.parseInt(scanner.next()));
                    break;
                default:
                    System.out.println("jok");
                    break;
            }
        }
    }
}
