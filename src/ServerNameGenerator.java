package src;

public class ServerNameGenerator {
    public static void main(String[] args) {
        String[] adjectives = {"big", "small", "elegant", "fancy", "clean", "cautious", "clever", "helpful", "difficult", "important"};
        String[] nouns = {"dog", "cat", "chair", "table", "car", "grass", "house", "cup", "computer", "paper"};

        String adj = randomWord(adjectives);
        String noun = randomWord(nouns);

        System.out.printf("Here is your server name:%n%s-%s%n", adj, noun);

    }


    public static String randomWord(String[] arr) {
        int randomNumber = (int)Math.ceil(Math.random() * 10);
        return arr[randomNumber];
    }
}
