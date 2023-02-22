import java.util.*;
import java.util.stream.Collectors;

public class Start {
    public static void main(String[] args) {
        List<Integer> divisorOf52 = new ArrayList<>();
        divisorOf52.add(1);
        divisorOf52.add(2);
        divisorOf52.add(4);
        divisorOf52.add(13);
        divisorOf52.add(26);
        divisorOf52.add(52);
        List<Integer> randomNumbers = new ArrayList<>();
        randomNumbers.add(1);
        randomNumbers.add(60);
        randomNumbers.add(13);
        randomNumbers.add(12);

        randomNumbers.addAll(divisorOf52);
        System.out.println("Lista unita: " + randomNumbers + "\n" + "Numero degli elementi: " + randomNumbers.size());

        Set<Integer> set = new LinkedHashSet<>(randomNumbers);
        List<Integer> randomNumberWithoutDuplicates = new ArrayList<>(set);
        System.out.println("Lista senza doppioni: " + randomNumberWithoutDuplicates);

        randomNumberWithoutDuplicates.sort(Comparator.naturalOrder());
        System.out.println("Lista in ordine crescente: " + randomNumberWithoutDuplicates);

        randomNumberWithoutDuplicates.sort(Comparator.reverseOrder());
        System.out.println("Lista in ordine decrescente: " + randomNumberWithoutDuplicates);
    }
}
