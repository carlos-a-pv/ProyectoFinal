public class Vivienda extends Propiedad{
    int numeroCuartos;
    int numeroBaños;
    int pisos;

    public Vivienda(String dirrecion, double valor, double area,
                    Propietario propietario, int numeroCuartos, int numeroBaños, int pisos, Disponibilidad disponibilidad) {
        super(dirrecion, valor, area, propietario, disponibilidad);
        this.numeroCuartos = numeroCuartos;
        this.numeroBaños = numeroBaños;
        this.pisos = pisos;
    }
}
