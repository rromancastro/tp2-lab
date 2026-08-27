
package animal;


public class Perro extends Canino implements Domestico, Comparable<Perro> {
    
    private String raza;

    public Perro(int id, String especie, String tipoComida, String habitat, String raza) {
        super(id, especie, tipoComida, habitat);
        this.raza = raza;
    }
    
    @Override
    public void hacerRuido(){
        System.out.println(especie + "hace ruido: ¡Guau, Guau!");
    }
    
    @Override 
    public void dormir(){
        int vueltas =(int) (Math.random() * 3) + 1;
        
        for (int i = 1; i <= vueltas; i++){
            System.out.println(especie + " da una vuelta... (" + i + ")");
        }
       
        System.out.println("Zzzz... " + especie + "dormida ");
    }
    
    @Override
    public void vacunar(){
        System.out.println("Se vacuna contra el moquillo al perro" + especie );
    }
    
    public void sacarPaseo(){
        System.out.println("Sacando a pasear a " + especie + " (" + raza + "). ¡Mueve la cola de felicidad!");
    }
    
    @Override
    public int compareTo(Perro otroPerro){
        return this.raza.compareToIgnoreCase(otroPerro.getRaza());
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    @Override
    public String toString(){
         return "Perro [ID: " + id + ", Especie: " + especie + ", Raza: " + raza + ", Comida: " + tipoComida + ", Hábitat: " + habitat + "]";
    }
    
    
}


