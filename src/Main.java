public class Main {
    public static void main(String[] args){
        String[] sehirler1 = new String[]{"İstanbul", "Ankara", "İzmir"};

        for(String sehir: sehirler1){
            System.out.println(sehir);
        }

        for(int i=0;i<3;i++){
            System.out.println(sehirler1[1]);
        }

    }
}
