import java.util.ArrayList;

public class workshop {
    public static void main(String[] args){
        /*
        var vehicle = new vehicleProduct();
        vehicle.setDescription("BMW");
        System.out.println(vehicle.getDescription());
        */

        var vehicles = new ArrayList<Product>();
        vehicles.add(new Product());
        vehicles.add(new Product());

        for (Product vehicle: vehicles) {
            vehicle.getDescription();
        }
    }
}
