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
public class MuebleriaCom1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //UpCasting
        //Mueble m1=new Placard("roble","negro",15000,2,4);
       // Mueble m1=null;//
        //m1=new Mesa("roble","verde",7000,3);
        //DownCasting
        //m1=new Placard("roble","marrón",20000,2,4);
        //System.out.println("Precio Pub"+m1.calcularPrecio());
        
        
        
        
        
        
        /*if(m1 instanceof Placard){
                Placard m2=(Placard)m1;
                m2.getCantPuertas();
        }*/
        
        Trasladable tras=new Escritorio("roble","rojo",2000,3,4);
        System.out.println("Traslado "+tras.calcularTraslado());
        if(tras instanceof Escritorio){
                    Escritorio es=(Escritorio)tras;
                    System.out.println("Tipo de Madera "+es.getTipoMadera());
        }
        
    }
    
}
