package xyz.subhamjena.app1;

import org.springframework.stereotype.Component;

@Component
public class demo2 {
    public void student(String name ,int roll){
        System.out.println("Student Details........");
        System.out.println("name is :" + name +"\n roll is :" + roll);
    }
    
    public int mark(int math) {
        return math;
    }
}
