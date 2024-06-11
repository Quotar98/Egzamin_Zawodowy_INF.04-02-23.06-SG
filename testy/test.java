import java.util.Random;

public class test {
    public static void main(String[] args) {
        int[] tablica = new int[100];
        generujLosoweLiczby(tablica);
        System.out.print("Tablica przed posortowaniem bąbelkowym: ");
        wypiszTablice(tablica);

        sortowanieBabelkowe(tablica);

        System.out.print("\nTablica po sortowaniu bąbelkowym: ");
        wypiszTablice(tablica);

        if (czyPosortowane(tablica)){
            System.out.println("\nTest zakończony sukcesem: Tablica została posortowana");
        }
        else {
            System.out.println("\nTest zakończony niepowodzeniem: Tablica nie została posortowana");
        }
    }

    public static void generujLosoweLiczby(int[] tablica){
        Random random = new Random();
        for (int i = 0; i < tablica.length; i++){
            tablica[i] = random.nextInt(1001);
        }
    }

    public static void wypiszTablice(int[] tablica){
        for (int liczba: tablica){
            System.out.print(liczba + ", ");
        }
        System.out.println();
    }

    public static void sortowanieBabelkowe(int[] tablica){
        int n = tablica.length;
        boolean zamieniono;
        for (int i = 0; i < n - 1; i++){
            zamieniono = false;
            for (int j = 0; j < n - i - 1; j++){
                if(tablica[j] > tablica[j + 1]){
                    int temp = tablica[j];
                    tablica[j] = tablica[j + 1];
                    tablica[j + 1] = temp;
                    zamieniono = true;
                }
            }
            if (!zamieniono){
                break;
            }
        }
    }

    public static boolean czyPosortowane(int[] tablica){
        for (int i = 0; i < tablica.length - 1; i++){
            if (tablica[i] > tablica[i + 1]){
                return false;
            }
        }
        return true;
    }
}