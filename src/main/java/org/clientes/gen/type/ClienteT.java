package org.clientes.gen.type;

import javax.validation.constraints.*;
import javax.validation.Valid;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("ClienteT")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-03T15:10:47.693004900-05:00[America/Bogota]")
public class ClienteT   {
  private @Valid Long id;
  private @Valid String primerNombre;
  private @Valid String primerApellido;
  private @Valid String correoElectronico;

  /**
   **/
  public ClienteT id(Long id) {
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
  public ClienteT primerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
    return this;
  }

  
  @JsonProperty("primerNombre")
  @NotNull
  public String getPrimerNombre() {
    return primerNombre;
  }

  @JsonProperty("primerNombre")
  public void setPrimerNombre(String primerNombre) {
    this.primerNombre = primerNombre;
  }

  /**
   **/
  public ClienteT primerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
    return this;
  }

  
  @JsonProperty("primerApellido")
  public String getPrimerApellido() {
    return primerApellido;
  }

  @JsonProperty("primerApellido")
  public void setPrimerApellido(String primerApellido) {
    this.primerApellido = primerApellido;
  }

  /**
   **/
  public ClienteT correoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
    return this;
  }

  
  @JsonProperty("correoElectronico")
  @NotNull
  public String getCorreoElectronico() {
    return correoElectronico;
  }

  @JsonProperty("correoElectronico")
  public void setCorreoElectronico(String correoElectronico) {
    this.correoElectronico = correoElectronico;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ClienteT clienteT = (ClienteT) o;
    return Objects.equals(this.id, clienteT.id) &&
        Objects.equals(this.primerNombre, clienteT.primerNombre) &&
        Objects.equals(this.primerApellido, clienteT.primerApellido) &&
        Objects.equals(this.correoElectronico, clienteT.correoElectronico);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, primerNombre, primerApellido, correoElectronico);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ClienteT {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    primerNombre: ").append(toIndentedString(primerNombre)).append("\n");
    sb.append("    primerApellido: ").append(toIndentedString(primerApellido)).append("\n");
    sb.append("    correoElectronico: ").append(toIndentedString(correoElectronico)).append("\n");
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

