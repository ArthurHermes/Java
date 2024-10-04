import java.util.Scanner;


class myCode{
  public static void main (String[] args) throws java.lang.Exception {
    
    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    String palavra = sc.next();
    
    while(N >= 0 || N <= 100){
      for(int i = 1; i < N; i++){
        System.out.println(palavra);
      }
      break;
    }
    sc.close();
  }
}
