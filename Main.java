import java.util.Scanner;
import java.util.ArrayList;

class Main {
    private int studentId;
    private String name;
    private int age;
    private String course;
    
    Main(int studentId, String name, int age, String course){
        this.studentId =studentId;
        this.name = name;
        this.age = age;
        this.course = course;
    }
    static{
        System.out.println("------- Student Management System---------");
    }
    public int getStudentId(){
        return studentId;
    }
    public void setDetails(String name, int age, String course){
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public static void addStd(Scanner sc, ArrayList<Main> students){
        System.out.print("Enter count of students want to add : ");
        int count = sc.nextInt();
        sc.nextLine();
        for(int i = 0; i < count; i++){
            System.out.print("\nStudent ID: ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Student Name: ");
            String name = sc.nextLine();
            System.out.print("Student Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Student Course: ");
            String course = sc.nextLine();
            
            Main std = new Main(id,name,age,course);
            students.add(std);
        }
        System.out.println("Student(S) created successfully");
    }
    public static void viewStd(ArrayList<Main> students){
        System.out.println("----All Current Students-----");
        for(Main s : students){
            System.out.println(s);
        }
    }
        public static void viewById(ArrayList<Main> students, Scanner sc){
         System.out.print("Enter id: ");
         int search = sc.nextInt();
         sc.nextLine();  
         boolean found = false;
         for(Main s : students){
              if(search == s.getStudentId()){
                  System.out.println(s);
                  found = true;
                  break;
              }
          }
          if(!found){
              System.out.println("ID cant found");
          }
    }
     public static void updateStd(ArrayList<Main> students, Scanner sc){
         System.out.print("Enter id to update: ");
         int search = sc.nextInt();
         sc.nextLine();
         for(Main s: students){
             if(search == s.getStudentId()){
                System.out.print("Student Name: ");
                String name = sc.nextLine();
                System.out.print("Student Age: ");
                int age = sc.nextInt();
                sc.nextLine();
                System.out.print("Student Course: ");
                String course = sc.nextLine();
                s.setDetails(name,age,course);
                System.out.println("Updated successfully\n" + s);
             }else{
                 System.out.println("ID cant found");
             }
         }
    }
    
    public static void deleteStd(ArrayList<Main> students, Scanner sc){
        System.out.print("Enter id to delete: ");
        int search = sc.nextInt();
        sc.nextLine();
        boolean found = false;
        for(Main s: students){
            if(search == s.getStudentId()){
                students.remove(s);
                found =true;
                break;
            }
        }
        if(!found){
            System.out.print("ID cant found");
        }
    }
    @Override
    public String toString(){
        return "\nStudent ID : "+studentId+"\nName : "+name+"\nAge : "+age+"\nCourse : "+course;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Main> students = new ArrayList<>();
        
        boolean exit = true;
        while(exit){
            System.out.print("\nselect action by number \n 1)Add student \n 2)View all Records \n 3)View Student by ID \n 4)Update details \n 5)Delete Student \n 6)exit \n action : ------ ");
            int opt = sc.nextInt();
            sc.nextLine();
            switch(opt){
                case 1:
                    addStd(sc,students);
                    break;
                case 2:
                    viewStd(students);
                    break;
                case 3:
                    viewById(students,sc);
                    break;
                case 4:
                    updateStd(students,sc);
                    break;
                case 5:
                    deleteStd(students,sc);
                    break;
                case 6:
                    exit = false;
                default:
                    System.out.println("give provided numbers only");
            }
        }
        exit = false;
    }
}
