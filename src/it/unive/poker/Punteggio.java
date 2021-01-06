package it.unive.poker;

public enum Punteggio{
    NoPair("Niente",5,0),
    OnePair("Coppia",3,1),
    TwoPair("Doppia Coppia",1,2),
    ThreeOfAKind("Tris",2,3),
    FullHouse("Full",0,4),
    FourOfAKind("Poker",0,5);

    private final String msgPunteggio;
    private int nCarteDaCambiare;
    private final int orderWin;
    Punteggio(String msg,int nCarteDaCambiare,int orderWin) {
        this.msgPunteggio=msg;
        this.nCarteDaCambiare=nCarteDaCambiare;
        this.orderWin=orderWin;
    }

    public String getMsgPunteggio() {
        return msgPunteggio;
    }

    public int getCarteDaCambiare() {
        return nCarteDaCambiare;
    }

    public int getOrderWin() {
        return orderWin;
    }
}
