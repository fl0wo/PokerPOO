package it.unive.poker;

import java.util.ArrayList;
import java.util.Arrays;

public class Giocatore {

    private String nome;
    private ArrayList<Carta> mano;

    public Giocatore(String nome,Carta... mano) {
        this.nome = nome;
        this.mano = new ArrayList<Carta>(Arrays.asList(mano));
    }

    public Carta[] gioca(){
        Carta[] daRiuf = Valutatore.daRifiutare(this.mano.toArray(Carta[]::new));
        mano.removeAll(Arrays.asList(daRiuf));
        return daRiuf;
    }

    public Punteggio getStatus(){
        return Valutatore.check(this.mano.toArray(Carta[]::new));
    }

    public void riceviCarte(Carta[] arr){
        this.mano.addAll(Arrays.asList(arr));
    }

    public String getNome() {
        return nome;
    }
}
