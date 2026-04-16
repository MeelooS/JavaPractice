package Задачи.TaskForTraining.ЗадачаНаТовары;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private List <Product> productList;
    private List <Discountable> discountableList;

    public Order(){
        //У каждого заказа будут свои новые списки, куда будут добавляться товары и скидки.
        //Ведь иначе у всех заказов будут общие списки, содержащие товары и скидки из всех товаров сразу
        this.productList = new ArrayList<>();           //this.productList = productList - неправильно, см. выше
        this.discountableList = new ArrayList<>();      //this.discountableList = discountableList - неправильно, см. выше
    }
    public void addProduct(Product product){
        productList.add(product);
    }

    public void addProducts(List <Product> products){
        productList.addAll(products);
    }

    public void addDiscount(Discountable discount){
        discountableList.add(discount);
    }

    public void addDiscounts(List <Discountable> discounts){
        discountableList.addAll(discounts);
    }

    public int calculatePrice(){
        int finalProductPrice = 0;
        int finalDiscountSum = 0;
        for (Product n: productList){
            finalProductPrice += n.getPrice();
        }
        for (Discountable n: discountableList){
            finalDiscountSum += n.discount(finalProductPrice);
        }
        return finalProductPrice - finalDiscountSum;
    }
}
