
package animal;


public class  Animal {

    protected int id;
    protected String especie;
    protected String tipoComida;
    protected String habitat;

    public Animal(int id, String especie, String tipoComida, String habitat) {
        this.id = id;
        this.especie = especie;
        this.tipoComida = tipoComida;
        this.habitat = habitat;
    }
    
    public void hacerRuido() {
    }
    
    public void comer (){
    }
    
    public void dormir (){
        System.out.println("Zzzz... " + especie + "Dormida");
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getTipoComida() {
        return tipoComida;
    }

    public void setTipoComida(String tipoComida) {
        this.tipoComida = tipoComida;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    
    
}
