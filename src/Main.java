import model.Carro;
import model.CarroEsportivo;

public class Main {
    public static void main(String[] args) {
        CarroEsportivo carro = new CarroEsportivo("206", 2008, "Pegeot", true);
        System.out.println(carro.toString());
        carro.ligar();
    }
}