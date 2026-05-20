package entity;

public class Porder {
   private int id;
   private String name;
   private int A;
   private int B;
   private int C;
   public Porder(String name, int a, int b, int c) {
	super();
	this.name = name;
	A = a;
	B = b;
	C = c;
   }
   public Porder() {
	super();
	// TODO Auto-generated constructor stub
   }
   public int getId() {
	return id;
   }
   public void setId(int id) {
	this.id = id;
   }
   public String getName() {
	return name;
   }
   public void setName(String name) {
	this.name = name;
   }
   public int getA() {
	return A;
   }
   public void setA(int a) {
	A = a;
   }
   public int getB() {
	return B;
   }
   public void setB(int b) {
	B = b;
   }
   public int getC() {
	return C;
   }
   public void setC(int c) {
	C = c;
   }
   
}
