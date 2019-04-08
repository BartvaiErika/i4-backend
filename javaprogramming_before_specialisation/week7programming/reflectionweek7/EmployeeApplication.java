//package week7programming.reflectionweek7;
//import java.nio.file.Files;
//import java.nio.file.Paths;
//import java.util.*;
//import java.io.File;
//import java.io.FileReader;
//public class EmployeeApplication {
//
//    public static void main(String[] args) {
//        week4programming.excercise9week4.FileReader fileReader = new week4programming.excercise9week4.FileReader();
//        readDocument(fileReader);
//    }
//
//    private static void readDocument(week4programming.excercise9week4.FileReader reader) {
//        System.out.println("Monthly payments");
//        File file = new File("/home/erika/IdeaProjects/java-projects/src/week7programming/reflectionweek7/employees.csv");
//        String filePath = file.getAbsolutePath();
//        List<String> lines = reader.getLines("/home/erika/IdeaProjects/java-projects/src/week7programming/reflectionweek7/employees.csv");
//        lines.remove(0);
//        Integer sum = 0;
//        String department = "";
//        String employee = "";
//        Integer departmentsPayment = 0;
//        Map<String, Integer> departementsPayments = new HashMap<>();
//        Integer biggestSalary = 0;
//        String departementOfBiggestSalary = "IT";
//        for (String line : lines) {
//            //Transfer successful: 2100€ to account AT1111222233334444
//            //John;Human Resources;2100;AT1111222233334444
//
//            List<String> employeeData = Arrays.asList(line.split(";"));
//            String salary = employeeData.get(2);
//            Integer salaryAsNumber = Integer.valueOf(salary);
//            if (Integer.valueOf(salary) > biggestSalary) {
//                biggestSalary = Integer.valueOf(salary);
//                departementOfBiggestSalary = employeeData.get(1);
//                String biggestSalaryEmployee = employeeData.get(0);
//            }
//
//            sum = sum + salaryAsNumber;
//            String account = employeeData.get(4);
//            department = employeeData.get(1);
//            departementsPayments.put(department, departmentsPayment);
//            if (departementsPayments.containsValue(department)) {
//                departementsPayments.replace(department, departmentsPayment, departmentsPayment);
//            } else
//                departementsPayments.put(department, departmentsPayment);
//
//            System.out.println("Transfer successful: " + salary + " to account " + account);
//
//        }
//        String mostPayingdepartement = "IT";
//        Integer paymentOfMostPayingdepartement = 0;
//        for (departmentsPayment: departementsPayments) {
//            if (departmentsPayment > paymentOfMostPayingdepartement) {
//                paymentOfMostPayingdepartement = departementsPayments.get(paymentOfMostPayingdepartement);
//             //   mostPayingdepartement = departementsPayments.keySet(departmentsPayment);
//
//            }
//        }
//
//        System.out.println("Total amount paid: " + sum + "€");
//        System.out.println("Most paying department: " + mostPayingdepartement);
//        System.out.println("Highest salary employee: " + employee + " from " + departementOfBiggestSalary + " with " + biggestSalary + " €");
//
//
//     }
//}
