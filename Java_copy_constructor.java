//copy constructor
class Java_copy_constructor{
int id,roll;
Java_copy_constructor(){
id=10;
roll=202;
System.out.println("normal="+id+roll);
}
Java_copy_constructor(Java_copy_constructor t){
id=t.id;
roll=t.roll;
System.out.println("copy="+t.id+t.roll);
}
}
class copy{
public static void main(String args[]){
Java_copy_constructor t1=new Java_copy_constructor();
Java_copy_constructor t2=new Java_copy_constructor(t1);
}
}