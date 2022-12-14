/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Armes;

import Armes.Arme;

/**
 *
 * @author maxCD
 */
public class Baton extends Arme {
    int age;

    public Baton(String n, int i,int a) {
        super(n, i);
        if (a>99){
            age = 99;
        }
        if (a>0){
            age = a;
        }else{
            age = 0;
        }
    }

    @Override
    public String toString() {
        return "Baton{" + "age=" + age + '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
