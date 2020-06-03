package com.doks;

import java.util.Scanner;

public class Main {

    static Product productFunc(String s, Scanner in) {
        Product product = null;
        TeaProducers[] allTeaProducers = TeaProducers.values();
        CoffeeProducers[] allCoffeeProducers = CoffeeProducers.values();
        String str = s;
        main_c: while(true) {
            switch (str) {
                case "Tea":
                    System.out.print("What producer:");
                    for (TeaProducers tprod : allTeaProducers) {
                        System.out.print(" " + tprod.name() + ";");
                    }
                    System.out.print("\nChoose: ");
                    str = in.next();
                    product = teaProducersFunc(str, in);
                    break main_c;
                case "Coffee":
                    System.out.print("What producer:");
                    for (CoffeeProducers cprod : allCoffeeProducers) {
                        System.out.print(" " + cprod.name() + ";");
                    }
                    System.out.print("\nChoose: ");
                    str = in.next();
                    product = coffeeProducersFunc(str, in);
                    break main_c;
                default:
                    System.out.print("Try again: ");
                    str = in.next();
            }
        }
        return product;
    }

    static Product teaProducersFunc(String s, Scanner in) {
        Product tea = null;
        String str = s;
        main_c: while(true) {
            switch (str) {
                case "Grinfield":
                    System.out.print("Black tea or Green?: ");
                    str = in.next();
                    tea = teaFunc(str, in, new Grinfield());
                    break main_c;
                case "Tess":
                    System.out.print("Black tea or Green?: ");
                    str = in.next();
                    tea = teaFunc(str, in, new Tess());
                    break main_c;
                default: System.out.print("Try again: "); str = in.next();
            }
        }
        return tea;
    }

    static Product coffeeProducersFunc(String s, Scanner in) {
        String str = s;
        Product coffee = null;
        main_c: while(true) {
            switch (str) {
                case "Nescafe":
                    System.out.print("Milky coffee or Black?: ");
                    str = in.next();
                    coffee = coffeeFunc(str, in, new Nescafe());
                    break main_c;
                case "Jardin":
                    System.out.print("Milky coffee or Black?: ");
                    str = in.next();
                    coffee = coffeeFunc(str, in, new Jardin());
                    break main_c;
                default: System.out.print("try again: "); str = in.next();
            }
        }
        return coffee;
    }

    static Product teaFunc(String s, Scanner in, TeaProducer tp) {
        //TeaProducer tp = new Grinfield();
        Product tea = null;
        String str = s;
        main_operator: while(true) {
            switch (str) {
                case "Black":
                    System.out.println("With sugar?(y/n)");
                    while (true) {
                        switch (str) {
                            case "y":
                                tea = tp.constructBlackTeaWithSugar(10.00);
                                break main_operator;
                            case "n":
                                tea = tp.constructBlackTea(9.50);
                                break main_operator;
                            default:
                                System.out.print("Try again: ");
                                str = in.next();
                                break;
                        }
                    }

                case "Green":
                    System.out.println("With sugar?(y/n)");
                    while (true) {
                        switch (str) {
                            case "y":
                                tea = tp.constructGreenTeaWithSugar(10.00);
                                break main_operator;
                            case "n":
                                tea = tp.constructGreenTea(9.50);
                                break main_operator;
                            default:
                                System.out.print("Try again: ");
                                str = in.next();
                                break;
                        }
                    }
                default:
                    System.out.print("Try again: ");
                    str = in.next();
                    break;

            }
        }
        return tea;

    }

    static Product coffeeFunc(String s, Scanner in, CoffeeProducer cp) {
        //CoffeeProducer cp = new Nescafe();
        Product coffee = null;
        String str = s;
        main_operator: while(true) {
            switch (str) {
                case "Milky":
                    System.out.println("With sugar?(y/n)");
                    while(true) {
                        switch (str) {
                            case "y":
                                coffee = cp.constructMilkCoffeeWithSugar(10.00);
                                break main_operator;
                            case "n":
                                coffee = cp.constructMilkCoffee(9.50);
                                break main_operator;
                            default:
                                System.out.print("Try again: ");
                                str = in.next();
                                break;
                        }
                    }
                case "Black":
                    System.out.println("With sugar?(y/n)");
                    while(true) {
                        switch (str) {
                            case "y":
                                coffee = cp.constructBlackCoffee(10.00, true);
                                break main_operator;
                            case "n":
                                coffee = cp.constructBlackCoffee(9.50);
                                break main_operator;
                            default:
                                System.out.print("Try again: ");
                                str = in.next();
                                break;
                        }
                    }
                default:
                    System.out.print("Try again: ");
                    str = in.next();
                    break;
            }
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
        System.out.println(product.getName() + (product.isSugar()?" with sugar":"") + " for " + product.getPrice()+"$");
        return;
    }
}
