/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.clases;

/**
 *
 * @author Adrian Morales jimenez
 */
public class OpcionalReloj {

    public void reloj() {
        int segundo = 0;
        int minutos = 0;
        int hora = 0;

        while (segundos < 60) {
            segundos++;

            if (segundos == 60) {
                minutos++;
                segundos = 0;
            }
            if (minutos == 60) {
                hora++;
                minutos = 0;
            }
            //Modificacion de la impresion en consola
            System.out.println("Cronómetro :" + hora + ":" + minutos + ":" + segundos);

        }

    }

}
