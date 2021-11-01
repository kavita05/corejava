/*8. List:
Create 5 objects of Trainer (tr_id,name,course,salary) with different values.
Using Collection, filter out the trainers having salary > 20000 and course is Java.
Put these filtered trainers into another collection for further reference. 
Remove it from the original collection.
Display these filtered trainers collection objects using an iterator.
*/


package SessionTask;

import java.util.ArrayList;
import java.util.Iterator;
public class List8 {

	public static void main(String[] args) {
		ArrayList<Trainee> trainer=new ArrayList<Trainee>();
		trainer.add(new Trainee(101,"kavita","java",22000));
		trainer.add(new Trainee(102,"neha","java",10000));
		trainer.add(new Trainee(103,"samadhan","php",24000));
		trainer.add(new Trainee(104,"saba","java",23000));
		trainer.add(new Trainee(103,"ariff","java",21000));
		
		Iterator<Trainee> itr=trainer.iterator();
		while(itr.hasNext()) {
			Trainee tr=itr.next();
			System.out.println(tr);
		}
		
		System.out.println("================");
		
		ArrayList<Trainee> newtrainer=new ArrayList<Trainee>();
		for(Trainee tr:trainer) {
			if(tr.salary > 20000) {
				if(tr.course == "java") {
					newtrainer.add(tr);
					System.out.println(tr);
				}
				
			
			}
		
		}
		
		trainer.clear();
		System.out.println("=============");
		
		Iterator<Trainee> itr1=trainer.iterator();
		while(itr1.hasNext()) {
			Trainee tr1=itr.next();
			System.out.println(tr1);
		}
	}

}

class Trainee{
	int trid;
	String name;
	String course;
	int salary;
	public Trainee(int trid, String name, String course, int salary) {
		super();
		this.trid = trid;
		this.name = name;
		this.course = course;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "trainee :  "+trid+"   Name:  "+name+"  course:  "+course+"  Salary:  "+salary;
	}

}
