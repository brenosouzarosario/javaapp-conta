package Model;

public class Cls_Conta {

    private float valor;

    public void Cls_Conta(float valor) {
        valor = 0;
    }

    public float sacar(float valorSaque) {
        if (valor < valorSaque) {
            throw new IllegalArgumentException();
        } else {
            valor = valor - valorSaque;
        }
        return valor;
    }

    public float depositar(float valorDeposito) {
        valor = valor + valorDeposito;
        return valor;
    }
}
