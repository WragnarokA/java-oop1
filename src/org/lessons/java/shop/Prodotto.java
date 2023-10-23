package org.lessons.java.shop;

import java.util.Random;

// Nel package org.lessons.java.shop, creare la classe Prodotto che gestisce i prodotti dello shop.
// Un prodotto è caratterizzato da:
// - codice (numero intero)
// - nome
// - descrizione
// - prezzo
// - iva
// Usate opportunamente i livelli di accesso (public, private), i costruttori, i metodi getter e setter ed eventuali altri metodi di “utilità” per fare in modo che:
// alla creazione di un nuovo prodotto venga passato il valore di tutti gli attributi, tranne il codice, che deve essere valorizzato con un numero random
// Il codice prodotto sia accessibile solo in lettura
// Gli altri attributi siano accessibili sia in lettura che in scrittura
// Il prodotto esponga sia un metodo per avere il prezzo base che uno per avere il prezzo comprensivo di iva
// Il prodotto esponga un metodo per avere il nome esteso, ottenuto concatenando codice-nome
// Nello stesso package aggiungete una classe Main con metodo main nella quale create tre prodotti e ne stampate il nome completo e il prezzo comprensivo di iva.
// BONUS: nella classe Prodotto create un metodo che restituisca il codice con un pad left di 0 per arrivare a 8 caratteri (ad esempio codice 91 diventa 00000091, mentre codice 123445567 resta come è)
public class Prodotto {
        private final int codice;
        private String  nome;
        private String  descrizione;
        private int prezzo;
        private double iva;


    public Prodotto(String nome, String descrizione, int prezzo, double iva) {
        this.codice = generateRandomCode();
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.iva = iva;
    }
    public int getCodice() {
        return codice;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescrizione(){
        return descrizione;
    }
    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
    public int getPrezzo() {
        return prezzo;
    }
    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }
    public double getIva() {
        return iva;
    }
    public void setIva(double iva) {
        this.iva = iva;
    }
    public double getPrezzoConIva() {
        return prezzo + prezzo  * iva;
    }
    public String getNomeEsteso() {
        return String.format("%08d-%s", codice, nome);
    }
    public int generateRandomCode() {
        Random random = new Random();
        return random.nextInt(100000000);
    }
}

