# PokerPOO



### Esercizio 1

Progettate e implementate tutte le classi che ritenete necessarie per realizzare un simulatore del
popolare gioco d’azzardo solitamente chiamato “video poker”. Il mazzo di carte ne contiene 52, 13
per ciascun seme, e viene mescolato all’inizio del gioco: dovete individuare una modalita’ di
mescolamento che sia equa, anche se non e’ necessario che sia efficiente. Successivamente vengono
mostrate le prime cinque carte del mazzo al giocatore, che ne puo’ rifiutare alcune, anche tutte, o
nessuna. Le carte rifiutate vengono sostituite con altre, prelevate ordinatamente dal mazzo. A
questo punto, sulla base delle cinque carte che il giocatore ha in mano, il programma comunica il
punteggio ottenuto, che deve essere il maggiore tra i seguenti, elencati in ordine crescente:
• No pair (“Niente”). La configurazione peggiore, che contiene cinque carte spaiate che non
compongono alcuna delle configurazioni elencate nel seguito.
• One pair (“Coppia”). Due carte dello stesso valore, ad esempio due regine.
• Two pairs (“Doppia coppia”). Due coppie, ad esempio due regine e due cinque.
• Three of a kind (“Tris”). Tre carte dello stesso valore, ad esempio tre regine.
• Full House (“Full”). Un tris e una coppia, ad esempio tre regine e due 5.
• Four of a kind (“Poker”). Quattro carte con lo stesso valore, ad esempio quattro regine.
medesimo seme.
## Non `e necessario implementare alcuna interfaccia utente o permettere effettivamente di giocare.
Semplicemente scrivere un main che svolga le seguenti operazioni tramite gli opportuni metodi:
• Mescola il mazzo;
• Preleva una mano per il giocatore;
• Se non ha almeno un full cambia 3 carte (se ha coppia), 2 carte (se ha tris) o una carta (se ha
doppia coppia);
• Preleva una mano per il computer e stampa chi ha vinto.
