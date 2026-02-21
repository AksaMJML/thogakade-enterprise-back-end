package edu.icet.repositery;

import edu.icet.model.dto.CustomerDTO;
import edu.icet.model.dto.OrderDTO;

import java.util.List;

public interface OrderRepositery {
    boolean addOrder(OrderDTO orderDTO);
    boolean updateOrder(OrderDTO orderDTO);
    boolean deleteOrder(Integer id);
    OrderDTO searchById(Integer id);
    List<OrderDTO> getAll();
}
