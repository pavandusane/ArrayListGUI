import java.util.*;
class AddressBook {
	ArrayList<String> info = new ArrayList<String>();
	ArrayList<String> info1 = new ArrayList<String>();
	ArrayList<String> info2 = new ArrayList<String>();

	Scanner sc = new Scanner(System.in);
	int id=0;
	String id1=null;
	public void create(){
		System.out.println("Create New Data");
		System.out.println("Enter Name : ");
		String name=sc.next();
		System.out.println("Enter Phone : ");
		String no=sc.next();
		System.out.println("Enter City : ");
		String city=sc.next();
		System.out.println("Enter Address : ");
		String add=sc.next();
		System.out.println("Enter Zip : ");
		String zip=sc.next();
		id1=Integer.toString(id);
		String str1=id1+" "+name+" "+no+" "+city+" "+add+" "+zip;
		info.add(str1);
		id=id+1;
		System.out.println(info);
	}
	public void display(){
		System.out.println("Id"+" | "+"Name"+" | "+"Phone No"+" | "+"City"+" | "+"Address"+" | "+"Zip");

		for(int i=0;i<info.size();i++){
			String str1 = info.get(i);
			String[] splited = str1.split("\\s+");
			System.out.println(splited[0]+" | "+splited[1]+" | "+splited[2]+" | "+splited[3]+" | "+splited[4]+" | "+splited[5]);
		
		}
	}
	
	
	public void update(){
		System.out.println("Update");
		System.out.println("Enter Id");
		int id1=sc.nextInt();
		String str1 = info.get(id1);
		String[] splited = str1.split("\\s+");
		if(str1!=null) {
			System.out.println("Update Name [Y/N]");
			String input1=sc.next();
			if(input1.equals("Y") || input1.equals("y")) {
			System.out.println("Enter Name : ");
			 String name1=sc.next();
			 splited[1]=name1;
			}
			System.out.println("Update Phone [Y/N]");
			String input2=sc.next();
			if(input2.equals("Y") || input2.equals("y")) {
			System.out.println("Enter Phone : ");
			String no1=sc.next();
			splited[2]=no1;
			}
			System.out.println("Update City [Y/N]");
			String input3=sc.next();
			if(input3.equals("Y") || input3.equals("y")) {
			System.out.println("Enter City : ");
			String city1=sc.next();
			splited[3]=city1;
			}
			System.out.println("Update Address [Y/N]");
			String input4=sc.next();
			if(input4.equals("Y") || input4.equals("y")) {
			System.out.println("Enter Address : ");
			String add1=sc.next();
			splited[4]=add1;
			}
			System.out.println("Update Zip [Y/N]");
			String input5=sc.next();
			if(input5.equals("Y") || input5.equals("y")) {
			System.out.println("Enter Zip : ");
			String zip1=sc.next();
			splited[5]=zip1;
			}
		}
		String str2=splited[0]+" "+splited[1]+" "+splited[2]+" "+splited[3]+" "+splited[4]+" "+splited[5];
		info.set(id1,str2);
		System.out.println(info);
				
}
	public void sortbyname(){
        System.out.println("Before Sorting ");

		for(int i=0;i<info.size();i++){
			String str1 = info.get(i);
			String[] splited = str1.split("\\s+");
			info1.add(splited[1]);
		}
        Collections.sort(info1);
        System.out.println("After Sorting by name");
        for(int i=0;i<info1.size();i++){
        	for (int j=0;j<info.size();j++){
        		String str2 = info.get(j);
    			String[] splited1 = str2.split("\\s+");
    			if(info1.get(i).equals(splited1[1])){
    			System.out.println(splited1[0]+" | "+splited1[1]+" | "+splited1[2]+" | "+splited1[3]+" | "+splited1[4]+" | "+splited1[5]);    				
    			}
        	}
        }
        info1.removeAll(info1);
	}	


	
	public void sortbyzip(){
        System.out.println("Before Sorting ");

		for(int i=0;i<info.size();i++){
			String str1 = info.get(i);
			String[] splited = str1.split("\\s+");
			info2.add(splited[5]);
		}	
        Collections.sort(info2);
        System.out.println("After Sorting by zip");
        for(int i=0;i<info2.size();i++){
        	for (int j=0;j<info.size();j++){
        		String str2 = info.get(j);
    			String[] splited1 = str2.split("\\s+");
    			if(info2.get(i).equals(splited1[5])){
    			System.out.println(splited1[0]+" | "+splited1[1]+" | "+splited1[2]+" | "+splited1[3]+" | "+splited1[4]+" | "+splited1[5]);    				
    			}
        	}
        }
        info2.removeAll(info2);
        
	}	

	public void delete(){
		System.out.println("Enter Id");
		int id1=sc.nextInt();
		String str1 = info.get(id1);
		if(str1!=null) {
			info.remove(id1);
		}
		System.out.println("Record Deleted");
	}
	
	public static void main(String[] args) {
		String input6;
	AddressBook ad=new AddressBook();
	do {
		System.out.println("******************************Menu*************************************");
			System.out.println("1.Create");
			System.out.println("2.Update");
			System.out.println("3.Delete");
			System.out.println("4.Sort by name");
			System.out.println("5.Sort by zip");
			System.out.println("6.Display");
			Scanner sc1 = new Scanner(System.in);
			int option = sc1.nextInt();
			switch(option){
			case 1:
					ad.create();
					break;
			case 2:
					ad.update();
					break;
			case 3:
				ad.delete();
				break;
			case 4:
				ad.sortbyname();
				break;
			case 5:
				ad.sortbyzip();
				break;
			case 6:
				ad.display();
				break;
			default:
				System.out.println("Please Enter Valid Option");
				break;
			} 
			System.out.println("Do you want to continue : ");
			input6=sc1.next();
		}while(input6.equals("Y") || input6.equals("y"));    //(input6=="Y" || input6=="y");			
	}
}
