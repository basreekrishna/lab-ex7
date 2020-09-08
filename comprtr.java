/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.util.*;
import java.lang.*;
import java.io.*;
class employee
{
    string name;
    int salary;
    employee(string name,int salary)
            
    {
        this.name=name;
        this.salary=salary;
    }
    public string tostring()
    {
        return this.name+" "+this.salary;
    }
    
}
            
/**
 *
 * @author sksba
 */
public class comprtr 

{
    public static void main(string[]args)
            
    {
        scanner sc=new scanner(system.in);
        int i,n;
        int salary=0;
        string name;
        ArrayList<employee>str=new ArrayList<employee>();
        system.out.println("Enter no of employee");
        n=sc.nextInt();
        for(i=0;i<n;i++)
            
            
        {
            system.out.println("Enter name");
            name=sc.next();
            system.out.println("Enter salary");
            salary=sc.nextInt();
            str.add(new employee(name,scalary));
            
        }
        collections.sort(str,new sortname());
        for(i=0;i<str.size();i++)
            system.out.println(str.get(i));
    }
    
}
class sortname implements comparator<employee>
{
    @override
    public int compare(employee a,employee b)
            
    {
        return a.name.compareTo(b.name);
    }
    
}

    

