package ch11.p4;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class Product {
    private int pno;
    private String name;
    private String company;
    private int price;

}
