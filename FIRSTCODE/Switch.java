package FIRSTCODE;

import java.util.*;

// import javafx.scene.control.Button;

public class Switch {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int button = sc.nextInt();

        switch (button) {
            case 1:
                System.out.println("hello");
                break;
            case 2:
                System.out.println("mukesh");
                break;
            case 3:
                System.out.println("kumar");
                break;
            case 4:
                System.out.println("welcome");
                break;
            default:
                System.out.println("invalid button");
        }

    }
}