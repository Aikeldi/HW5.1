package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Heros h1 = new Heros(100, 25, "Mental");
        
        Boss boss = new Boss();

        boss.setHealth(250);
        boss.setDamage(50);
        boss.setDefType("Mental");
        System.out.println(boss.getHealth() + " " + boss.getDamage() + " " + boss.getDefType());
    }
}
