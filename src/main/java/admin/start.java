package admin;
import java.io.*;

import siddhant.CSGO;
import siddhant.DAO;
import siddhant.characters;
import siddhant.gameenter;
import siddhant.guns;
import siddhant.map;
import siddhant.nfs;
import siddhant.valorant;

public class start {
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Hello User, Please Enter Your Name : \n");
		String user = br.readLine();
		System.out.println("Welcome to the Gaming Environment "+user);
		System.out.println(" ");
		
			System.out.println("PRESS 1 For VALORANT");
			System.out.println("PRESS 2 For CS:GO");
			System.out.println("PRESS 3 For Need For Speed");
			int c = Integer.parseInt(br.readLine());
			if(c == 3)
			{
				System.out.println(" ");
				System.out.println("Welcome to Need For Speed");
				System.out.println(" ");
				System.out.println("Enter User Name : ");
				String Uname = br.readLine();
				System.out.println("Enter Password : ");
				int Upass = Integer.parseInt(br.readLine());
				
				gameenter g = new gameenter(Uname, Upass);
				boolean ans1 = DAO.passcheck(g);
				if(ans1) {
					System.out.println(" ");
					System.out.println("Correct Password");
					System.out.println(" ");
					System.out.println("Welcome to NEED FOR SPEED");
					System.out.println("Enter Player Name: ");
					String name = br.readLine();
					System.out.println("Enter Player ID : ");
					int ID = Integer.parseInt(br.readLine());
				
					nfs n = new nfs(name, ID);
					boolean ans = DAO.insertPlayerRecordToDB(n);
					if(ans) {
						System.out.println("Player Created ");
						System.out.println(n);
						System.out.println(" ");
						System.out.println("Choose Characters");
						System.out.println("Press 1 for Male");
						System.out.println("Press 2 for Female");
						int chara = Integer.parseInt(br.readLine());
						if(chara == 1)
						{
							characters ch = new characters("Male");
							DAO.insertCharaintoDB1(ch);
								System.out.println("Male choosen");
								System.out.println(" ");
								System.out.println("Choose Gun");
								System.out.println("Press 1 for Machine Gun");
								System.out.println("Press 2 for Phantom");
								System.out.println("Press 3 for Vandal");
								System.out.println("Press 4 for Deagle");
								int gun = Integer.parseInt(br.readLine());
								System.out.println(" ");
								if( gun == 1)
								{
									guns gn = new guns("Machine Gun");
									DAO.insertgunintoDB(gn);
									System.out.println("Machine Gun Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									if( mapvar == 1)
									{
										map m = new map("Heaven");
										DAO.insertmapintoDB(m);
										System.out.println("Heaven Map Selected.");
										System.out.println("All records Set");
										System.out.println("Press 1 to show");
										int infovar = Integer.parseInt(br.readLine());
										if( infovar == 1)
										{
											DAO.getData();
										}
										
										System.out.println("Player Information : ");
									}
									if( mapvar == 2)
									{
										map m = new map("VCT");
										DAO.insertmapintoDB(m);
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
									if( mapvar == 3)
									{
										map m = new map("BRIM");
										DAO.insertmapintoDB(m);
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}		
								}
								if( gun == 2)
								{
									guns gn = new guns("Phantom Gun");
									DAO.insertgunintoDB(gn);
									System.out.println("Phantom Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 3)
								{
									guns gn = new guns("Vandal Gun");
									DAO.insertgunintoDB(gn);
									System.out.println("Vandal Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									}
								}
								if( gun == 4)
								{
									guns gn = new guns("Deagle Gun");
									DAO.insertgunintoDB(gn);
									System.out.println("Deagle Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
							}
						
						if(chara == 2)
						{
							characters ch = new characters("Female");
							boolean anschar = DAO.insertCharaintoDB1(ch);
							if( anschar) {
								System.out.println("Female choosen");
								System.out.println(" ");
								System.out.println("Choose Gun");
								System.out.println("Press 1 for Machine Gun");
								System.out.println("Press 2 for Phantom");
								System.out.println("Press 3 for Vandal");
								System.out.println("Press 4 for Deagle");
								int gun = Integer.parseInt(br.readLine());
								System.out.println(" ");
								if( gun == 1)
								{
									guns gn = new guns("Machine Gun");
									DAO.insertgunintoDB(gn);
									System.out.println("Machine Gun Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
									
								}
								if( gun == 2)
								{
									guns gn = new guns("Phantom Gun");
									DAO.insertgunintoDB(gn);
									System.out.println("Phantom Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 3)
								{
									guns gn = new guns("Vandal Gun");
									DAO.insertgunintoDB(gn);
									System.out.println("Vandal Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 4)
								{
									guns gn = new guns("Deagle Gun");
									DAO.insertgunintoDB(gn);
									System.out.println("Deagle Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
							}
						}
					}else {
						System.out.println("Some error Occured While Inserting...Please try Again!");
					}
				}else {
					System.out.println("Incorrect Password");
				}
			}
			if( c == 2)
			{
				System.out.println(" ");
				System.out.println("Welcome to CS:GO");
				System.out.println(" ");
				System.out.println("Enter User Name : ");
				String Uname = br.readLine();
				System.out.println("Enter Password : ");
				int Upass = Integer.parseInt(br.readLine());
				
				gameenter g = new gameenter(Uname, Upass);
				boolean ans1 = DAO.passcheck(g);
				if(ans1) {
					System.out.println(" ");
					System.out.println("Correct Password");
					System.out.println("Welcome to CS:GO");
					System.out.println(" ");
					System.out.println("Enter Player Name: ");
					String name = br.readLine();
					System.out.println("Enter Player ID : ");
					int ID = Integer.parseInt(br.readLine());
				
					CSGO cs = new CSGO(name, ID);
					boolean ans = DAO.insertPlayerRecordToDB(cs);
					if(ans) {

						System.out.println("Player Created ");
						System.out.println(cs);
						System.out.println(" ");
						System.out.println("Choose Characters");
						System.out.println("Press 1 for Male");
						System.out.println("Press 2 for Female");
						int chara = Integer.parseInt(br.readLine());
						if(chara == 1)
						{
							characters ch = new characters("Male");
							boolean anschar = DAO.insertCharaintoDB2(ch);
							if( anschar) {
								System.out.println("Male choosen");
								System.out.println(" ");
								System.out.println("Choose Gun");
								System.out.println("Press 1 for Machine Gun");
								System.out.println("Press 2 for Phantom");
								System.out.println("Press 3 for Vandal");
								System.out.println("Press 4 for Deagle");
								int gun = Integer.parseInt(br.readLine());
								System.out.println(" ");
								if( gun == 1)
								{
									guns gn = new guns("Machine Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Machine Gun Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 2)
								{
									guns gn = new guns("Phantom Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Phantom Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 3)
								{
									guns gn = new guns("Vandal Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Vandal Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 4)
								{
									guns gn = new guns("Deagle Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Deagle Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
							}
						}
						if(chara == 2)
						{
							characters ch = new characters("Female");
							boolean anschar = DAO.insertCharaintoDB2(ch);
							if( anschar) {
								System.out.println("Female choosen");
								System.out.println(" ");
								System.out.println("Choose Gun");
								System.out.println("Press 1 for Machine Gun");
								System.out.println("Press 2 for Phantom");
								System.out.println("Press 3 for Vandal");
								System.out.println("Press 4 for Deagle");
								int gun = Integer.parseInt(br.readLine());
								System.out.println(" ");
								if( gun == 1)
								{
									guns gn = new guns("Machine Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Machine Gun Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 2)
								{
									guns gn = new guns("Phantom Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Phantom Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 3)
								{
									guns gn = new guns("Vandal Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Vandal Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 4)
								{
									guns gn = new guns("Deagle Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Deagle Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
							}
						}
					}else {
						System.out.println("Some error Occured While Inserting...Please try Again!");
					}
				}
				else {
			System.out.println("Incorrect Password");
				}
			}
			if( c == 1)
			{
				System.out.println(" ");
				System.out.println("Welcome to Valorant");
				System.out.println(" ");
				System.out.println("Enter User Name : ");
				String Uname = br.readLine();
				System.out.println("Enter Password : ");
				int Upass = Integer.parseInt(br.readLine());
				
				gameenter g = new gameenter(Uname, Upass);
				boolean ans1 = DAO.passcheck(g);
				if(ans1) {
					System.out.println(" ");
					System.out.println("Correct Password");
					System.out.println("Welcome to Valorant");
					System.out.println(" ");
					System.out.println("Enter Player Name: ");
					String name = br.readLine();
					System.out.println("Enter Player ID : ");
					int ID = Integer.parseInt(br.readLine());
				
					valorant va = new valorant(name, ID);
					boolean ans = DAO.insertPlayerRecordToDB(va);
					if(ans)
					{
						System.out.println("Player Created");
						System.out.println(va);
						System.out.println(" ");
						System.out.println("Choose Characters");
						System.out.println("Press 1 for Male");
						System.out.println("Press 2 for Female");
						int chara = Integer.parseInt(br.readLine());
						if(chara == 1)
						{
							characters ch = new characters("Male");
							boolean anschar = DAO.insertCharaintoDB(ch);
							if( anschar) {
								System.out.println("Male choosen");
								System.out.println(" ");
								System.out.println("Choose Gun");
								System.out.println("Press 1 for Machine Gun");
								System.out.println("Press 2 for Phantom");
								System.out.println("Press 3 for Vandal");
								System.out.println("Press 4 for Deagle");
								int gun = Integer.parseInt(br.readLine());
								System.out.println(" ");
								if( gun == 1)
								{
									guns gn = new guns("Machine Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Machine Gun Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 2)
								{
									guns gn = new guns("Phantom Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Phantom Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 3)
								{
									guns gn = new guns("Vandal Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Vandal Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 4)
								{
									guns gn = new guns("Deagle Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Deagle Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
							}
						}
						if(chara == 2)
						{
							characters ch = new characters("Female");
							boolean anschar = DAO.insertCharaintoDB(ch);
							if( anschar) {
								System.out.println("Female choosen");
								System.out.println(" ");
								System.out.println("Choose Gun");
								System.out.println("Press 1 for Machine Gun");
								System.out.println("Press 2 for Phantom");
								System.out.println("Press 3 for Vandal");
								System.out.println("Press 4 for Deagle");
								int gun = Integer.parseInt(br.readLine());
								System.out.println(" ");
								if( gun == 1)
								{
									guns gn = new guns("Machine Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Machine Gun Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 2)
								{
									guns gn = new guns("Phantom Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Phantom Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 3)
								{
									guns gn = new guns("Vandal Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Vandal Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
								if( gun == 4)
								{
									guns gn = new guns("Deagle Gun");
									DAO.insertgunintoDB1(gn);
									System.out.println("Deagle Locked");
									System.out.println(" ");
									System.out.println("Choose map");
									System.out.println("Press 1 for Heaven : Map 1");
									System.out.println("Press 2 for VCT : Map 2");
									System.out.println("Press 3 for BRIM : Map 3");
									int mapvar = Integer.parseInt(br.readLine());
									System.out.println(" ");
									switch (mapvar)
									{
									case 1:
										System.out.println("Heaven Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 2:
										System.out.println("VCT Map Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
										break;
									case 3:
										System.out.println("BRIM Selected.");
										System.out.println("Ready to play : Press Enter");
										System.out.println("Player Information : ");
									}
								}
							}
						}
					}
					else {
						System.out.println("Some error Occured While Inserting...Please try Again!");
					}
				}
				else {
			System.out.println("Incorrect Password");
				}
			}
	}
}
