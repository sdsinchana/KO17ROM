// class JioHotStar {
    // public static void main(String args[]) {
        
        // String hindiSeries[]= {"Sacred Games", "Mirzapur", "The Family Man", "Paatal Lok", "Aarya",
            // "Delhi Crime", "Made in Heaven", "Special OPS", "Asur", "Kota Factory"};

        // String kannadaSeries[] = {"Humble Politician Nograj", "Tandoori Idly", "Hate You Romeo", "Loose Connection", "Dr. Bro",
            // "By Mistake", "Joshelay", "Gandhada Gudi", "Honeymoon", "Navelru Half Boiled"};

        // String malayalamMovies[] = {"Drishyam", "Bangalore Days", "Premam", "Kumbalangi Nights", "Joji",
            // "CIA", "Hridayam", "Jana Gana Mana", "Android Kunjappan", "Minnal Murali"};

        // String englishSeries[]= {"Breaking Bad", "Game of Thrones", "Stranger Things", "Money Heist", "Friends",
            // "The Witcher", "Sherlock", "Dark", "House of the Dragon", "The Office"};

       
        // System.out.println("The number of Hindi Series:"+hindiSeries.length);
        // System.out.println("The Hindi Series are :"+hindiSeries[0]+","+hindiSeries[1]+","+hindiSeries[2]+
							// ","+hindiSeries[3]+","+hindiSeries[4]+","+hindiSeries[5]+
							// ","+hindiSeries[6]+","+hindiSeries[7]+","+hindiSeries[8]+","+hindiSeries[9]);

        // System.out.println("The number of Kannada Series:"+kannadaSeries.length);
        // System.out.println("The Kannada Series are :"+kannadaSeries[0]+","+kannadaSeries[1]+","+kannadaSeries[2]+
							// ","+kannadaSeries[3]+","+kannadaSeries[4]+","+kannadaSeries[5]+","+kannadaSeries[6]+
							// ","+kannadaSeries[7]+","+kannadaSeries[8]+","+kannadaSeries[9]);
		
        // System.out.println("The number of Malayalam Movies:"+malayalamMovies.length);
        // System.out.println("The Malayalam Series are :"+malayalamMovies[0]+","+malayalamMovies[1]+
							// ","+malayalamMovies[2]+","+malayalamMovies[3]+","+malayalamMovies[4]+
							// ","+malayalamMovies[5]+","+malayalamMovies[6]+","+malayalamMovies[7]+
							// ","+malayalamMovies[8]+","+malayalamMovies[9]);

        // System.out.println("The number of English Series:"+englishSeries.length);
        // System.out.println("The English Series are :"+englishSeries[0]+","+englishSeries[1]+
							// ","+englishSeries[2]+","+englishSeries[3]+","+englishSeries[4]+
							// ","+englishSeries[5]+","+englishSeries[6]+","+englishSeries[7]+
							// ","+englishSeries[8]+","+englishSeries[9]);
							
    // }
// }


class JioHotStar{
	static String hindiSeries[]={"Sacred Games", "Mirzapur", "The Family Man", "Paatal Lok", "Aarya",
            "Delhi Crime", "Made in Heaven", "Special OPS", "Asur", "Kota Factory"};
			
	static String kannadaSeries[] = {"Humble Politician Nograj", "Tandoori Idly", "Hate You Romeo", "Loose Connection", "Dr. Bro",
            "By Mistake", "Joshelay", "Gandhada Gudi", "Honeymoon", "Navelru Half Boiled"};
			
	static String malayalamMovies[] = {"Drishyam", "Bangalore Days", "Premam", "Kumbalangi Nights", "Joji",
             "CIA", "Hridayam", "Jana Gana Mana", "Android Kunjappan", "Minnal Murali"};

    static String englishSeries[]= {"Breaking Bad", "Game of Thrones", "Stranger Things", "Money Heist", "Friends",
            "The Witcher", "Sherlock", "Dark", "House of the Dragon", "The Office"};
			
	public static void main(String args[]){
		System.out.println("Start of main");
		getHindiSeries();
		getKannadaSeries();
		getMalayalamSeries();
		getEnglishSeries();
		System.out.println("End of main");
	}
	
	public static void getHindiSeries(){
		System.out.println("Beginning of getHindiSeries()");
		for(String hindi:hindiSeries){
			System.out.println(hindi);
		}
		System.out.println("End of getHindiSeries()");
	}
	
	public static void getKannadaSeries(){
		System.out.println("-------------------------------");
		System.out.println("Beginning of getKannadaSeries()");
		for(String kannada:kannadaSeries){
			System.out.println(kannada);
		}
		System.out.println("End of getKannadaSeries()");
	}
	
	public static void getMalayalamSeries(){
		System.out.println("---------------------------------");
		System.out.println("Beginning of getMalayalamSeries()");
		for(String malayalam:malayalamMovies){
			System.out.println(malayalam);
		}
		System.out.println("End of getMalayalamSeries()");
	}
	
	public static void getEnglishSeries(){
		System.out.println("--------------------------------");
		System.out.println("Beginning of getEnglishSeries()");
		for(String english:englishSeries){
			System.out.println(english);
		}
		System.out.println("End of getEnglishSeries()");
	}
}
