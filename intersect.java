/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.util.*;
/**
 *
 * @author sksba
 */
public class intersect
        
{
    public void interscet(Arraylist<Integer> obj1,ArrayList<Integer> obj2)
            
        
    {
        int i,j,k1,k2;
        ArrayList<Integer>obj=new ArrayList<Intrger>();
        for(K1=0;<obj1.size();K1++)
        
        {
            i=obj1.get(k1);
            for(k2=0;k2<obj2.size();k2++)
                
            {
                j=obj2.get(k2);
                if(i==j)
                    obj.add(i);
            }
            
        }
        
    }
    Iterator link=obj.iterator();
    while(link.hasNext())
    system.out.println(link.next());
    
}
public static void main(string[]args)

{

   intersct ob=new intersct();
   ArrayList<Integer>obj1=new Array<>();
   ArrayList<Integer>obj2=new ArrayList<Integer>();
   obj1.add(1);
   obj1.add(4);
   obj1.add(8);
   obj1.add(9);
   obj1.add(11);
   obj.add(15);
   obj.add(17);
   obj.add(28);
   obj.add(41);
   obj.add(59);
   //obj2.add(4);
   obj2.add(7);
   obj2.add(11);
   obj2.add(17);
   obj2.add(19);
   obj2.add(20);
   obj2.add(23);
   obj2.add(28);
   obj2.add(37);
   obj2.add(59);
   obj2.add(81);
   ob.intersect(obj1,obj2);
}

}



}

        

             
    



