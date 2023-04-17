package org.products;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/products")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class ProductsController {

    @Inject
    ProductsService productsService;

    @GET
    public List<ProductsModel> getAllProducts() {
        return productsService.getAll();
    }

    @POST
    public ProductsEntity createProduct(ProductsModel product) {
        ProductsEntity productsEntity = productsService.create(product);
        return productsEntity;
    }

    @GET
    @Path("/{id}")
    public ProductsModel getProductById(@PathParam("id") Long id) {
        return productsService.getById(id);
    }

    @PUT
    @Path("/{id}")
    public ProductsModel updateProduct(@PathParam("id") Long id, ProductsModel productModel) {
        productModel.setId(id);
        return productsService.update(productModel);
    }

    @DELETE
    @Path("/{id}")
    public void deleteProduct(@PathParam("id") Long id) {
        productsService.delete(id);
    }

}