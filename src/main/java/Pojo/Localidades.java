package Pojo;
// Generated 19/06/2015 12:59:55 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Localidades generated by hbm2java
 */
public class Localidades  implements java.io.Serializable {


     private Integer idLocalidad;
     private Provincias provincias;
     private String nombre;
     private Set<Sucursales> sucursaleses = new HashSet<Sucursales>(0);

    public Localidades() {
    }

	
    public Localidades(Provincias provincias, String nombre) {
        this.provincias = provincias;
        this.nombre = nombre;
    }
    public Localidades(Provincias provincias, String nombre, Set<Sucursales> sucursaleses) {
       this.provincias = provincias;
       this.nombre = nombre;
       this.sucursaleses = sucursaleses;
    }
   
    public Integer getIdLocalidad() {
        return this.idLocalidad;
    }
    
    public void setIdLocalidad(Integer idLocalidad) {
        this.idLocalidad = idLocalidad;
    }
    public Provincias getProvincias() {
        return this.provincias;
    }
    
    public void setProvincias(Provincias provincias) {
        this.provincias = provincias;
    }
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Set<Sucursales> getSucursaleses() {
        return this.sucursaleses;
    }
    
    public void setSucursaleses(Set<Sucursales> sucursaleses) {
        this.sucursaleses = sucursaleses;
    }




}

