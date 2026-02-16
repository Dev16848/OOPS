class LoanCalculator {
    double calculateEMI(int principal, int time, float rate) {
        float monthlyRate = rate / (12 * 100);
        int months = time * 12;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
               (Math.pow(1 + monthlyRate, months) - 1);
    }

    double calculateEMI(double principal, int time, double rate) {
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
               (Math.pow(1 + monthlyRate, months) - 1);
    }

    double calculateEMI(int principal, int time) {
        double rate = 10.0;
        double monthlyRate = rate / (12 * 100);
        int months = time * 12;
        return (principal * monthlyRate * Math.pow(1 + monthlyRate, months)) /
               (Math.pow(1 + monthlyRate, months) - 1);
    }
}

public class LoanDemo {
    public static void main(String[] args) {
        LoanCalculator lc = new LoanCalculator();

        System.out.println("Home Loan EMI: " + lc.calculateEMI(500000, 20, 7.5f));
        System.out.println("Vehicle Loan EMI: " + lc.calculateEMI(300000.0, 5, 9.0));
        System.out.println("Personal Loan EMI: " + lc.calculateEMI(100000, 2));
    }
}
