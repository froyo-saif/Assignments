class Student{
	private String stu_name;
	private int mark_eng;
	private int mark_math;
	private int mark_sci;
	
	static int roll_no;
	static int highet;
	static Student obj;
	static {
		roll_no=1000;
		highet=0;
		obj=null;
	}
	public Student() {
		// TODO Auto-generated constructor stub
		roll_no++;
	}
	public int  getRoll_no() {
		return roll_no;
	}
	public String getStu_name() {
		return stu_name;
	}
	public void setStu_name(String stu_name) {
		this.stu_name = stu_name;
	}
	public int getMark_eng() {
		return mark_eng;
	}
	public void setMark_eng(int mark_eng) {
		this.mark_eng = mark_eng;
	}
	public int getMark_math() {
		return mark_math;
	}
	public void setMark_math(int mark_math) {
		this.mark_math = mark_math;
		if(mark_math>highet) {
			obj=this;
			highet=mark_math;
		}
	}
	public int getMark_sci() {
		return mark_sci;
	}
	public void setMark_sci(int mark_sci) {
		this.mark_sci = mark_sci;
	}

}
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj1=new Student();
		obj1.setStu_name("RAM");
		obj1.setMark_eng(76);
		obj1.setMark_math(99);
		obj1.setMark_sci(86);
		Student obj2= new Student();
		obj2.setStu_name("SHYAM");
		obj2.setMark_eng(66);
		obj2.setMark_math(89);
		obj2.setMark_sci(96);
		Student obj3= new Student();
		obj3.setStu_name("ROHIT");
		obj3.setMark_eng(96);
		obj3.setMark_math(77);
		obj3.setMark_sci(66);
		Student obj4= new Student();
		obj4.setStu_name("ROHAN");
		obj4.setMark_eng(76);
		obj4.setMark_math(97);
		obj4.setMark_sci(76);
		
		Student resultStudent=Student.obj;
		System.out.println("Roll No: "+resultStudent.getRoll_no()+" "+"Name: "+resultStudent.getStu_name());
	}

}
