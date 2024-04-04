package org.example;

// Generic bir sınıf
class Kutu<T> {
    private T icerik;

    public Kutu(T icerik) {
        this.icerik = icerik;
    }

    // Generic alanı yazdıran metot
    public void icerikYazdir() {
        System.out.println("Kutu İçeriği: " + icerik);
    }
}

public class Main {
    public static void main(String[] args) {
        // String türünde bir kutu oluşturup içerisine "Merhaba" metni koyuyoruz
        Kutu<String> stringKutu = new Kutu<>("Merhaba");
        stringKutu.icerikYazdir();

        // Integer türünde bir kutu oluşturup içerisine 42 değerini koyuyoruz
        Kutu<Integer> integerKutu = new Kutu<>(60);
        integerKutu.icerikYazdir();
    }
}
