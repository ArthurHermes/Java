package program;
import java.util.Scanner;
import entities.calcEntities;

public class Calculadora {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        

        boolean continuar = true;

        try{
            while (continuar) {
            
                calcEntities calc = new calcEntities();
                System.out.println("Qual operação deseja realizar: ");
                System.out.printf("1:Soma %n2:Subtração %n3:Multiplicação %n4:Divisão %n5:Fatoração %n6:Raiz Quadrada%n");
                int op = sc.nextInt();
                if(op == 1){
                    System.out.println("Soma");
                    System.out.println("Insira a baixo os dois numeros");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    System.out.println("A soma de " + num1 + " + " + num2 + " = " + calc.soma(num1, num2));
                }
                else if(op == 2){
                    System.out.println("Subtração");
                    System.out.println("Insira a baixo os dois numeros");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    System.out.println("A subtração de " + num1 + " - " + num2 + " = " + calc.subtracao(num1, num2));
                }
                else if(op == 3){
                    System.out.println("Multiplicação");
                    System.out.println("Insira a baixo os dois numeros");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    System.out.println("A multiplicação de " + num1 + " x " + num2 + " = " + calc.multiplicacao(num1, num2));
                }
                else if(op == 4){
                    System.out.println("Divisão");
                    System.out.println("Insira a baixo os dois numeros");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    System.out.println("A divisão de " + num1 + " / " + num2 + " = " + calc.divisao(num1, num2));
                }
                else if(op == 5){
                    System.out.println("Fatoração");
                    System.out.println("Insira a baixo os dois numeros");
                    int num1 = sc.nextInt();
                    int num2 = sc.nextInt();
                    System.out.println("A fatoração de " + num1 + " com expoente " + num2 + " = " + calc.fatoracao(num1, num2));
                }
                else if(op == 6){
                    System.out.println("Raiz Quadrada");
                    System.out.println("Insira a baixo o valor da raiz");
                    int num1 = sc.nextInt();
                    System.out.println("A raiz quadrada de " + num1 + " é = " + calc.raizQuadrada(num1));
                }

                System.out.println("Deseja continuar?(Sim ou Não)");
                char escolha = sc.next().charAt(0);
                if (escolha == 's' || escolha == 'S'){
                    continuar = true;
                }else{
                    continuar = false;
                }
                
            }
            
        }catch (Exception e) {System.out.println("Fez merda, IMBECIL!  Começa Denovo");}
        
        sc.close();
    }
}
