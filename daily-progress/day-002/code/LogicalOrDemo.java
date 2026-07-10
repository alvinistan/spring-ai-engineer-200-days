public class LogicalOrDemo {

    public static void main(String[] args) {

        boolean weekend = true;
        boolean holiday = false;

        System.out.println(weekend || holiday);

        boolean employee = false;
        boolean visitorPass = true;

        if(employee || visitorPass){
            System.out.println("Entry Allowed");
        }else{
            System.out.println("Access Denied");
        }

    }
}
