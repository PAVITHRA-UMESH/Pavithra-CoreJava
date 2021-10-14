package Session;

import java.util.Scanner;

public class HasADemo {

	public static void main(String[] args) {
		
				Scanner scan = new Scanner(System.in);
				System.out.println("Enter the  number of Employees you want to add : ");
				int num = scan.nextInt();

				Project pro[] = new Project[num];
				int proid;
				String proname;
				String prolocation;
				for(int i = 0;i<num;i++)
				{
					System.out.println("Enter Project Details : ");
					System.out.println("pid     pname     plocation");
					proid = scan.nextInt();
					proname = scan.next();
					prolocation = scan.next();
					pro[i] = new Project(proid, proname, prolocation);
				}
				
				System.out.println("--------------------------------------------------------");
				
				Employee emp[];emp=new Employee[num];
				int empid;
				String empname;
				double empsal;

				for(int i = 0;i<num;i++)
				{
					System.out.println("Enter Employee Details : ");
					System.out.println("eid      ename    esal");
					empid = scan.nextInt();
					empname = scan.next();
					empsal = scan.nextDouble();
					emp[i] = new Employee(empid, empname, empsal, pro[i]);
				}

				// Out of these 4 , display employees having salary > 25000 and working for
				// Webapplication && emp[j].project.pname=="ECommerceWebApp"
				System.out.println("Employee detail Are:");
				for(int j = 0;j<num;j++)
				{

					if (emp[j].esal > 25000 && emp[j].project.pname.equalsIgnoreCase("ECommerceWebApp")) {

						System.out.println("Empid:" + emp[j].eid + ",  EmpName:" + emp[j].ename + ", Salary:" + emp[j].esal+ ",  Projectname: " + emp[j].project.pname);
					}

				}

			}

		}

		class Employee {
			int eid;
			String ename;
			double esal;
			Project project;

			public Employee(int eid, String ename, double esal, Project project) {
				super();
				this.eid = eid;
				this.ename = ename;
				this.esal = esal;
				this.project = project;
			}

		}

		//Relation with Employee and Project(Has-A)
		class Project {
			int pid;
			String pname;
			String plocation;

			public Project(int pid, String pname, String plocation) {
				super();
				this.pid = pid;
				this.pname = pname;
				this.plocation = plocation;
			}

		}


	
