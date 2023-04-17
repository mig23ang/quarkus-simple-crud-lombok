package org.products;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class ProductsModel {

    public Long id;

    public String nombre;

    public String descripcion;

    public Integer precio;

    public ProductsModel(Long id, String nombre, String descripcion, Integer precio) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
    }

}
