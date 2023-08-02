
package zoologico;


public class Reptil extends Animal {

    //Declaro los atributos
    private boolean escamas;
    private boolean carnivoro;

    public Reptil(int edad, boolean escamas, boolean carnivoro) {
        super();// para llamar al constructor de la clase base Animal
        super.setEdad(edad);
        this.escamas = escamas;
        this.carnivoro = carnivoro;
    }

    public boolean isEscamas() {
        return escamas;
    }

    public boolean isCarnivoro() {
        return carnivoro;
    }
    
    @Override
    public String obtenerNombreClase(){
        return "Reptil";
    }
}