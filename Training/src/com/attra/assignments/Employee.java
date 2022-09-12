package com.attra.assignments;
	public class Employee {
	    public String name;
	      public double salary;
	      public int empid;
	      public String addres;
	    
	    
	            public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public double getSalary() {
	        return salary;
	    }
	    public void setSalary(double salary) {
	        this.salary = salary;
	    }
	    public int getEmpid() {
	        return empid;
	    }
	    public void setEmpid(int empid) {
	        this.empid = empid;
	    }
	    public String getaddress()
	    {
			return addres;
	    	
	    }
	    public void setaddress(String address)
	    {
	    	this.addres=address;
	    }
	        
	           public void Employee() {
	              System.out.println("name  : " + name );
	              System.out.println("salary :" + salary);
	              System.out.println("empid  : " + empid );
	              System.out.println("address :" + addres);
	           }
	           public static void main(String args[]) {
	          
	              Employee emp = new Employee();
	              emp.setSalary(30);
	              emp.setName("Deepak");
	              emp.setEmpid(326056);
	              emp.setaddress("Bangalore");
	             emp.Employee();
	              
	               }
	    
	}


