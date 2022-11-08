/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alfito septiano
 */
public class Knife extends Weapon {
    
    public String knifeEdge;
    
    public Knife(){
        
    }
    
    @Override
    public void attack(){
        System.out.println("Menyayat dan menusuk musuh");
        super.info();
    }

}
