
package com.servisportvalencia.tienda.usuarios;

public class Usuario {
    private int idUsuario;
    private String codigo;
    private String nombre;
    private String primerApellido;
    private String segundoApellido;
    private String dni_cif;
    private TipoUsuario tipoUsuario;
    private MetodoPago metodoPagopago;

    public Usuario() {
    }

    public Usuario(int idUsuario, String codigo, String nombre, String primerApellido, String segundoApellido, String dni_cif, TipoUsuario tipoUsuario, MetodoPago metodoPagopago) {
        this.idUsuario = idUsuario;
        this.codigo = codigo;
        this.nombre = nombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.dni_cif = dni_cif;
        this.tipoUsuario = tipoUsuario;
        this.metodoPagopago = metodoPagopago;
    }

    /**
     * @return the idUsuario
     */
    public int getIdUsuario() {
        return idUsuario;
    }

    /**
     * @param idUsuario the idUsuario to set
     */
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the primerApellido
     */
    public String getPrimerApellido() {
        return primerApellido;
    }

    /**
     * @param primerApellido the primerApellido to set
     */
    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    /**
     * @return the segundoApellido
     */
    public String getSegundoApellido() {
        return segundoApellido;
    }

    /**
     * @param segundoApellido the segundoApellido to set
     */
    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    /**
     * @return the dni_cif
     */
    public String getDni_cif() {
        return dni_cif;
    }

    /**
     * @param dni_cif the dni_cif to set
     */
    public void setDni_cif(String dni_cif) {
        this.dni_cif = dni_cif;
    }

    /**
     * @return the tipoUsuario
     */
    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    /**
     * @param tipoUsuario the tipoUsuario to set
     */
    public void setTipoUsuario(TipoUsuario tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    /**
     * @return the metodoPagopago
     */
    public MetodoPago getMetodoPagopago() {
        return metodoPagopago;
    }

    /**
     * @param metodoPagopago the metodoPagopago to set
     */
    public void setMetodoPagopago(MetodoPago metodoPagopago) {
        this.metodoPagopago = metodoPagopago;
    }

   
    
    
}
