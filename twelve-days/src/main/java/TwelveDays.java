class TwelveDays {
    String verse(int verseNumber) {
        String day = "", things = "";

        switch (verseNumber) {
            case 12:
                things += "twelve Drummers Drumming, ";
            case 11:
                things += "eleven Pipers Piping, ";
            case 10:
                things += "ten Lords-a-Leaping, ";
            case 9:
                things += "nine Ladies Dancing, ";
            case 8:
                things += "eight Maids-a-Milking, ";
            case 7:
                things += "seven Swans-a-Swimming, ";
            case 6:
                things += "six Geese-a-Laying, ";
            case 5:
                things += "five Gold Rings, ";
            case 4:
                things += "four Calling Birds, ";
            case 3:
                things += "three French Hens, ";
            case 2:
                things += "two Turtle Doves, and ";
            case 1:
                things += "a Partridge in a Pear Tree.";

        }
        switch (verseNumber) {
            case 1:
                day = "first";
                break;
            case 2:
                day = "second";
                break;
            case 3:
                day = "third";
                break;
            case 4:
                day = "fourth";
                break;
            case 5:
                day = "fifth";
                break;
            case 6:
                day = "sixth";
                break;
            case 7:
                day = "seventh";
                break;
            case 8:
                day = "eighth";
                break;
            case 9:
                day = "ninth";
                break;
            case 10:
                day = "tenth";
                break;
            case 11:
                day = "eleventh";
                break;
            case 12:
                day = "twelfth";
                break;
        }

        String vers = "On the " + day + " day of Christmas my true love gave to me: " + things+"\n";
        return vers;
    }


    String verses(int startVerse, int endVerse) {
        String whole="";
        for(int i=startVerse;i<=endVerse;i++){
            whole+=verse(i);
            if(i!=endVerse)whole+="\n";
        }
        return whole;
    }
    
    String sing() {
        return verses(1,12);
    }


}
