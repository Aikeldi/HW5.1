package com.company;

public class Heros {

    private int health;
    private int damage;
    private String Mental;

    public Heros(){}

    public Heros(int health, int damage, String Mental) {
        this.health = health;
        this.damage = damage;
        this.Mental = Mental;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getMental() {
        return Mental;
    }
}
