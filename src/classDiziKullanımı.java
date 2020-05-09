public class classDiziKullanımı {
    public static void main(String[] args){
        var product1 = new Product();
        product1.setName("Laptop");

        var product2 = new Product();
        product2.setName("Telefon");

        var urunler = new Product[]{product1,product2};

        for (int i = 0; i < urunler.length; i++) {
            System.out.println(urunler[i].getName());
        }
    }
}
