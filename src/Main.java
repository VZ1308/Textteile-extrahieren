import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Benutzer zur Eingabe einer Zeichenkette auffordern
        System.out.println("Bitte geben Sie die Zeichenkette im Format -derArtikel[Artikelbezeichnung]wurdebestelltvon[besteller'in]- ein:");
        String input = scanner.nextLine();

        // Schließen des Scanners
        scanner.close();

        // Artikelbezeichnung und Besteller extrahieren
        String articlePrefix = "derArtikel[";
        String orderedByPrefix = "wurdebestelltvon[";
        String articleSuffix = "]";
        String orderedBySuffix = "]";

        // Überprüfen, ob die Eingabe das richtige Format hat
        if (input.contains(articlePrefix) && input.contains(orderedByPrefix)) {
            // Extrahieren der Artikelbezeichnung
            int articleStartIndex = input.indexOf(articlePrefix) + articlePrefix.length();
            int articleEndIndex = input.indexOf(articleSuffix, articleStartIndex);
            String article = input.substring(articleStartIndex, articleEndIndex);

            int orderedByStartIndex = input.indexOf(orderedByPrefix) + orderedByPrefix.length();
            int orderedByEndIndex = input.indexOf(orderedBySuffix, orderedByStartIndex);
            String orderedBy = input.substring(orderedByStartIndex, orderedByEndIndex);

            System.out.println("Artikelbezeichnung: " + article);
            System.out.println("Besteller: " + orderedBy);
        } else {
            System.out.println("Die Eingabe entspricht nicht dem erwarteten Format.");
        }
    }
}
