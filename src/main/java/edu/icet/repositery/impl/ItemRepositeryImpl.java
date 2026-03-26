package edu.icet.repositery.impl;

import edu.icet.model.dto.ItemDTO;
import edu.icet.repositery.ItemRepositery;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepositeryImpl implements ItemRepositery {

    private final JdbcTemplate template;

    @Override
    public boolean addItem(ItemDTO itemDTO) {
        return template.update("INSERT INTO items VALUES (?,?,?,?,?)" ,
                itemDTO.getS
        );
    }

    @Override
    public boolean update(ItemDTO itemDTO) {
        return template.update("UPDATE TABLE items SET ");
    }

    @Override
    public boolean deleteById(String id) {
        return template.update("DELETE FROM items WHERE code = ?");
    }

    @Override
    public ItemDTO searchById(String id) {
        return null;
    }

    @Override
    public List<ItemDTO> getAll() {
        return List.of();
    }
}
