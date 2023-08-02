
package zoologico;


public class Jaguar extends Mamifero {

    private String nombre;

    public Jaguar(int edad, String nombre,String tipoPelaje, boolean enCelo) {
        super(edad,tipoPelaje,enCelo);
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Jaguar: " + nombre;
    }
}