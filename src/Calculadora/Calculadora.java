package Calculadora;

public class Calculadora {
    private Double a, b;

    public Calculadora(Double a, Double b) {
        this.a = a;
        this.b = b;
    }

    public String sum(){return String.valueOf(this.a + this.b);}
    public String sub(){return String.valueOf(this.a - this.b);}
    public String mult(){return String.valueOf(this.a * this.b);}
    public String div(){return String.valueOf(this.a / this.b);}

}
