package de.demo;

public class Demo {

	public static void main(String[] args) throws Exception {
		
		try(Table table = new Table("Select * from MyTable")) {
			
			while (table.next()) {
				for(int column = 0; column < table.getColumnCount(); column ++) {
					System.out.print(table.getValue(column) + "\t");
					
				}
				System.out.println();
			}
			
			
		}
		
		
		System.out.println("ende");
	}

}
