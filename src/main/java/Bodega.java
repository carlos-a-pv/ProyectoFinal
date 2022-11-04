public class Bodega extends Propiedad{
    String zona;
    String nombre;
    public Bodega(String dirrecion, double valor, float area, Propietario propietario, String zona) {
        super(dirrecion, valor, area, propietario);
        this.zona = zona;
    }
}
