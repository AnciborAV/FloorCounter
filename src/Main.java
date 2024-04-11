import java.util.Scanner;

class Main {
		private static final String STOP = "/stop";
		public static void main(String[] args)
		{
				System.out.println("Введите номер квартиры от 1 до 21." +
								" Если хотите выйти из программы нажмите /stop.");
				boolean isActive = true;
				Scanner s = new Scanner(System.in);
				while (isActive && s.hasNext()) {
						switch (s.next()) {
								case "1", "2", "3" -> {
										System.out.println("Эта квартира находится на 1 этаже");
								}
								case "4", "5", "6" -> {
										System.out.println("Эта квартира находится на 2 этаже");
								}
								case "7", "8", "9" -> {
										System.out.println("Эта квартира находится на 3 этаже");
								}
								case "10", "11", "12" -> {
										System.out.println("Эта квартира находится на 4 этаже");
								}
								case "13", "14", "15" -> {
										System.out.println("Эта квартира находится на 5 этаже");
								}
								case "16", "17", "18" -> {
										System.out.println("Эта квартира находится на 6 этаже");
								}
								case "19", "20", "21" -> {
										System.out.println("Эта квартира находится на 7 этаже");
								}
								case STOP -> {
										System.out.println("Задолбали со своими этажами! Все, я спать!");
										isActive = false;
								}
								default -> {
										System.out.println("Много этажей я устал писать!");
								}
						}
				}
		}
}
