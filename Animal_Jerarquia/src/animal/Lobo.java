
package animal;


public class Lobo extends Canino {

    public Lobo(int id, String especie, String tipoComida, String habitat) {
        super(id, especie, tipoComida, habitat);
    }
    
    @Override
        public void ladrar (){
            System.out.println(especie + " dice: ¡Barf, Barf! ");
        }
        
    public void aullar(){
        
    int cantU = (int) (Math.random() * (10 - 4 + 1)) + 4; 

    StringBuilder aullido = new StringBuilder("A");
        for (int i = 0; i < cantU; i++) {
            aullido.append("u");
        }
        System.out.println(especie + " aúlla: ¡" + aullido.toString() + "!");
    }

    @Override
    public void hacerRuido() {
        System.out.println(especie + " emite un sonido ambiental en su hábitat: " + habitat + ".");
        aullar(); 
    }

    @Override
    public String toString() {
        return "Lobo [ID: " + id + ", Especie: " + especie + ", Comida: " + tipoComida + ", Hábitat: " + habitat + "]";
    }
}
