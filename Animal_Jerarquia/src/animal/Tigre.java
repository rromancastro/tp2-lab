
package animal;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Tigre extends Felino {

    public Tigre (double altura, double velocidad, int id, String especie, String tipoComida, String habitat) {
        super(altura, velocidad, id, especie, tipoComida, habitat);
    }
    
    @Override
    public void hacerRuido (){
        System.out.println(especie + " Gruñe: ¡Grrrr...! ");
    }
    
    @Override
    public void saltar() {
        pedirVelocidad(); 
        double alturaSalto = (this.velocidad * 2) + 10;
        System.out.println(especie + " realiza un increible salto de " + alturaSalto + " metros de altura.");
    }
    
    public void pedirVelocidad(){
        Scanner teclado = new Scanner(System.in);
        boolean entradaValida = false;
        
        while (!entradaValida){
            
            try {
                
                System.out.println("Ingrese la velocidad de asecho para el " + especie + " (m/s): ");
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
        public String toString(){
            return " Tigre [ID: " + id + ", Especie: " + especie + ",Comida:" + tipoComida + ", Habitat: " + habitat + " Altura: " + altura +", Velocidad:" + velocidad + " ]";
        }
    }
