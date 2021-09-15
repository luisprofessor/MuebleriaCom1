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
public abstract class Mueble {
    protected String tipoMadera;
    protected String color;
    protected double precioBasico;
    protected int stock;

    public Mueble(String tipoMadera, String color, double precioBasico, int stock) {
        this.tipoMadera = tipoMadera;
        this.color = color;
        this.precioBasico = precioBasico;
        this.stock = stock;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrecioBasico() {
        return precioBasico;
    }

    public void setPrecioBasico(double precioBasico) {
        this.precioBasico = precioBasico;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    
    public abstract double calcularPrecio();
    
}
