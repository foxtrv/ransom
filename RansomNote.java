import java.util.HashMap;
import java.util.Map;

public class RansomNote {

    Map<Character, Integer> charMap;
    Map<Character, Integer> failMap;
    String ransomNoteText;
    String magazineText;

    RansomNote() {
        charMap = new HashMap<Character, Integer>();
        failMap = new HashMap<Character, Integer>();
        ransomNoteText = null;
        magazineText = null;
    }

    public static void main(String[] args) {

        RansomNote r = new RansomNote();

        // Ransom Note Text taken from the famous Adolph Coors III ransom - heir to the Coors Brewing Company empire.
        // https://en.wikipedia.org/wiki/Adolph_Coors_III
        r.ransomNoteText = "Mrs. Coors:\n" +
                "Your husband has been kidnaped. His car is by Turkey Creek.\n" +
                "Call the police or F.B.I: he dies.\n" +
                "Cooperate: he lives.\n" +
                "Ransom: $200,000 in tens and $300,000 in twenties.\n" +
                "There will be no negotiating.\n" +
                "Bills: used / non-consecutive / unrecorded / unmarked.\n" +
                "Warning: we will know if you call the police or record the serial numbers.\n" +
                "Directions: Place money and this letter and envelope in one suitcase or bag. Have two men with a car ready to make the delivery.\n" +
                "When all set, advertise a tractor for sale in Denver Post section 69. Sign ad King Ranch, Fort Lupton.\n" +
                "Wait at NA 9-4455 for instructions after ad appears.\n" +
                "Deliver immediately after receiving call. Any delay will be regarded as a stall to set up a stake-out.\n" +
                "Understand this: Adolph's life is in your hands. We have no desire to commit murder. All we want is that money. If you follow the instructions, he will be released unharmed within 48 hours after the money is received. \n";


        // Magazine Text is from a random article on wikipedia.
        // https://en.wikipedia.org/wiki/Instant_book
        r.magazineText = "Instant book\n" +
                "From Wikipedia, the free encyclopedia\n" +
                "Instant book is a term used in publishing to describe a book that has been produced and published very quickly to meet market demand.\n" +
                "Normally when a book is published, it represents months of preparation and production—the production process takes from two months to a year.[1] An Instant book is one that is written and published very quickly to capitalize on a current news event or figure.[1] Many of the scheduling and roadblocks in a publishing plan are put aside in order to get the book published as quickly as possible.[1] Sometimes government documents or reports are published—they require little editing and are part of the public domain.[1] The book generally has a very short lifespan once published—sales are expected to be high in the first few days and weeks and then drop off.[1]\n" +
                "Contents  [hide] \n" +
                "1\tThe early years\n" +
                "2\tTwentieth century\n" +
                "3\t21st century\n" +
                "4\tNotable instant books\n" +
                "5\tReferences\n" +
                "The early years[edit]\n" +
                "There are conflicting reports as to when the first instant book was published. There are reports that the first instant book appeared after the Chicago fire of 1874. There were Instant books published and sold door-to-door about the Titanic shortly after the disaster in 1912.[2] Pocket Books claims that they published the first instant book in 1945 after the death of President Franklin D. Roosevelt and the dropping of the atomic bomb in Hiroshima.[1]\n" +
                "Twentieth century[edit]\n" +
                "It was in the latter half of the 20th century that American publishers used Instant books more commonly as part of their publishing plan.[1] Instant books were published on the Northeast blackout of 1965, the Moon landing, the Iran hostage crisis, and the murder of John Lennon.[1]\n" +
                "One of the most successful instant books was the Warren Commission Report published in 1964 by Bantam Books, which by 1987 had over 1.7 million copies in print.[1] Bantam followed this book up with over 70 other instant books over the next couple of decades.[1] Two San Francisco Chronicle journalists wrote a book on the Jonestown massacre in 11 days, publishing it three hours before a competing work. Operation Entebbe and IBM's introduction of its PCjr home computer also received instant books.[3]\n" +
                "Instant books have gone in and out of favor over the years. By the late 1980s, the New York Times said that their high cost of production along with several failed Instant books caused publishers to back away from this process.[1] Publishers printed instant books in mass paperback in high quantity print runs that resulted in returns to the publisher after public interest waned in the topic. But by the 1990s advances in the publishing and distribution had allowed costs to go down and some publishers built instant publishing back into their plans.[4][5]\n" +
                "St Martin's Press published several instant books in the late 1990s focusing on true-crime, including books on the O.J. Simpson case (Fallen Hero) and the Susan Smith case (Sins of the Mother). Executive editor, Charles Spicer, described to Writer's Digest how he looked for authors who were experienced reporters who were capable of gathering information quickly and writing to a deadline. He had chosen Carlton Smith, an experienced reporter, to write an instant book on the Jon Benet Ramsay case (Death of a Little Princess).[5] Spicer said that a book needed to be able to sell hundreds of thousands of copies to be worth a publisher's effort for an instant book.[5]\n" +
                "21st century[edit]\n" +
                "Some types of instant books did not fare well in the 21st century. The advent of the Internet had an impact on government and document instant publishing—a government document or report could be posted online instead of printed in book form for easy public access. Instead of publishing documents—publishers looked for other ways to create value with instant books by focusing on major sporting and news events.[6]\n" +
                "Often a book publisher will team up with newspapers. Triumph Books, a division of Random House, is an example of a publisher that focuses on creating instant books with newspapers. Triumph worked with Los Angeles Times to publish a book commemorating the 2012 Stanley Cup, and with the Chicago Tribune for an Instant book commemorating the 2016 World series.[7][8]\n" +
                "JHU Press is an example of a publisher producing an Instant book tied to a news event. JHU Press published an instant book on the Gun Violence debate shortly after the Sandy Hook incident with materials gathered from a summit that was quickly conceived and put together. The publisher Press described their process for publishing an instant book using a simultaneous process to Publisher's Weekly in 2013:\n" +
                "Kathy Alexander, JHU Press’ publicity manager, reports that while the press is more accustomed to a publishing process that typically takes 11 months from transmission of the manuscript to book release, they are able to produce Reducing Gun Violence in 14 days by shifting from a linear production process, in which every task occurs in order, to a more simultaneous process, in which different tasks are performed at the same time.\n" +
                "The cover, for example, was designed before the title was finalized,” Anderson explained, “Metadata was pushed out to booksellers before the manuscript was complete. Even the peer review process was changed to accommodate the schedule with multiple readers reviewing individual parts simultaneously.”[9]\n" +
                "Over the years, printers and book manufacturers have adjusted their process to accommodate instant books through innovation and updating printing practices.[10] Where once a large print run was needed for an instant book (but often translated in high returns), now smaller print runs can make instant publishing more feasible.[10]";


        r.ransomNoteText = r.ransomNoteText.toLowerCase();
        r.magazineText = r.magazineText.toLowerCase();
        r.collectCharsFromMagazine(r.charMap, r.magazineText);
//        r.printMap(r.charMap, "=== Chars found in magazine text ===");
        boolean test = r.checkIfRansomNoteCanBeMade(r.charMap, r.ransomNoteText);
        if (test) {
            System.out.println("✔ Success! Ransom note can be made from magazine.");
        } else {
            System.out.println("❌ Ransom note cannot be made from magazine text.");
            r.printMap(r.failMap, "=== Chars missing ===");
        }
    }

    private void collectCharsFromMagazine(Map<Character, Integer> charMap, String magazineText) {
        for (int i = 0; i < magazineText.length(); i++) {
            Character c = magazineText.charAt(i);
            this.add(charMap, c);
        }
    }

    private boolean checkIfRansomNoteCanBeMade(Map<Character, Integer> charMap, String ransomNoteText) {
        boolean check = true;
        for (Character c : ransomNoteText.toCharArray()) {
            if (charMap.containsKey(c)) {
                Integer charsRemaining = charMap.get(c);
                if (charsRemaining < 1) {
                    this.add(failMap, c);
                    check = false;
                }
                charMap.put(c, --charsRemaining);
            } else {
                this.add(failMap, c);
                check = false;
            }
        }
        return check;
    }

    private void add(Map<Character, Integer> map, Character c) {
        Integer numFound = map.get(c);
        if (numFound == null)
            map.put(c, 1);
        else
            map.put(c, ++numFound);
    }

    private void printMap(Map<Character, Integer> map, String msg) {
        System.out.println(msg);
        for (Object name : map.keySet()){
            String key = name.toString();
            String value = map.get(name).toString();
            System.out.println(key + " " + value);
        }
    }

}
