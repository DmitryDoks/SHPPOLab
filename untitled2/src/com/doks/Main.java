package com.doks;

import java.util.Scanner;

public class Main {

    static Product productFunc(String s, Scanner in) {
        Product product = null;
        TeaProducers[] allTeaProducers = TeaProducers.values();
        CoffeeProducers[] allCoffeeProducers = CoffeeProducers.values();
        String str = s;
        switch (str) {
            case "Tea":
                System.out.print("What producer:");
                for(TeaProducers tprod : allTeaProducers) {
                    System.out.print(" " + tprod.name()+";");
                }
                System.out.print("\nChoose: ");
                str = in.next();
                product = teaProdFunc(str, in);
                break;
            case "Coffee":
                System.out.print("What producer:");
                for(CoffeeProducers cprod : allCoffeeProducers) {
                    System.out.print(" " + cprod.name()+";");
                }
                System.out.print("\nChoose: ");
                str = in.next();
                product = coffeeProdFunc(str, in);
                break;
        }
        return product;
    }

    static Product teaProdFunc(String s, Scanner in) {
        Product tea = null;
        String str = s;
        switch (str) {
            case "Grinfield":
                System.out.print("Black tea or Green?: ");
                str = in.next();
                tea = GrinFunc(str, in);
                break;
            case "Tess":
                System.out.print("Black tea or Green?: ");
                str = in.next();
                tea = TessFunc(str, in);
                break;
        }
        return tea;
    }

    static Product coffeeProdFunc(String s, Scanner in) {
        String str = s;
        Product coffee = null;
        switch (s) {
            case "Nescafe":
                System.out.print("Milky coffee or Black?: ");
                str = in.next();
                coffee = NescaFunc(str, in);
                break;
            case "Jardin":
                System.out.print("Milky coffee or Black?: ");
                str = in.next();
                coffee = JardinFunc(str, in);
                break;
        }
        return coffee;
    }

    static Product GrinFunc(String s, Scanner in) {
        TeaProducer tp = new Grinfield();
        Product tea = null;
        String str = s;
        switch (s) {
            case "Black":
                System.out.println("With sugar?(y/n)");
                str = in.next();
                switch (str) {
                    case "y":
                        tea = tp.constructBlackTeaWithSugar(10.00);
                        break;
                    case "n":
                        tea = tp.constructBlackTea(9.50);
                        break;
                }
                break;
            case "Green":
                System.out.println("With sugar?(y/n)");
                str = in.next();
                switch (str) {
                    case "y":
                        tea = tp.constructGreenTeaWithSugar(10.00);
                        break;
                    case "n":
                        tea = tp.constructGreenTea(9.50);
                        break;
                }
                break;
        }
        return tea;

    }

    static Product TessFunc(String s, Scanner in) {
        TeaProducer tp = new Tess();
        Product tea = null;
        String str = s;
        switch (s) {
            case "Black":
                System.out.println("With sugar?(y/n)");
                str = in.next();
                switch (str) {
                    case "y":
                        tea = tp.constructBlackTeaWithSugar(10.00);
                        break;
                    case "n":
                        tea = tp.constructBlackTea(9.50);
                        break;
                }
                break;
            case "Green":
                System.out.println("With sugar?(y/n)");
                str = in.next();
                switch (str) {
                    case "y":
                        tea = tp.constructGreenTeaWithSugar(10.00);
                        break;
                    case "n":
                        tea = tp.constructGreenTea(9.50);
                        break;
                }
                break;
        }
        return tea;

    }

    static Product NescaFunc(String s, Scanner in) {
        CoffeeProducer cp = new Nescafe();
        Product coffee = null;
        String str = s;
        switch (s) {
            case "Milky":
                System.out.println("With sugar?(y/n)");
                str = in.next();
                switch (str) {
                    case "y":
                        coffee = cp.constructMilkCoffeeWithSugar(10.00);
                        break;
                    case "n":
                        coffee = cp.constructMilkCoffee(9.50);
                        break;
                }
                break;
            case "Black":
                System.out.println("With sugar?(y/n)");
                str = in.next();
                switch (str) {
                    case "y":
                        coffee = cp.constructBlackCoffee(10.00, true);
                        break;
                    case "n":
                        coffee = cp.constructBlackCoffee(9.50);
                        break;
                }
                break;
        }
        return coffee;

    }

    static Product JardinFunc(String s, Scanner in) {
        CoffeeProducer cp = new Jardin();
        Product coffee = null;
        String str = s;
        switch (s) {
            case "Milky":
                System.out.println("With sugar?(y/n)");
                str = in.next();
                switch (str) {
                    case "y":
                        coffee = cp.constructMilkCoffeeWithSugar(10.00);
                        break;
                    case "n":
                        coffee = cp.constructMilkCoffee(9.50);
                        break;
                }
                break;
            case "Black":
                System.out.println("With sugar?(y/n)");
                str = in.next();
                switch (str) {
                    case "y":
                        coffee = cp.constructBlackCoffee(10.00, true);
                        break;
                    case "n":
                        coffee = cp.constructBlackCoffee(9.50);
                        break;
                }
                break;
        }
        return coffee;

    }


    public static void main(String[] args) {

        System.out.print("In menu: ");
        Products[] allProducts = Products.values();
        for (Products product : allProducts) {
            System.out.print(" " + product+";");
        }

        System.out.print("\nChoose the product: ");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        Product product = productFunc(s, in);
        System.out.println(product.getName()+(product.isSugar()?" with sugar":"")+" for " + product.getPrice()+"$");
        return;
    }
}
