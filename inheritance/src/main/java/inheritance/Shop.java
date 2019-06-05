package inheritance;

public class Shop {
    private String shopName;
    private String shopDescription;
    private String shopPrice;


    public String getShopName() {
        return shopName;
    }

    public String getShopDescription() {
        return shopDescription;
    }

    public String getShopPrice() {
        return shopPrice;
    }

    public Shop(){}

    public Shop(String shopName, String shopDescription, String shopPrice) {
        this.shopName = shopName;
        this.shopDescription =shopDescription;
        this.shopPrice = shopPrice;
    }

    public String toString() {
        return String.format(this.shopName + " is " + this.shopDescription + " and the price is " + this.shopPrice);
    }
}
