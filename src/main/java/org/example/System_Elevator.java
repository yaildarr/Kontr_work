package org.example;

public class System_Elevator {
    int kolChetn;
    int kolNechetn;
    Chetn_Elevator firstChetn = new Chetn_Elevator();
    Nechetn_Elevator firstNechetn = new Nechetn_Elevator();
    Employ_Elevator employElevator = new Employ_Elevator();
    public System_Elevator(int kolChetn, int kolNechetn){
        this.kolChetn = kolChetn;
        this.kolNechetn = kolNechetn;
    }
    public void initChetnSystem(int kolChetn){
        Chetn_Elevator e = firstChetn;
        for (int i = 2; i < kolChetn+1; i++) {
            Chetn_Elevator Chetn_Elevator = new Chetn_Elevator();
            Chetn_Elevator.num = i;
            e.next= Chetn_Elevator;
            e = Chetn_Elevator;
        }
        e.next = firstChetn;
    }
    public void chetnOutput(){
        Chetn_Elevator e = firstChetn;
        for (int i = 0; i < kolChetn; i++) {
            System.out.println(e.num);
            e = e.next;
        }
        System.out.println(e.num);
    }
    public void callChetn() {
        int rand = (int) (Math.random() * 3);
        rand+=1;
        Chetn_Elevator e1 = firstChetn;
        for (int i = 0; i < rand; i++) {
            if (e1.num == rand){
                e1.isEmptyElevator = true;
                System.out.println("Освободился " + rand + " лифт");
            } else {
                e1 = e1.next;
            }
        }
        boolean findFree = false;
        Chetn_Elevator e = firstChetn;
        Chetn_Elevator zan;
        try {
            while (!findFree) {
                if (e.isEmptyElevator == true) {
                    e.isEmptyElevator = false;
                    System.out.println("Вызван четный лифт под номером " + e.num);
                    findFree = true;
                    zan = e;
                } else {
                    e = e.next;
                }
            }
        } catch (Exception f) {
            System.out.println("Все лифты заняты");

        }
    }
    public void initNechetnSystem(int kolNechetn){
        Nechetn_Elevator e = firstNechetn;
        for (int i = 2; i < kolNechetn+1; i++) {
            Nechetn_Elevator Nechetn_Elevator = new Nechetn_Elevator();
            Nechetn_Elevator.num = i;
            e.next= Nechetn_Elevator;
            e = Nechetn_Elevator;
        }
        e.next = firstNechetn;
    }

    public void callNechetn() {
        int rand = (int) (Math.random() * 3);
        rand+=1;
        Nechetn_Elevator e1 = firstNechetn;
        for (int i = 0; i < rand; i++) {
            if (e1.num == rand){
                e1.isEmptyElevator = true;
                System.out.println("Освободился " + rand + " лифт");
            } else {
                e1 = e1.next;
            }
        }
        boolean findFree = false;
        Nechetn_Elevator e = firstNechetn;
        Nechetn_Elevator zan;
        try {
            while (!findFree) {
                if (e.isEmptyElevator == true) {
                    e.isEmptyElevator = false;
                    System.out.println("Вызван четный лифт под номером " + e.num);
                    findFree = true;
                    zan = e;
                } else {
                    e = e.next;
                }
            }
        } catch (Exception e4) {
            System.out.println("Ошибка, все лифты заняты");
        }
    }

    public void callEmploy(){
        if ((int)Math.random() == 0){
            System.out.println("Служебный лифт занят");
        } if ((int) Math.random()==1){
            System.out.println("Вызван служебный лифт");
        }
    }

}
