package WsizLab5;

public class MainLAB05 {
//    Szef s1 = new Szef("Jan", "Kowalski",1234,1234);
//    Pracownik p1 = new Pracownik("Jan","Kowalski",1234);

    //pkt1
    public static void main(String[] args) {
        Punkt pkt1 = new Punkt(3.4,2.0);
        Punkt pkt2 = new Punkt(1.4,2.3);
        Punkt pkt3 = new Punkt(2.4,-2.0);

        pkt1.opis();
        pkt2.przesun(3.4,23.0);
        pkt3.opis();

        Prostokat p1 = new Prostokat(3,4);
        Trojkat t1 = new Trojkat(5,4);
        Figura f1 = new Figura();

        p1.getPowierzchnia();
        f1.getKolor();


    }
}
