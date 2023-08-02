package zoologico;

public class Zoologico {
    //declaran dos variables miembro jaguares y serpientes de tipo Jaula<Animal>
    Jaula<Animal> jaguares;
    Jaula<Animal> serpientes;
    
    public static String compararAnimales(Jaula<Animal> anim1, Jaula<Animal> anim2) {
        /*
        toma dos objetos de tipo Jaula<Animal> 
        y compara las edades de los animales en ambas jaulas para determinar cuál es el animal más viejo
        */
        
        
        // Modifique el metodo para hacer las pruebas
        Animal mayor = null;
        
        for (Animal a : anim1.getAnimales()) {
            if(mayor == null || a.getEdad() > mayor.getEdad()) {
                mayor = a;
            }
        }
        for (Animal a : anim2.getAnimales()) {
            if(mayor == null || a.getEdad() > mayor.getEdad()) {
                mayor = a;
            }
        }

        return "El animal mas viejo entre " + anim1.getAnimales().get(0).obtenerNombreClase() + "\ny " + anim2.getAnimales().get(0).obtenerNombreClase() + "\nes " + mayor.toString() + " , y tiene: " + mayor.getEdad();
    
    }

    public void imprimirResultado() {
        
        ejecutarPruebasGenericidad();
    }

    
    
    public void ejecutarPruebasGenericidad() {
        //crea la jaula con 2 jaguares
        jaguares = new Jaula<>();
        Jaguar j1 = new Jaguar(10,"Pancho", "liso", true);
        Jaguar j2 = new Jaguar(8,"Lila", "rubio", false);
        jaguares.asignarAnimal(j1);
        jaguares.asignarAnimal(j2);
        jaguares.mostrarAnimales();
        
        //crea la jaula con 2 sepientes
        serpientes = new Jaula<>();
        Serpiente s1 = new Serpiente(20,"Lalo", true, false);
        Serpiente s2 = new Serpiente(7,"Pirincha", false, true);
        serpientes.asignarAnimal(s1);
        serpientes.asignarAnimal(s2);
        serpientes.mostrarAnimales();
        System.out.println(compararAnimales(jaguares, serpientes));
 
    }
}
