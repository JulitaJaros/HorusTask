package org.example;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class BlockImp implements Block {
    private String color;
    private String material;

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public String getMaterial() {
        return this.material;
    }
}
