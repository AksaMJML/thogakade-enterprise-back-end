package edu.icet.repositery;

import edu.icet.model.dto.CustomerDTO;

import java.util.List;

public interface CustomerRepositery {
    boolean addCustomer(CustomerDTO customerDTO);
    boolean updateCustomer(CustomerDTO customerDTO);
    boolean deldeteById(String id);
    CustomerDTO searchById(String id);
    List<CustomerDTO> getAll();
}
