package edu.icet.service;

import edu.icet.model.dto.OrderDTO;

public interface OrderService {
    boolean addOrder(OrderDTO orderDTO);
}
