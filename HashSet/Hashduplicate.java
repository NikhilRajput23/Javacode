import java.util.HashSet;
import java.util.Scanner;
class Student{
 int id;
 String name;
 Student (int id,String name){
    this.id=id;
        this.name=name;
 }
 @Override
 public int hashCode(){
    return id;
 }
 @Override
  public  boolean equals(Object obj){
    Student s=(Student) obj;
    return this.id==s.id;
  }
}
public class Hashduplicate{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
  
    HashSet <Student> set=new HashSet<>();
      int n=sc.nextInt();
    for(int i=0;i<n;i++){
        int id=sc.nextInt();
        String name=sc.next();
        set.add(new Student(id, name));
    }
    for(Student s:set){
        System.out.println(s.id+" "+s.name);
    

  
}}
}