package edu.icet.service.impl;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.repositery.CustomerRepositery;
import edu.icet.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    final CustomerRepositery repositery;

    @Override
    public void addCustomer(CustomerDTO customerDTO) {
        repositery.addCustomer(customerDTO);
    }

    @Override
    public void updateCustomer(CustomerDTO customerDTO) {

    }

    @Override
    public void deleteById(Integer id) {

    }

    @Override
    public CustomerDTO searchCustomer(Integer id) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return List.of();
    }
}
