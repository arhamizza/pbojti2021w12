

public class Tester4 {
    public static void main(String[] args) {
        Owner ow = new Owner();
        ElectricityBill eBill = new ElectricityBill(5, "R-2");
        ow.pay(eBill);//pay for electricty bill
        System.out.println("-------------------------------");

        PermanentEmployee pEmp = new PermanentEmployee("Dedik", 500);
        ow.pay(pEmp);//pay for electricty employee
        System.out.println("--------------------------------");

        InternshipEmployee iEmp = new InternshipEmployee("Suharto", 5);
        ow.showMyEmployee(pEmp);//show permanent employee info
        System.out.println("----------------------------------");
        ow.showMyEmployee(iEmp);//show internship employee info
    }
}
