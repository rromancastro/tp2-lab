
package animal;


public class Canino extends Animal {

    public Canino(int id, String especie, String tipoComida, String habitat) {
        super(id, especie, tipoComida, habitat);
    }
    
    public void ladrar (){
        System.out.println(especie + " dice ¡Barf Barf!");
    }
    
}
