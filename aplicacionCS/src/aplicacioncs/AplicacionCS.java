/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacioncs;

/**
 *
 * @author Gomez_Rivera
 */
public class AplicacionCS {

    private static formulario formulario;
    private static personas personas[];
    private static int contador;
    
    public static void main(String[] args) {
        formulario=new formulario();
        personas=new personas[100];
        
        for(int i=0; i<100; i++){
            personas[i]=new personas();
        }
        contador=0;
        
        formulario.setVisible(true);
                       
    }
    public static void guardar(String n, String a, String d, int t, String o){
        //nombre n, apellido a, direccion d, telefono t, observaciones o
        personas[contador].setNombre(n);
        personas[contador].setApellido(a);
        personas[contador].setDireccion(d);
        personas[contador].setTelefono(t);
        personas[contador].setObservaciones(o);
        
        contador ++;
        
    }
    public static void buscar(String bus){
        for(int j=0; j < personas.length; j++){
            if(personas[j].getNombre().equals(bus)){
                formulario.cargardatos(personas[j]);
            }
        }
    }
}
