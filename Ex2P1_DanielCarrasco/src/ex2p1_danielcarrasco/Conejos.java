/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ex2p1_danielcarrasco;

import java.util.ArrayList;
import java.util.Scanner;

public class Conejos {
    String nombreC;
    int precioC;

    public Conejos(String nombreC, int precioC) {
        this.nombreC = nombreC;
        this.precioC = precioC;
    }
    
    public ArrayList<String> getConejos(String nombreV){
        Scanner ninet = new Scanner(System.in);
        ArrayList<String> Conejos = new ArrayList();
        System.out.println("Comprando conejos?");
        System.out.println("Hola, bienvenido ingresa el nombre de tu nuevo conej: ");
        nombreV= ninet.nextLine();
        Conejos.add(nombreC);
        System.out.println("Tienes un conejito!!");
        
        return Conejos;
    }

    public String getNombreC() {
        return nombreC;
    }

    public void setNombreC(String nombreC) {
        this.nombreC = nombreC;
    }

    public int getPrecioC() {
        return precioC;
    }

    public void setPrecioC(int precioC) {
        this.precioC = precioC;
    }
    
    
}
