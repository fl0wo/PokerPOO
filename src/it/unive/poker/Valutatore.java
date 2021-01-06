package it.unive.poker;

public class Valutatore {
    /*

    3 5 5 11 11
    1 2 2 5 5

    11 -> 2
    5 -> 2
    3 -> 1

    f=1,2,2

     */
    public static Punteggio check(Carta[] g){
        int[] freq = calcFreq(g);

        int nCoppie2 = nOccurence(freq,2);
        int nCoppie3 = nOccurence(freq,3);
        int nCoppie4 = nOccurence(freq,4);

        if(nCoppie2==2) return Punteggio.TwoPair;
        if(nCoppie2==1){
            if(nCoppie3==1) return Punteggio.FullHouse;
            return Punteggio.OnePair;
        }
        if(nCoppie3==1) return Punteggio.ThreeOfAKind;
        if(nCoppie4==1) return Punteggio.FourOfAKind;

        return Punteggio.NoPair;
    }

    private static int[] calcFreq(Carta[] g){
        int[] freq = new int[Mazzo.N_CARTE+1];

        for(int i=0;i<freq.length;i++)
            freq[i]=0;

        for(Carta x:g)
            if(x!=null)
                freq[x.getNumero()]++;
        return freq;
    }

    private static int nOccurence(int[] freq,int target){
        int ans=0;

        for(int x:freq)
            if(x==target)
                ans++;

        return ans;
    }

    private static Carta findOnMano(int target,Carta[] mano){
        for(int i=0;i<mano.length;i++){
            if(mano[i].getNumero()==target)
                return mano[i];
        }
        return null;
    }

    public static Carta[] daRifiutare(Carta[] g){
        Punteggio p = Valutatore.check(g);

        int carteDaEliminare = p.getCarteDaCambiare();

        if(carteDaEliminare==0)return new Carta[0];

        Carta[] daEliminare = new Carta[carteDaEliminare];

        int[] freq = calcFreq(g);
        int cnt=0;
        for(int i=0;i<freq.length;i++){
            if(freq[i]==1){
                daEliminare[cnt++]=findOnMano(i,g);
            }
        }
        return daEliminare;
    }

    public static int confronta(Punteggio a,Punteggio b){
        return a.getOrderWin()==b.getOrderWin() ? 0 :
                a.getOrderWin()>b.getOrderWin() ? 1 : -1;
    }
}
