package DefaultPackage;

public class Aims {
    public static void main(String[] args) {

        //Create a new cart
        Cart anOrder = new Cart();
        //12. Create Carts of DigitalVideoDiscs
        //Crate new DVD objects and add them to the cart
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The lion King",
                "Animation","Roger Allder", 87, 19.95f);
        anOrder.addDigitalVideoDisc(dvd1);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
                "Sci-fi","Geogre Lucas", 87, 24.95f);
        anOrder.addDigitalVideoDisc(dvd2);

        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
                "Animation","Roger Allder", 87, 18.99f);
        anOrder.addDigitalVideoDisc(dvd3);

        //Display the cart details
        System.out.println();
        anOrder.displayCart();

        //print the total cost of the items in the cart
        System.out.println("Total Cost is: ");
        System.out.println(anOrder.totalCost());

        //Remove DVD from cart
        anOrder.removeDigitalVideoDisc(dvd1);
        anOrder.displayCart();
    }
}
