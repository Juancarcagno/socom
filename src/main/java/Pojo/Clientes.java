package Pojo;
// Generated 19/06/2015 12:59:55 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Clientes generated by hbm2java
 */
public class Clientes  implements java.io.Serializable {


     private Integer idCliente;
     private String apellido;
     private String nombre;
     private String direccion;
     private String telefono;
     private String email;
     private Set<Facturas> facturases = new HashSet<Facturas>(0);
     private Set<Usuarios> usuarioses = new HashSet<Usuarios>(0);

    public Clientes() {
    }

	
    public Clientes(String apellido, String nombre, String direccion) {
        this.apellido = apellido;
        this.nombre = nombre;
        this.direccion = direccion;
    }
    public Clientes(String apellido, String nombre, String direccion, String telefono, String email, Set<Facturas> facturases, Set<Usuarios> usuarioses) {
       this.apellido = apellido;
       this.nombre = nombre;
       this.direccion = direccion;
       this.telefono = telefono;
       this.email = email;
       this.facturases = facturases;
       this.usuarioses = usuarioses;
    }
   
    public Integer getIdCliente() {
        return this.idCliente;
    }
    
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getEmail() {
        return this.email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    public Set<Facturas> getFacturases() {
        return this.facturases;
    }
    
    public void setFacturases(Set<Facturas> facturases) {
        this.facturases = facturases;
    }
    public Set<Usuarios> getUsuarioses() {
        return this.usuarioses;
    }
    
    public void setUsuarioses(Set<Usuarios> usuarioses) {
        this.usuarioses = usuarioses;
    }




}


