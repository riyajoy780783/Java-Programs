package com.face.dao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.face.player.Player;
import com.face.util.ConnectionManager;


public class PlayerDAO {
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	ConnectionManager con = new ConnectionManager();
	
	
	
		public void createPlayer() throws IOException, SQLException, ClassNotFoundException {
		//insert new player details to database
		
		Connection conn = con.getConnection();
			
		Statement statement =  conn.createStatement();
			
		System.out.print("Enter the playername : ");
		String playerName = br.readLine();
		System.out.print("Enter the Countryname : ");
		String countryName = br.readLine();
		System.out.print("Enter the skill : ");
		String skill = br.readLine();
		System.out.print("Enter the Team name : ");
		String teamName = br.readLine();
		
		statement.executeUpdate("INSERT INTO playerdetails (Playerdetails,Country,Skill,Teamname) values ('"+playerName+"','"+countryName+"','"+skill+"','"+teamName+"') ");
			
			
		
		
	}
		
		public void listofPlayer() throws ClassNotFoundException, SQLException {
			
			Connection conn = con.getConnection();
			
			Statement statement =  conn.createStatement();
			ResultSet res=statement.executeQuery("select * from playerdetails");
			
			System.out.println("Player name\tcountry Name\tskill\t\tTeam name");
			while (res.next()) {
	            
	            String Playername = res.getString(1);
	            String countryName = res.getString(2);
	            String skill = res.getString(3);
	            String teamname = res.getString(4);
	            
				System.out.println(Playername+"\t"+countryName+"\t\t"+skill+"\t\t"+teamname);
			}
			
		}
		
		
		public void selectPlayers() throws ClassNotFoundException, SQLException, IOException {
			
			Connection conn = con.getConnection();
			
			Statement statement =  conn.createStatement();
			
			System.out.println("Enter the skill");
			String skill = br.readLine();
			
			ResultSet res=statement.executeQuery("select * from playerdetails where Skill='"+skill+"'");
			
			System.out.println("Player name\tcountry Name\tskill\t\tTeam name");
			while (res.next()) {
			
			String Playername = res.getString(1);
            String countryName = res.getString(2);
            skill = res.getString(3);
            String teamname = res.getString(4);
            
			
			System.out.println(Playername+"\t"+countryName+"\t\t"+skill+"\t\t"+teamname);
			}
		}
}
