import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;

import com.face.dao.PlayerDAO;

//import com.mysql.jdbc.Statement;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException, SQLException, ClassNotFoundException {
		
		boolean i = false;
		do {
		
		System.out.println("MENU");
		
		System.out.println("\n	1.List of players");
		System.out.println("	2.Add new players");
		System.out.println("	3.Search players");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int choice = Integer.parseInt(br.readLine());
		//Statement statement = (Statement) con.createStatement();
		
		PlayerDAO pdao = new PlayerDAO();
		
		switch(choice) {
		
		
		case 1:
			
			pdao.listofPlayer();
			i=true;
			break;
			
		case 2:
			
			try {
				
				pdao.createPlayer();
				
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i=true;
			break;
			
		case 3:
			
			pdao.selectPlayers();
			i=true;
			break;
		
		}
		
		}while(i);		

	}

}
