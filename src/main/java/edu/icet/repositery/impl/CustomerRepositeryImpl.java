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
        String sql = "UPDATE customer SET CustTitle = ? , CustName = ? , DOB = ? , salary = ?, CustAddress = ? , City = ? , Province = ? , PostalCode = ? WHERE CustID = ? ";
        return jdbcTemplate.update(sql,
                customerDTO.getTitle(),
                customerDTO.getName(),
                customerDTO.getDob(),
                customerDTO.getSalary(),
                customerDTO.getAddress(),
                customerDTO.getCity(),
                customerDTO.getProvince(),
                customerDTO.getPostalCode(),
                customerDTO.getId()
                )>0;
    }

    @Override
    public boolean deldeteById(String id) {
        String sql = "DELETE FROM customer";
        return jdbcTemplate.update(sql , id)>1;
    }

    @Override
    public CustomerDTO searchById(String id) {
        String sql = "SELECT * FROM customer WHERE CustID = ?";
        return jdbcTemplate.queryForObject(sql, (rs, rowNum) -> new CustomerDTO(
                rs.getString(1),
                rs.getString(2),
                rs.getString(3),
                rs.getDate(4),
                rs.getDouble(5),
                rs.getString(6),
                rs.getString(7),
                rs.getString(8),
                rs.getString(9)
                ), id);
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
