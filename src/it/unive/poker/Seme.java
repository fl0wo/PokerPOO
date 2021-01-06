package it.unive.poker;

public enum Seme {
    Cuori("Cuori"),
    Fiori("Fiori"),
    Quadri("Quadri"),
    Picche("Picche");

    private final String nome;

    Seme(String nome) {
        this.nome=nome;
    }

    @Override
    public String toString() {
        return this.nome;
    }
};
