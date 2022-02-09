package interviewQues;

import java.util.HashMap;

public class Ticket {

	public static void main(String[] args) {
		
		HashMap<String, String> ticket = new HashMap<>();
		String Dep ="";
		String Des ="";
		ticket.put("Mum", "Hyd");
		ticket.put("Goa", "Chenn");
		ticket.put("Del", "Mum");
		ticket.put("Hyd", "Goa");
		
		for (String s : ticket.keySet()) {
			int flag=0;
			int flag2=0;
			for (String m : ticket.keySet()) {
				if (s.equals(ticket.get(m))) {
					flag = 1;
					break;
				}
				if(ticket.get(s).equals(m)) {
					flag2 = 1;
					break;
				}
			}
			if (flag == 0 ) {
				Dep = s;
			}
			if (flag2 == 0 ) {
				Des = ticket.get(s);
			}
			
		}
		
		System.out.println(Dep +" "+ Des);
	}

}
