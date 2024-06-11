import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] tablica = new int[100];
        generujLosoweLiczby(tablica);
        System.out.println("Tablica przed posortowaniem bąbelkowym: ");
        wypiszTablice(tablica);

        sortowanieBabelkowe(tablica);

        System.out.println("\nTablica po sortowaniu bąbelkowym: ");
        wypiszTablice(tablica);
    }

    public static void generujLosoweLiczby(int[] tablica){
        Random random = new Random();
        for (int i = 0; i < tablica.length; i++){
            tablica[i] = random.nextInt(1000);
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

}