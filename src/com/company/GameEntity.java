package com.company;

public class GameEntity {
    private int Health;
    private int Damage;
    private String superr;

    public int getHealth() {
        return Health;
    }

    public void setHealth(int health) {
        Health = health;
    }

    public int getDamage() {
        return Damage;
    }

    public void setDamage(int damage) {
        Damage = damage;
    }

    public String getSuperr() {
        return superr;
    }

    public void setSuperr(String superr) {
        this.superr = superr;
    }
}
