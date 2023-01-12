package classeFinal;

import classesNormais.Carro;

public final class CarroUtilitario extends Carro {

    private Double bagageiroTeto;

    public CarroUtilitario(){}

    public CarroUtilitario(Double bagageiroTeto){
        this.bagageiroTeto = bagageiroTeto;
    }

    public Double getBagageiroTeto() {
        return this.bagageiroTeto;
    }

    public void setBagageiroTeto(Double bagageiroTeto) {
        this.bagageiroTeto = bagageiroTeto;
    }
}
