/*
 *  Created by IntelliJ IDEA.
 *  User: Pranav Tomar
 *  Roll no.: 32 (181500475)
 *  section: B
 */
package problem5.student;
// to store student information and properties
public class Student {
    String name;
    int roll;
    int account;
    int backlog;

    public Student()
    {

    }
    public Student(int roll, int backlog, int account)
    {
        this.roll=roll;
        this.account= account;
        this.backlog=backlog;
    }

    public int getAccount()
    {
        return account;
    }

    public int getBacklog() {
        return backlog;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }}
