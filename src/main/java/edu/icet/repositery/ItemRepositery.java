package edu.icet.repositery;

import edu.icet.model.dto.ItemDTO;

import java.util.List;

public interface ItemRepositery {
    boolean addItem(ItemDTO itemDTO);
    boolean update(ItemDTO itemDTO);
    boolean deleteById(String id);
    ItemDTO searchById(String id);
    List<ItemDTO> getAll();
}
