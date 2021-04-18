package org;

public class Printer {


    public void printTicket(){
        System.out.println("Печатаю билет. Ждите");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Напечатал билет");
    }
}
