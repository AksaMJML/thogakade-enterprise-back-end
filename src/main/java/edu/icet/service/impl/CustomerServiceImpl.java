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
    public boolean addCustomer(CustomerDTO customerDTO) {
      return   repositery.addCustomer(customerDTO);

    }

    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) {
            return  false;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public CustomerDTO searchCustomer(String id) {
        return null;
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {
        return repositery.getAll();
    }
}
