package coolections;

public class ArrayList {
	
	class employee{
		private int eid;
		private String ename;
		private float efees;
		public employee() {
			super();
			// TODO Auto-generated constructor stub
		}
		public employee(int eid, String ename, float efees) {
			super();
			this.eid = eid;
			this.ename = ename;
			this.efees = efees;
		}
		public int getEid() {
			return eid;
		}
		
		public void setEid(int eid) {
			this.eid = eid;
		}
		public String getEname() {
			return ename;
		}
		public void setEname(String ename) {
			this.ename = ename;
		}
		public float getEfees() {
			return efees;
		}
		public void setEfees(float efees) {
			this.efees = efees;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		public static void main(String[] args) {
		ArrayList <employee> list= new Arraylist<employee>();
		
		
		employee e1= new employee(1,"Prathamesh",123.0f);
		employee e2= new employee(2,"Avishkar",1231.0f);
		employee e3= new employee(3,"darshan",1232.0f);
		employee e4= new employee(4,"anuj",1233.0f);
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		
System.out.println("EID\tEname\tEfees");

System.out.println(e.getid());
			
		}
		
		
	}

	

}
