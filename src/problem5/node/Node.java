/*
 *  Created by IntelliJ IDEA.
 *  User: Pranav Tomar
 *  Roll no.: 32 (181500475)
 *  section: B
 */
package problem5.node;

import problem5.student.Student;

// to define node properties
public class Node {

    Student student;
    Node next;

    public Student getStudent()
    {
        return student;
    }

    public void setStudent(Student student)
    {
        this.student= student;

    }

    public Node getNext()
    {
        return next;
    }

    public void setNext(Node next)
    {
        this.next = next;
    }

}
