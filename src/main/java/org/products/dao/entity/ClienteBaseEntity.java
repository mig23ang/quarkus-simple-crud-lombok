package org.products.dao.entity;

import java.time.LocalDate;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import io.quarkus.hibernate.orm.panache.PanacheEntityBase;

public class ClienteBaseEntity extends PanacheEntityBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer numeroCliente;
    private String tipoPersona;
    private String tipoDocumento;
    private Integer numeroDocumento;
    private LocalDate fechaExpedicionDocumento;
    private String primerNombre;
    private Integer numeroCelular;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private String correoElectronico;

    public ClienteBaseEntity() {
    }

    public ClienteBaseEntity(Long id, Integer numeroCliente, String tipoPersona, String tipoDocumento,
            Integer numeroDocumento, LocalDate fechaExpedicionDocumento, String primerNombre, Integer numeroCelular,
            String segundoNombre, String primerApellido, String segundoApellido, String correoElectronico) {
        this.id = id;
        this.numeroCliente = numeroCliente;
        this.tipoPersona = tipoPersona;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaExpedicionDocumento = fechaExpedicionDocumento;
        this.primerNombre = primerNombre;
        this.numeroCelular = numeroCelular;
        this.segundoNombre = segundoNombre;
        this.primerApellido = primerApellido;
        this.segundoApellido = segundoApellido;
        this.correoElectronico = correoElectronico;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumeroCliente() {
        return this.numeroCliente;
    }

    public void setNumeroCliente(Integer numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public String getTipoPersona() {
        return this.tipoPersona;
    }

    public void setTipoPersona(String tipoPersona) {
        this.tipoPersona = tipoPersona;
    }

    public String getTipoDocumento() {
        return this.tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Integer getNumeroDocumento() {
        return this.numeroDocumento;
    }

    public void setNumeroDocumento(Integer numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public LocalDate getFechaExpedicionDocumento() {
        return this.fechaExpedicionDocumento;
    }

    public void setFechaExpedicionDocumento(LocalDate fechaExpedicionDocumento) {
        this.fechaExpedicionDocumento = fechaExpedicionDocumento;
    }

    public String getPrimerNombre() {
        return this.primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public Integer getNumeroCelular() {
        return this.numeroCelular;
    }

    public void setNumeroCelular(Integer numeroCelular) {
        this.numeroCelular = numeroCelular;
    }

    public String getSegundoNombre() {
        return this.segundoNombre;
    }

    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }

    public String getPrimerApellido() {
        return this.primerApellido;
    }

    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }

    public String getSegundoApellido() {
        return this.segundoApellido;
    }

    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }

    public String getCorreoElectronico() {
        return this.correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

}
