/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mavenproject2.eva1_3_packages;

import OTROPAQUETE.Persona;

/**
 *
 * @author bisonte
 */
public class EVA1_3_PACKAGES {

    public static void main(String[] args) {
        Persona persona= new Persona();
        //persona.  // los atributos son default, no son accesibles (otro paquete)
        automovil automovil= new automovil();
        //automovil.marca //atributos son default, son accesobles ( el mismo paquete)
    }
}
