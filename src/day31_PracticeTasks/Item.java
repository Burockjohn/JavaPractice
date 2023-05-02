package day31_PracticeTasks;

public class Item {

    public String name;
    public int quantity;
    public double unitPrice;

    public Item(String name, double unitPrice, int quantity) {
        this.name = name;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public double calcCost() {
      return unitPrice*quantity;

    }

    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", totalPrice=" + calcCost() +
                '}';
    }
}

/*

4. Item Task:
		4.1 Create a class called Item
            Attributes:
                name, unitPrice, quantity

            Add a constructor to initialize all the fields

            Methods:
                calcCost(): returns the total price of the Item
                toString(): returns the name, unitPrice, quantity and total Price that's calculated by calcCost()

 */
