package edu.icet.controller;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.service.CustomerService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/customer")
@CrossOrigin
public class CustomerController {

    final CustomerService service;

    @PostMapping("/add")
    public boolean addCustomer(@RequestBody CustomerDTO customerDTO){
         return service.addCustomer(customerDTO);

    }

    @GetMapping("/getAll")
    public List<CustomerDTO> getAll(){
      return service.getAllCustomers();
    }

    @PutMapping("/update")
    public boolean updateCustomer(@RequestBody CustomerDTO customerDTO){
        return service.updateCustomer(customerDTO);
    }

    @DeleteMapping("/delete-by-id/{id}")
    public boolean deleteById(@PathVariable String id){
        return service.deleteById(id);
    }

    @GetMapping("/search-by-id/{id}")
    public CustomerDTO searchById(@PathVariable String id){
        return service.searchCustomer(id);
    }

}
