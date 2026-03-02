package edu.icet.repositery.impl;

import edu.icet.model.dto.OrderDTO;
import edu.icet.repositery.OrderRepositery;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class OrderRepositeryImpl implements OrderRepositery {

    private final JdbcTemplate jdbcTemplate;

    @Override
    public boolean addOrder(OrderDTO orderDTO) {
        String sql = "INSERT INTO Orders VALUES (?,?,?)";
        return jdbcTemplate.update(sql ,
                orderDTO.getId(),
                orderDTO.getDate(),
                orderDTO.getCusId()
                )>0;
    }

    @Override
    public boolean updateOrder(OrderDTO orderDTO) {
        String sql = "UPDATE orders SET OrderDate = ?, CustID = ? WHERE OrderID = ?";
        return jdbcTemplate.update(sql,
                orderDTO.getDate(),
                orderDTO.getCusId(),
                orderDTO.getId()
        )>0;
    }

    @Override
    public boolean deleteOrder(Integer id) {
        return false;
    }

    @Override
    public OrderDTO searchById(Integer id) {
        return null;
    }

    @Override
    public List<OrderDTO> getAll() {
        String sql = "SELECT * FROM orders";
        return jdbcTemplate.query(sql , (rs, rowNum) ->
            new OrderDTO(
                    rs.getString(1),
                    rs.getDate(2).toLocalDate(),
                    rs.getString(3)
            )
        );
    }
}
