package Calculator;

public class vCalculator implements Calculator {
    public void vCalculator() {

    }
    @Override
    public void sum(double a, double b){
        double m=a+b;
        System.out.println("Сложение: "+ a + " " + b  +" " + m );
    }
    @Override
    public void multiplication(double a, double b){
        System.out.println("Умножение: "+ a + " " + b  +" " + a*b );
    }
    @Override
    public void division(double a, double b){
        System.out.println("Деление: "+ a + " " + b  +" " + a/b );
    }
    @Override
    public void subtraction(double a, double b){
        double m = a-b;
        System.out.println("Вычитание: "+ a + " " + b  +" " + m );
    }
}
