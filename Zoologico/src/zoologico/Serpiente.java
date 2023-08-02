
package zoologico;


public class Serpiente extends Reptil {

    //atributo de la clase
    private String nombre;

    //el constructor
    public Serpiente(int edad, String nombre, boolean escamas, boolean carnivoro) {
        /*
        para llamar al constructor de la clase base Reptil y pasar los parámetros edad, escamas y carnivoro a dicho constructor.
        */
        super(edad,escamas, carnivoro);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        //modifico el metodo heredado 
        return "Serpiente: " + nombre;
    }
}
