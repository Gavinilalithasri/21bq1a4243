package JAVA;
import JAVA.*;
import Distance.*;
import Time.*;
import java.util.Scanner;
public class Converter {
	public static void main(String[] args) {
	 Scanner var = new Scanner(System.in);
	 Dollar D = new Dollar();
	 Euro E = new Euro();
	 Yen Y = new Yen();
	 Meter M = new Meter();
	 Miles Mi = new Miles();
	 Minutes Min = new Minutes();
	 Seconds S = new Seconds();
	 System.out.println(" 1.Curreny Converter\n 2.Distance Converter\n3.Time Converter\n");
	 System.out.print("Enter an Option : ");
	 int opt = var.nextInt();
	 switch(opt) {
	 case 1:
	 System.out.println("***Currency Converter***");
	 System.out.println(" 1.Dollar To INR\n 2.INR To Dollar\n3.Euro To INR\n 4.INR To Euro\n 5.Yen To INR\n 6.INR To Yen\n");
	 System.out.print("Enter an Option : ");
	 int option = var.nextInt();
	 switch(option) {
	 case 1:
	 System.out.print("\nEnter value in Dollars : ");
	 double dollar = var.nextDouble();
	 D.DollarToINR(dollar);
	break;
	 case 2:
	 System.out.print("\nEnter value in INR : ");
	 double rup = var.nextDouble();
	 D.INRtoDollar(rup);
	break;
	 case 3:
	 System.out.print("\nEnter value in Euros : ");
	 double euro = var.nextDouble();
	 E.EuroToINR(euro);
	break;
	 case 4:
	 System.out.print("\nEnter value in INR : ");
	 double inr = var.nextDouble();
	 E.INRtoEuro(inr);
	break;
	 case 5:
	 System.out.print("\nEnter value in Yen : ");
	 double yen = var.nextDouble();
	 Y.YenToINR(yen);
	break;
	 case 6:
	 System.out.print("\nEnter value in INR : ");
	 double rupee = var.nextDouble();
	 Y.INRtoYen(rupee);
	break;
	 default:
	 System.out.println("Invalid Option");
	 }
	 break;
	 case 2:
	 System.out.println("***Distance Converter***");
	 System.out.println(" 1.Meter To KM\n 2.KM To Meter\n 3.MilesTo KM\n 4.KM To Miles\n");
	 System.out.print("Enter an Option : ");
	 int option2 = var.nextInt();
	 switch(option2) {
	 case 1:
	 System.out.print("\nEnter value in Meters : ");
	 double meter = var.nextDouble();
	 M.MeterToKM(meter);
	break;
	 case 2:
	 System.out.print("\nEnter value in KM : ");
	 double km = var.nextDouble();
	 M.KMtoMeter(km);
	break;
	 case 3:
	 System.out.print("\nEnter value in Miles : ");
	 double miles = var.nextDouble();
	 Mi.MilesToKM(miles);
	break;
	 case 4:
	 System.out.print("\nEnter value in KM : ");
	 double Km2 = var.nextDouble();
	 Mi.KMtoMiles(Km2);
	break;
	 default:
	 System.out.println("Invalid Option");
	 }
	 break;
	 case 3:
	 System.out.println("***Time Converter***");
	 System.out.println(" 1.Minutes to Hours\n 2.Hours To Minutes\n3.Seconds To Hours\n 4.Hours To Seconds\n");
	 System.out.print("Enter an Option : ");
	 int option3 = var.nextInt();
	 switch(option3) {
	 case 1:
	 System.out.print("\nEnter value in Minutes : ");
	 double mins = var.nextDouble();
	 Min.minsToHours(mins);
	break;
	 case 2:
	 System.out.print("\nEnter value in Hours : ");
	 double hour1 = var.nextDouble();
	 Min.hoursToMins(hour1);
	break;
	 case 3:
	 System.out.print("\nEnter value in Seconds : ");
	 double secs = var.nextDouble();
	 S.secsToHours(secs);
	break;
	 case 4:
	 System.out.print("\nEnter value in Hours : ");
	 double hour2 = var.nextDouble();
	 S.hoursToSecs(hour2);
	break;
	 default:
	 System.out.println("Invalid Option");
	 }
	 break;

	default:

	System.out.println("Invalid Option");
	 }
	 var.close();
	 }
	} 


