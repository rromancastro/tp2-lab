
package animal;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Leon extends Felino {

    public Leon (int id, String especie, String tipoComida, String habitat, double altura, double velocidad) {
        super(altura, velocidad, id, especie, tipoComida, habitat);
    }
    
    @Override
    public void hacerRuido (){
        System.out.println(especie + " ruge fuerte: ¡Roooooar! ");
    }
    
    @Override
    public void saltar() {
        pedirVelocidad(); 
        double alturaSalto = (this.velocidad * 3) + 5;
        System.out.println(especie + " realiza un increible salto de " + alturaSalto + " metros de altura.");
    }
    
    public void pedirVelocidad(){
        Scanner teclado = new Scanner(System.in);
        boolean entradaValida = false;
        
        while (!entradaValida){
            
            try {
                
                System.out.println("Ingrese la velocidad del " + especie + " (m/s): ");
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
            return "Leon [ID: " + id + ", Especie: " + especie + ",Comida:" + tipoComida + ", Habitat: " + habitat + " Altura: " + altura +", Velocidad:" + velocidad + " ]";
        }
    }

