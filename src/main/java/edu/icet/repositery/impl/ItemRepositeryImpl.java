package edu.icet.repositery.impl;

import edu.icet.model.dto.ItemDTO;
import edu.icet.repositery.ItemRepositery;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@Repository
@RequiredArgsConstructor
public class ItemRepositeryImpl implements ItemRepositery {

    private final JdbcTemplate template;


    private ItemDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
        ItemDTO dto = new ItemDTO();
        dto.setItemCode(rs.getString("ItemCode"));
        dto.setDescription(rs.getString("Description"));
        dto.setPackSize(rs.getString("PackSize"));
        dto.setUnitPrice(rs.getDouble("UnitPrice"));
        dto.setQtyOnHand(rs.getInt("QtyOnHand"));
        return dto;
    }

    @Override
    public boolean addItem(ItemDTO itemDTO) {
        String sql = "INSERT INTO items (ItemCode, Description, PackSize, UnitPrice, QtyOnHand) VALUES (?,?,?,?,?)";
        return template.update(sql,
                itemDTO.getItemCode(),
                itemDTO.getDescription(),
                itemDTO.getPackSize(),
                itemDTO.getUnitPrice(),
                itemDTO.getQtyOnHand()
        ) > 0;
    }

    @Override
    public boolean update(ItemDTO itemDTO) {
        String sql = "UPDATE items SET Description = ?, PackSize = ?, UnitPrice = ?, QtyOnHand = ? WHERE ItemCode = ?";
        return template.update(sql,
                itemDTO.getDescription(),
                itemDTO.getPackSize(),
                itemDTO.getUnitPrice(),
                itemDTO.getQtyOnHand(),
                itemDTO.getItemCode()
        ) > 0;
    }

    @Override
    public boolean deleteById(String id) {
        String sql = "DELETE FROM items WHERE ItemCode = ?";
        return template.update(sql, id) > 0;
    }

    @Override
    public ItemDTO searchById(String id) {
        String sql = "SELECT * FROM items WHERE ItemCode = ?";
        return template.queryForObject(sql, this::mapRow, id);
    }

    @Override
    public List<ItemDTO> getAll() {
        String sql = "SELECT * FROM items";
        return template.query(sql, this::mapRow);
    }


}
