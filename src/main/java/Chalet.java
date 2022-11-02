public class Chalet extends Vivienda{

    String materialConstruccion;
    Boolean aguaPotable;
    Boolean servicioAlcantarillado;
    Boolean pozoSeptico;
    Boolean internet;
    Boolean energiaElectrica;
    Boolean gasDomiciliario;

    public Chalet(String dirrecion, double valor, float area, Propietario propietario, int numeroCuartos,
                  int numeroBaños, int pisos, String materialConstruccion, Boolean aguaPotable,
                  Boolean servicioAlcantarillado, Boolean pozoSeptico, Boolean internet, Boolean energiaElectrica, Boolean gasDomiciliario) {
        super(dirrecion, valor, area, propietario, numeroCuartos, numeroBaños, pisos);
        this.materialConstruccion = materialConstruccion;
        this.aguaPotable = aguaPotable;
        this.servicioAlcantarillado = servicioAlcantarillado;
        this.pozoSeptico = pozoSeptico;
        this.internet = internet;
        this.energiaElectrica = energiaElectrica;
        this.gasDomiciliario = gasDomiciliario;
    }
}
