public class Item {
    private String name;
    private int quantity;


    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public int getQuantity() {
        return quantity;
    }

    public void increaseQuantity(Item item) {
        item.quantity++;
    }

    public void decreaseQuantity(Item item) {
        item.quantity--;
    }

}