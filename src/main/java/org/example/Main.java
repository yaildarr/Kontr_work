package org.example;

import org.example.System_Elevator;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько лифтов для четных этажей должно быть в системе?");
        int chetn = scanner.nextInt();
        System.out.println("Сколько лифтов для нечетных этажей должно быть в системе?");
        int nechetn = scanner.nextInt();
        System_Elevator system = new System_Elevator(chetn,nechetn);
        system.initChetnSystem(chetn);
        system.initNechetnSystem(nechetn);
        menu();
        while (true) {
            String askMenu = scanner.nextLine();
            if (askMenu.equals("1")){
                system.callChetn();
                menu();
            } else if (askMenu.equals("2")){
                system.callNechetn();
                menu();
            } else if (askMenu.equals("3")){
                system.callEmploy();

            }
        }
    }
    public static void menu(){
        System.out.println("1.Вызвать лифт на четный этаж \n 2.Вызвать лифт на нечетный этаж \n 3.Вызвать служебный лифт");
    }
}