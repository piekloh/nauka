public class EchoTester {
    public static void main(String[] args) {
        Echo e1 = new Echo();
        Echo e2 = e1;
        int x=0;
        while(x<4){
            e1.witaj();
            e1.ilosc = e1.ilosc + 1;
            if (x>0){
            e2.ilosc = e2.ilosc + 1;
            }
            if (x>1){
                e2.ilosc = e2.ilosc + e1.ilosc;
            }
            x = x + 1;
        }
        System.out.println(e2.ilosc);
    }
}
