import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int cyfra;
    int x=0;
    System.out.println("Wprowadz liczbe do sprawdzenia");
    Scanner liczba = new Scanner(System.in);
cyfra=liczba.nextInt();
    for(int i =0;i<cyfra;i++){
      if (cyfra%(i+1)==0)
        x++;}
          
    
  if(x==2)
    System.out.println(cyfra+"jest liczba pierwsza");
      else
    System.out.println(cyfra+" nie jest liczba pierwsza");
    }
}