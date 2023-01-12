import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.student.manage.Student;
import com.student.manage.StudentDao;

public class Start {

	public static void main(String[] args)throws  IOException{
		System.out.println("welcome to student Management app");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			System.out.println("press 1 to add student");
			System.out.println("press 2 to delete student");
			System.out.println("press 3 to display student");
			System.out.println("press 4 to exit");
			int c =Integer.parseInt(br.readLine());
			
			if (c ==1) 
			{
				//add student
				System.out.println("enter Student Name");
				String name = br.readLine();
				
				System.out.println("enter Student phone name:");
				String phone =br.readLine();
				
				System.out.println("enter Student city:");
				String city = br.readLine();
				
				//create student object to store student
				Student st = new Student(name, phone, city);
				
				boolean ans = StudentDao.insertStudentToDB(st);
				if (ans) {
					System.out.println("Student added successfully.");
				}
				else {
					System.out.println("something went wrong.");
				}
				System.out.println(st);
				
			}else if (c==2) 
			{
				System.out.println("enter student is to delete:");
				int userID = Integer.parseInt(br.readLine());
				
				boolean f = StudentDao.deleteStudent(userID);
				if (f) {
					System.out.println("deleted");
				}else {
					System.out.println("something went wrong...");
				}
				
				
				
			}else if (c==3) 
			{
				StudentDao.showAllStudents();
			}else if (c==4) 
			{
				break;
			}else {
				
			}
			
		}
		System.out.println("Thank you....");

	}

}
