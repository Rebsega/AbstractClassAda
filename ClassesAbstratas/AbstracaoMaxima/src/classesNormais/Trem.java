package classesNormais;

import classeAbstrata.Veiculo;

public class Trem extends Veiculo {

    private Double velocidade=0.0;

    public Trem(){};

    public Trem(Double velocidade) {
        super(velocidade);
    }

    @Override
    public void acelerar(Double velocidade) {
        System.out.println("Acelerando o trem em "+velocidade+" km/h");
        this.velocidade += velocidade;
    }

    @Override
    public void frear(Double velocidade) {
        System.out.println("Freando o trem em "+velocidade+" km/h");
        this.velocidade -= velocidade;
    }

    public Double getVelocidade() {
        return this.velocidade;
    }
}
