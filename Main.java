package com.company;
public class Main {
    static class Human {
        int age;
        String name;
        int salary;
        static long population;

        public Human(int age, String name, int salary) {
            this.name = name;
        }
    }
    public static void main(String[] args) {
        Human jay = new Human(21, "Jay", 200000);
        Human rahul = new Human(22, "Rahul", 20000);
        Human priyanshu = new Human(22, "priyanshu", 20000);

    }
}
