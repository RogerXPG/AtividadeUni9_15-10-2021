package br.uninove.matematica;

public class OperacoesBasicas {
    private float valorA;
    private float valorB;

    public OperacoesBasicas() {}
    
    public OperacoesBasicas(float valorA, float valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }
    
    public float getValorA() {
        return valorA;
    }

    public void setValorA(float valorA) {
        this.valorA = valorA;
    }

    public float getValorB() {
        return valorB;
    }

    public void setValorB(float valorB) {
        this.valorB = valorB;
    }
    
    
    //Métodos das operações básicas:
    public float soma() {
        return valorA + valorB;
    }
    
    public float subtrai() {
        return valorA - valorB;
    }
    
    public float multiplica() {
        return valorA * valorB;
    }
    
    public float divide() {
        if(valorB != 0) {
            return valorA / valorB;
        } else {
            return Float.NaN;
        }
    }
}
