package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(100);
        boss.setDamage(10);
        boss.weapon.setModel(5);
        boss.weapon.setName("Ak");
        System.out.println(boss.PrintInfo());

        Skeleton skeleton = new Skeleton();
        skeleton.setDamage(140);
        skeleton.setDamage(20);
        skeleton.setColv_strel(10);
        skeleton.weapon.setModel(10);
        skeleton.weapon.setName("Ak");
        System.out.println(skeleton.PrintInfo());


        Skeleton thor = new Skeleton();
        thor.setDamage(100);
        thor.setDamage(15);
        thor.setColv_strel(15);
        thor.weapon.setModel(20);
        thor.weapon.setName("lighning");
        System.out.println(thor.PrintInfo());


    }
}
