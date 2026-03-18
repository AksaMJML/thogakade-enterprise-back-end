package edu.icet.service.impl;

import edu.icet.model.dto.ItemDTO;
import edu.icet.repositery.ItemRepositery;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemServiceImpl implements ItemService {

    private final ItemRepositery itemRepositery;
    @Override
    public boolean addItem(ItemDTO itemDTO) {
        return false;
    }

    @Override
    public boolean updateItem(ItemDTO itemDTO) {
        return false;
    }

    @Override
    public boolean deleteItem(String id) {
        return false;
    }

    @Override
    public ItemDTO serachItem(String id) {
        return null;
    }

    @Override
    public List<ItemDTO> getAll() {
        return List.of();
    }
}
