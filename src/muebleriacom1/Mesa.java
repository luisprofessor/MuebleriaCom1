/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package muebleriacom1;

/**
 *
 * @author Javier
 */
public class Mesa extends Mueble {

    public Mesa(String tipoMadera, String color, double precioBasico, int stock) {
        super(tipoMadera, color, precioBasico, stock);
    }

    @Override
    public double calcularPrecio() {
        return precioBasico*1.10;
    }
    
}
