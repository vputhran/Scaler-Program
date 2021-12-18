package bday12.classproblems;

public class GoToParty {
    public static void main(String[] args) {
        goToParty(10,0);
    }

    static void goToParty(int n, int x) {
        //Base case
        if (n == x) {
            System.out.println("Reached Party");
            return;
        }
        //Recursive call

        System.out.println("Take a step " + x);
        goToParty(n, x+1);   // Anything that is written before the function call - goes towards the base case anything after the function call goes towards the main()
        System.out.println("Coming back from the party " + x);


    }
}
