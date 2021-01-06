package it.unive.poker;

public class Carta{

    private final int numero; // 1 13
    private final Seme seme;

    public Carta(int number, Seme seme){
        this.numero=number;
        this.seme = seme;
    }

    int getNumero(){
        return this.numero;
    }

    Seme getSeme(){
        return this.seme;
    }

    @Override
    public String toString() {
        return this.getNumero() + " di " + this.getSeme().toString();}
}
