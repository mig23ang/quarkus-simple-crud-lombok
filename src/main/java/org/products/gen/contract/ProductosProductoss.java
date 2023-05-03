package org.products.gen.contract;

import org.products.gen.type.Producto;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;


import java.io.InputStream;
import java.util.Map;
import java.util.List;
import javax.validation.constraints.*;
import javax.validation.Valid;

@Path("/productos")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2023-05-02T19:26:44.012483500-05:00[America/Bogota]")
public interface ProductosProductoss {

    @GET
    @Produces({ "application/json" })
    List<Producto> productosGet();

    @DELETE
    @Path("/{id}")
    void productosIdDelete(@PathParam("id") Long id);

    @GET
    @Path("/{id}")
    @Produces({ "application/json" })
    Producto productosIdGet(@PathParam("id") Long id);

    @PUT
    @Path("/{id}")
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Producto productosIdPut(@PathParam("id") Long id,@Valid @NotNull Producto producto);

    @POST
    @Consumes({ "application/json" })
    @Produces({ "application/json" })
    Producto productosPost(@Valid @NotNull Producto producto);
}
