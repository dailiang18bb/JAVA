package dataStructures.Java_12_Sort;

import java.util.*;
import java.util.jar.Pack200;

class Student {
	private int id;
	private String fname;
	private double cgpa;

	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}

	public int getId() {
		return id;
	}

	public String getFname() {
		return fname;
	}

	public double getCgpa() {
		return cgpa;
	}
}


//my Override Comparator class
class checkGPA implements Comparator<Student> {

	@Override
	public int compare(Student s1, Student s2) {
		if (s1.getCgpa() == s2.getCgpa()) {
			if (s1.getFname() == s2.getFname()) {
				return s1.getId() - s2.getId();
			} else {
				return s1.getFname().compareTo(s2.getFname());
			}
		} else {
			return (s2.getCgpa() - s1.getCgpa()) < 0 ? -1 : (s2.getCgpa() == s1.getCgpa() ? 0 : 1);
		}
	}
}

// Complete the code
public class Solution {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int testCases = Integer.parseInt(in.nextLine());

		List<Student> studentList = new ArrayList<Student>();
		while (testCases > 0) {
			int id = in.nextInt();
			String fname = in.next();
			double cgpa = in.nextDouble();

			Student st = new Student(id, fname, cgpa);
			studentList.add(st);

			testCases--;
		}
		in.close();

		// my code

		// Java 8 works

		/*
		 * studentList.sort(new Comparator<Student>() {
		 * 
		 * @Override public int compare(Student s1, Student s2) { if (s1.getCgpa() ==
		 * s2.getCgpa()) { if (s1.getFname() == s2.getFname()) { return s1.getId() -
		 * s2.getId(); } else { return s1.getFname().compareTo(s2.getFname()); } } else
		 * { return (s2.getCgpa() - s1.getCgpa()) < 0 ? -1 : (s2.getCgpa() ==
		 * s1.getCgpa() ? 0 : 1); } } });
		 */
		// end my code

		Collections.sort(studentList, new checkGPA());

		for (Student st : studentList) {
			System.out.println(st.getFname());
		}
	}
}
