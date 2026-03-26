package edu.icet.service;

import edu.icet.model.dto.ItemDTO;

import java.util.List;

public interface ItemService {
    boolean addItem(ItemDTO itemDTO);
    boolean updateItem(ItemDTO itemDTO);
    boolean deleteItem(String id);
    ItemDTO serachItem(String id);
    List<ItemDTO> getAll();
}
