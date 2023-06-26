import java.util.*;


public class Employee_Portal 
{
    public static void main(String [] args)
    {
        System.out.println("_Welcome to Employee Portal_");
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
                        
                        ArrayList<ArrayList<String>> Emp_details = new ArrayList<>();
                        ArrayList <String> Emp_name = new ArrayList<String>();
                        System.out.println("\nEmployee_Details");
                        
                        Emp_name.add("Harsha");
                        Emp_name.add("Kiddo");
                        Emp_name.add("Pradeep");
                        Emp_name.add("Krishna");
       
                        ArrayList<String> Emp_Id = new ArrayList<String>();
                        
                        Emp_Id.add("EMP1744");
                        Emp_Id.add("EMP2220");
                        Emp_Id.add("EMP2356");
                        Emp_Id.add("EMP2417");
       
                        Emp_details.add(Emp_name);
                        Emp_details.add(Emp_Id);
       
       
                        for (int k = 0; k < Emp_details.get(0).size(); k++) 
                        {
                            System.out.println(Emp_details.get(0).get(k) + "\t" + Emp_details.get(1).get(k));
                        }


                    break;
                    case 2:
                        System.out.println("Add Employee Data");
                    break;
                }
            }
        else
            {
                System.out.println("\n Please Provide Correct Credintals");
            }
            
    }
}
