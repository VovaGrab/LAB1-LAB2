public class Operations {
    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        float realPart = num1.getRe() * num2.getRe() - num1.getIm() * num2.getIm();
        float imaginaryPart = num1.getRe() * num2.getIm() + num1.getIm() * num2.getRe();
        return new ComplexNumber(realPart, imaginaryPart);
    }
    public static ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2) {
        float realPart = num1.getRe() * num2.getRe() - num1.getIm() * num2.getIm();
        float imaginaryPart = num1.getRe() * num2.getIm() + num1.getIm() * num2.getRe();
        return new ComplexNumber(realPart, imaginaryPart);
    }
}
