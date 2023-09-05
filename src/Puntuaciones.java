public class Puntuaciones {
    public static final int maxEntradas=3;
    protected int numEntradas;
    protected EntradaJuego[] entradas;

    public Puntuaciones(){
        entradas=new EntradaJuego[maxEntradas];
        numEntradas=0;
    }

    public String toString() {
        String s = "[";
        for (int i = 0; i < numEntradas; i++) {
            if (i > 0) s += " , ";
            s += entradas[i];
        }
        return s + "]";

    }

    public void add (EntradaJuego e) {
        int nuevaPuntacion = e.getPuntuacion();
        if (numEntradas == maxEntradas){
            if (nuevaPuntacion <= entradas [numEntradas -1].getPuntuacion() )
                return;
        }
        else
            numEntradas++;
        int i=numEntradas-1;
        for (; (i>=1) && (nuevaPuntacion > entradas[i-1].getPuntuacion()); i--)
            entradas[i]=entradas[i-1];
        entradas[i] = e;
    }

    public EntradaJuego remove (int i) throws IndexOutOfBoundsException {
        if ((i<0) || (i >= numEntradas))
            throw new IndexOutOfBoundsException("Indice no valido: " + i);
        EntradaJuego temp = entradas[i];
        for (int j=i; j<numEntradas -1; j++)
            entradas[j] = entradas[j+1];
        entradas[ numEntradas -1] = null;
        numEntradas--;
        return temp;
    }
}