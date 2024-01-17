package pojos.product;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {

    @JsonProperty
    private String name;

    @JsonProperty
    private int price;

    @JsonProperty
    private int quantity;

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}
