public class Main {
    public static void main(String[] args){
        mesajVer();
        hesapla();
        System.out.println(topla(2,3));
    }
    public static void mesajVer(){
        System.out.println("Merhaba");
    }

    public static void hesapla(){
        System.out.println("Hesaplandı");
    }

    public static int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }
}
