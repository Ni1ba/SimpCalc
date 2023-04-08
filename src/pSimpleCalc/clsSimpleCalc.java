package pSimpleCalc;
import java.util.Scanner;
//Класс простой калькулятор
public class clsSimpleCalc {
	//основная функция калькулятора
	public static void main(String[] args){
		//создаем  объект сканер для ввода данных числовых
		Scanner myScanInt =new Scanner (System.in);
		System.out.print("First value: ");
		int fValue = myScanInt.nextInt();
		
		//создаем  объект сканер для ввода данных типа строки
		Scanner myScanStr=new Scanner (System.in);
		System.out.print("Operand: ");
		String operand  = myScanStr.nextLine();
		
		System.out.print("Second value: ");
		int lValue = myScanInt.nextInt();
		
		//выбираем операнд и выполняем операцию между числами
		switch (operand) {
		case "+" :
			System.out.print("Result: " + (fValue + lValue));
		break;
		
		case "-" :
			System.out.print("Result: " + (fValue - lValue));
		break;
		
		case "*":
			System.out.print("Result: " + (fValue *lValue));
		break;
		
		case "/":
			System.out.print("Result: " + (fValue / lValue));
		break;
		
		//если операнда нет в списке, выводим ошибку
		default:
			System.out.print("Err#");
		}
	
	}
}

