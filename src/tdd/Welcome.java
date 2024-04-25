package tdd;

public class Welcome {
	public static String welcome (String input) {
		if (input==null || input.trim().isEmpty())	{
			return "Hello, my friend" ;
		}
		if (estEnMajuscule(input)) {
			return gestionCris(input);
		}
		if (contientEspace(input)) {
			if(contientVirgule(input)) {
				return gestionNoms(input);
			}
			return "Hello, " +capitalize(suppEspace(input));
		}
		if(contientVirgule(input)) {
			return gestionNoms(input);
		}
		else { 
			return "Hello, " + capitalize(input) ;
		}
	}
	


	private static String capitalize (String name ) {
	if (name == null  || name.trim().isEmpty()){
		return "my friend";
	}else {
		char[]tab_char=name.toCharArray();
		tab_char[0]=Character.toUpperCase(tab_char[0]);
		name=new String (tab_char);
		return name ;
		}
	}
	private static boolean estEnMajuscule(String chaine) {
		for (int i=0; i<chaine.length();i++) {
			if (!Character.isUpperCase(chaine.charAt(i)))
				return false ;
		}
			
			return true ;
		}
		
	private static String gestionCris(String nom) {
		return "HELLO, " +nom+ "!";
		
	}
	private static boolean contientEspace(String chaine ) {
		return chaine.contains(" ");
		
		
	}
	private static String suppEspace (String chaine ) {
		return chaine.replaceAll("\\s", "");
		
		
	}
	private static boolean contientVirgule(String chaine) {
		return chaine.contains(",");
		
	}
	private static String phraseMaj(String[] Maj, int nombreNoms){
		String out = "HELLO";
		int i = 0;
		while(i < nombreNoms) {
			out += ", " + Maj[i];
			i+=1;
		}
//		if (nombreNoms > 1) {
//			if(i != nombreNoms) {
//				return out + " AND "+Maj[i];
//			}
//		}else {
//			out += ", " + Maj[i];
//		}
		return out;
	}
	private static String phraseNonMaj(String[] NonMaj, int nombreNoms){
		String out = "Hello";
		int i = 0;
		while(i < nombreNoms) {
			out += ", " + NonMaj[i];
			i+=1;
		}
//		if(nombreNoms > 1){
//			return out + " and "+ NonMaj[i];
//		}
		return out;
	}
	private static String gestionNoms(String chaine) {
		String[]parties=chaine.split(",");
		String []Maj = new String[parties.length];
		String []NonMaj = new String[parties.length];
		int nombreMaj = 0;
		int nombreMin = 0;
		
		int i = 0;
		int j = 0;
		for (String nom : parties) {
			if(estEnMajuscule(nom.trim())) {
				Maj[i] = nom.trim();
				nombreMaj += 1;
				i+=1;
			}else {
				NonMaj[j] =  nom.trim().substring(0,1).toUpperCase()+ nom.trim().substring(1).toLowerCase();
				nombreMin += 1;
				j+=1;
			}
		}
		String out = phraseMaj(Maj, nombreMaj);
		String out2 = phraseNonMaj(NonMaj, nombreMin);
		if (out.equals("HELLO")) {
			return out2 ;
		}
		return out2+". AND "+ out + " !";
	}

	
}
