package it.unive.poker;

import java.util.*;

public class Mazzo {

    public final static int N_CARTE=13;
    public final static int N_SEME=4;
    private final int N_CARTE_PER_MANO=5;
    private Queue<Carta> carte;

    public Mazzo(){
        this.init();    // inizialmente sono tutte in ordine
    }

    public void mescolaMazzo(){
        int L=carte.size();
        Carta[] situa = carte.toArray(Carta[]::new);
        for(int i=0;i<L;i++){
            int newI = (int) (Math.random() * L);
            Carta tmp=situa[i];
            situa[i]=situa[newI];
            situa[newI]=tmp;
        }
        carte.clear();
        for(int i=0;i<L;i++)
            carte.add(situa[i]);    // reinserisco tutte le carte nel mazzo

    }

    private Carta pesca(){
        return carte.poll();
    }

    public Carta[] getMano(){
        Carta[] mano = new Carta[N_CARTE_PER_MANO];
        for(int i=0;i<N_CARTE_PER_MANO;i++)
            mano[i]=pesca();

        System.out.println("Mano -> ");
        for(Carta x:mano)
            if(x!=null)
                System.out.printf(x.toString() +" ");
        System.out.println();

        return mano;
    }

    public Carta rifiuta(Carta x){
        carte.add(x); // questa carta la ritrovero nel fondo del mazzo
        // in casi mescolo qui this.mescolaMazzo();
        return this.pesca();
    }

    public Carta[] rifiutaAll(Carta[] x){

        System.out.println("Rifiuta -> ");
        for(Carta y:x)
            if(y!=null)
                System.out.printf(y.toString() +" ");
        System.out.println();

        Carta[] nuovePescate = new Carta[x.length];
        int cnt=0;
        for(Carta y:x)
            nuovePescate[cnt++] = this.rifiuta(y);

        System.out.println("Nuove Pescate -> ");
        for(Carta y:nuovePescate)
            if(y!=null)
                System.out.printf(y.toString() +" ");
        System.out.println();

        return nuovePescate;
    }

    private void init(){
        carte = new LinkedList<Carta>();
        for(Seme x : Seme.values()){
            for(int i=1;i<=N_CARTE;i++){
                carte.add(new Carta(i,x));
            }
        }
    }
}
