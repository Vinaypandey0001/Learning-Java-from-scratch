/* Our hoary culture had several great persons since time immemorial and king Vikramaditya’s nava ratnas (nine gems) belongs to this ilk. They are named in the following shloka:





TCS Ninja Coding Questions and Answers

Among these, Varahamihira was an astrologer of eminence and his book Brihat Jataak is recokened as the ultimate authority in astrology. He was once talking with Amarasimha, another gem among the nava ratnas and the author of the Sanskrit thesaurus, Amarakosha. Amarasimha wanted to know the final position of a person, who starts from the origin 0 0 and travels per the following scheme.

He first turns and travels 10 units of distance
His second turn is upward for 20 units
The third turn is to the left for 30 units
The fourth turn is downward for 40 units
The fifth turn is to the right(again) for 50 units
… And thus he travels, every time increasing the travel distance by 10 units.

Constraints:

2<=n<=1000


TCS Ninja Coding Questions #2 - Solution and Output

*/
import java.util.Scanner;

public class TCS_4_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int x = 0, y = 0;
        char direction = 'R'; // Initialize direction for clarity

        while (n > 0) {
            switch (direction) {
                case 'R':
                    x += 10; // Move right
                    direction = 'U';
                    break;
                case 'U':
                    y += 20; // Move up
                    direction = 'L';
                    break;
                case 'L':
                    x -= 10; // Move left
                    direction = 'D';
                    break;
                case 'D':
                    y -= 20; // Move down
                    direction = 'R';
                    break;
                default:
                    System.out.println("Invalid direction encountered."); // Handle unexpected input
            }

            n--;
        }

        System.out.println(x + " " + y);
    }
}
