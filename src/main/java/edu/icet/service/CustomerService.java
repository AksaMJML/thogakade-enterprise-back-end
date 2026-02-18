package edu.icet.service;

import edu.icet.model.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    void addCustomer(CustomerDTO customerDTO);
    void updateCustomer(CustomerDTO customerDTO);
    void deleteById(Integer id);
    CustomerDTO searchCustomer(Integer id);
    List<CustomerDTO> getAllCustomers();
}
