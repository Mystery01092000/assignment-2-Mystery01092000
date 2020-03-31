/*
 *  Created by IntelliJ IDEA.
 *  User: Pranav Tomar
 *  Roll no.: 32 (181500475)
 *  section: B
 */
package problem3.main;

import problem3.myqueue.MyPriorityQueue;

// executable class
// use problem5.student.Student class to create object of student
public class MyMain {

    public static void main(String[] args)
    {
        MyPriorityQueue obj = new MyPriorityQueue();
        obj.insert("Pranav", 1);
        obj.insert("rishabh",5);
        obj.insert("kartik", 3);
        obj.insert("sarvendra", 22);
        obj.insert("naina",16);
        obj.insert("Vrinda", 33);
        System.out.println("Student according to their roll  number are: ");
        obj.peep();

    }
}
