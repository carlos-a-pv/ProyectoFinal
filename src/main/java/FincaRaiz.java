import java.lang.reflect.Array;
import java.text.DateFormat;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class FincaRaiz {

    private List<Propiedad> propiedades;
    private List <Cliente> clientes;
    private List <Empleado> empleados;
    private List <Administrador> administradores;
    private List<Transaccion> transacciones;

    public FincaRaiz(){
        propiedades = new ArrayList<>();
        empleados = new ArrayList<>();
        clientes = new ArrayList<>();
        administradores = new ArrayList<>();
        transacciones = new ArrayList<>();
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
    public void registrarPropiedad(Propiedad propiedad, Usuario usuario) throws Exception {

        if (usuario instanceof Empleado) {
            String dirrecion1 = propiedad.getDirecion();
            Propiedad propiedaAux = propiedades.stream().filter(propiedades -> propiedades.getDirecion() == dirrecion1).findFirst().orElse(null);
            if (propiedaAux != null) {
                throw new Exception("La propiedad ya existe");
            } else if (propiedad != null) {

                propiedades.add(propiedad);
            
            } else {
                throw new Exception("Datos invalidos");
            }
        }
        else {
            throw new Exception("Solo los empleados pueden registrar propiedades");

        }
        }
    public void registrarPropietarioPropietarios(Propietario propietario,Exception e){


    }
    public void registrarCliente (Cliente cliente,Exception e){


    }
    public void alquilar (Propiedad propiedad,Exception e){


    }
    public void vender (Propiedad propiedad,Exception e){


    }
    public void retirarPropiedad (Propiedad propiedad){
    	
    	


    }
    public void registrarTransacciones (Empleado empleado, Cliente cliente, Propiedad propiedad){
    	
    	
    	Propiedad propiedadDisponible = this.obtenerPropiedad(propiedad.getDirecion());
    	
    	if(propiedadDisponible == null) {
    		System.out.println("esta propiedad no existe");
    	}
    	else {
    		if(propiedadDisponible.isDisponible()) {
        		System.out.println("la propiedad ya esta ocupada "+propiedad.getDirecion());
        	}
        	else {
        		Transaccion transaccion = new Transaccion(empleado, cliente, propiedad);
        		transacciones.add(transaccion);
        		
        		propiedadDisponible.setDisponible(false);
        	}
    	}
    	
    }
    
    public ArrayList<ReporteVentasPorEmpleado> visualizarReporte(LocalDateTime fechaInicio, LocalDateTime fechaFinal, String idEmpleado){
    	ArrayList<ReporteVentasPorEmpleado> listaReporte = new ArrayList<ReporteVentasPorEmpleado>();
    
    	ArrayList<Transaccion> listaTransaccionRango =  (ArrayList<Transaccion>) transacciones.stream().filter(transaccion -> (
    			  
    			  transaccion.getEmpleado().getUserId().equals(idEmpleado) &&
    			  (transaccion.getFechaRegistro().isAfter(fechaInicio) || transaccion.getFechaRegistro().equals(fechaInicio))
    			  &&
    			  (transaccion.getFechaRegistro().isBefore(fechaFinal) || transaccion.getFechaRegistro().equals(fechaFinal))
    			  )).collect(Collectors.toList());
    	
    	//Devuelve los datos de un empleado, Busca por id y por rango de fechas y devuelve una lista de transacciones por ejemplo ventas y alquileres de casas 
    	
    	
    	if(listaTransaccionRango.size() > 0) {
    		ReporteVentasPorEmpleado ventas = new ReporteVentasPorEmpleado(); //Aqui instancio el empleado con 
        	ventas.setNombreEmpleado(listaTransaccionRango.get(0).getEmpleado().getNombre()); //Con esto accedo al primer registro que sería el nombre del empleado, siempre sera el mismo porque se filtro por un solo id
        	int cantidadVentas = 0;
        	double total = 0;
        	for (Transaccion transac : listaTransaccionRango) {
        		total += transac.getPropiedad().getValor();
        		cantidadVentas++;
    		}

        	ventas.setCantidadPropiedades(cantidadVentas);
        	ventas.setTotal(total);
        	listaReporte.add(ventas);
    	}

    	
    	return listaReporte;
    }


    
   public Propiedad obtenerPropiedad(String direccion){
    	
        return  propiedades.stream().filter(propiedad -> propiedad.getDirecion().equals(direccion)).findFirst().orElse(null);
        
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
    public void registrarEmpleado(Empleado empleado, Exception e) {
    	empleados.add(empleado);
    }
    public void bloquearCuenta(Usuario usuario,Empleado empleado){

    	//empleados.remove(empleado);
    	
    	if (usuario instanceof Administrador) {
            Empleado empleadoAux = empleado;
            empleado = empleados.stream().filter(empleados -> empleados.getUserId() == empleadoAux.getUserId()).findFirst().orElse(null);
    	
    	
    		if (usuario instanceof Administrador) {
    		empleado.setEstado(false);
    		}
    		else {
    			System.out.println("Solo los administradores pueden bloquear cuentas");
    		}
    	}
    }
    public void actualizarDatosEmpleado(Usuario usuario, Empleado empleado, String nombre, String userId, String password, boolean estado) throws Exception {

    	
    	
        if (usuario instanceof Administrador) {
            Empleado empleadoAux = empleado;
            empleado = empleados.stream().filter(empleados -> empleados.getUserId() == empleadoAux.getUserId()).findFirst().orElse(null);
            if (empleado != null) {
                empleado.setNombre(nombre);
                empleado.setUserId(userId);
                empleado.setPassword(password);
                empleado.setEstado(estado);
            }
        } else {
            throw new Exception("Solo los administradores pueden actualizar empleados");
        }
    }
    
}


