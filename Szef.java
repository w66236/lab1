package WsizLab5;

public class Szef extends Pracownik{
    int premia;

    public Szef(String imie, String nazwisko, int wyplata, int premia) {
        super(imie, nazwisko, wyplata);
        this.premia = premia;
    }
    public void Wypisz(){
        System.out.println("Jestem szefem i mam premie: "+premia+
                "szef: "+imie+" "+nazwisko+" wyplata"+wyplata);
    }
}
