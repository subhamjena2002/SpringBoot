package xyz.subhamjena.app1;

import org.springframework.stereotype.Component;

@Component
public class demo3 {
    public void add(int number1, int number2) {
        int sum = number1 + number2;
        System.out.println("\n\n\nsum is :" + sum);
    }

    public int subtract( int number1, int number2) {
        return number1-number2;
    }
    
}
