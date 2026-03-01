package edu.icet.service.impl;

import edu.icet.model.dto.OrderDTO;
import edu.icet.service.OrderService;

import java.util.List;

public class OrderServiceImpl implements OrderService {
    @Override
    public boolean addOrder(OrderDTO orderDTO) {
        return false;
    }

    @Override
    public boolean updateOrder(OrderDTO orderDTO) {
        return false;
    }

    @Override
    public boolean deleteById(String id) {
        return false;
    }

    @Override
    public OrderDTO searchById(String id) {
        return null;
    }

    @Override
    public List<OrderDTO> getAll() {
        return List.of();
    }
}
