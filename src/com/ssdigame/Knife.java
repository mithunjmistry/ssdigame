package com.ssdigame;

/**
 * Created by Mithun on 2/21/2017.
 */
public class Knife implements Weapon {

    @Override
    public void Attack() {
        System.out.println("Player attacked using a knife");
    }

    @Override
    public void Show() {
        System.out.println("Knife is being shown in the gameplay");
    }
}
