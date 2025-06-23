import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class ProductComposite extends Product{
    private List<Product> productList;
    private Double discount;

    public ProductComposite(String name, Double discount) {
        super(name);
        this.discount = discount;
        this.productList = new ArrayList<>();
    }

    @Override
    public Double calculatePrice() {
        Double finalPrice = 0.0;
        for (Product product : productList) {
            finalPrice += product.calculatePrice();
        }
        Double finalDiscountPrice = finalPrice - (finalPrice * discount);
        return finalDiscountPrice;
    }
    public void addProduct (Product product){
        productList.add(product);
    }
}
