package edu.icet.repositery.impl;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.repositery.CustomerRepositery;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class CustomerRepositeryImpl implements CustomerRepositery {

    final private JdbcTemplate jdbcTemplate;

    @Override
    public boolean addCustomer(CustomerDTO customerDTO) {
        String sql = "INSERT INTO customer VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        return jdbcTemplate.update(sql ,
                customerDTO.getId(),
                customerDTO.getTitle(),
                customerDTO.getName(),
                customerDTO.getDob(),
                customerDTO.getSalary(),
                customerDTO.getAddress(),
                customerDTO.getCity(),
                customerDTO.getProvince(),
                customerDTO.getPostalCode()
        )>0;

    }




    @Override
    public boolean updateCustomer(CustomerDTO customerDTO) {
        String sql = "UPDATE TABLE customer SET = (?,?,?,?,?,?,?,?) WHERE id = ?";
//        jdbcTemplate.update(sql,
//                )
        return false;
    }

    @Override
    public boolean deldeteById(String id) {
        return false;
    }

    @Override
    public List<CustomerDTO> getAll() {
      String sql = "SELECT * FROM customer";
      List<CustomerDTO> customerDTOList = jdbcTemplate.query(sql , (rs, rowNum) -> {
          CustomerDTO customerDTO = new CustomerDTO();
          customerDTO.setId(rs.getString(1));
          customerDTO.setTitle(rs.getString(2));
          customerDTO.setName(rs.getString(3));
          customerDTO.setDob(rs.getDate(4));
          customerDTO.setSalary(rs.getDouble(5));
          customerDTO.setAddress(rs.getString(6));
          customerDTO.setCity(rs.getString(7));
          customerDTO.setProvince(rs.getString(8));
          customerDTO.setPostalCode(rs.getString(9));
          return customerDTO;
      });
      return customerDTOList;
    }
}
