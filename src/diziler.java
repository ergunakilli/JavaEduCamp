public class diziler {
    public static void main(String[] args){
        String[] sehirler1 = new String[]{"İstanbul", "Bursa", "Adana"};

        String[] sehirler2 = new String[]{"Antep", "Urfa", "Kastamonu"};

        sehirler1 = sehirler2;
        sehirler1[0] = "Paris";
        System.out.println(sehirler2[0]); //Paris

        //referans type, value type, stack-heap
    }
}
