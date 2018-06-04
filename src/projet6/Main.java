package projet6;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		double nombreDble = 1.45235435325345;
		double nombreArrondi = arrondi(nombreDble, 2);
		System.out.println(nombreArrondi);
		
		// Quelques methodes utiles
		String chaine = new String("COUCOU TOUT LE MONDE !"), chaine2 = new String(), chaine3 = new String();
		chaine2 = chaine.toLowerCase();   //Donne "coucou tout le monde !"
		chaine3 = chaine.toUpperCase();   //Donne "COUCOU COUCOU"
		int longueur = 0;
		longueur = chaine.length();   //Renvoie 9
				
		String str1 = new String("coucou"), str2 = new String("toutou");
		if (str1.equals(str2))
			System.out.println("Les deux chaînes sont identiques !");
			else
				 System.out.println("Les deux chaînes sont différentes !");
				
		// !str1.equals(str2) pour tester si 2 chaines sont differentes
				
		String nbre = new String("1234567");
		char carac = nbre.charAt(4);   //Renverra ici le caractère 5
				
		String chain = new String("la paix niche"), chain2 = new String();
		chain2 = chain.substring(3,13);   //Permet d'extraire "paix niche"
				
		String mot = new String("anticonstitutionnellement");
		int n = 0;
				 
		n = mot.indexOf('t');           //n vaut 2
		n = mot.lastIndexOf('t');       //n vaut 24
		n = mot.indexOf("ti");          //n vaut 2
		n = mot.lastIndexOf("ti");      //n vaut 12
		n = mot.indexOf('x');           //n vaut -1
				
		double X = 0.0;
		X = Math.random();
		//Retourne un nombre aléatoire 
		//compris entre 0 et 1, comme 0.0001385746329371058

		double sin = Math.sin(120);     //La fonction sinus
		double cos = Math.cos(120);     //La fonction cosinus
		double tan = Math.tan(120);     //La fonction tangente
		double abs = Math.abs(-120.25); //La fonction valeur absolue (retourne le nombre sans le signe)
		double d = 2;
		double exp = Math.pow(d, 2);    //La fonction exposant
		//Ici, on initialise la variable exp avec la valeur de d élevée au carré
		//La méthode pow() prend donc une valeur en premier paramètre, et un exposant en second
				
				
		String[] tabStr = {"toto", "titi", "tata"};
		int[] tabInt = {1, 2, 3, 4};
		String[][] tabStr2 = {{"1", "2", "3", "4"}, {"toto", "titi", "tata"}};

		//La méthode avec un tableau de String sera invoquée
		parcourirTableau(tabStr);
		//La méthode avec un tableau d'int sera invoquée
		parcourirTableau(tabInt);
		//La méthode avec un tableau de String à deux dimensions sera invoquée
		parcourirTableau(tabStr2);
		
		int entier = 0xFE;
		System.out.println(entier);
						
	}
	
	//QUELQUES METHODES PRATIQUES
	//Methode qui arrondi un double, B etant le nombre de decimale
	static double arrondi(double A, int B) {
		  return (double) ( (int) (A * Math.pow(10, B) + .5)) / Math.pow(10, B);
	}
	
	//Methode pour parcourir un tableau de chaine a 1 dimension
	static void parcourirTableau(String[] tab)
	{
	   for(String str : tab)
	   System.out.println(str);
	}
	//La meme methode pour un tableau d'entier
	static void parcourirTableau(int[] tab)
	{
	  for(int str : tab)
	    System.out.println(str);
	}
	//La meme methode pour un tableau de chaines a 2 dimension
	static void parcourirTableau(String[][] tab)
	{
	  for(String tab2[] : tab)
	  {
	    for(String str : tab2)
	      System.out.println(str);
	  }
	}
	
}
