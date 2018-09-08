 class Parantclass{
 int x=10;
 int y=20;
 public Parantclass(){
 System.out.println("i am from DC");
 }
 public void m1(){
	 System.out.println("i am from Parantclass m1");
 }
 }
 class Childclass extends Parantclass{
 int z=10;
 public void m2(){
 System.out.println("i am from Childclass m2");
 }
 public Childclass(){
 System.out.println("i am from Childclass");
 }
 public static void main(String[] args){
 Childclass obj=new Childclass();
 System.out.println(obj.x+" "+obj.y+" "+obj.z);
 obj.m2();
 obj.m1();
 }
 }
 
 
 
 