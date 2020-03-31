/*
 *  Created by IntelliJ IDEA.
 *  User: Pranav Tomar
 *  Roll no.: 32 (181500475)
 *  section: B
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {

    public static void main(String[] args)
    {
        MyBinarySearchTree obj = new MyBinarySearchTree();
        obj.insert(21);
        obj.insert(22);
        obj.insert(23);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);
        obj.insert(60);
        obj.insert(70);
        System.out.print("Left Child nodes are:  ");
        obj.printLeftNode(obj.root);
        System.out.println();
        System.out.println("No of nodes that doesn't have a left child node are:  "+obj.getCount());
        obj.preOrder(obj.root);
    }
}

