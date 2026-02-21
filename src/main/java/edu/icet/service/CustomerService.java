package edu.icet.service;

import edu.icet.model.dto.CustomerDTO;

import java.util.List;

public interface CustomerService {
    boolean addCustomer(CustomerDTO customerDTO);
    boolean updateCustomer(CustomerDTO customerDTO);
    boolean deleteById(String id);
    CustomerDTO searchCustomer(String id);
    List<CustomerDTO> getAllCustomers();
}
