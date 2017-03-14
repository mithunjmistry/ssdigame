package com.ssdigame;

/**
 * Created by Mithun on 2/21/2017.
 */
public class WeaponFactory {

    public Weapon selectWeapon(String weaponSelected){
        if (weaponSelected.equals(null)){
            return null;
        }
        if (weaponSelected.equalsIgnoreCase("knife")){
            return new Knife();
        }
        else if (weaponSelected.equalsIgnoreCase("axe")){
            return new Axe();
        }
        else if (weaponSelected.equalsIgnoreCase("sword")){
            return new Sword();
        }
        else if (weaponSelected.equalsIgnoreCase("crossbow")){
            return new Crossbow();
        }
        return null;
    }
}
