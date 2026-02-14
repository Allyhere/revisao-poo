package model;

public class Carro {

    public Carro() {

    }
    public Carro(String modelo, int ano, String marca) {
        this.modelo = modelo;
        this.ano = ano;
        this.marca = marca;
    }

    private String modelo;
    private int ano;
    private String marca;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", ano=" + ano +
                ", marca='" + marca + '\'' +
                '}';
    }
}
