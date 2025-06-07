public class ContaBancaria {

        public String name;
        public double balance;
        public double interestRate;

    public ContaBancaria(String name, double balance, double interestRate) {
        this.name = name;
        this.balance = balance;
        this.interestRate = interestRate;
    }



    //Retorno Nulo
        public void deposit(double amount) {
            balance += amount;
        }

        public void withdraw(double amount) {
            if (amount > balance) {
                System.out.println("Saldo insuficiente!");
            } else {
                balance -= amount;
            }
        }
    }

