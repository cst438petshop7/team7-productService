package edu.csumb.cst438.ProductService.data;

import java.util.List;

import org.springframework.stereotype.Repository;

import edu.csumb.cst438.ProductService.api.products.Product;

@Repository
public class ProductDBClient {
    //TODO: use DB enteties rather than api layer enteties.
    public List<Product> getProductData () {
        //db validation
        //set up client
        //call the database
        //mapping
        //return to bus layer
        return null;
    }
}