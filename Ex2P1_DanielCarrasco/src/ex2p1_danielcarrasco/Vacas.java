/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_danielcarrasco;

import java.util.Scanner;
import java.util.ArrayList;


public class Vacas {

    String nombreV;
    int precioV;

    public Vacas(String nombreV, int precioV) {
        this.nombreV = nombreV;
        this.precioV = precioV;
    }
    
    //Se intenta
    
    public ArrayList<String> getVacas(String nombreV){
        Scanner nine = new Scanner(System.in);
        ArrayList<String> Vacas = new ArrayList();
        System.out.println("Comprando vacas?");
        System.out.println("Hola, bienvenido ingresa el nombre de tu nueva vaquita: ");
        nombreV= nine.nextLine();
        Vacas.add(nombreV);
        System.out.println("Tienes una nueva vaca!!");
        
        return Vacas;
    }

    public String getNombreV() {
        return nombreV;
    }

    public void setNombreV(String nombreV) {
        this.nombreV = nombreV;
    }

    public int getPrecioV() {
        return precioV;
    }

    public void setPrecioV(int precioV) {
        this.precioV = precioV;
    }


}
