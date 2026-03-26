package edu.icet.controller;

import edu.icet.model.dto.ItemDTO;
import edu.icet.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("item")
@RequiredArgsConstructor
public class ItemController {
    private final ItemService itemService;

    @PostMapping
    public boolean addItem(@RequestBody ItemDTO itemDTO){
        return itemService.addItem(itemDTO);
    }

    @PutMapping
    public boolean upadteItem(@RequestBody ItemDTO itemDTO){
        return itemService.updateItem(itemDTO);
    }

    @DeleteMapping("/{id}")
    public boolean deleteById(@@PathVariable String id){
        return itemService.deleteItem(id);
    }

    @GetMapping("/{id}")
    public ItemDTO searchById(@PathVariable String id){
        return itemService.serachItem(id);
    }

    @GetMapping
    public List<ItemDTO> getAll(){
        return itemService.getAll();
    }

}
