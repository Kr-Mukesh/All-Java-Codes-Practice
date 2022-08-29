package STRING;

public class String1 {
    public static void main(String[] args) {

        String name1 = "mukesh";
        String name2 = "mukesh1";

        // method one

        // if(name1.compareTo(name2)==0){
        // System.out.println("strings are eqal");
        // }else{
        // System.out.println("not eqal");
        // }

        // method two

        if (name1 == name2) {
            System.out.println("strings are eqal");
        } else {
            System.out.println("not eqal");
        }
    }
}