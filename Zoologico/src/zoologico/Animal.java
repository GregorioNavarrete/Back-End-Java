
package zoologico;


public class Animal {
    //Atributos de la clase
    private String nombre;
    private String nombreCientífico;
    private boolean enPeligro;
    private int edad;
    private String habitat;
    
    // el constructor por default es provisto por Java
   
    
    
    //los get y set 
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombreCientífico() {
        return nombreCientífico;
    }

    public void setNombreCientífico(String nombreCientífico) {
        this.nombreCientífico = nombreCientífico;
    }

    public void setEnPeligro(boolean enPeligro) {
        this.enPeligro = enPeligro;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
    //metodos 
    public boolean isEnPeligro() {
        return enPeligro;
    }    
    public String obtenerNombreClase(){
        /*
            devuelve una cadena vacía por ahora.
            Puedes modificar este método según sea necesario en futuras implementaciones.
            con el polimorfismo
        */
        
        return "";
    }
}


