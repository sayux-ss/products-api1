package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customers")
public class CustomerController {

    @GetMapping("/{id}")
    public Customer getById(@PathVariable Long id) {

        Address address = new Address(
                "115 New Cavendish Street", "London", "W1W 6UW");

        return new Customer(id, "Ada Lovelace",
                "ada@example.com", address);
    }
}
