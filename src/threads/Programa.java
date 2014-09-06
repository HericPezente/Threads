/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package threads;

/**
 *
 * @author i03
 */
public class Programa implements Runnable{
    private int id;

    @Override
    public void run() {
       for(int i=0; i < 10000;i++){
           System.out.println("Programa:"+id+" Valor:"+i);
       } 
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
