package com.company;

public class Skeleton extends Boss{
    private int colv_strel;

    public int getColv_strel() {
        return colv_strel;
    }

    public void setColv_strel(int colv_strel) {
        this.colv_strel = colv_strel;
    }
    public String PrintInfo(){
        return getHealth()+ " "+ getDamage()+ " "+ weapon.getModel()+" "+weapon.getName()+ " "+getColv_strel();
    }
}
