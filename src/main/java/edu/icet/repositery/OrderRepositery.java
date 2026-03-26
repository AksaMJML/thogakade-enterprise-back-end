package edu.icet.repositery;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.model.dto.OrderDTO;

import java.util.List;

public interface OrderRepositery {
    boolean addOrder(OrderDTO orderDTO);
    boolean updateOrder(OrderDTO orderDTO);
    boolean deleteById(String id);
    OrderDTO searchById(String id);
    List<OrderDTO> getAll();
}
