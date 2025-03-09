/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tadlista;

/**
 *
 * @author gran_
 */
public class TADLista {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        TADCaracter obj=new TADCaracter();
        // obj.setCaracter("-----*-----");
        // obj.setNombre("Asterisco");
        // obj.setTamaño("10");
        
        // obj.mostrarcaracter();
        
        TADCaracter caracter[]= new TADCaracter[5];
        char caracter1[]= {'*','-','&',')','+'};
        
        Persona p1=new Persona();
        Persona p2=new Persona();
        Persona p3=new Persona();
        Persona p4=new Persona();
        Persona p5=new Persona();
                
        Persona matrix[][]={{p1,p2,p3,p4,p5},{p1,p2,p3,p4,p5},{p1,p2,p3,p4,p5},{p1,p2,p3,p4,p5}};
        
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                System.out.print(matrix[i][j].digerir());
            }
        System.out.println();
        }

        /*
        for(int h=0;h<5;h++)
        {
            System.out.print(caracter1[h]); 
            if(caracter1[h]=='-')
            {
                caracter1[h]='#';
                
            }
        }
        System.out.println(caracter1);   
       */
    }
    


}
