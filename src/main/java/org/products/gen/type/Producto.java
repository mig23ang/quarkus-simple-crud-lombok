package org.products.gen.type;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("Producto")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-03T08:15:00.723108300-05:00[America/Bogota]")
public class Producto   {
  private @Valid Long id;
  private @Valid String nombre;
  private @Valid String descripcion;
  private @Valid Integer precio;

  /**
   **/
  public Producto id(Long id) {
    this.id = id;
    return this;
  }

  
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Long id) {
    this.id = id;
  }

  /**
   **/
  public Producto nombre(String nombre) {
    this.nombre = nombre;
    return this;
  }

  
  @JsonProperty("nombre")
  @NotNull
  public String getNombre() {
    return nombre;
  }

  @JsonProperty("nombre")
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  /**
   **/
  public Producto descripcion(String descripcion) {
    this.descripcion = descripcion;
    return this;
  }

  
  @JsonProperty("descripcion")
  public String getDescripcion() {
    return descripcion;
  }

  @JsonProperty("descripcion")
  public void setDescripcion(String descripcion) {
    this.descripcion = descripcion;
  }

  /**
   **/
  public Producto precio(Integer precio) {
    this.precio = precio;
    return this;
  }

  
  @JsonProperty("precio")
  @NotNull
  public Integer getPrecio() {
    return precio;
  }

  @JsonProperty("precio")
  public void setPrecio(Integer precio) {
    this.precio = precio;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Producto producto = (Producto) o;
    return Objects.equals(this.id, producto.id) &&
        Objects.equals(this.nombre, producto.nombre) &&
        Objects.equals(this.descripcion, producto.descripcion) &&
        Objects.equals(this.precio, producto.precio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombre, descripcion, precio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Producto {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombre: ").append(toIndentedString(nombre)).append("\n");
    sb.append("    descripcion: ").append(toIndentedString(descripcion)).append("\n");
    sb.append("    precio: ").append(toIndentedString(precio)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

