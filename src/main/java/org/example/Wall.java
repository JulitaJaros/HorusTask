package org.example;
import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
public class Wall implements Structure{
    private List<Block> blocks;

    @Override
    public Optional<Block> findBlockByColor(String color) {
        for(Block block : blocks ){
            if(block.getColor().equals(color))
                return Optional.of(block);
            }
        return Optional.empty();
    }
    @Override
    public List<Block> findBlocksByMaterial(String material) {
        return blocks.stream()
                .filter(block -> block.getMaterial().equals(material))
                .collect(Collectors.toList());
    }
    @Override
    public int count() {
        return blocks.size();
    }
}
