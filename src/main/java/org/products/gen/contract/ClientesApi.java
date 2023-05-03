package org.products.gen.contract;

import org.products.gen.type.ClienteBaseType;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/clientes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-03T10:38:10.167628400-05:00[America/Bogota]")
public interface ClientesApi {

    @PUT
    @Path("/editar/{id}")
    @Consumes({ "application/json" })
    void clientesEditarIdPut(@PathParam("id") Long id,@Valid @NotNull ClienteBaseType clienteBaseType);

    @DELETE
    @Path("/eliminar/{id}")
    void clientesEliminarIdDelete(@PathParam("id") Long id);

    @GET
    @Produces({ "application/json" })
    List<ClienteBaseType> clientesGet();

    @GET
    @Path("/{id}")
    void clientesIdGet(@PathParam("id") Long id);

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    ClienteBaseType clientesPost(@Valid @NotNull ClienteBaseType clienteBaseType);
}
