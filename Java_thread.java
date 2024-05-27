class test implements Runnable{
 public void run(){

  for(int i=0;i<4;i++){
try{
System.out.println("i is  "+i);
Thread.sleep(2000);}
catch(InterruptedException e){}
}
 for(int j=0;j<4;j++){
System.out.println("j is  "+j);
}
}
}
class test2 extends Thread{
public void run(){
 for(int k=0;k<2;k++){
System.out.println("k is  "+k);
}}
}
class Java_thread{
public static void main(String args[]){
test t = new test();
test2 t2 = new test2();
Thread t1 = new Thread(t);
t1.start();
t2.start();
t2.setPriority(Thread.MAX_PRIORITY);
t1.setPriority(Thread.MIN_PRIORITY);
System.out.println(t1.getPriority());
}
}