import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Employee[] employess = new Employee[10];
        Random random = new Random();
        for (int i = 0; i < employess.length; i++) {
            double salary = 50_000 + 50_000 * random.nextDouble();
            employess[i] = new Employee("name" + i, random.nextInt(1, 6), salary);
        }

        employAlL(employess);
        System.out.println();
        System.out.println(getSum(employess));
        System.out.println(getMinSalary(employess));
        System.out.println(getMaxSalary(employess));
        System.out.println(getAverageSalary(employess));
        System.out.println();
        employAlLs(employess);
        System.out.println();

    }

    private static void employAlL(Employee[] employess) {
        for (Employee employee : employess) {
            System.out.println(employee);
        }
    }

    public static double getSum(Employee[] employess) {
        double sum = 0;
        for (Employee employee : employess) {
            sum = sum + employee.getSalary();
        }
        return sum;
    }

    public static Employee getMinSalary(Employee[] employess) {
        Employee minEmployee = null;
        for (Employee employee : employess) {
            if (minEmployee == null || minEmployee.getSalary() > employee.getSalary()) {
                minEmployee = employee;
            }
        }
        return minEmployee;
    }

    public static Employee getMaxSalary(Employee[] employess) {
        Employee maxEmployee = null;
        for (Employee employee : employess) {
            if (maxEmployee == null || maxEmployee.getSalary() < employee.getSalary()) {
                maxEmployee = employee;
            }
        }
        return maxEmployee;
    }

    public static double  getAverageSalary(Employee[] employess) {
        return getSum(employess) / employess.length;
        }



    private static void employAlLs(Employee[] employess) {
        for (Employee employee : employess) {
            System.out.println(employee.getName());
        }
    }
        }






