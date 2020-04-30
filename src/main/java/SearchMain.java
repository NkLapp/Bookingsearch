import com.opencsv.CSVReader;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class SearchMain {





    /**
     * Tests file paths
     *
     * @param file
     */
    private static void printPaths(File file)
    {
        try
        {
            System.out.println("File Path = " + file.getPath());
            System.out.println("Absolute Path = " + file.getAbsolutePath());
            System.out.println("Canonical Path = " + file.getCanonicalPath());
            System.out.println("\n");
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }


    /**
     * Tulosta kaikki kirjat, jotka ovat saaneet yli miljoona kertaa arvosanan 5. Arvosanojen 5
     * lukumäärä löytyy sarakkeesta ratings_5 . Kirjoista tulee tulostaa sarakkeen title arvo.
     * @param rivit, Books tiedosto
     */
    public static void analyysi1(List<String[]> rivit) {
        System.out.println("Analyysi 1:");

        for (String rivi[] : rivit) {
            try {
                int ratingViisi = Integer.parseInt(rivi[20]);

                if (ratingViisi > 1000000) {
                    System.out.println(ratingViisi);
                }
                } catch(NumberFormatException e) {

                }
            }
    }

    /**
     * Tulosta kaikki kirjat, jotka on arvioitu vähintään satatuhatta kertaa, ja joiden arvioista yli
     * 40% on arvosana 3. Arvosanat saat selville sarakkeista ratings_1, ratings_2, ... .
     * Kirjoista tulee tulostaa sarakkeen title arvo.
     */
    public static void analyysi2() {
        System.out.println("Analyysi 2:");

    }

    /**
     *Joskus useammalla kirjalla on sama ISBN-numero. Tulosta kirjat, joiden ISBN-numero
     * toistuu listassa vähintään kaksi kertaa (mikäli ISBN-numero puuttuu, jätä rivi huomiotta).
     * Tulosta kirjoista sarakkeen title arvo. Käytä ISBN-numerona sarakkeen isbn13 arvoa.
     */
    public static void analyysi3() {
        System.out.println("Analyysi 3:");

    }

    /**
     *Tulosta vanhin kirja. Mikäli riviltä puuttuu julkaisuvuosi (sarake on tyhjä), jätä kyseinen
     * rivi huomiotta. Voit olettaa, että vanhin kirja on yksikäsitteinen (eli vanhimmalla
     * julkaisuvuodella ei ole useampia kirjoja). Tulosta kirjasta sen nimi (sarakkeen title
     * arvo) ja julkaisuvuosi. Käytä julkaisuvuotena saraketta original_publication_year
     */
    public static void analyysi4() {
        System.out.println("Analyysi 4:");

    }

    /**
     *Kullakin kirjalla voi olla yksi tai useampi kirjoittaja. Tulosta kirjoittaja, joka on ollut
     * kirjoittajana useimmassa kirjassa. Käytä kirjoittajan tunnistamiseen sarakkeen authors
     * arvoa. Mikäli kirjalla on useampi kirjoittaja, sarakkeen authors sisältämät nimet on
     * eroteltu toisistaan pilkulla
     */
    public static void analyysi5() {
        System.out.println("Analyysi 5:");

    }

    /**
     * Seuraavissa analyyseissä käytetään tiedoston books.csv lisäksi tiedostoa book_tags.csv.
     * Tiedoston book_tags.csv sarakkeen goodreads_book_id arvo vastaa tiedoston books.csv
     * sarakkeen goodreads_book_id arvoa. Esimerkiksi, mikäli tiedostossa book_tags.csv olevan
     * sarakkeen goodreads_book_id arvo on 31337, vastaa se books.csv tiedostossa olevaa riviä,
     * jossa sarakkeen goodreads_book_id arvo on 31337 -- rivillä on kirjan “Blackwood Farm (The
     * Vampire Chronicles tiedot.
     */

    /**
     * Laske ja tulosta tiedostosta book_tags.csv niiden rivien lukumäärä, joissa sarakkeen
     * goodreads_book_id arvo on 31337.
     *
     */
    public static void analyysi6() {
        System.out.println("Analyysi 6:");

    }

    /**
     * Laske ja tulosta tiedostosta book_tags.csv niiden rivien sarakkeen count summa, joissa
     * sarakkeen tag_id arvo on 30574.
     */
    public static void analyysi7() {
        System.out.println("Analyysi 7:");

    }

    /**
     * Laske ja tulosta vuonna 1945 julkaistuun kirjaan 1984 liittyvien tagien lukumäärä (eli
     * kyseiseen kirjaan liittyvien rivien lukumäärä tiedostosta book_tags.csv). Analyysin tulee
     * toimia, vaikka sarakkeen goodreads_book_id arvo muuttuisi. Etsi sarakkeen
     * goodreads_book_id arvo kirjan tietojen perusteella tiedostosta books.csv ja tarkastele
     * tämän jälkeen tiedostoa book_tags.csv löydetyn arvon perusteella. Älä siis kirjoita
     * ohjelmaa, joka tarkastelee vain kirjaa, jonka goodreads_book_id :n arvo on 13 --
     * ohjelman tulee toimia vaikka sarakkeen goodreads_book_id arvo olisi jotain muuta.
     */
    public static void analyysi8() {
        System.out.println("Analyysi 8:");

    }
    /**
     * Selvitä ja tulosta niiden kirjojen nimet (sarake title tiedostosta books.csv), joihin liittyy
     * tiedostossa book_tags.csv sarakkeen tag_id arvo 32837.
     */
    public static void analyysi9() {
        System.out.println("Analyysi 9:");

    }

    /**
     * Seuraavissa analyyseissä käytetään tiedostojen books.csv ja book_tags.csv lisäksi tiedostoa
     * tags.csv. Tiedoston tags.csv sarakkeen tag_id arvo vastaa tiedoston book_tags.csv olevan
     * sarakkeen tag_id arvoa.
     */

    /**
     *Tulosta tiedostosta tags.csv ne sarakkeen tag_id arvot, joihin liittyvän sarakkeen
     * tag_name arvo alkaa merkkijonolla history-of.
     */
    public static void analyysi10() {
        System.out.println("Analyysi 10:");

    }

    /**
     * Laske ja tulosta niiden kirjojen lukumäärä, joihin on liitetty tägi classic-poetry. Selvitä
     * siis ensin tiedostosta tags.csv sarakkeen tag_id arvo riville, jonka sarakkeen tag_name
     * arvo on classic-poetry. Laske tämän jälkeen tiedostosta book_tags.csv niiden rivien
     * lukumäärä, joissa esiintyy edellä selvittämäsi tag_id . Kuten aiemmin, huomaa että
     * tiedostojen sisältö voi muuttua -- toteuta analyysi siis siten, että analyysi toimii vaikka
     * tiedostojen sisältö muuttuisi.
     */
    public static void analyysi11() {
        System.out.println("Analyysi 11:");

    }

    /**
     * Tulosta niiden kirjojen nimet (tiedoston books.csv sarake title), joihin on liitetty tägi
     * computer-programming. Selvitä siis ensin tiedostosta tags.csv sarakkeen tag_id
     * arvo riville, jonka sarakkeen tag_name arvo on computer-programming. Selvitä tämän
     * jälkeen tiedostosta book_tags.csv rivit, joiden tag_id -sarakkeen arvo on aiemmin
     * selvittämäsi arvo. Selvitä näiden rivien sarakkeiden goodreads_book_id arvot, ja selvitä
     * niiden perusteella tiedostosta books.csv kirjojen otsikot (sarake title ). Kuten aiemmin,
     * huomaa että tiedostojen sisältö voi muuttua -- toteuta analyysi siis siten, että analyysi
     * toimii vaikka tiedostojen sisältö muuttuisi.
     */
    public static void analyysi12() {
        System.out.println("Analyysi 12:");

    }

    /**
     *  Selvitä ja tulosta kolme yleisintä kirjaan The Name of the Wind (The Kingkiller
     * Chronicle, #1) liittyvää tägiä. Tägien yleisyyden saat selville tiedoston book_tags.csv
     * sarakkeesta count.
     */
    public static void analyysi13() {
        System.out.println("Analyysi 13:");

    }

    /**
     * Selvitä ja tulosta viisi yleisintä kirjoittajan Suzanne Collins kirjoihin liittyvää tägiä.
     * Huomioi tägien yleisyyttä selvittäessä tiedoston book_tags.csv sarakkeen count arvo
     */
    public static void analyysi14() {
        System.out.println("Analyysi 14:");

    }

    /**
     * Selvitä ja tulosta mihin välillä 1990-2000 julkaistuun kirjaan (tai kirjoihin, mikäli tieto ei ole
     * yksikäsitteinen) liittyy eniten to-read-tägejä. Huomioi tägien yleisyyttä selvittäessä
     * tiedoston book_tags.csv sarakkeen count arvo.
     */
    public static void analyysi15() {
        System.out.println("Analyysi 15:");

    }

    /**
     * Tulosta käyttäjä (tai käyttäjät), jotka ovat antaneet eniten arvioita. Tulosta käyttäjästä
     * käyttäjän tunnus (sarakkeen user_id arvo). Laske kukin ratings.csv -tiedoston rivi
     * yhdeksi arvioksi.
     */
    public static void analyysi16() {
        System.out.println("Analyysi 16:");

    }

    /**
     * Selvitä ja tulosta käyttäjä tai käyttäjät, jotka ovat arvioineet eniten samoja kirjoja kuin
     * käyttäjä, jonka tunnus ( user_id -sarakkeen arvo) on 6630 .
     */
    public static void analyysi17() {
        System.out.println("Analyysi 17:");

    }

    /**
     * Selvitä ja tulosta käyttäjä, jolla on eniten samanarvoisia arvioita samoista kirjoista, kuin
     * käyttäjällä, jonka tunnus on 6630 . Mikäli samaa mieltä olleita käyttäjiä on useita, tulosta
     * ne kukin omalle rivilleen.
     */
    public static void analyysi18() {
        System.out.println("Analyysi 18:");

    }

    /**
     * Listaa edellisen osan perusteella käyttäjälle 6630 kirjoja (sarakkeen title arvo), joita
     * käyttäjä 6630 ei ole arvioinut, mutta joita edellisessä osassa tunnistetut käyttäjät ovat
     * pitäneet arvion 5 arvoisena. Listaa korkeintaan 5 kirjaa.
     */
    public static void analyysi19() {
        System.out.println("Analyysi 19:");

    }

    /**
     * Selvitä kirja, jonka arvioissa on suurin keskihajonta. Tarkastele vain kirjoja, jotka ovat
     * saaneet vähintään miljoona arviota tiedoston books.csv sarakkeiden ratings_1 ,
     * ratings_2 , … mukaan. Käytä arvioiden keskihajonnan laskemiseen tiedostossa
     * ratings.csv olevia arvioita. Tulosta eniten mielipiteitä jakaneesta kirjasta (eli kirjasta,
     * jonka arvioiden keskihajonta on suurin) kirjan nimi (sarake title ) sekä siihen liittyvien
     * arvioiden keskihajonta.
     */
    public static void analyysi20() {
        System.out.println("Analyysi 20:");

    }

    /**
     * Seuraavissa analyyseissä käytetään tiedostoja books.csv, book_tags.csv, tags.csv ja
     * ratings.csv.
     */

    /**
     * Selvitä viisi yleisintä tägiä ( book_tags.csv -tiedoston count -sarakkeen perusteella
     * tarkasteltuna) kirjalle, jonka arvioissa on pienin keskihajonta. Ota mukaan vain ne kirjat,
     * jotka ovat saaneet vähintään seitsemänsataaviisikymmentätuhatta arviota tiedoston
     * books.csv sarakkeiden ratings_1, ratings_2, … mukaan. Käytä arvioiden keskihajonnan
     * laskemiseen tiedostossa ratings.csv olevia arvioita. Tulosta lopulta tägeihin liittyvä
     * tiedostosta tags.csv löytyvän sarakkeen tag_name arvo.
     */
    public static void analyysi21() {
        System.out.println("Analyysi 21:");

    }

    /**
     * Selvitä viisi eniten mielipiteitä jakavaa kirjaa, joihin liittyy tägi fantasy. Saat mielipiteitä
     * jakavat kirjat selville laskemalla niihin liitttyvien arvioiden keskihajonnan (mitä suurempi
     * keskihajonta, sitä suurempi mielipiteiden jakautuminen). Ota mukaan vain ne kirjat, joihin
     * tägi fantasy on liitetty yli kymmenentuhatta kertaa (tiedoston book_tags.csv sarake
     * count ), ja jotka on arvioitu vähintään viisituhatta kertaa (tiedoston books.csv
     * sarakkeiden ratings_1, ratings_2, … mukaan). Käytä arvioiden keskihajonnan
     * laskemiseen tiedostossa ratings.csv olevia arvioita. Tulosta lopulta kirjojen nimet
     * ( title ) ja niiden arvioiden keskihajonnat.
     */
    public static void analyysi22() {
        System.out.println("Analyysi 22:");

    }

    public static void main(String[] args) throws IOException {
        Scanner lukija = new Scanner(System.in);
        //System.out.println("Mikä tiedosto luetaan?");
        //String tiedosto = lukija.nextLine();
        String books = "./src/main/data/books.csv";
        String booksTags = "./src/main/data/books_tags.csv";
        String rating = "./src/main/data/rating.csv";
        String tags = "./src/main/data/tags.csv";
        String toRead = "./src/main/data/to_read.csv";

        File bookstiedosto = new File(books);
        File booksTagstiedosto = new File(booksTags);
        File ratingtiedosto = new File(rating);
        File tagstiedosto = new File(tags);
        File toReadtiedosto = new File(toRead);


        //printPaths(bookstiedosto);

        List<String[]> booksRivit = new CSVReader(new FileReader(bookstiedosto.getAbsolutePath())).readAll();
        //System.out.println("Tiedostossa oli " + booksRivit.size() + " riviä.");

        analyysi1(booksRivit);


    }

}
