
package animal;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Gato extends Felino implements Domestico {
    private String raza;
    
    
public Gato(int id, String especie, String tipoComida, String habitat, double altura, double velocidad) {
    super(altura, velocidad, id, especie, tipoComida, habitat);
    }
    
    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public void rugir (){
        System.out.println(especie + "dice: ¡Miauuu! ");
    }
    
    @Override
    public void saltar() {
        pedirVelocidad(); 
        double alturaSalto = this.velocidad + 1;
        System.out.println(especie + " realiza un salto de " + alturaSalto + " metros de altura (desde el suelo).");
    }
    
    public void pedirVelocidad(){
        Scanner teclado = new Scanner(System.in);
        boolean entradaValida = false;
        
        while (!entradaValida){
            
            try {
                
                System.out.println("Ingrese la velocidad de salto praa " + especie + " (m/s): ");
                this.velocidad = teclado.nextDouble();
                if (this.velocidad < 0){
                    System.out.println("La velocidad no puede ser negativa Reintente.");
                }else {
                    entradaValida = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: ¡Tipo de dato incorrecto! Ingrese un número decimal (use la coma ',' si es necesario).");
                teclado.next(); 
            }
        }
    }            
    
    @Override
    public void vacunar (){
    Scanner teclado = new Scanner (System.in);
    int opcion = 0; 
    boolean seleccionValida = false; 
    
        System.out.println("\n--- Menu vacunacion para Gatos ---");
        System.out.println("Seleccione la vacuna para "+ especie + ":");
        System.out.println("1 - Sarna");
        System.out.println("2 - Cancha");
        System.out.println("3 - Parásitos");
        
        while (!seleccionValida) {
            try {
                System.out.println("Ingrese una opcion (1-3): ");
                opcion = teclado.nextInt();
                if (opcion >=1 && opcion <= 3){
                seleccionValida = true;
                }else{
                    System.out.println("opcion incorrecta. Ingrese un valor entre 1 y 3.");
                }
                
                
            }catch (InputMismatchException e){
                System.out.println("Error: Debe ingresar un numero entero. ");
                teclado.next();
            }
        }
        switch (opcion){
            case 1:
                System.out.println(" El " + especie + " ha sido vacunado con exito contra la Sarna!");
                break;
            case 2:
                System.out.println(" El " + especie + " ha sido vacunado con exito contra la Cancha!");
                break;
            case 3:
                System.out.println(" El " + especie + " ha sido vacunado con exito contra la Parasito!");
                break;
        }
    }
    @Override
    public String toString() {
        return "Gato [ID: " + id + ", Especie: " + especie + ", Raza: " + raza + ", Comida: " + tipoComida + ", Hábitat: " + habitat + ", Altura: " + altura + ", Velocidad: " + velocidad + "]";
    }
}
   


