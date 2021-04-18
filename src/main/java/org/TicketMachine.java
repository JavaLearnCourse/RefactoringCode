package org;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class TicketMachine {


    private Printer printer = new Printer();

    private Map<String, Double> route1 = new HashMap();
    private Map<String, Double> route2 = new HashMap();

    public TicketMachine(){
        route1.put("AAA", 0.5);
        route1.put("AAB", 0.6);
        route1.put("AAC", 0.9);

        route1.put("ACCC", 1.2);
        route2.put("ARRE", 1.2);

    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Вы едите загород? Да/Нет");
        String s = scanner.nextLine();
        if ("Да".equals(s)) {
            getCityTicket();
        } else if ("Нет".equals(s)) {
            getCountryTicket();
        }

    }
    public void  getCityTicket(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите маршрут");
        System.out.println("Город    Цена");
        for (Map.Entry<String, Double>  routes : route1.entrySet()){
            System.out.println(routes.getKey() + " " + routes.getValue());
        }
        String str = scanner.nextLine();
        double price = route1.get(str);
        System.out.println("Цена: " + price);
        System.out.println("Внесите деньги");
        double money =  scanner.nextDouble();

        if (money >= price){
            printer.printTicket();
        }
    }

    public void  getCountryTicket(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите маршрут");
        System.out.println("Город    Цена");
        for (Map.Entry<String, Double>  routes : route1.entrySet()){
            System.out.println(routes.getKey() + " " + routes.getValue());
        }
        String str = scanner.nextLine();
        double price = route1.get(str);
        System.out.println("Цена: " + price);
        System.out.println("Внесите деньги");
        double money =  scanner.nextDouble();

        if (money >= price){
            printer.printTicket();
        }
    }




}
