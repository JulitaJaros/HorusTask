package org.example;
import lombok.ToString;

import java.util.List;
@ToString
public class CompositeBlockImp extends BlockImp {
    private List<Block> blocks;

    public CompositeBlockImp(String color, String material) {
        super(color, material);
    }

}
