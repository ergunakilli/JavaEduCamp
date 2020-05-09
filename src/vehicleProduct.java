public class vehicleProduct extends Product {
    @Override
    public String getDescription() {
        return "Araç Tanımı: " + super.getDescription();
    }
}
