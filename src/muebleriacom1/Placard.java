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
public class Placard extends Mueble implements Trasladable{
    
    private int cantPuertas;
    
   public Placard(String tipoMadera, String color, double precio, int stock, int cantPuertas) {
       super(tipoMadera,color,precio,stock);
        this.cantPuertas = cantPuertas;
         
        }

    public int getCantPuertas() {
        return cantPuertas;
    }

    public void setCantPuertas(int cantPuertas) {
        this.cantPuertas = cantPuertas;
    }
    
    @Override
    public double calcularPrecio(){
        //return getPrecioBasico() + (getPrecioBasico() * 0.20);
        return precioBasico*1.20;
    }

    @Override
    public double calcularTraslado() {
        
        //To change body of generated methods, choose Tools | Templates.
        return calcularPrecio()*0.10;
    }
    
}

