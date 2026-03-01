package edu.icet.service;

import edu.icet.model.dto.OrderDTO;

import java.util.List;

public interface OrderService {
    boolean addOrder(OrderDTO orderDTO);
    boolean updateOrder(OrderDTO orderDTO);
    boolean deleteById(String id);
    OrderDTO searchById(String id);
    List<OrderDTO> getAll();
}
