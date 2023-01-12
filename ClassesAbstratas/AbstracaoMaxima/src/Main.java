import classesNormais.Bicicleta;
import classesNormais.Carro;
import classesNormais.Trem;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Carro carro2 = new Carro();
        carro2.acelerar(30.0);
        Trem trem = new Trem();
        Bicicleta bicicleta = new Bicicleta();
        carro.acelerar(30.0);
        carro.acelerar(20.0);

        System.out.println("TESTE: "+bicicleta.equals(carro2,carro));
    }
}
