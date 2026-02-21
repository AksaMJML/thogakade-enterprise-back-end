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

//    @PutMapping("/update")
//    public void updateCustomer(CustomerDTO customerDTO){
//        service.updateCustomer(customerDTO);
//    }
}
