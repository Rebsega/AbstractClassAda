package classesNormais;

import classeAbstrata.Veiculo;

public class Carro extends Veiculo {

    private Double velocidade=0.0;
    public Carro(){};

    public Carro(Double velocidade) {
        super(velocidade);
    }

    @Override
    public void acelerar(Double velocidade) {
        System.out.println("Acelerando o carro em "+velocidade+" km/h");
        this.velocidade += velocidade;
    }

    @Override
    public void frear(Double velocidade) {
        System.out.println("Freando o carro em "+velocidade+" km/h");
        this.velocidade -= velocidade;
    }

    public Double getVelocidade() {
        return velocidade;
    }

    public final void abrirPorta(){
        System.out.println("Portas abertas");
    }
}
