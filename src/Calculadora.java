public class Calculadora {

    public static void main(String[] args) {
        int vitorias = 110;
        int derrotas = 10;
        int saldoVitorias = Calculos.saldoVitorias(vitorias, derrotas);
        String nivel = Calculos.nivelHeroi(saldoVitorias);

        System.out.println("O Herói tem um saldo de " + saldoVitorias + " e está no nível de " + nivel);
    }
}
