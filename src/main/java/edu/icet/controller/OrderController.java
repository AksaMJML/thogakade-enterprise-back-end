package edu.icet.controller;

import edu.icet.model.dto.OrderDTO;
import edu.icet.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/orders")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService service;

    @PostMapping("/add")
    public boolean addOrder(@RequestBody OrderDTO orderDTO){
        return service.addOrder(orderDTO);
    }

    @GetMapping("/get")
    public List<OrderDTO> getAll(){
        return service.getAll();
    }
}
