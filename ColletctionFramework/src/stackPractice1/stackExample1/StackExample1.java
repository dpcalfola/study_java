package stackPractice1.stackExample1;

import java.util.Stack;

public class StackExample1 {
    public static void main(String[] args) {
        Stack<Coin> coinBox = new Stack<Coin>();

        coinBox.push(new Coin(20));
        coinBox.push(new Coin(70));
        coinBox.push(new Coin(100));
        coinBox.push(new Coin(130));


        while(!coinBox.empty()){
            Coin coin = coinBox.pop();
            System.out.printf("꺼내온 동전: %d원\n", coin.getValue());
        }

    }
}
