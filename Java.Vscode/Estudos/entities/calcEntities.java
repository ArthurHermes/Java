package entities;

public class calcEntities {

    public int soma(int num1, int num2){
        return num1 + num2;
    }

    public int subtracao(int num1, int num2){
        return num1 - num2;
    }

    public int multiplicacao(int num1, int num2){
        return num1 * num2;

    }

    public int divisao(int num1, int num2){
        return num1 / num2;
    }

    public Double fatoracao(int num1, int num2){
        return Math.pow(num1, num2);
    }

    public Double raizQuadrada(int num1){
        return Math.sqrt(num1);
    }
    
}
