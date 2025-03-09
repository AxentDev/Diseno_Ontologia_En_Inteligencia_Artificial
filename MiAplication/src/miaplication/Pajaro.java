/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package miaplication;

/**
 *
 * @author gran_
 */
public class Pajaro {
    public double tamano;
    public double peso;
    public double altura;
    public String tipo;
    public char genero;
    public String especie;
    public String subespecie;
    public String ubicacion;
    public String nombre_comun;
    public boolean volador;
    private int id;

    public Pajaro(int id) {
        this.id = id;
    }
    
    public Pajaro(){
        this.id = 555;
    }
    
    public int consultarId()
    {
        return this.id;
    }
    
}
