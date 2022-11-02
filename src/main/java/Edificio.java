public class Edificio extends Propiedad{
        int numeropisos;

        public Edificio(String dirrecion, double valor, float area, Propietario propietario, int numeropisos) {
                super(dirrecion, valor, area, propietario);
                this.numeropisos = numeropisos;
        }
}
