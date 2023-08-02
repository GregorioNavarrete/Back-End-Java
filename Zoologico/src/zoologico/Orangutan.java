
package zoologico;


public class Orangutan extends Mamifero {

    private int iq;
    private boolean enPareja;

    public Orangutan(int edad, String tipoPelaje, boolean enCelo, int iq, boolean enPareja) {
        super(edad,tipoPelaje, enCelo);
        this.iq = iq;
        this.enPareja = enPareja;
    }

    public int getIq() {
        return iq;
    }

    public boolean isEnPareja() {
        return enPareja;
    }

}