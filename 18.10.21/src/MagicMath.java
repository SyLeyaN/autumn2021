public class MagicMath {
     int n;

     MagicMath(int n){
         this.n=n;
     }
     MagicMath(){

     }
     public static int fact(int n){
         int f=1;
         while (n>=1){
             f*=n;
             n--;
         }
         return f;
     }

     public static int abs(int n){
         if (n>0)
             return n;
         else return -1*n;
     }

     public static double pow(double n, double e){
         return Math.pow(n,e);
     }
}

