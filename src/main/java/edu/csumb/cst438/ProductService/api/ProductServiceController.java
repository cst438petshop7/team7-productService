package edu.csumb.cst438.ProductService.api;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import edu.csumb.cst438.ProductService.api.products.*;
import edu.csumb.cst438.ProductService.business.Manager;

@RestController
public class ProductServiceController {
    @Autowired
    // Manager manager;


    @GetMapping ("/Products")
    @ResponseBody
    List<Product> getProducts () {
        List<Product> result = callDB();
        return result;
    }

    private List<Product> callDB() {
        // API Key from heroku
        String api = "https://productsdb-service.herokuapp.com/allProducts";
        RestTemplate restTemplate = new RestTemplate();
        
        ResponseEntity<List<Product>> result = restTemplate.exchange(
            api, 
            HttpMethod.GET,
            null,
            new ParameterizedTypeReference<List<Product>>(){}
        );
        
        return result.getBody();
    }
}