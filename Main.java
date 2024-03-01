public class Main {
    public static void main(String[] args) {
        items = new ArrayList<Item>();
        items.addItem("Tin of Sardines");
        items.addItem("Sharp Can Lid");
        items.addItem("Tin of Sardines");
        items.addItem("Tin of Sardines");
        items.removeItem("Tin of Sardines");
        items.addItem("Dented Water Bottle");
        items.printInventory();
    }
}