public class Item {
    private String name;
    private int quantity;

    /**
     * Sets name of an item.
     * @author Katelyn Clark
     * @param name The name of the item being created.
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * Gets name of an item.
     * @author Katelyn Clark
     * @return The name of the current item.
     */
    public String getName() {
        return name;
    }

    /**
     * Sets quantity of an item.
     * @author Katelyn Clark
     * @param quantity The quantity of the item being created.
     */
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    /**
     * Gets quantity of an item.
     * @author Katelyn Clark
     * @return The quantity of the current item.
     */
    public int getQuantity() {
        return quantity;
    }

    /**
     * Increases the quantity of an item by one.
     * @author Katelyn Clark
     * @param item The item being incremented.
     */
    public void increaseQuantity(Item item) {
        item.quantity++;
    }
    /**
     * Decreases the quantity of an item by one.
     * @author Katelyn Clark
     * @param item The item being decremented.
     */
    public void decreaseQuantity(Item item) {
        item.quantity--;
    }

}