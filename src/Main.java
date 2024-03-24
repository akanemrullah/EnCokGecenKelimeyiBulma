import java.util.HashMap;
import java.util.Scanner;

public class Main {

    // Hashmap olusturulan metot
    public static HashMap<String, Integer> hashCreate(){
        String word;
        String[] wordSplit;
        int counter;
        Scanner input = new Scanner(System.in);

        System.out.print("Kelimeleri saydirmak istedigin cumleyi gir: ");
        word = input.nextLine();

        wordSplit = word.split(" "); // Ilk olarak String class inin split metotu ile " " karakteri ile ayirdigimiz kelimeleri wordSplit adli dizide tutuyoruz

        HashMap<String, Integer> hashMap = new HashMap<>(); // hashMap adinda yapimizi olusturuyoruz

        // hashMap e key ve veriable degerlerini atadigimiz mantiksal yapi
        for (int i = 0; i < wordSplit.length; i++) {
            counter = 1;
            for (int j = 0 ; j < wordSplit.length ; j++){
                if ((wordSplit[i].equalsIgnoreCase(wordSplit[j])) && (i != j)) {
                    hashMap.put(wordSplit[i].toUpperCase(), counter++);
                } else {
                    hashMap.put(wordSplit[i].toUpperCase(), counter);
                }
            }
        }
        return hashMap; // olusturulan bu yapi geri donduruluyor
    }

    // Cikti aldigimiz metot
    public static void hashPrint(HashMap<String, Integer> hashMap){

        for (String s : hashMap.keySet()){
            System.out.println(s + " - " + hashMap.get(s));
        }

    }

    public static void main(String[] args) {

        HashMap<String, Integer> hash;

        hash = hashCreate(); // Hashmap i olusturdugumuz metot cagriliyor
        hashPrint(hash); // Yukarida olusturulan metot un ciktisi veriliyor.
    }
}