package it.unive;

import it.unive.poker.Giocatore;
import it.unive.poker.Mazzo;
import it.unive.poker.Punteggio;
import it.unive.poker.Valutatore;

public class Main {

    public static void main(String... args) {
        final Mazzo mazzo = new Mazzo();
        mazzo.mescolaMazzo();

        Giocatore a = new Giocatore("Player",mazzo.getMano());

        a.riceviCarte(
                mazzo.rifiutaAll(
                        a.gioca()));

        Punteggio dela = a.getStatus(); // con le nuove carte pescate

        Giocatore b = new Giocatore("Computer",mazzo.getMano());

        b.riceviCarte(
                mazzo.rifiutaAll(
                        b.gioca()));

        Punteggio delb = b.getStatus();

        int risultati = Valutatore.confronta(dela,delb);

        if(risultati>0){
            // vinto negrazzo
            System.out.println("Ha vinto " + a.getNome() + " con : " + dela.getMsgPunteggio());
        }else if(risultati<0){
            // vinto b
            System.out.println("Ha vinto " + b.getNome() + " con : " + delb.getMsgPunteggio());
        }else{
            // pareggio
            System.out.printf("pareggio");
        }

    }
}
