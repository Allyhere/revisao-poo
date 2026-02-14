package model;

public class CarroEsportivo extends Carro {
    private boolean turbo;

    public CarroEsportivo() {
    }

    public CarroEsportivo(String modelo, int ano, String marca, boolean turbo) {
        super(modelo, ano, marca);
        this.turbo = turbo;
    }

    public boolean isTurbo() {
        return turbo;
    }

    public void setTurbo(boolean turbo) {
        this.turbo = turbo;
    }

    @Override
    public String toString() {
        return "CarroEsportivo{" +
                "turbo=" + turbo +
                '}';
    }
}

