import java.time.format.DateTimeFormatter;
import java.util.List;

public class Reporte extends Administrador {
  DateTimeFormatter fecha;
  Empleado vendedor;
  double valorNegocio;
  List <Empleado> registroVentas;

 public Reporte(String nombre, String userId, String password, DateTimeFormatter fecha, Empleado vendedor
         , double valorNegocio, List<Empleado> registroVentas,Rol cargo) {
  super(nombre, userId, password);
  this.fecha = fecha;
  this.vendedor = vendedor;
  this.valorNegocio = valorNegocio;
  this.registroVentas = registroVentas;
 }

 public DateTimeFormatter getFecha() {
  return fecha;
 }

 public void setFecha(DateTimeFormatter fecha) {
  this.fecha = fecha;
 }

 public Empleado getVendedor() {
  return vendedor;
 }

 public void setVendedor(Empleado vendedor) {
  this.vendedor = vendedor;
 }

 public double getValorNegocio() {
  return valorNegocio;
 }

 public void setValorNegocio(double valorNegocio) {
  this.valorNegocio = valorNegocio;
 }

 public List<Empleado> getRegistroVentas() {
  return registroVentas;
 }

 public void setRegistroVentas(List<Empleado> registroVentas) {
  this.registroVentas = registroVentas;
 }
}
