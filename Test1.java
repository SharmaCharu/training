package threading;


import java.util.*;


class Test1{
  
  static boolean Prime(int n){
      for(int i=2; i<= Math.sqrt(n); i++){
          if(n%i == 0){
              return false;
          }
      }
      return true;
  }
  
  static boolean AddPrime(int x){
      boolean a1 = Prime(x);
      if(a1 == true){
          int sum = 0;
          while(x > 0){
              int z1 = x%10;
              sum += z1;
              x /= 10;
          }
          boolean a2 = Prime(sum);
          if(a2 == true){
              return true;
          }
      }
      return false;
  }
  
  public static void main(String[] args){
      Scanner scan = new Scanner(System.in);
      //size of array
      int n = scan.nextInt();
      //for storing nos
      int A[] = new int[n];
      for(int i=0; i<n; i++){
          A[i] = scan.nextInt();
      }
      for(int i=0; i<n; i++){
          boolean result = AddPrime(A[i]);
          //will check whether additive or not
          if(result == true)
              System.out.print(A[i] + " ");
      }
      scan.close();
  }
}

