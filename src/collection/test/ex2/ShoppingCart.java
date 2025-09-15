package collection.test.ex2;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Item> items = new ArrayList<>();

    public void addItem(Item item) {
    items.add(item);
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (Item i : items){
            System.out.println(i.getName()+ ", 합계:" + i.getTotalPrice());
        }
        System.out.println("전체 가격 합:" + total());
    }

    private int total (){
        int totalPrice = 0;
        for (Item i : items){
           totalPrice += i.getTotalPrice();
        }
        return totalPrice;
    }
}
