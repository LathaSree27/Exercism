class TwelveDays {
    String verse(int verseNumber) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        String dayOutput = "On the ";
        switch (verseNumber) 
        {
            case 1:
               dayOutput += "first";
               break;
            case 2:
               dayOutput += "second";
               break;
            case 3:
               dayOutput += "third";
               break;
            case 4:
               dayOutput += "fourth";
               break;
            case 5:
               dayOutput += "fifth";
               break;
            case 6:
               dayOutput += "sixth";
               break;
            case 7:
               dayOutput += "seventh";
               break;
            case 8:
               dayOutput += "eighth";
               break;
            case 9:
               dayOutput += "ninth";
               break;
            case 10:
               dayOutput += "tenth";
               break;
            case 11:
               dayOutput += "eleventh";
               break;
            case 12:
               dayOutput += "twelfth";
               break;
        }
        dayOutput += " day of Christmas my true love gave to me: ";
        switch (verseNumber) 
        {
            case 12:
               dayOutput += "twelve Drummers Drumming, ";
            case 11:
               dayOutput += "eleven Pipers Piping, ";
            case 10:
               dayOutput += "ten Lords-a-Leaping, ";
            case 9:
               dayOutput += "nine Ladies Dancing, ";
            case 8:
               dayOutput += "eight Maids-a-Milking, ";
            case 7:
               dayOutput += "seven Swans-a-Swimming, ";
            case 6:
               dayOutput += "six Geese-a-Laying, ";
            case 5:
               dayOutput += "five Gold Rings, ";
            case 4:
               dayOutput += "four Calling Birds, ";
            case 3:
               dayOutput += "three French Hens, ";
            case 2:
               dayOutput += "two Turtle Doves, and ";
            case 1:
               dayOutput += "a Partridge in a Pear Tree.\n";
        }
        return dayOutput;
    }

    String verses(int startVerse, int endVerse) {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
         String daysOutput="";
        int i;
        for(i=startVerse;i<endVerse;i++){
           
            daysOutput+= this.verse(i);
            daysOutput+= "\n";
        }
        daysOutput+= this.verse(i);
        return daysOutput;
    }
    
    String sing() {
        // throw new UnsupportedOperationException("Delete this statement and write your own implementation.");
        return this.verses(1,12);
    }
}
