
package application;
import java.util.ArrayList;
import java.util.*;
public class Array_list1 {
    public static void main(String []args){
        ArrayList no=new ArrayList();
        no.add(10);
        no.add(100);
        no.add(78);
        Collections.sort(no);
        for(int i=0;i<no.size();i++){
            System.out.println(no.get(i));
        }
        no.remove(0);            //slow execution
        for(int i=0;i<no.size();i++){
            System.out.println(no.get(i));
        }
        ArrayList l1=new ArrayList();
        l1.add("Ashish sah");
        l1.add("shyam");
        l1.add("mohan");
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        l1.remove(1);            //slow execution
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
        for(int i=0;i<l1.size();i++){
            System.out.println(l1.get(i));
        }
    }
}
