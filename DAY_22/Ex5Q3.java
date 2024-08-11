import java.util.*;

clasimport java.util.*;

class Worker {
    public String name;
    public double salary_rate;

    public void get_details() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("\nEnter worker's name : ");
        name = s1.nextLine();
        System.out.println("Enter worker salary  : ");
        salary_rate = s1.nextDouble();
    }

    public void show_details() {
        System.out.println("\nworker details : ");
        System.out.println("Name : " + name);
        System.out.println("Salary  : " + salary_rate);
    }

   
    public double getSalaryRate() {
        return salary_rate;
    }
}

class DailyWorker extends Worker {
    public void workerpay(int days) {
        double pay = days * getSalaryRate();
        System.out.println("Salary : " + pay);
    }
}

class SalariesWorker extends Worker {
    public void workerpay(int hours) {
        double pay = 40 * getSalaryRate();
        System.out.println("Salary : " + pay);
    }
}

class Ex5Q3 {
    public static void main(String[] args) {
        DailyWorker d1 = new DailyWorker();
        SalariesWorker s1 = new SalariesWorker();

        d1.get_details();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter number of days he worked : ");
        int days = s2.nextInt();
        d1.show_details();
        System.out.println("Days : " + days);
        d1.workerpay(days);

        s1.get_details();
        s1.show_details();
        s1.workerpay(40);

        System.out.println("Name: vinay Kumar Pandey");
       
    }
}

s Worker {
    public String name;
    public double salary_rate;

    public void get_details() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("\nEnter worker's name : ");
        name = s1.nextLine();
        System.out.println("Enter worker salary  : ");
        salary_rate = s1.nextDouble();
    }

    public void show_details() {
        System.out.println("\nworker details : ");
        System.out.println("Name : " + name);
        System.out.println("Salary  : " + salary_rate);
    }

   
    public double getSalaryRate() {
        return salary_rate;
    }
}

class DailyWorker extends Worker {
    public void workerpay(int days) {
        double pay = days * getSalaryRate();
        System.out.println("Salary : " + pay);
    }
}

class SalariesWorker extends Worker {
    public void workerpay(int hours) {
        double pay = 40 * getSalaryRate();
        System.out.println("Salary : " + pay);
    }
}

class Ex5Q3 {
    public static void main(String[] args) {
        DailyWorker d1 = new DailyWorker();
        SalariesWorker s1 = new SalariesWorker();

        d1.get_details();
        Scanner s2 = new Scanner(System.in);
        System.out.println("Enter number of days he worked : ");
        int days = s2.nextInt();
        d1.show_details();
        System.out.println("Days : " + days);
        d1.workerpay(days);

        s1.get_details();
        s1.show_details();
        s1.workerpay(40);

        System.out.println("Name: vinay Kumar Pandey");
       
    }
}

