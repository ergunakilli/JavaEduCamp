public class diziler {
    public static void main(String[] args){
        for (int i=1; i<=10;i++){
            System.out.println(i);
        }

        var sayi = 10;
        while (sayi<=100){
            System.out.println(sayi);
            sayi = sayi+10;
        }

        int sayi2 = 11;
        do{
            System.out.println(sayi2);
            sayi2 = sayi2+10;
        }while (sayi2>=100);
    }
}
