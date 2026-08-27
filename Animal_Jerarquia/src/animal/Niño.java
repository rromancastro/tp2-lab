
package animal;


public class Niño extends Humano {
    private Gato gato;

    public Niño(Gato gato, String nombre, int edad) {
        super(nombre, edad);
        this.gato = gato;
    }
    
 public void jugarConGato(Gato g) {
        this.gato = g;
        System.out.println("El niño " + nombre + " está jugando con el gato " + g.getEspecie() + ".");
    }

    public Gato getGato() {
        return gato;
    }

    public void setGato(Gato gato) {
        this.gato = gato;
    }
    
}
