public class Main {
    public static void main(String[] args) {

        //Instancia de cuenta de banco
        CuentaBanco cuentaBanco = new CuentaBanco("Luis Lopez", 1000);

        //ACTIVIDAD
        //Retirar 500
        cuentaBanco.retiro(500);

        //Depositar 5,000
        cuentaBanco.deposito(5000);

        //Retirar  2,000
        cuentaBanco.retiro(2000);

        //Imprime el nombre del propietario de la cuenta
        System.out.println(cuentaBanco.getPropietario());

        //Imprime el saldo actual del propietario
        System.out.println(cuentaBanco.getSaldo());

    }
}