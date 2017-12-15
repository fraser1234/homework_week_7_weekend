package Shop;

import java.util.ArrayList;

public class Shop {

    private ArrayList<ISell> stock;

//    public Shop(ArrayList<ISell> stock){
//        this.stock = new ArrayList<>();
//    }


    public Shop(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public static void add(ArrayList<ISell> stock) {
        stock.add((ISell) stock);
    }

}
