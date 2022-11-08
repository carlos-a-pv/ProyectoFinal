import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FincaRaiz {

    private List<Propiedad> propiedades;
    private List <Cliente> clientes;
    private List <Empleado> empleados;
    private List <Administrador> administradores;

    private  List <Propietario> propietarios;

    public FincaRaiz() {
        this.propiedades = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.empleados = new ArrayList<>();
        this.administradores = new ArrayList<>();
        this.propietarios = new ArrayList<>();
    }

    public List<Propietario> getPropietarios() {
        return propietarios;
    }

    public void setPropietarios(List<Propietario> propietarios) {
        this.propietarios = propietarios;
    }

    public List<Propiedad> getPropiedades() {
        return propiedades;
    }

    public void setPropiedades(List<Propiedad> propiedades) {
        this.propiedades = propiedades;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }

    public List<Administrador> getAdministradores() {
        return administradores;
    }

    public void setAdministradores(List<Administrador> administradores) {
        this.administradores = administradores;
    }
    public void registrarEmpleado(Empleado empleado, Administrador administrador) throws Exception {

        if (administrador instanceof Administrador) {
            String userId1 = empleado.getUserId();
            Empleado empleadoAux = empleados.stream().filter(empleado1 -> empleado1.getUserId() == userId1).findFirst().orElse(null);
            if (empleadoAux != null) {
                throw new Exception("La propiedad ya existe");
            } else if (empleado != null) {

                empleados.add(empleado);
            } else {
                throw new Exception("Datos invalidos");
            }
        } else {
            throw new Exception("Solo los empleados pueden registrar propiedades");

        }
    }
    public void registrarPropiedad(Propiedad propiedad, Empleado empleado) throws Exception {

        if (empleado.isEstado() == true) {
            String dirrecion1 = propiedad.getDirecion();
            Propiedad propiedaAux = propiedades.stream().filter(propiedades -> propiedades.getDirecion() == dirrecion1).findFirst().orElse(null);
            if (propiedaAux != null) {
                throw new Exception("La propiedad ya existe");
            } else if (propiedad != null) {

                propiedades.add(propiedad);
            } else {
                throw new Exception("Datos invalidos");
            }
        } else {
            throw new Exception("Solo los empleados pueden registrar propiedades");

        }
    }
    public void registrarPropietarioPropietarios(Propietario propietario,Empleado empleado) throws Exception {

        if (empleado.isEstado() == true) {
            String dirrecion1 = propietario.getNombre();
            Propietario propietarioAux = propietarios.stream().filter(propietario1 -> propietario1.getNombre() == dirrecion1).findFirst().orElse(null);
            if (propietarioAux != null) {
                throw new Exception("La propiedad ya existe");
            } else if (propietario!= null) {

                propietarios.add(propietario);
            } else {
                throw new Exception("Datos invalidos");
            }
        } else {
            throw new Exception("Solo los empleados pueden registrar propiedades");

        }
    }
    public void registrarCliente (Cliente cliente,Empleado empleado)throws Exception{

    if (empleado.isEstado() == true) {
        String dirrecion1 = empleado.getUserId();
        Empleado propietarioAux = empleados.stream().filter(empleado1 -> empleado1.getNombre() == dirrecion1).findFirst().orElse(null);
        if (propietarioAux != null) {
            throw new Exception("La propiedad ya existe");
        } else if (cliente!= null) {

            clientes.add(cliente);
        } else {
            throw new Exception("Datos invalidos");
        }
    } else {
        throw new Exception("Solo los empleados pueden registrar propiedades");

        }
    }

    public void alquilar (Propiedad propiedad){


    }
    public void vender (Propiedad propiedad){


    }
    public void retirarPropiedad (Propiedad propiedad){

    				
    }
    public void registrarTransacciones (){


    }
    public List<String> buscarPropiedad(String propiedad){

        return propiedades.stream().map( (propiedad1) -> {
            return propiedad1.getClass().getSimpleName();
        }).filter( (propiedad1)-> {
            return propiedad1.equalsIgnoreCase(propiedad);
        }).collect(Collectors.toList());
    }
    public void alquilar(){

    	

    }
    public void comprar(Propiedad propiedad){

    	propiedades.remove(propiedad);

    }
    public void registrarEmpleado(Empleado empleado, Exception e){

    	empleados.add(empleado);


    }
    public void visualizarReportes (DateFormat periodo, Exception e){


    }
    public void bloquearCuenta(Empleado empleado){
    	
    	empleados.remove(empleado);
    	
    }
    public void actualizarDatosEmpleado(String nombre, String userId, String password){
    	
    	int index=empleados.indexOf(empleados.stream().filter(empleado1 ->empleado1.getNombre().equals(nombre)).findFirst().get());
    	Empleado empleado=new Empleado(nombre,userId,password);
    		
    	//empleado.setNombre(nombre);
        empleado.setUserId(userId);
        empleado.setPassword(password);
        empleados.set(index, empleado);
           
        //final
    }
}
