import java.util.Scanner;


class Employee{
    int salary=50000;
}
class TeachingAssitant
{
    String Fee="Fee waiver is applicable";   
}

class Professor extends Employee{
    int bonus=10000;
}

class AssitantProfessor extends Employee{
    int bonus=5000;
}


class Dean extends Professor{
    int bonus=20000;
}




class Car
{
    private String model;
    private int speed;


    public Car(String model)
    {
        this.model=model;
        this.speed=0;
    }
    public String getmodel()
    {
        return model;
    }
    public int getspeed()
    {
        return speed;
    }
    public void setspeed(int speed)
    {
        this.speed=speed;
    }
    public void accelerate(int increment)
    {
        setspeed(increment + this.speed);
        System.out.println("The car is going at " + getspeed() + " km/h");
    }
}






public class Demo {
    public static void main(String[] args) {
        Car C =new Car("Chevrolet");
        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("*******Welcome to the Car Demo Program use the following menu to navigate******");
        while(true)
        {
        System.out.println("1. Class:");
        System.out.println("2. Object:");
        System.out.println("3. Method:");
        System.out.println("4. Data Abstraction");
        System.out.println("5. Encapsulation");
        System.out.println("6. Inheritance");
        System.out.println("7. Exit");
        ch=sc.nextInt();
        if (ch==1)
        {
            System.out.println("The Name of the class is: Car");

        }
        else if (ch==2)
        {
            System.out.println("The Object is: C");
        }
        else if (ch==3)
        {
            System.out.println("The methods are: getmodel(), getspeed(), setspeed(), accelerate()");
        }
        else if (ch==4)
        {
            int speed;
            System.out.print("Please Enter the speed to accelerate the car: ");
            try {
                speed=sc.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid integer.");
                sc.next(); 
                continue; 
            }
           C.accelerate(speed);

        }
        else if (ch==5)
        {   System.out.println("Explaining them about the getter and setter function inside the class");
            System.out.println("The model of the car is: " + C.getmodel());
            System.out.println("The speed of the car is: " + C.getspeed() + " km/h");
        }
        else if (ch==6)
        {
            System.out.println("Single level Inheritance");
            Professor p = new Professor();
            System.out.println("The Total compensation for the salary of the Employee Typr Professor is: " + (p.salary + p.bonus));            
            System.out.println("Multi level Inheritance");
            Dean d = new Dean();
            System.out.println("The Total compensation for the salary of the Employee Type Dean is: " + (d.salary + d.bonus + p.bonus));
            System.out.println("heirarchical Inheritance");
            AssitantProfessor ap = new AssitantProfessor();
            System.out.println("The Total compensation for the salary of the Employee Type Assitant Professor is: " + (ap.salary + ap.bonus));
        }
        else if (ch==7)
        {
            System.out.println("Exiting the program...");
            break;
        }
        else
        {
            System.out.println("Invalid choice. Please try again.");
        }

        
        }
       

        
        
        
    }
}