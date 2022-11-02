public class Casa extends Vivienda{
    String materialConstruccion;

    public Casa(String dirrecion, double valor, float area, Propietario propietario, int numeroCuartos, int numeroBaños, int pisos, String materialConstruccion) {
        super(dirrecion, valor, area, propietario, numeroCuartos, numeroBaños, pisos);
        this.materialConstruccion = materialConstruccion;
    }
}
