
package application;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Linked_List {
    public static void main(String []args){
    ArrayList n1=new ArrayList();
    LinkedList n2=new LinkedList();
    
    doTiming("ArrayList",n1);
    doTiming("LinkedList",n2);
    }
    private static  void doTiming(String type,List list){
        long start=System.currentTimeMillis();
     for(int i=0;i<1E5;i++){
         list.add(i);
     }
     long end=System.currentTimeMillis();
     System.out.println("time taken "+(end-start)+"ms by "+type);
     
    }
}
