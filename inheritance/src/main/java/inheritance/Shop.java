package inheritance;

public class Shop extends ZelpBase {
    private String shopDescription;
    private String shopPrice;


    public String getShopDescription() { return shopDescription; }
    public String getShopPrice() { return shopPrice; }

    public Shop(String shopName, String shopDescription, String shopPrice) {
        super(shopName);
        this.shopDescription =shopDescription;
        this.shopPrice = shopPrice;
    }

    public String toString() {
        return String.format(this.getName() + " is " + this.shopDescription + " and the price is " + this.shopPrice);
    }

}
