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
public class Escritorio extends Mueble implements Trasladable{
    
    private int cantDeCajones;

    public Escritorio(String tipoMadera,String color, double precio,int stock,int cajones) {
        super(tipoMadera,color,precio,stock);
        this.cantDeCajones = cajones;
    }

    @Override
    public double calcularPrecio() {
       return this.precioBasico+(cantDeCajones*100);
    }

    public int getCantDeCajones() {
        return cantDeCajones;
    }

    public void setCantDeCajones(int cantDeCajones) {
        this.cantDeCajones = cantDeCajones;
    }
    
    @Override
    public double calcularTraslado(){
    
        return calcularPrecio()*0.10;
    }
    
}

