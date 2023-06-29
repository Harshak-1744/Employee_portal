import java.util.*;
import java.util.ArrayList;


public class Employee_Portal 
{
    public static void main(String[] args) 
    {
        System.out.println("_Welcome to Employee Portal_");
        System.out.println("\nPlease enter your employee id:");

        int[] my_array = { 1744, 2220 };
        int my_input, num, array_size;
        array_size = 2;
        try (Scanner sc = new Scanner(System.in)) {
            my_input = sc.nextInt();

            for (num = 0; num < array_size; num++) 
            {
                if (my_array[num] == my_input) 
                {
                    break;
                }
            }

            if (num != array_size) 
            {
                System.out.println("Aloha Admin");
                System.out.println("\nAdmin, do you want to [1] Display or [2] Add Employee Data");
                int choice = sc.nextInt();

                ArrayList<ArrayList<String>> Emp_details = new ArrayList<>();
                ArrayList<String> Emp_name = new ArrayList<>();
                ArrayList<String> Emp_Id = new ArrayList<>();

                Emp_name.add("Harsha");
                Emp_name.add("Kiddo");
                Emp_name.add("Pradeep");
                Emp_name.add("Krishna");

                Emp_Id.add("EMP1744");
                Emp_Id.add("EMP2220");
                Emp_Id.add("EMP2356");
                Emp_Id.add("EMP2417");

                Emp_details.add(Emp_name);
                Emp_details.add(Emp_Id);

                switch (choice) 
                {
                    case 1:
                        System.out.println("\nEmployee Details");

                        for (int k = 0; k < Emp_details.get(0).size(); k++) 
                        {
                            System.out.println(Emp_details.get(0).get(k) + "\t" + Emp_details.get(1).get(k));
                        }
                        break;
                    case 2:
                        System.out.println("Add Employee Data");

                        System.out.println("Enter Employee ID:");
                        String newEmpId = sc.next();

                        System.out.println("Enter Employee Name:");
                        String newEmpName = sc.next();

                        Emp_details.get(0).add(newEmpName);
                        Emp_details.get(1).add(newEmpId);

                        System.out.println("Employee Added Successfully!");

                        System.out.println("Do you want to display the added employee? [Y/N]");
                        String displayChoice = sc.next();
                            
                        if (displayChoice.equalsIgnoreCase("Y")) 
                        {
                            for (int k = 0; k < Emp_details.get(0).size(); k++) 
                            {
                                System.out.println(Emp_details.get(0).get(k) + "\t" + Emp_details.get(1).get(k));
                            }
                        }
                        break;
                    default:
                        System.out.println("Invalid choice");
                        break;
                }
            } 
            else 
            {
                System.out.println("\nPlease provide correct credentials");
            }
        }
    }
}
