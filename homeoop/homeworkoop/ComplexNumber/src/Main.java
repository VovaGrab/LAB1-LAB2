public class Main {
    public static void main(String[] args) {
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(4, -1);
        ComplexNumber sum = Operations.add(num1, num2);
        System.out.println("Suma: " + sum);
        ComplexNumber product = Operations.multiply(num1, num2);
        System.out.println("Produsul: " + product);
    }
}
