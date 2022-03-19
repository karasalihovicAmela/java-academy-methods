package com.company;

public class Example {

    public static void main(String[] args) {
        printMessage("Muamer");
        printMessage("Amela");
        printMessage("John");
    }

    public static void printGreeting() {
        System.out.println("[Hi!]");
    }

    public static void printBye() {
        System.out.println("/Bye!\\");
    }

    public static void printMessage(String name) {
        printGreeting();
        System.out.println("This is " + name);
        printBye();
    }

}
