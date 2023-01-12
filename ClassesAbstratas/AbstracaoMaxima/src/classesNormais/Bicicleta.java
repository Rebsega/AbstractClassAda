package classesNormais;

import classeAbstrata.Veiculo;

public class Bicicleta extends Veiculo {

    private Double velocidade=0.0;

    public Bicicleta(){};

    public Bicicleta(Double velocidade) {
        super(velocidade);
    }

    @Override
    public void acelerar(Double velocidade) {
        System.out.println("Acelerando a bicicleta em "+velocidade+" km/h");
        this.velocidade += velocidade;
    }

    @Override
    public void frear(Double velocidade) {
        System.out.println("Freando a bicicleta em "+velocidade+" km/h");
        this.velocidade -= velocidade;
    }

    public Double getVelocidade() {
        return this.velocidade;
    }
}
