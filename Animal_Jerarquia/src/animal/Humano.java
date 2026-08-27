
package animal;


public class Humano {
    
    protected String nombre;
    protected int edad;
    protected Perro perro;
    
    
public Humano(String nombre, int edad) {
    this.nombre = nombre;
    this.edad = edad;
    this.perro = null;
}

public void adoptarPerro(Perro p) {
        if (this.perro == null) {
            this.perro = p;
            System.out.println("¡Adopción exitosa! " + nombre + " ha adoptado a " + p.getEspecie() + ".");
        } else {
            System.out.println(nombre + " ya tiene un perro adoptado (" + this.perro.getEspecie() + ") y no puede tener más.");
        }
    }
public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }

    public Perro getPerro() { return perro; }
    public Perro getPerrro() { return perro; }
    
    public void setPerro(Perro perro) { this.perro = perro; 
    }
}

