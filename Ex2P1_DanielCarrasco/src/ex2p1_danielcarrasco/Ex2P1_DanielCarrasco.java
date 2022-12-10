/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex2p1_danielcarrasco;

import java.util.Random;
import java.util.Scanner;

public class Ex2P1_DanielCarrasco {

    public static void main(String[] args) {

        Stardew();

    }

    public static void Stardew() {
        System.out.println("Bienvenidx a Stardew Valley");
        boolean finalJ = true;
        Scanner ninetales = new Scanner(System.in);
        
        int contD = 0;

        do {
            System.out.println("--------------------------");
            System.out.println("-----Menu de acciones-----");
            System.out.println("1-. Plantar cosechas");
            System.out.println("2-. Cosechar");
            System.out.println("3-. Conseguir animales");
            System.out.println("4-. Vender cosas");
            System.out.println("5-. Dormir");
            System.out.println("6-. Ciudad?");
            System.out.println("--------------------------");
            int ops = ninetales.nextInt();
            
            switch (ops){
                case 1:
                    System.out.println("------Dias de juego: "+contD+"------");
                    System.out.println("Es hora de ponernos manos a la obra con esos cultivos");
                    System.out.println("Es hora de plantar unos vegetales finos");
                    System.out.println("Venga, tu puedes chik");
                    
                    contD++;
                    System.out.println("-----Dias trascurridos: "+contD);
                    break;
                case 2:
                    
                    contD++;
                    break;
                case 3:
                    
                    contD++;
                    break;
                case 4:
                    contD++;
                    break;
                case 5:
                    
                    contD++;
                    break;
                case 6:
                    finalJ = false;
                    contD++;
                    break;
                default:
                    
                    System.out.println("Ingresaste una opcion incorrecta asi que te confundiste y te dormiste");
                    contD++;
                    System.out.println("-----Dias trascurridos: "+contD);
                    break;
            }
            
            //If dias por que al llegar a 10 dias termina
            
            if (contD>=11){
              finalJ = false;  
            }
            System.out.println("--------------------------");
        } while (finalJ == true);
        //Yo quería hacer dos finales jajajaj
        int max = 2;
        int min = 1;
        int random = new Random().nextInt((max - min) + 1) + min;

        if (random == 1) {
            System.out.println("--------Final Malo--------");
            System.out.println("Despues de pasar mucho tiempo cuidando a tus animales decidiste tomar un nuevo camino asi que tomaste un tren a la ciudad");
            System.out.println("Gran error, todos los animales que vendiste cobraron venganza por hacerlos carnitas");
            System.out.println("Ahora has sido atacado por un conejo rabioso en la estacion del tren y te has desmayado en las vias");
            System.out.println("Fin del juego...");
        } else {
            System.out.println("--------Final Bueno--------");
            System.out.println("De camino a la ciudad encontraste al amor de tu vida");
            System.out.println("Ahora tienes una casa, una familia y todo el dinero necesario");
            System.out.println("Tus animales fueron liberados despues de tu partida");
            System.out.println("Fin del juego!!");
        }

    }

}
