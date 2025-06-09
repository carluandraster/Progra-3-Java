package com.Modelo.Estados;

import com.Modelo.Calculadora;

public class SegundoOperandoState extends State {
    private StringBuilder op2;

    public SegundoOperandoState(Calculadora calculadora) {
        super(calculadora);
        this.op2 = new StringBuilder();
    }

    @Override
    public void ingresarOperando(char n) {
        this.op2.append(n);
    }

    @Override
    public double resolver() throws ArithmeticException {
        double resultado = 0;
        this.calculadora.setOperando2(Double.parseDouble(this.op2.toString()));
        if (this.calculadora.getOperacion() != '/' || this.calculadora.getOperando2() != 0)
            this.calculadora.setEstado(new ResultadoState(this.calculadora, resultado));
        else
            switch (this.calculadora.getOperacion()) {
                case '+':
                    resultado = this.calculadora.getOperando1() + this.calculadora.getOperando2();
                    break;
                case '-':
                    resultado = this.calculadora.getOperando1() - this.calculadora.getOperando2();
                    break;
                case '*':
                    resultado = this.calculadora.getOperando1() * this.calculadora.getOperando2();
                    break;
                case '/':
                    resultado = this.calculadora.getOperando1() / this.calculadora.getOperando2();
                    break;
                default:
                    break;
            }

        return resultado;
    }

    @Override
    public void establecerOperacion(char operacion) {
    }
}
