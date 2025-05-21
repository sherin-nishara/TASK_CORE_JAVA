
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

class Ticket {
    String name;
    String port;
    String dest;
    String date;
    static int count = 1;
    
    Ticket(String name, String port, String dest, String date){
        this.name = name;
        this.port = port;
        this.dest = dest;
        this.date = date;
        count++;
    }
    
    public static void book(Scanner sc, HashMap<Integer,Ticket> rec){
        System.out.print("name : ");
        String name = sc.nextLine();
        System.out.print("source : ");
        String port = sc.nextLine();
        System.out.print("destination : ");
        String dest = sc.nextLine();
        System.out.print("date : ");
        String date = sc.nextLine();
        int id = count;
        Ticket tic = new Ticket(name,port,dest,date);
        rec.put(id,tic);
        System.out.println("created");
    }
    
    public static void view(HashMap<Integer,Ticket> rec){
        for(Map.Entry<Integer,Ticket> s: rec.entrySet()){
            System.out.println("--------------\n"+"ticket Id : " + s.getKey() + " \n" + s.getValue());
        }
    }
    
    public static void byId(Scanner sc, HashMap<Integer,Ticket> rec){
        System.out.print("enter ticketId : ");
        int search = sc.nextInt();
        sc.nextLine();
        for(Map.Entry<Integer,Ticket> s: rec.entrySet()){
            if(search == s.getKey()){
                System.out.println(s.getValue());
            }else{
                System.out.println("id not found");
            }
        }
    }
    
    public static void update(Scanner sc, HashMap<Integer,Ticket> rec){
        System.out.println("enter id : ");
        int search = sc.nextInt();
        sc.nextLine();
        for(Map.Entry<Integer,Ticket> s: rec.entrySet()){
            if(search == s.getKey()){
                System.out.println("name : ");
                String name = sc.nextLine();
                System.out.println("from : ");
                String port = sc.nextLine();
                System.out.println("dest : ");
                String dest = sc.nextLine();
                System.out.println("date : ");
                String date = sc.nextLine();
                
                Ticket newTic = new Ticket(name,port,dest,date);
                
                rec.put(search,newTic);
            }else{
                System.out.println("id not found");
            }
        }
        
    }
    @Override
    public String toString(){
        return " name : "+ name+" \n source: "+port+" \n destination: "+ dest+" \n date: "+ date+ "\n---------------";
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        HashMap<Integer,Ticket> rec = new HashMap<>();
        
        boolean choice = true;
        while(choice){
            System.out.println("1)book 2)view 3)view by id 4)update 5)cancel \n 6)exit");
            int c = sc.nextInt();
            sc.nextLine();
            switch(c){
                case 1:
                    book(sc,rec);
                    break;
                case 2:
                    view(rec);
                    break;
                case 3:
                    byId(sc,rec);
                    break;
                case 4:
                    update(sc,rec);
                    break;
                case 6:
                    choice = false;
                    break;
            }
        }
    }
}
