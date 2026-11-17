
package com.pract.Question1;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    private final List<Product> products = new ArrayList<>();

    public ProductService() {

        products.add(new Product(1, "Keyboard", 49.99));
        products.add(new Product(2, "Mouse", 19.99));

    }

    public List<Product> getAllProducts() {

        return products;

    }
}
