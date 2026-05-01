package ch11.p4;

import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        //product 객체를 저장하는 리스트 생성
        List<Product> productList = new ArrayList<>();

        for (int i = 0; i <= 5; i++){
            Product product = new Product(i, "상품" + i, "멋진회사", (int) (10000 * Math.random()));
            productList.add(product);
        }

        productList.stream().forEach(System.out::println);
    }
}
