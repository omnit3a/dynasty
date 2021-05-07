package src;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

import javax.swing.*;

public class Main{
	
	public static String[][] world = {
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".","@",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."}
	};
	
	public static String[][] backup = {
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."},
			{".",".",".",".",".",".",".",".",".","."}
	};
	
	public static String prefix;
	public static String out;
	
	static JFrame frame = new JFrame("Dynasty");
	static JPanel panel = new JPanel();
	static JFrame combat = new JFrame();
	static JFrame a = new JFrame("Announcements");
	
	static musicStuff musicObject = new musicStuff();
	
	static JFrame frame1 = new JFrame("Crafting");
	static JLabel label1 = new JLabel();
	static JLabel label2 = new JLabel();
	static JLabel label3 = new JLabel();
	static JLabel label4 = new JLabel();
	static JLabel label5 = new JLabel();
	static JLabel label6 = new JLabel();
	static JLabel label7 = new JLabel();
	static JLabel label8 = new JLabel();
	static JLabel label9 = new JLabel();
	static JPanel panel1 = new JPanel();
	
	static JLabel row0 = new  JLabel();
	static JLabel row1 = new  JLabel();
	static JLabel row2 = new  JLabel();
	static JLabel row3 = new  JLabel();
	static JLabel row4 = new  JLabel();
	static JLabel row5 = new  JLabel();
	static JLabel row6 = new  JLabel();
	static JLabel row7 = new  JLabel();
	static JLabel row8 = new  JLabel();
	static JLabel row9 = new  JLabel();
	
	static JLabel arow0 = new JLabel();
	
	static JFrame inventory = new JFrame("Inventory");
	static JPanel inventorypanel = new JPanel();
	static JLabel item1 = new JLabel();
	static JLabel item2 = new JLabel();
	static JLabel item3 = new JLabel();
	static JLabel item4 = new JLabel();
	static JLabel item5 = new JLabel();
	static JPanel ap = new JPanel();
	
	static JFrame annoucmentsFrame = new JFrame();
	static JPanel annoucmentsPanel = new JPanel();
	static JLabel labelA = new JLabel();
	
	static int keyCode;
	static int x = 5;
	static int y = 5;
	static long absX;
	static long absY;
	static int wallX;
	static int wallY;
	static int treeX;
	static int treeY;
	static int enemyX1;
	static int enemyY1;
	static int enemyAC;
	static int backupX;
	static int backupY;
	static int max1 = 10;
	static int max2 = 2;
	static int max3 = 4;
	static int max4 = 20;
	static Random r = new Random();
	static int health = 5;
	static int attackDamage;
	static String dir = "UP";
	public static int stone = 0;
	public static int wood = 0;
	public static int statue = 0;
	public static int campfire = 0;
	public static int support = 0;
	public static int bombs = 0;
	public static int coal = 0;
	public static int iron = 0;
	public static int mechanisms = 0;
	public static boolean hasFurnace = false;
	static String block;
	static int hasHouse = 0;
	static int pathfinderX;
	static int pathfinderY;
	static int dirP;
	static int goldX;
	static int goldY;
	static int score = 0;
	static int stairsX;
	static int stairsY;
	static boolean underground = false;
	static int burn = 0;
	static int bombX;
	static int bombY;
	static boolean fighting = false;
	static String item01 = "Bombs";
	static String item02 = "Sword(TODO)";
	static String item03 = "Shovel";
	static String item04 = "Bucket";
	static String item05 = "Furnace"; 
	static int itemN = 1;
	static int waterX;
	static int waterY;
	static boolean first = true;
	static boolean dead = false;
	static int houseX;
	static int houseY;
	static boolean bucketEmpty = true;
	static String enemy;
	static char c;
	
	static void resetItems() {
		stone = 0;
		wood = 0;
		statue = 0;
		campfire = 0;
		support = 0;
		bombs = 0;
		coal = 0;
		iron = 0;
		mechanisms = 0;
		hasFurnace = false;
	}
	
	public static void genTown(){
		houseX = r.nextInt(4);
		houseY = r.nextInt(4);
	
			world[houseY][houseX] = "▒";
			world[houseY+1][houseX] = "▒";
			world[houseY+2][houseX] = "▒";
			world[houseY][houseX+1] = "▒";
			world[houseY][houseX+2] = "▒";
			world[houseY+1][houseX+2] = "▒";
			world[houseY+2][houseX+2] = "▒";
			world[houseY+1][houseX+1] = "@";
			houseX = 0;
			houseY = 0;
		
		houseX = r.nextInt(8);
		houseY = r.nextInt(8);
		
			world[houseY][houseX] = "▒";
			world[houseY+1][houseX] = "▒";
			world[houseY+2][houseX] = "▒";
			world[houseY][houseX+1] = "▒";
			world[houseY][houseX+2] = "▒";
			world[houseY+1][houseX+2] = "▒";
			world[houseY+2][houseX+2] = "▒";
			world[houseY+1][houseX+1] = "@";
			houseX = 0;
			houseY = 0;
	}
	
	public static void backup() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				backup[i][j] = world[i][j];
			}
		}
	}
	
	public static void fireSpread() {
		for (int n = 0; n < 200; n++) {
			try {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j <10; j++) {
					if (world[i][j] == "♨") {
						if(world[i+1][j] == "♣" || world[i+1][j] == "▓"){
							world[i+1][j] = "♨";
							continue;
						}
						if(world[i-1][j] == "♣" || world[i+1][j] == "▓") {
							world[i-1][j] = "♨";
							continue;
						}
						if(world[i][j+1] == "♣" || world[i][j+1] == "▓") {
							world[i][j+1] = "♨";
							continue;
						}
						if(world[i][j-1] == "♣" || world[i][j-1] == "▓") {
							world[i][j-1] = "♨";
							continue;
						}
						} else {
							continue;
						}
					continue;
					}
				continue;
				}
			} catch (ArrayIndexOutOfBoundsException fireSpread) {
			}
		}
	}
	
	public static void waterFlow() {
		for (int n = 0; n < 200; n++) {
			try {
			for (int i = 0; i < 10; i++) {
				for (int j = 0; j <10; j++) {
					if (world[i][j] == "≈") {
						if(world[i+1][j] == ">"){
							world[i+1][j] = "≈";
							continue;
						}
						if(world[i-1][j] == ">") {
							world[i-1][j] = "≈";
							continue;
						}
						if(world[i][j-1] == ">") {
							world[i][j-1] = "≈";
							continue;
						}
						if(world[i][j+1] == ">") {
							world[i][j+1] = "≈";
							continue;
							}
						}
					continue;
					}
				continue;
				}
			} catch (ArrayIndexOutOfBoundsException fireSpread) {
			}
		}
	}
	
	public static void genWater() {
		waterY = r.nextInt(max1);
		waterX = r.nextInt(max1);
		try {
		if (world[waterY][waterX] != "@" && world[waterY][waterX] != "≈" && world[waterY][waterX] != "♖" && world[waterY][waterX] != "♨") {
			if (world[waterY][waterX] != "≈" && world[waterY][waterX] != "≈" && waterY != 0 && waterY != 9 && waterX != 0 && waterX != 9) {
				world[waterY][waterX] = "≈";
				printWorld(world);
			}
			}
		} catch (ArrayIndexOutOfBoundsException genWalls) {
			
		}
	}
	
	public static void genGold() {
		goldX = r.nextInt(max1);
		goldY = r.nextInt(max1);
		try {
			if (world[goldY][goldX] == ".") {
				world[goldY][goldX] = "[";
				printWorld(world);
			}
		} catch (ArrayIndexOutOfBoundsException genGold) {
			
		}
	}
	
	public static void genHill() {
		wallY = r.nextInt(max1);
		wallX = r.nextInt(max1);
		try {
		if (world[wallY][wallX] != "@" && world[wallY][wallX] != "▒" && world[wallY][wallX] != "♖" && world[wallY][wallX] != "♨") {
			if (world[wallY][wallX] != "▒" && world[wallY][wallX] != "▒" && wallY != 0 && wallY != 9 && wallX != 0 && wallX != 9) {
				world[wallY][wallX] = "▒";
				printWorld(world);
			}
			}
		} catch (ArrayIndexOutOfBoundsException genWalls) {
			
		}
 	}
	
	public static void bomb() {
		
		switch(dir) {
			case "UP":
				if (world[y-1][x] == "." && bombs != 0) {
					world[y-1][x] = "ó";
					bombY = y-1;
					bombX = x;
					bombs--;
					attackDamage = 20;
					musicObject.playSound("bomb.wav");
					if (world[bombY-1][bombX] != "@") {
						pause(100);
						world[bombY-1][bombX] = ".";
						pause(100);
						world[bombY+1][bombX] = ".";
						attackDamage = 20;
						
					}
					if (world[bombY+1][bombX] != "@") {
						pause(100);
						world[bombY+1][bombX] = ".";
						pause(100);
						world[bombY-1][bombX] = ".";
						
					}
					if (world[bombY][bombX-1] != "@") {
						pause(100);
						world[bombY][bombX-1] = ".";
						pause(100);
						world[bombY][bombX+1] = ".";
						
					}
					if (world[bombY][bombX+1] != "@") {
						pause(100);
						world[bombY][bombX+1] = ".";
						pause(100);
						world[bombY][bombX-1] = ".";
						
					}
				}
				break;
			case "DOWN":
				if (world[y+1][x] == "." && bombs != 0) {
					world[y+1][x] = "ó";
					bombY = y+1;
					bombX = x;
					bombs--;
					attackDamage = 20;
					musicObject.playSound("bomb.wav");
					if (world[bombY-1][bombX] != "@") {
						pause(100);
						world[bombY-1][bombX] = ".";
						pause(100);
						world[bombY+1][bombX] = ".";
						
					}
					if (world[bombY+1][bombX] != "@") {
						pause(100);
						world[bombY+1][bombX] = ".";
						pause(100);
						world[bombY-1][bombX] = ".";
						
					}
					if (world[bombY][bombX-1] != "@") {
						pause(100);
						world[bombY][bombX-1] = ".";
						pause(100);
						world[bombY][bombX+1] = ".";
						
					}
					if (world[bombY][bombX+1] != "@") {
						pause(100);
						world[bombY][bombX+1] = ".";
						pause(100);
						world[bombY][bombX-1] = ".";
					}
				}
				break;
			case "LEFT":
				if (world[y][x-1] == "." && bombs != 0) {
					world[y][x-1] = "ó";
					bombY = y;
					bombX = x-1;
					bombs--;
					attackDamage = 20;
					musicObject.playSound("bomb.wav");
					if (world[bombY-1][bombX] != "@") {
						pause(100);
						world[bombY-1][bombX] = ".";
						pause(100);
						world[bombY+1][bombX] = ".";
					}
					if (world[bombY+1][bombX] != "@") {
						pause(100);
						world[bombY+1][bombX] = ".";
						pause(100);
						world[bombY-1][bombX] = ".";
					}
					if (world[bombY][bombX-1] != "@") {
						pause(100);
						world[bombY][bombX-1] = ".";
						pause(100);
						world[bombY][bombX+1] = ".";
					}
					if (world[bombY][bombX+1] != "@") {
						pause(100);
						world[bombY][bombX+1] = ".";
						pause(100);
						world[bombY][bombX-1] = ".";
					}
				}
				break;
			case "RIGHT":
				if (world[y][x+1] == "." && bombs != 0) {
					world[y][x+1] = "ó";
					bombY = y;
					bombX = x+1;
					bombs--;
					attackDamage = 20;
					musicObject.playSound("bomb.wav");
					if (world[bombY-1][bombX] != "@") {
						pause(100);
						world[bombY-1][bombX] = ".";
						pause(100);
						world[bombY+1][bombX] = ".";
					}
					if (world[bombY+1][bombX] != "@") {
						pause(100);
						world[bombY+1][bombX] = ".";
						pause(100);
						world[bombY-1][bombX] = ".";
					}
					if (world[bombY][bombX-1] != "@") {
						pause(100);
						world[bombY][bombX-1] = ".";
						pause(100);
						world[bombY][bombX+1] = ".";
					}
					if (world[bombY][bombX+1] != "@") {
						pause(100);
						world[bombY][bombX+1] = ".";
						pause(100);
						world[bombY][bombX-1] = ".";
					}
					
				}
				break;
		}
	}
	
	public static void sword() {
		
		switch (dir) {
			case "UP":
				if(world[y-1][x] == "&") {
					attackDamage = r.nextInt(20);
					if (attackDamage > enemyAC) {
						dead = true;
						world[y-1][x] = ".";
						printWorld(world);
						arow0.setText("You Killed The Monster");
					} else if (score != 0) {
						score--;
						if (score == 0) {
							resetItems();
						}
					} else if (score == 0 && attackDamage < enemyAC) {
						resetItems();
					}
				}
				break;
			case "DOWN":
				if(world[y+1][x] == "&") {
					attackDamage = r.nextInt(20);
					if (attackDamage > enemyAC) {
						dead = true;
						world[y+1][x] = ".";
						printWorld(world);
						arow0.setText("You Killed The Monster");
					} else if (score != 0) {
						score--;
						if (score == 0) {
							resetItems();
						}
					} else if (score == 0 && attackDamage < enemyAC) {
						resetItems();
					}
				}
				break;
			case "LEFT":
				if(world[y][x-1] == "&") {
					attackDamage = r.nextInt(20);
					if (attackDamage > enemyAC) {
						dead = true;
						world[y][x-1] = ".";
						printWorld(world);
						arow0.setText("You Killed The Monster");
					} else if (score != 0) {
						score--;
						if (score == 0) {
							resetItems();
						}
					} else if (score == 0 && attackDamage < enemyAC) {
						resetItems();
					}
				}
				break;
			case "RIGHT":
				if(world[y][x+1] == "&") {
					attackDamage = r.nextInt(20);
					if (attackDamage > enemyAC) {
						dead = true;
						world[y][x+1] = ".";
						printWorld(world);
						arow0.setText("You Killed The Monster");
					} else if (score != 0) {
						score--;
						if (score == 0) {
							resetItems();
						}
					} else if (score == 0 && attackDamage < enemyAC) {
						resetItems();
					}
				}
				break;
		}
	}
	
	public static void bucket() {
		switch (dir) {
		case "UP":
			if (world[y-1][x] == "≈" && bucketEmpty == true) {
				world[y-1][x] = ">";
				bucketEmpty = false;
			} else if (bucketEmpty == false) {
				world[y-1][x] = "≈";
				for (int flow = 0; flow < 100; flow++) {
					waterFlow();
				}
				bucketEmpty = true;
			}
		break;
		case "DOWN":
			if (world[y+1][x] == "≈" && bucketEmpty == true) {
				world[y+1][x] = ">";
				bucketEmpty = false;
			} else if (bucketEmpty == false) {
				world[y+1][x] = "≈";
				for (int flow = 0; flow < 100; flow++) {
					waterFlow();
				}
				bucketEmpty = true;
			}
		break;
		case "LEFT":
			if (world[y][x-1] == "≈" && bucketEmpty == true) {
				world[y][x-1] = ">";
				bucketEmpty = false;
			} else if (bucketEmpty == false) {
				world[y][x-1] = "≈";
				for (int flow = 0; flow < 100; flow++) {
					waterFlow();
				}
				bucketEmpty = true;
			}
		break;
		case "RIGHT":
			if (world[y][x+1] == "≈" && bucketEmpty == true) {
				world[y][x+1] = ">";
				bucketEmpty = false;
			} else if (bucketEmpty == false) {
				world[y][x+1] = "≈";
				for (int flow = 0; flow < 100; flow++) {
					waterFlow();
				}
				bucketEmpty = true;
			}
		break;
		
	}
	}
	
	public static void shovel() {
		switch (dir) {
			case "UP":
				if (world[y-1][x] == ".") {
					world[y-1][x] = ">";
					for (int flow = 0; flow < 100; flow++) {
						waterFlow();
					}
				}
			break;
			case "DOWN":
				if (world[y+1][x] == ".") {
					world[y+1][x] = ">";
					for (int flow = 0; flow < 100; flow++) {
						waterFlow();
					}
				}
			break;
			case "LEFT":
				if (world[y][x-1] == ".") {
					world[y][x-1] = ">";
					for (int flow = 0; flow < 100; flow++) {
						waterFlow();
					}
				}
			break;
			case "RIGHT":
				if (world[y][x+1] == ".") {
					world[y][x+1] = ">";
					for (int flow = 0; flow < 100; flow++) {
						waterFlow();
					}
				}
			break;
			
		}
	}
	
	public static void investigate() throws FileNotFoundException {
		switch(dir) {
			case "UP":
				switch (world[y-1][x]) {
					case "g":
						Reader(1,"Enemies.txt");
						annoucments(out);
						break;
					case "c":
						Reader(2,"Enemies.txt");
						annoucments(out);
						break;
					case "d":
						Reader(3,"Enemies.txt");
						annoucments(out);
						break;
					case "a":
						Reader(4,"Enemies.txt");
						annoucments(out);
						break;
					case "b":
						Reader(5,"Enemies.txt");
						annoucments(out);
						break;
					case "e":
						Reader(6,"Enemies.txt");
						annoucments(out);
						break;
					case "f":
						Reader(7,"Enemies.txt");
						annoucments(out);
						break;
					case "h":
						Reader(8,"Enemies.txt");
						annoucments(out);
						break;
					case "i":
						Reader(9,"Enemies.txt");
						annoucments(out);
						break;
					case "j":
						Reader(10,"Enemies.txt");
						annoucments(out);
						break;
					case "k":
						Reader(11,"Enemies.txt");
						annoucments(out);
						break;
					case "l":
						Reader(12,"Enemies.txt");
						annoucments(out);
						break;
					case "m":
						Reader(13,"Enemies.txt");
						annoucments(out);
						break;
					case "n":
						Reader(14,"Enemies.txt");
						annoucments(out);
						break;
					case "o":
						Reader(15,"Enemies.txt");
						annoucments(out);
						break;
					case "p":
						Reader(16,"Enemies.txt");
						annoucments(out);
						break;
					case "q":
						Reader(17,"Enemies.txt");
						annoucments(out);
						break;
					case "r":
						Reader(18,"Enemies.txt");
						annoucments(out);
						break;
					case "s":
						Reader(19,"Enemies.txt");
						annoucments(out);
						break;
					case "t":
						Reader(20,"Enemies.txt");
						annoucments(out);
						break;
					case "u":
						Reader(21,"Enemies.txt");
						annoucments(out);
						break;
					case "v":
						Reader(22,"Enemies.txt");
						annoucments(out);
						break;
					case "w":
						Reader(23,"Enemies.txt");
						annoucments(out);
						break;
					case "x":
						Reader(24,"Enemies.txt");
						annoucments(out);
						break;
					case "y":
						Reader(25,"Enemies.txt");
						annoucments(out);
						break;
					case "z":
						Reader(26,"Enemies.txt");
						annoucments(out);
						break;
					case "@":
						Reader(27,"Enemies.txt");
						annoucments(out);
						break;
					case "▒":
						Reader(1,"Blocks.txt");
						annoucments(out);
						break;
					case "♣":
						Reader(2,"Blocks.txt");
						annoucments(out);
						break;
					case "▓":
						Reader(3,"Blocks.txt");
						annoucments(out);
						break;
					case "♖":
						Reader(4,"Blocks.txt");
						annoucments(out);
						break;
					case "♨":
						Reader(5,"Blocks.txt");
						annoucments(out);
						break;
					case "[":
						Reader(6,"Blocks.txt");
						annoucments(out);
						break;
					case ">":
						Reader(7,"Blocks.txt");
						annoucments(out);
						break;
					case "≈":
						Reader(8,"Blocks.txt");
						annoucments(out);
						break;
				}
				break;
			case "DOWN":
				switch (world[y+1][x]) {
				case "g":
					Reader(1,"Enemies.txt");
					annoucments(out);
					break;
				case "c":
					Reader(2,"Enemies.txt");
					annoucments(out);
					break;
				case "d":
					Reader(3,"Enemies.txt");
					annoucments(out);
					break;
				case "a":
					Reader(4,"Enemies.txt");
					annoucments(out);
					break;
				case "b":
					Reader(5,"Enemies.txt");
					annoucments(out);
					break;
				case "e":
					Reader(6,"Enemies.txt");
					annoucments(out);
					break;
				case "f":
					Reader(7,"Enemies.txt");
					annoucments(out);
					break;
				case "h":
					Reader(8,"Enemies.txt");
					annoucments(out);
					break;
				case "i":
					Reader(9,"Enemies.txt");
					annoucments(out);
					break;
				case "j":
					Reader(10,"Enemies.txt");
					annoucments(out);
					break;
				case "k":
					Reader(11,"Enemies.txt");
					annoucments(out);
					break;
				case "l":
					Reader(12,"Enemies.txt");
					annoucments(out);
					break;
				case "m":
					Reader(13,"Enemies.txt");
					annoucments(out);
					break;
				case "n":
					Reader(14,"Enemies.txt");
					annoucments(out);
					break;
				case "o":
					Reader(15,"Enemies.txt");
					annoucments(out);
					break;
				case "p":
					Reader(16,"Enemies.txt");
					annoucments(out);
					break;
				case "q":
					Reader(17,"Enemies.txt");
					annoucments(out);
					break;
				case "r":
					Reader(18,"Enemies.txt");
					annoucments(out);
					break;
				case "s":
					Reader(19,"Enemies.txt");
					annoucments(out);
					break;
				case "t":
					Reader(20,"Enemies.txt");
					annoucments(out);
					break;
				case "u":
					Reader(21,"Enemies.txt");
					annoucments(out);
					break;
				case "v":
					Reader(22,"Enemies.txt");
					annoucments(out);
					break;
				case "w":
					Reader(23,"Enemies.txt");
					annoucments(out);
					break;
				case "x":
					Reader(24,"Enemies.txt");
					annoucments(out);
					break;
				case "y":
					Reader(25,"Enemies.txt");
					annoucments(out);
					break;
				case "z":
					Reader(26,"Enemies.txt");
					annoucments(out);
					break;
				case "@":
					Reader(27,"Enemies.txt");
					annoucments(out);
					break;
				case "▒":
					Reader(1,"Blocks.txt");
					annoucments(out);
					break;
				case "♣":
					Reader(2,"Blocks.txt");
					annoucments(out);
					break;
				case "▓":
					Reader(3,"Blocks.txt");
					annoucments(out);
					break;
				case "♖":
					Reader(4,"Blocks.txt");
					annoucments(out);
					break;
				case "♨":
					Reader(5,"Blocks.txt");
					annoucments(out);
					break;
				case "[":
					Reader(6,"Blocks.txt");
					annoucments(out);
					break;
				case ">":
					Reader(7,"Blocks.txt");
					annoucments(out);
					break;
				case "≈":
					Reader(8,"Blocks.txt");
					annoucments(out);
					break;
				}
				break;
			case "LEFT":
				switch (world[y][x-1]) {
				case "g":
					Reader(1,"Enemies.txt");
					annoucments(out);
					break;
				case "c":
					Reader(2,"Enemies.txt");
					annoucments(out);
					break;
				case "d":
					Reader(3,"Enemies.txt");
					annoucments(out);
					break;
				case "a":
					Reader(4,"Enemies.txt");
					annoucments(out);
					break;
				case "b":
					Reader(5,"Enemies.txt");
					annoucments(out);
					break;
				case "e":
					Reader(6,"Enemies.txt");
					annoucments(out);
					break;
				case "f":
					Reader(7,"Enemies.txt");
					annoucments(out);
					break;
				case "h":
					Reader(8,"Enemies.txt");
					annoucments(out);
					break;
				case "i":
					Reader(9,"Enemies.txt");
					annoucments(out);
					break;
				case "j":
					Reader(10,"Enemies.txt");
					annoucments(out);
					break;
				case "k":
					Reader(11,"Enemies.txt");
					annoucments(out);
					break;
				case "l":
					Reader(12,"Enemies.txt");
					annoucments(out);
					break;
				case "m":
					Reader(13,"Enemies.txt");
					annoucments(out);
					break;
				case "n":
					Reader(14,"Enemies.txt");
					annoucments(out);
					break;
				case "o":
					Reader(15,"Enemies.txt");
					annoucments(out);
					break;
				case "p":
					Reader(16,"Enemies.txt");
					annoucments(out);
					break;
				case "q":
					Reader(17,"Enemies.txt");
					annoucments(out);
					break;
				case "r":
					Reader(18,"Enemies.txt");
					annoucments(out);
					break;
				case "s":
					Reader(19,"Enemies.txt");
					annoucments(out);
					break;
				case "t":
					Reader(20,"Enemies.txt");
					annoucments(out);
					break;
				case "u":
					Reader(21,"Enemies.txt");
					annoucments(out);
					break;
				case "v":
					Reader(22,"Enemies.txt");
					annoucments(out);
					break;
				case "w":
					Reader(23,"Enemies.txt");
					annoucments(out);
					break;
				case "x":
					Reader(24,"Enemies.txt");
					annoucments(out);
					break;
				case "y":
					Reader(25,"Enemies.txt");
					annoucments(out);
					break;
				case "z":
					Reader(26,"Enemies.txt");
					annoucments(out);
					break;
				case "@":
					Reader(27,"Enemies.txt");
					annoucments(out);
					break;
				case "▒":
					Reader(1,"Blocks.txt");
					annoucments(out);
					break;
				case "♣":
					Reader(2,"Blocks.txt");
					annoucments(out);
					break;
				case "▓":
					Reader(3,"Blocks.txt");
					annoucments(out);
					break;
				case "♖":
					Reader(4,"Blocks.txt");
					annoucments(out);
					break;
				case "♨":
					Reader(5,"Blocks.txt");
					annoucments(out);
					break;
				case "[":
					Reader(6,"Blocks.txt");
					annoucments(out);
					break;
				case ">":
					Reader(7,"Blocks.txt");
					annoucments(out);
					break;
				case "≈":
					Reader(8,"Blocks.txt");
					annoucments(out);
					break;
				}
				break;
			case "RIGHT":
				switch (world[y][x+1]) {
				case "g":
					Reader(1,"Enemies.txt");
					annoucments(out);
					break;
				case "c":
					Reader(2,"Enemies.txt");
					annoucments(out);
					break;
				case "d":
					Reader(3,"Enemies.txt");
					annoucments(out);
					break;
				case "a":
					Reader(4,"Enemies.txt");
					annoucments(out);
					break;
				case "b":
					Reader(5,"Enemies.txt");
					annoucments(out);
					break;
				case "e":
					Reader(6,"Enemies.txt");
					annoucments(out);
					break;
				case "f":
					Reader(7,"Enemies.txt");
					annoucments(out);
					break;
				case "h":
					Reader(8,"Enemies.txt");
					annoucments(out);
					break;
				case "i":
					Reader(9,"Enemies.txt");
					annoucments(out);
					break;
				case "j":
					Reader(10,"Enemies.txt");
					annoucments(out);
					break;
				case "k":
					Reader(11,"Enemies.txt");
					annoucments(out);
					break;
				case "l":
					Reader(12,"Enemies.txt");
					annoucments(out);
					break;
				case "m":
					Reader(13,"Enemies.txt");
					annoucments(out);
					break;
				case "n":
					Reader(14,"Enemies.txt");
					annoucments(out);
					break;
				case "o":
					Reader(15,"Enemies.txt");
					annoucments(out);
					break;
				case "p":
					Reader(16,"Enemies.txt");
					annoucments(out);
					break;
				case "q":
					Reader(17,"Enemies.txt");
					annoucments(out);
					break;
				case "r":
					Reader(18,"Enemies.txt");
					annoucments(out);
					break;
				case "s":
					Reader(19,"Enemies.txt");
					annoucments(out);
					break;
				case "t":
					Reader(20,"Enemies.txt");
					annoucments(out);
					break;
				case "u":
					Reader(21,"Enemies.txt");
					annoucments(out);
					break;
				case "v":
					Reader(22,"Enemies.txt");
					annoucments(out);
					break;
				case "w":
					Reader(23,"Enemies.txt");
					annoucments(out);
					break;
				case "x":
					Reader(24,"Enemies.txt");
					annoucments(out);
					break;
				case "y":
					Reader(25,"Enemies.txt");
					annoucments(out);
					break;
				case "z":
					Reader(26,"Enemies.txt");
					annoucments(out);
					break;
				case "@":
					Reader(27,"Enemies.txt");
					annoucments(out);
					break;
				case "▒":
					Reader(1,"Blocks.txt");
					annoucments(out);
					break;
				case "♣":
					Reader(2,"Blocks.txt");
					annoucments(out);
					break;
				case "▓":
					Reader(3,"Blocks.txt");
					annoucments(out);
					break;
				case "♖":
					Reader(4,"Blocks.txt");
					annoucments(out);
					break;
				case "♨":
					Reader(5,"Blocks.txt");
					annoucments(out);
					break;
				case "[":
					Reader(6,"Blocks.txt");
					annoucments(out);
					break;
				case ">":
					Reader(7,"Blocks.txt");
					annoucments(out);
					break;
				case "≈":
					Reader(8,"Blocks.txt");
					annoucments(out);
					break;
				}
				break;
		}
	}
	
	public static void talk() throws FileNotFoundException {
		switch (dir) {
			case "UP":
				if (world[y-1][x] == "@") {
					Reader(r.nextInt(5), "speech.txt");
					annoucments(out);
				}
				break;
			case "DOWN":
				if (world[y+1][x] == "@") {
					Reader(r.nextInt(5), "speech.txt");
					annoucments(out);
				}
				break;
			case "LEFT":
				if (world[y][x-1] == "@") {
					Reader(r.nextInt(5), "speech.txt");
					annoucments(out);
				}
				break;
			case "RIGHT":
				if (world[y][x+1] == "@") {
					Reader(r.nextInt(5), "speech.txt");
					annoucments(out);
				}
				break;
		}
	}
	
	public static void genWalls() {
		wallY = r.nextInt(max1);
		wallX = r.nextInt(max1);
		hasHouse = r.nextInt(max1);
		try {
			if (hasHouse != 100) {
		if (world[wallY][wallX] != "@" && world[wallY][wallX] != "▒" && world[wallY][wallX] != "♖" && world[wallY][wallX] != "♨") {
			if (world[wallY+1][wallX+1] != "▒" && world[wallY-1][wallX-1] != "▒" && world[wallY+1][wallX-1] != "▒" && world[wallY-1][wallX+1] != "▒") {
				world[wallY][wallX] = "▒";
				printWorld(world);
			}
		}
			}
		} catch (ArrayIndexOutOfBoundsException genWalls) {
			
		}
	}
	
	public static void genForest() {
		wallY = r.nextInt(max1);
		wallX = r.nextInt(max1);
		hasHouse = r.nextInt(max1);
		try {
			if (hasHouse != 100) {
		if (world[wallY][wallX] != "@" && world[wallY][wallX] != "♣" && world[wallY][wallX] != "♖" && world[wallY][wallX] != "♨") {
			if (world[wallY+1][wallX+1] != "♣" && world[wallY-1][wallX-1] != "♣" && world[wallY+1][wallX-1] != "♣" && world[wallY-1][wallX+1] != "♣") {
				world[wallY][wallX] = "♣";
				printWorld(world);
			}
		}
			}
		} catch (ArrayIndexOutOfBoundsException genWalls) {
			
		}
	}
	
	public static void genEnemies() {
		enemyX1 = r.nextInt(max1);
		enemyY1 = r.nextInt(max1);
		enemyAC = r.nextInt(max1);
		if (world[enemyY1][enemyX1] != "&" && world[enemyY1][enemyX1] != "▒" && world[enemyY1][enemyX1] != "♣") {
			world[enemyY1][enemyX1] = "&";
		} else {
			genEnemies();
		}
	}
	
	public static void genTrees() {
		treeY = r.nextInt(max1);
		treeX = r.nextInt(max1);
		try {
			if (world[treeY][treeX] != "@" && world[treeY][treeX] != "▒" && treeX != 0 && treeY != 0 && treeX != 9 && treeY != 9) {
				world[treeY][treeX] = "♣";
				printWorld(world);
			} else if (world[treeY][treeX] == "@" || world[treeY][treeX] == "▒" || treeX == 0 || treeY == 0 || treeX == 9 || treeY == 9) {
				genTrees();
			}
		}catch (ArrayIndexOutOfBoundsException genTrees) {
			
		}
	}
	
	public static void clearWorld() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j <10; j++) {
				world[i][j] = ".";
				printWorld(world);
			}
			world[y][x] = "@";
			printWorld(world);
		}
	}
	
	public static void pathfindingWander(){
		
		for (int i = 0; i < 50 ; i++) {
			char c = (char)(r.nextInt(26) + 'a');
			enemy = Character.toString(c);
		}
		while (true) {
			if (dead == false) {
			printWorld(world);
			dirP = r.nextInt(max3);
			pause(500);
		switch (dirP) {
			case 0:
				if (enemyY1 != 0 && world[enemyY1-1][enemyX1] != "▒" && world[enemyY1-1][enemyX1] != "♣" && world[enemyY1-1][enemyX1] != "║" && world[enemyY1-1][enemyX1] != "▓" && world[enemyY1-1][enemyX1] != "♖" && world[enemyY1-1][enemyX1] != "♨" && world[enemyY1-1][enemyX1] != "≈" && world[enemyY1-1][enemyX1] != "*") {
				enemyY1--;
				world[enemyY1][enemyX1] = enemy;
				world[enemyY1+1][enemyX1] = ".";
				printWorld(world);
				}
				break;
			case 1:
				if (enemyY1 != 9 && world[enemyY1+1][enemyX1] != "▒" && world[enemyY1+1][enemyX1] != "♣" && world[enemyY1+1][enemyX1] != "║" && world[enemyY1+1][enemyX1] != "▓" && world[enemyY1+1][enemyX1] != "♖" && world[enemyY1+1][enemyX1] != "♨" && world[enemyY1+1][enemyX1] != "≈" && world[enemyY1+1][enemyX1] != "*") {
					enemyY1++;
					world[enemyY1][enemyX1] = enemy;
					world[enemyY1-1][enemyX1] = ".";
					printWorld(world);
					}
					break;
			case 2:
				if (enemyX1 != 0 && world[enemyY1][enemyX1-1] != "▒" && world[enemyY1][enemyX1-1] != "♣" && world[enemyY1][enemyX1-1] != "║" && world[enemyY1][enemyX1-1] != "▓" && world[enemyY1][enemyX1-1] != "♖" && world[enemyY1][enemyX1-1] != "♨" && world[enemyY1][enemyX1-1] != "≈" && world[enemyY1][enemyX1-1] != "*") {
					enemyX1--;
					world[enemyY1][enemyX1] = enemy;
					world[enemyY1][enemyX1+1] = ".";
					printWorld(world);
					}
					break;
			case 3:
				if (enemyX1 != 9 && world[enemyY1][enemyX1+1] != "▒" && world[enemyY1][enemyX1+1] != "♣" && world[enemyY1][enemyX1+1] != "║" && world[enemyY1][enemyX1+1] != "▓" && world[enemyY1][enemyX1+1] != "♖" && world[enemyY1][enemyX1+1] != "♨" && world[enemyY1][enemyX1+1] != "≈" && world[enemyY1][enemyX1+1] != "*") {
					enemyX1++;
					world[enemyY1][enemyX1] = enemy;
					world[enemyY1][enemyX1-1] = ".";
					printWorld(world);
					}
					break;
				}
			} else {
				world[enemyY1][enemyX1] = ".";
			}
			}
		}
	
	public static void pause(int ms) {
	    try {
	        Thread.sleep(ms);
	    } catch (InterruptedException e) {
	        System.err.format("IOException: %s%n", e);
	    }
	}
	
	static void printWorld(String[][] world) {
		row0.setFont(new Font("Menlo", Font.PLAIN, 20));
		row1.setFont(new Font("Menlo", Font.PLAIN, 20));
		row2.setFont(new Font("Menlo", Font.PLAIN, 20));
		row3.setFont(new Font("Menlo", Font.PLAIN, 20));
		row4.setFont(new Font("Menlo", Font.PLAIN, 20));
		row5.setFont(new Font("Menlo", Font.PLAIN, 20));
		row6.setFont(new Font("Menlo", Font.PLAIN, 20));
		row7.setFont(new Font("Menlo", Font.PLAIN, 20));
		row8.setFont(new Font("Menlo", Font.PLAIN, 20));
		row9.setFont(new Font("Menlo", Font.PLAIN, 20));
		
		item1.setText("Item 1: "+item01);
		item2.setText("Item 2: "+item02);
		item3.setText("Item 3: "+item03);
		item4.setText("Item 4: "+item04);
		item5.setText("Item 5: "+item05);
		
		//panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
		panel.setLayout(new GridLayout(0,1));
		panel1.setLayout(new GridLayout(0,1));
		inventorypanel.setLayout(new GridLayout(0,1));
		
		
		label1.setFont(new Font("Menlo", Font.PLAIN, 20));
		label1.setText("Crafting Menu");
		label2.setFont(new Font("Menlo", Font.PLAIN, 10));
		label3.setFont(new Font("Menlo", Font.PLAIN, 10));
		label4.setFont(new Font("Menlo", Font.PLAIN, 10));
		label5.setFont(new Font("Menlo", Font.PLAIN, 10));
		label6.setFont(new Font("Menlo", Font.PLAIN, 10));
		label7.setFont(new Font("Menlo", Font.PLAIN, 10));
		label8.setFont(new Font("Menlo", Font.PLAIN, 10));
		label9.setFont(new Font("Menlo", Font.PLAIN, 10));
		arow0.setText("");
		if (stone >= 3) {
			label2.setText("Can Craft Statue (Z)");
		} else {
			label2.setText("");
		}
		if (wood >= 5) {
			label3.setText("Can Craft Fire (X)");
		} else {
			label3.setText("");
		}
		if (wood >= 3) {
			label4.setText("Can Craft Support (C)");
		} else {
			label4.setText("");
		}
		if (wood >= 3 && stone >= 5) {
			label5.setText("Can Craft Bomb (V)");
		} else {
			label5.setText("");
		}
		if (stone >= 10 && wood >= 2) {
			label6.setText("Can Craft Furnace (B)");
		} else {
			label6.setText("");
		}
		if (hasFurnace == true && stone >= 1) {
			label7.setText("Can Smelt Iron (N)");
		} else {
			label7.setText("");
		}
		if (hasFurnace == true && wood >= 1) {
			label8.setText("Can Make Charcoal (M)");
		} else {
			label8.setText("");
		}
		
		row0.setText(world[0][0]+world[0][1]+world[0][2]+world[0][3]+world[0][4]+world[0][5]+world[0][6]+world[0][7]+world[0][8]+world[0][9]+"Stone: "+stone);
		row1.setText(world[1][0]+world[1][1]+world[1][2]+world[1][3]+world[1][4]+world[1][5]+world[1][6]+world[1][7]+world[1][8]+world[1][9]+"Wood: " +wood);
		row2.setText(world[2][0]+world[2][1]+world[2][2]+world[2][3]+world[2][4]+world[2][5]+world[2][6]+world[2][7]+world[2][8]+world[2][9]+"Statue: "+statue);
		row3.setText(world[3][0]+world[3][1]+world[3][2]+world[3][3]+world[3][4]+world[3][5]+world[3][6]+world[3][7]+world[3][8]+world[3][9]+"Fire: "+campfire);
		row4.setText(world[4][0]+world[4][1]+world[4][2]+world[4][3]+world[4][4]+world[4][5]+world[4][6]+world[4][7]+world[4][8]+world[4][9]+"Support: "+support);
		row5.setText(world[5][0]+world[5][1]+world[5][2]+world[5][3]+world[5][4]+world[5][5]+world[5][6]+world[5][7]+world[5][8]+world[5][9]+"Coal: "+coal);
		row6.setText(world[6][0]+world[6][1]+world[6][2]+world[6][3]+world[6][4]+world[6][5]+world[6][6]+world[6][7]+world[6][8]+world[6][9]+"Iron: "+ iron);
		row7.setText(world[7][0]+world[7][1]+world[7][2]+world[7][3]+world[7][4]+world[7][5]+world[7][6]+world[7][7]+world[7][8]+world[7][9]);
		row8.setText(world[8][0]+world[8][1]+world[8][2]+world[8][3]+world[8][4]+world[8][5]+world[8][6]+world[8][7]+world[8][8]+world[8][9]+"Item "+itemN);
		row9.setText(world[9][0]+world[9][1]+world[9][2]+world[9][3]+world[9][4]+world[9][5]+world[9][6]+world[9][7]+world[9][8]+world[9][9]+"Armour: "+score);
		world[y][x] = "@";

	}
	
	public static void CraftingMenuMain() {
		frame1.setSize(250,210);
		frame1.setResizable(false);
		frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame1.setVisible(true);
		
		frame1.add(panel1);
		panel1.add(label1);
		panel1.add(label2);
		panel1.add(label3);
		panel1.add(label4);
		panel1.add(label5);
		panel1.add(label6);
		panel1.add(label7);
		panel1.add(label8);
		panel1.add(label9);
		panel1.setBackground(Color.BLACK);
		label1.setForeground(Color.ORANGE);
		label2.setForeground(Color.ORANGE);
		label3.setForeground(Color.ORANGE);
		label4.setForeground(Color.ORANGE);
		label5.setForeground(Color.ORANGE);
		label6.setForeground(Color.ORANGE);
		label7.setForeground(Color.ORANGE);
		label8.setForeground(Color.ORANGE);
		label9.setForeground(Color.ORANGE);
		
		frame1.addKeyListener(new KeyListener() {
			

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				int keyCode = e.getKeyCode();
				switch (keyCode) {
					case KeyEvent.VK_Z:
						if (stone >= 3) {
							stone -= 3;
							statue++;
							printWorld(world);
						}
						break;
					case KeyEvent.VK_X:
						if (wood >= 5) {
							wood -= 5;
							campfire++;
							printWorld(world);
						}
						break;
					case KeyEvent.VK_C:
						if (wood >= 3) {
							wood -= 3;
							support++;
							printWorld(world);
						}
						break;
					case KeyEvent.VK_V:
						if (wood >= 3 && stone >= 5) {
							wood -= 3;
							stone -= 5;
							bombs++;
							printWorld(world);
						}
					case KeyEvent.VK_B:
						if (stone >= 10 && wood >= 2) {
							stone -= 10;
							wood -= 2;
							hasFurnace = true;
							printWorld(world);
						}
						break;
					case KeyEvent.VK_N:
						if (hasFurnace == true && stone >= 1){
							stone--;
							iron++;
							musicObject.playSound("smoke.wav");
							try {
							if (world[y-1][x] == ".") {
								world[y-1][x] = "░";
							}
							if (world[y+1][x] == ".") {
								world[y+1][x] = "░";
							}
							if (world[y][x-1] == ".") {
								world[y][x-1] = "░";
							}
							if (world[y][x+1] == ".") {
								world[y][x+1] = "░";
							}
							}catch (ArrayIndexOutOfBoundsException j) {
								
							}
							printWorld(world);
						}
						break;
					case KeyEvent.VK_M:
						if (hasFurnace == true && wood >= 1){
							wood--;
							coal++;
							musicObject.playSound("smoke.wav");
							try {
								if (world[y-1][x] == ".") {
									world[y-1][x] = "░";
								}
								if (world[y+1][x] == ".") {
									world[y+1][x] = "░";
								}
								if (world[y][x-1] == ".") {
									world[y][x-1] = "░";
								}
								if (world[y][x+1] == ".") {
									world[y][x+1] = "░";
								}
								}catch (ArrayIndexOutOfBoundsException j) {
									
								}
							printWorld(world);
						}
						break;
				}
			}

			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
	}
	
	static void playerScript() {
		frame.setSize(250,210);
		panel.setSize(250,210);
		frame.add(panel);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		if (fighting == false) {
		printWorld(world);
		frame.addKeyListener(new KeyListener() {

			@Override
			public void keyTyped(KeyEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void keyPressed(KeyEvent e) {
				// TODO Auto-generated method stub
				keyCode = e.getKeyCode();
				try {
				switch (keyCode) {
					case KeyEvent.VK_W:
						if (y != 0 && world[y-1][x] != "▒" && world[y-1][x] != "♣" && world[y-1][x] != "▓" && world[y-1][x] != "♖" && world[y-1][x] != "♨" && world[y-1][x] != "║" && world[y-1][x] != "≈" && world[y-1][x] != "*"  && world[y-1][x] != "@" && world[y-1][x] != ">") { //bounds and collision
							dir = "UP";
							y--;
							world[y][x] = "@";
							world[y+1][x] = ".";
							printWorld(world);
						} else if(y == 0 && underground == false) {
							y = 9;
							world[y-9][x] = ".";
							first = false;
							dead = false;
							absY--;
							r.setSeed(absX*absY);
								genLevel();

						}
						if (world[y-1][x] == "▒" || world[y-1][x] == "♣") {
							dir = "UP";
						}
						if (y == goldY && x == goldX) {
							score++;
							goldX = r.nextInt(max1);
							goldY = r.nextInt(max1);
						}
						break;
					case KeyEvent.VK_S:
						if (y != 9 && world[y+1][x] != "▒"  && world[y+1][x] != "♣" && world[y+1][x] != "▓" && world[y+1][x] != "♖" && world[y+1][x] != "♨" && world[y+1][x] != "║" && world[y+1][x] != "≈" && world[y+1][x] != "*" && world[y+1][x] != "@" && world[y+1][x] != ">") { //bounds and collision
							dir = "DOWN";
							y++;
							world[y][x] = "@";
							world[y-1][x] = ".";
							printWorld(world);
						} else if (y == 9 && underground == false) {
							y = 0;
							world[y+9][x] = ".";
							first = false;
							dead = false;
							absY++;
							r.setSeed(absX*absY);
							genLevel();

						}
						if (world[y+1][x] == "▒" || world[y+1][x] == "♣") {
							dir = "DOWN";
						}
						if (y == goldY && x == goldX) {
							score++;
							goldX = r.nextInt(max1);
							goldY = r.nextInt(max1);
						}
						break;
					case KeyEvent.VK_A:
						if (x != 0 && world[y][x-1] != "▒" && world[y][x-1] != "♣" && world[y][x-1] != "▓" && world[y][x-1] != "♖" && world[y][x-1] != "♨" && world[y][x-1] != "║" && world[y][x-1] != "≈" && world[y][x-1] != "*" && world[y][x-1] != "@" && world[y][x-1] != ">") { //bounds and collision
							dir = "LEFT";
							x--;
							world[y][x] = "@";
							world[y][x+1] = ".";
							printWorld(world);
						} else if (x == 0 && underground == false) {
							x = 9;
							world[y][x-9] = ".";
							first = false;
							dead = false;
							absX--;
							r.setSeed(absX*absY);
							genLevel();
						}
						if (world[y][x-1] == "▒" || world[y][x-1] == "♣") {
							dir = "LEFT";
						}
						if (y == goldY && x == goldX) {
							score++;
							goldX = r.nextInt(max1);
							goldY = r.nextInt(max1);
						}
						break;
					case KeyEvent.VK_D:
						if (x != 9 && world[y][x+1] != "▒" && world[y][x+1] != "♣" && world[y][x+1] != "▓" && world[y][x+1] != "♖" && world[y][x+1] != "♨" && world[y][x+1] != "║" && world[y][x+1] != "≈" && world[y][x+1] != "*" && world[y][x+1] != "@" && world[y][x+1] != ">") { //bounds and collision
							dir = "RIGHT";
							x++;
							world[y][x] = "@";
							world[y][x-1] = ".";
							printWorld(world);
						} else if (x == 9 && underground == false) {
							x = 0;
							world[y][x+9] = ".";
							first = false;
							dead = false;
							absX++;
							r.setSeed(absX*absY);
							genLevel();
						}
						if (world[y][x+1] == "▒" || world[y][x+1] == "♣") {
							dir = "RIGHT";
						} 
						if (y == goldY && x == goldX) {
							score++;
							goldX = r.nextInt(max1);
							goldY = r.nextInt(max1);
						}
						break;
					case KeyEvent.VK_Q:
						backup();
						if (dir == "UP") {
								if (world[y-1][x] == "▒" || world[y-1][x] == "♖") {
									stone++;
									world[y-1][x] = ".";
									printWorld(world);
									break;
								} else if (world[y-1][x] == "♣" || world[y-1][x] == "▓" || world[y-1][x] == "♨" || world[y-1][x] == "║") {
									wood++;
									world[y-1][x] = ".";
									printWorld(world);
									break;
								}
							}	
								else if (dir == "DOWN") {
								if (world[y+1][x] == "▒" || world[y+1][x] == "♖") {
									stone++;
									world[y+1][x] = ".";
									printWorld(world);
									break;
								} else if (world[y+1][x] == "♣" || world[y+1][x] == "▓" || world[y+1][x] == "♨" || world[y+1][x] == "║") {
									wood++;
									world[y+1][x] = ".";
									printWorld(world);
									break;
								}
							} else if (dir == "LEFT") {
								if (world[y][x-1] == "▒" || world[y][x-1] == "♖") {
									stone++;
									world[y][x-1] = ".";
									printWorld(world);
									break;
								} else if (world[y][x-1] == "♣" || world[y][x-1] == "▓" || world[y][x-1] == "♨" || world[y][x-1] == "║") {
									wood++;
									world[y][x-1] = ".";
									printWorld(world);
									break;
								}
							} else if (dir == "RIGHT") {
								if (world[y][x+1] == "▒" || world[y][x+1] == "♖") {
									stone++;
									world[y][x+1] = ".";
									printWorld(world);
									break;
								} else if (world[y][x+1] == "♣" || world[y][x+1] == "▓" || world[y][x+1] == "♨" || world[y][x+1] == "║") {
									wood++;
									world[y][x+1] = ".";
									printWorld(world);
									break;
								}
							}
					case KeyEvent.VK_E:
						backup();
						if (block == "stone") {
						if (dir == "UP") {
								if (world[y-1][x] == "." && stone != 0) {
									stone--;
									world[y-1][x] = "▒";
									printWorld(world);
									break;
								}
							}	
								else if (dir == "DOWN") {
								if (world[y+1][x] == "." && stone != 0) {
									stone--;
									world[y+1][x] = "▒";
									printWorld(world);
									break;
								}
							} else if (dir == "LEFT") {
								if (world[y][x-1] == "." && stone != 0) {
									stone--;
									world[y][x-1] = "▒";
									printWorld(world);
									break;
								}
							} else if (dir == "RIGHT") {
								if (world[y][x+1] == "." && stone != 0) {
									stone--;
									world[y][x+1] = "▒";
									printWorld(world);
									break;
								}
							}
						} else if (block == "wood") {
							if (dir == "UP") {
								if (world[y-1][x] == "." && wood != 0) {
									wood--;
									world[y-1][x] = "▓";
									printWorld(world);
									break;
								}
							}	
								else if (dir == "DOWN") {
								if (world[y+1][x] == "." && wood != 0) {
									wood--;
									world[y+1][x] = "▓";
									printWorld(world);
									break;
								}
							} else if (dir == "LEFT") {
								if (world[y][x-1] == "." && wood != 0) {
									wood--;
									world[y][x-1] = "▓";
									printWorld(world);
									break;
								}
							} else if (dir == "RIGHT") {
								if (world[y][x+1] == "." && wood != 0) {
									wood--;
									world[y][x+1] = "▓";
									printWorld(world);
									break;
								}
							}
						} else if (block == "statue") {
							if (dir == "UP") {
								if (world[y-1][x] == "." && statue != 0) {
									statue--;
									world[y-1][x] = "♖";
									printWorld(world);
									break;
								}
							}	
								else if (dir == "DOWN") {
								if (world[y+1][x] == "." && statue != 0) {
									statue--;
									world[y+1][x] = "♖";
									printWorld(world);
									break;
								}
							} else if (dir == "LEFT") {
								if (world[y][x-1] == "." && statue != 0) {
									statue--;
									world[y][x-1] = "♖";
									printWorld(world);
									break;
								}
							} else if (dir == "RIGHT") {
								if (world[y][x+1] == "." && statue != 0) {
									statue--;
									world[y][x+1] = "♖";
									printWorld(world);
									break;
								}
							}
						}else if (block == "campfire") {
							if (dir == "UP") {
								if (world[y-1][x] == "." && campfire != 0 && world[y-1][x] != "≈") {
									campfire--;
									world[y-1][x] = "♨";
									for (burn = 0; burn < 100; burn++) {
										fireSpread();
									}
									printWorld(world);
									burn = 0;
									break;
								}
							}	
								else if (dir == "DOWN") {
								if (world[y+1][x] == "." && campfire != 0 && world[y+1][x] != "≈") {
									campfire--;
									world[y+1][x] = "♨";
									for (burn = 0; burn < 100; burn++) {
										fireSpread();
										}
									printWorld(world);
									burn = 0;
									break;
								}
							} else if (dir == "LEFT") {
								if (world[y][x-1] == "." && campfire != 0 && world[y][x-1] != "≈") {
									campfire--;
									world[y][x-1] = "♨";
									for (burn = 0; burn < 100; burn++) {
										fireSpread();
										}
									printWorld(world);
									burn = 0;
									break;
								}
							} else if (dir == "RIGHT") {
								if (world[y][x+1] == "." && campfire != 0 && world[y][x+1] != "≈" ) {
									campfire--;
									world[y][x+1] = "♨";
									for (burn = 0; burn < 100; burn++) {
										fireSpread();
										}
									printWorld(world);
									burn = 0;
									break;
								}
							}
						}else if (block == "support") {
							if (dir == "UP") {
								if (world[y-1][x] == "." && support != 0) {
									support--;
									world[y-1][x] = "║";
									printWorld(world);
									break;
								}
							}	
								else if (dir == "DOWN") {
								if (world[y+1][x] == "." && support != 0) {
									support--;
									world[y+1][x] = "║";
									printWorld(world);
									break;
								}
							} else if (dir == "LEFT") {
								if (world[y][x-1] == "." && support != 0) {
									support--;
									world[y][x-1] = "║";
									printWorld(world);
									break;
								}
							} else if (dir == "RIGHT") {
								if (world[y][x+1] == "." && support != 0) {
									support--;
									world[y][x+1] = "║";
									printWorld(world);
									break;
								}
							}
						}
					case KeyEvent.VK_UP:
						dir = "UP";
						break;
						
					case KeyEvent.VK_DOWN:
						dir = "DOWN";
						break;
						
					case KeyEvent.VK_LEFT:
						dir = "LEFT";
						break;
						
					case KeyEvent.VK_RIGHT:
						dir = "RIGHT";
						break;
						
					case KeyEvent.VK_1:
						block = "stone";
						break;
					case KeyEvent.VK_2:
						block = "wood";
						break;
					case KeyEvent.VK_3:
						block = "statue";
						break;
					case KeyEvent.VK_4:
						block = "campfire";
						break;
					case KeyEvent.VK_5:
						block = "support";
						break;
					case KeyEvent.VK_O:
						CraftingMenuMain();
						break;
					case KeyEvent.VK_R:
						switch(itemN) {
						case 1:
							bomb();
							break;
						case 2:
							sword();
							break;
						case 3:
							shovel();
							break;
						case 4:
							bucket();
							break;
						}
						break;
						
					case KeyEvent.VK_P:
						if (itemN < 5) {
							itemN++;
							printWorld(world);
						} else {
							itemN = 1;
						}
						break;
						
					case KeyEvent.VK_SPACE:
						sword();
						break;
					
					case KeyEvent.VK_T:
					try {
						talk();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
						break;
					case KeyEvent.VK_Y:
					try {
						investigate();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					break;
				}
				}catch(ArrayIndexOutOfBoundsException playerScript) {
					
				}
			}
			@Override
			public void keyReleased(KeyEvent e) {
				// TODO Auto-generated method stub
				
			}
			
		});
		}
		}
	
	public static void genLevel() {
		clearWorld();
		for (int i = 0; i < 50 ; i++) {
			char c = (char)(r.nextInt(26) + 'a');
			enemy = Character.toString(c);
		}
		dead = false;
		if (first == false) {
		int plan = r.nextInt(max4);
		if (plan == 0 || plan == 1 || plan == 2 || plan == 3 || plan == 4 || plan == 5 || plan == 18) {
			
			for (int i = 0; i < 200; i++) {
				genWalls();
			}
			for (int j = 0; j < 3; j++) {
				genTrees();
			}
		} else if (plan == 6 || plan == 7 || plan == 8 || plan == 9 || plan == 10 || plan == 11 || plan == 19){
			for (int n = 0; n <100; n++) {
				genForest();
			}
			for (int j = 0; j < 3; j++) {
				genTrees();
			}
		} else if (plan == 12) {
			clearWorld();
			genTown();
			for (int j = 0; j < 3; j++) {
				genTrees();
			}
		} else if (plan == 15 || plan == 16){
			for (int i = 0; i < 200; i++) {
				genWater();
				world[1][1] = ".";
				world[1][8] = ".";
				world[8][1] = ".";
				world[8][8] = ".";
			}
		} else {
			clearWorld();
			genLevel();
		}
		} else {
			for (int i = 0; i < 200; i++) {
				genWalls();
			}
			for (int j = 0; j < 3; j++) {
				genTrees();
			}
		}
		genEnemies();
		genGold();
		printWorld(world);
		
	}
	
	public static void Reader(int line , String filePath) throws FileNotFoundException {
		File dialog = new File(filePath);
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(dialog);
		for (int i = 0; i < line ; i++)
			out = scan.nextLine();
	}
	
	public static void annoucments(String announcment) {
		labelA.setText(announcment);
	}
	
	public static void main(String[] args) throws FileNotFoundException{
		//musicObject.playMusic("02 - Overworld.wav");
		panel.add(row0);
		panel.add(row1);
		panel.add(row2);
		panel.add(row3);
		panel.add(row4);
		panel.add(row5);
		panel.add(row6);
		panel.add(row7);
		panel.add(row8);
		panel.add(row9);
		
		playerScript();
		genLevel();
		
		absX = r.nextLong();
		absY = r.nextLong();
		
		
		panel.setBackground(Color.BLACK);
		row0.setForeground(Color.ORANGE);
		row1.setForeground(Color.ORANGE);
		row2.setForeground(Color.ORANGE);
		row3.setForeground(Color.ORANGE);
		row4.setForeground(Color.ORANGE);
		row5.setForeground(Color.ORANGE);
		row6.setForeground(Color.ORANGE);
		row7.setForeground(Color.ORANGE);
		row8.setForeground(Color.ORANGE);
		row9.setForeground(Color.ORANGE);
		
		annoucmentsPanel.setVisible(true);
		annoucmentsPanel.setSize(750,60);
		annoucmentsPanel.add(labelA);
		annoucmentsFrame.add(annoucmentsPanel);
		annoucmentsFrame.setSize(750,60);
		labelA.setFont(new Font("Menlo", Font.PLAIN, 20));
		
		JFrame helpFrame = new JFrame("Help Menu");
		JLabel helprow0 = new JLabel();
		JLabel helprow1 = new JLabel();
		JLabel helprow2 = new JLabel();
		JLabel helprow3 = new JLabel();
		JLabel helprow4 = new JLabel();
		JLabel helprow6 = new JLabel();
		JLabel helprow7 = new JLabel();
		JLabel helprow8 = new JLabel();
		JLabel helprow9 = new JLabel();
		
		JPanel helppanel = new JPanel();
		helppanel.setBackground(Color.BLACK);
		helpFrame.setSize(250,210);
		helpFrame.setResizable(false);
		helpFrame.add(helppanel);
		
		inventory.setSize(250,210);
		inventory.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		inventory.setResizable(false);
		inventory.setVisible(true);
		inventorypanel.setVisible(true);
		inventorypanel.setSize(250,210);
		inventory.add(inventorypanel);
		inventorypanel.setVisible(true);
		frame1.setLocation(0+500, 0+250);
		frame.setLocation(250+500, 0+250);
		inventory.setLocation(750+500, 0+250);
		helpFrame.setLocation(500+500, 0+250);
		annoucmentsFrame.setLocation(250+500, 250+210);
		annoucmentsFrame.setVisible(true);
		annoucmentsPanel.setBackground(Color.BLACK);
		labelA.setForeground(Color.ORANGE);
		annoucmentsFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		helppanel.add(helprow0);
		helppanel.add(helprow1);
		helppanel.add(helprow2);
		helppanel.add(helprow3);
		helppanel.add(helprow4);
		helppanel.add(helprow6);
		helppanel.add(helprow7);
		helppanel.add(helprow8);
		helppanel.add(helprow9);
		
		inventorypanel.setBackground(Color.BLACK);
		item1.setFont(new Font("Menlo", Font.PLAIN, 20));
		item2.setFont(new Font("Menlo", Font.PLAIN, 20));
		item3.setFont(new Font("Menlo", Font.PLAIN, 20));
		item4.setFont(new Font("Menlo", Font.PLAIN, 20));
		item5.setFont(new Font("Menlo", Font.PLAIN, 20));
		item1.setForeground(Color.ORANGE);
		item2.setForeground(Color.ORANGE);
		item3.setForeground(Color.ORANGE);
		item4.setForeground(Color.ORANGE);
		item5.setForeground(Color.ORANGE);
		inventorypanel.add(item1);
		inventorypanel.add(item2);
		inventorypanel.add(item3);
		inventorypanel.add(item4);
		inventorypanel.add(item5);
		inventory.add(inventorypanel);
		
		helppanel.setLayout(new GridLayout(0,1));
		helprow0.setFont(new Font("Menlo", Font.PLAIN, 20));
		helprow1.setFont(new Font("Menlo", Font.PLAIN, 15));
		helprow2.setFont(new Font("Menlo", Font.PLAIN, 15));
		helprow3.setFont(new Font("Menlo", Font.PLAIN, 15));
		helprow4.setFont(new Font("Menlo", Font.PLAIN, 15));
		helprow6.setFont(new Font("Menlo", Font.PLAIN, 15));
		helprow7.setFont(new Font("Menlo", Font.PLAIN, 15));
		helprow8.setFont(new Font("Menlo", Font.PLAIN, 15));
		helprow9.setFont(new Font("Menlo", Font.PLAIN, 15));
		helprow0.setText("Help");
		helprow1.setText("Arrows: Build DIR");
		helprow2.setText("Q: Build/Break");
		helprow3.setText("O: Craft");
		helprow4.setText("1-8: Select");
		helprow6.setText("P: Cycle");
		helprow7.setText("R: Item");
		helprow8.setText("T: Talk");
		helprow9.setText("Y: Investigate");
		
		helprow0.setForeground(Color.ORANGE);
		helprow1.setForeground(Color.ORANGE);
		helprow2.setForeground(Color.ORANGE);
		helprow3.setForeground(Color.ORANGE);
		helprow4.setForeground(Color.ORANGE);
		helprow6.setForeground(Color.ORANGE);
		helprow7.setForeground(Color.ORANGE);
		helprow8.setForeground(Color.ORANGE);
		helprow9.setForeground(Color.ORANGE);
		
		helpFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		helpFrame.setVisible(true);
		
		arow0.setForeground(Color.ORANGE);
		
		arow0.setFont(new Font("Menlo", Font.PLAIN, 15));
		
		pathfindingWander();
	}
}