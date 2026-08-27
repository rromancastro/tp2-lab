
package animal;

public abstract class Felino extends Animal {
   
    protected double altura;
    protected double velocidad;

    public Felino(double altura, double velocidad, int id, String especie, String tipoComida, String habitat) {
        super(id, especie, tipoComida, habitat);
        this.altura = altura;
        this.velocidad = velocidad;
    }
    
    public void rugir(){
        System.out.println(especie + " emite un rugido felino: ¡Grrrr!");
    }
   
    public abstract void saltar();

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(double velocidad) {
        this.velocidad = velocidad;
    }
    
    
}
