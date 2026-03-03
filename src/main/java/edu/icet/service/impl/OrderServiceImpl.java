package edu.icet.service.impl;

import edu.icet.model.dto.OrderDTO;
import edu.icet.repositery.OrderRepositery;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepositery repositery;

    @Override
    public boolean addOrder(OrderDTO orderDTO) {
        return repositery.addOrder(orderDTO);
    }

    @Override
    public boolean updateOrder(OrderDTO orderDTO) {
        return repositery.updateOrder(orderDTO);
    }

    @Override
    public boolean deleteById(String id) {
        return repositery.deleteById(id);
    }

    @Override
    public OrderDTO searchById(String id) {
        return null;
    }

    @Override
    public List<OrderDTO> getAll() {
        return repositery.getAll();
    }
}
