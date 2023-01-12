package classeAbstrata;

import java.util.Objects;

public abstract class Veiculo {

    private Double velocidade;

    public Veiculo(){};

    public Veiculo(Double velocidade) {
        this.velocidade=velocidade;
    }

    public abstract void acelerar(Double velocidade);

    public abstract void frear(Double velocidade);

    public boolean equals(Object veiculo1, Object veiculo2) {
        if(veiculo1.getClass() == veiculo2.getClass()){
            System.out.println("Veiculos iguais");
            return true;
        }
        else {
            System.out.println("Veiculos diferentes");
            return false;
        }
    }
}
