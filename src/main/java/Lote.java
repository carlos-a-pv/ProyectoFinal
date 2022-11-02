public class Lote extends Propiedad{
    String zona;

    public Lote(String dirrecion, double valor, float area, Propietario propietario, String zona) {
        super(dirrecion, valor, area, propietario);
        this.zona = zona;
    }
}
