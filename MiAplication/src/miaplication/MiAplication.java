/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package miaplication;

/**
 *
 * @author gran_
 */
public class MiAplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Pajaro gua = new Pajaro();
        Pajaro col = new Pajaro();
        Pajaro tuc = new Pajaro(12347);
        Pajaro azu = new Pajaro(12345);
        
        gua.nombre_comun="Guacamaya";
        col.nombre_comun="Colibri";
        tuc.nombre_comun="Tucan";
        azu.nombre_comun="Azulejo";
        
        System.out.println(gua.consultarId());
        System.out.println("Codigo: "+tuc.consultarId()+" el nombre del pajaro es: "+tuc.nombre_comun);
    }
    
}
