class TwelveDays {
    String[] days = { "first",
            "second", "third", "fourth",
            "fifth", "sixth", "seventh",
            "eighth", "ninth", "tenth",
            "eleventh", "twelfth" };;
    String[] gifts = {
            "a Partridge in a Pear Tree",
            "two Turtle Doves",
            "three French Hens",
            "four Calling Birds",
            "five Gold Rings",
            "six Geese-a-Laying",
            "seven Swans-a-Swimming",
            "eight Maids-a-Milking",
            "nine Ladies Dancing",
            "ten Lords-a-Leaping",
            "eleven Pipers Piping",
            "twelve Drummers Drumming",
    };

    String verse(int verseNumber) {
        String answer = "On the " + days[verseNumber - 1] + " day of Christmas my true love gave to me: ";
        for (int i = verseNumber; i > 1; i--) {
            answer += gifts[i - 1] + ", ";
        }
        if (verseNumber != 1) {
            answer += "and " + gifts[0];
        } else {
            answer += gifts[0];
        }
        return answer + ".\n";
    }

    String verses(int startVerse, int endVerse) {
        String answer = "";
        for (int i = startVerse; i <= endVerse; i++) {
            answer += this.verse(i);
            if (i == endVerse)
                break;
            answer += "\n";
        }
        return answer;
    }

    String sing() {
        return this.verses(1, 12);
    }
}
