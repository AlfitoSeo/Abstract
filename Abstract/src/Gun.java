/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfito septiano
 */
public class Gun extends Weapon{
    
    public int bullets;
    
    public Gun(){
        
    }
    
    public Gun(int bullets){
        this.bullets = bullets;
    }
    
    @Override
    public void attack(){
        System.out.println("Menembak peluru");
        System.out.println("Sisa peluru: "+--bullets);
        super.info();
    }
}
