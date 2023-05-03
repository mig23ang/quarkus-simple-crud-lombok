package org.clientes.gen.contract;

import org.clientes.gen.type.ClienteT;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/ClienteT")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-03T14:58:15.923520900-05:00[America/Bogota]")
public interface ClienteTApi {

    @GET
    @Produces({ "application/json" })
    List<ClienteT> clienteTGet();

    @DELETE
    @Path("/{id}")
    void clienteTIdDelete(@PathParam("id") Long id);

    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    ClienteT clienteTIdGet(@PathParam("id") Long id);

    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    ClienteT clienteTIdPut(@PathParam("id") Long id,@Valid @NotNull ClienteT clienteT);

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    ClienteT clienteTPost(@Valid @NotNull ClienteT clienteT);
}
