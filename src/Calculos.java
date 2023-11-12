public class Calculos {
    public static int saldoVitorias(int vitorias, int derrotas) {
        return vitorias - derrotas;
    }

    public static String nivelHeroi(int saldo) {
        if (saldo < 10) {
            return "Ferro";
        } else if (saldo <= 20) {
            return "Bronze";
        } else if (saldo <= 50) {
            return "Prata";
        } else if (saldo <= 80) {
            return "Ouro";
        } else if (saldo <= 90) {
            return "Diamante";
        } else if (saldo <= 100) {
            return "Lendário";
        } else {
            return "Imortal";
        }
    }
}
