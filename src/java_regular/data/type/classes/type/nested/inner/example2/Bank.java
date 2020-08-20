package java_regular.data.type.classes.type.nested.inner.example2;

public class Bank {
    // inner class
    public class Account {
        private long number;
        private double balance;

        public Account(long number) {
            this.number = number;
        }

        public long getNumber() {
            return number;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double sum) {
            balance += sum;
        }

        public boolean withdraw(double sum) {
            if (balance < sum)
                return false;

            balance -= sum;
            return true;
        }

        public void show() {
            System.out.printf("Bank account:" +
                    "\n\tTitle:     \t%s" +
                    "\n\tNumber:    \t%d" +
                    "\n\tBalance:   \t%g\n", title, getNumber(), getBalance());
        }
    }

    private String title;

    public String getTitle() {
        return title;
    }

    public Bank(String title) {
        this.title = title;
    }
}
