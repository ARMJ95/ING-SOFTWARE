/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Adrian Morales Jimenez
 */
public class Reloj extends Thread {

    public Reloj(String nombre) {
        super(nombre);
    }

    @Override
    public void run() {
        int segundos = 0;
        int minutos = 0;
        int hora = 0;
       try {

            while (segundos < 60) {
                segundos++;
                Thread.sleep(1000);

                if (segundos == 60) {
                    minutos++;
                    segundos=0;
                }
                if (minutos == 60) {
                    hora++;
                    minutos=0;
                }
                System.out.println("La hora es ----> " + hora+"hh"+ ":" + minutos+"mm" + ":" + segundos+"sg");
               
            }
    

                   
        } catch (InterruptedException ex) {
            Logger.getLogger(Reloj.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}


