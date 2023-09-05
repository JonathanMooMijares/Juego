public class EntradaJuego {
    protected String nombre;
    protected int puntación;

    public EntradaJuego(String n, int p){
        nombre=n;
        puntación=p;
    }
    public String getNombre(){
        return nombre;
    }
    public int getPuntuacion(){
        return puntación;
    }
    public String toString(){
        return "(" + nombre + "," + puntación + ")";
    }
}