import java.util.*;

public class Employee_Portal 
{
    public static void main(String [] args)
    {
        System.out.println("__Welcome to Employee Portal__");
        System.out.println("\n Please Enter your employee id:-");

        int[] my_array = {1744, 2220};
        int my_input , i, array_size;
        array_size = 2;
        Scanner sc = new Scanner(System.in);
        my_input = sc.nextInt();
        boolean my_check = false;
        

        
        for ( i = 0 ; i < array_size ; i++ ) 
        {
            if (my_array[i] == my_input) 
            {
                my_check = true;
                break;
            }
        }
        
        if(my_check)
            { 
                System.out.println("Aloha Admin");
                System.out.println("\nAdmin do you want to [1] Display or [2] Add Employee Data");
                int choice = sc.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.println("Display");
                    break;
                    case 2:
                        System.out.println("Add Employee Data");
                }
            }
        else
            {
                System.out.println("\n Please Provide Correct Credintals");
            }
            
    }
}
