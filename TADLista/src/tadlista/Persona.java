package tadlista;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gran_
 */
public class Persona
{


    private String nombre;
    private int edad;
    private float peso;
    public String direccion="Hola a todos";
    
        //Establezco los contructores
        public Persona(String n) 
        {
        nombre = n;
        }

        public Persona(String n, int e, float p)
        {
            nombre = n; edad = e; peso = p;
        }

        public Persona () {}//Constructor por defecto
 
    //Ahora establezco los metodos
    public float andar (int dist)
    {
        boolean valor = true;
        int con =0;
        while(valor==true)
                {
                    if (dist>20 && con!=dist)
                    {
                        System.out.println("Contador igual a "+con);
                        con++;
                    }
                    else
                    {
                            valor=false;
                    }
                }
    
        
    return 0;
    }
    public void hablar (String texto, int dos)
    {
    //implementación
    
        if(edad ==40 || peso >dos)
        {
            System.out.println(texto+" me llamo "+nombre);
        }
        else
        {
            System.out.println("Es menor que 20");
        }
    }
    public String digerir ()
    {
        return "ya termine el for";
    /*implementación
        for (int y=0;y<5 && y>0;y++)
        {
            System.out.println("Empiezo el ciclo en "+y);
        }
        System.out.println("Ya termine el for");
        */
    }
}
