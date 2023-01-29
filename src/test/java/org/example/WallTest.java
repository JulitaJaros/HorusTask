package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


class WallTest {
    public List<Block> getBlocks() {
        List<Block> blocks = new ArrayList<>();
        blocks.add(new CompositeBlockImp("blue", "wood"));
        blocks.add(new CompositeBlockImp("blue", "steel"));
        blocks.add(new CompositeBlockImp("black", "steel"));
        return blocks;
    }
    @Test
    void findBlockByColor() {
        //given
        Wall wall = new Wall(getBlocks());
        //when
        Optional<Block> block = wall.findBlockByColor("blue");
        //then
        if (block.isPresent()) {
            Assertions.assertEquals("blue", block.get().getColor());
        } else {
            Assertions.fail();
        }
    }
    @Test
    void findBlocksByMaterial() {
        //given
        Wall wall = new Wall(getBlocks());
        //when
        List<Block> blocks = wall.findBlocksByMaterial("wood");
        //then
        Assertions.assertEquals(1, blocks.size());
    }
    @Test
    void count() {
        //given
        Wall wall = new Wall(getBlocks());
        //when
        int quantity = wall.count();
        //then
        Assertions.assertEquals(3, quantity);
    }

}