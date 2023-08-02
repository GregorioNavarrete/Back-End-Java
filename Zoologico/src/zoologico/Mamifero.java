
package zoologico;


public class Mamifero extends Animal {
    //Mamifero como una subclase de Animal

    //declaro los atributos de la clase
    private String tipoPelaje;
    private boolean enCelo;

    //delaro el constructor de la clase
    public Mamifero(int edad, String tipoPelaje, boolean enCelo) {
        super();// para llamar al constructor de la clase base Animal
        super.setEdad(edad);
        this.tipoPelaje = tipoPelaje;
        this.enCelo = enCelo;
    }

    public boolean isEnCelo() {
        return enCelo;
    }

    public void setEnCelo(boolean enCelo) {
        this.enCelo = enCelo;
    }

    public String getTipoPelaje() {
        return tipoPelaje;
    }

    
    /*
        Se anula el método obtenerNombreClase heredado de la clase Animal para devolver la cadena "Mamifero".
        Esta es una implementación personalizada del método en la subclase
    */
    @Override
    public String obtenerNombreClase(){
        return "Mamifero";
    }

}
 