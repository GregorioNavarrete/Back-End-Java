package zoologico;


import java.util.ArrayList;
import java.util.List;

class Jaula<T> {
    /*
        Se define la clase Jaula con un parámetro de tipo genérico T.
        trabajar con diferentes tipos de objetos.
    */
     private List<T> animales;
     /*
        Se declara una variable miembro llamada animales de tipo List<T> para almacenar los animales en la jaula.
        Esta lista contendrá elementos del tipo especificado por el parámetro genérico T.
     */
     
     //costructor
    public Jaula() {
        // inicializa la lista animales como una instancia de ArrayList.
        this.animales= new ArrayList<>();
    }

    
    
    
    //get y set
    public List<T> getAnimales() {
        return animales;
    }
    public void setAnimales(List<T> animales) {
        this.animales = animales;
    }

    
    
    
    
    //metodos de la clase
    public void asignarAnimal(T animal) {
        //agrega el animal a la lista
        animales.add(animal);

    }

//    public void asignarAnimal(Serpiente animal) {
//        animales.add(animal);
//
//    }
 
    public void eliminarAnimal(T animal) {
        //elimina el animal de la lista
        animales.remove(animal);
    }

    public void mostrarAnimales() {
        /*
        utilizando un bucle for-each e imprime cada animal en la consola utilizando el método toString.
        */
        for(T animal: animales){
            System.out.println(animal.toString());
            }
        }
    
    public String obtenerNombreClase(){
        //devuelve el nombre de la clase Jaula.
        return this.obtenerNombreClase();
    }
}