public class WarmUp {
    public static void main(String... args) {
        String words = "A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,R,S,T,U,V,W,X,Y,Z";
        String[] letters = words.split(",");

        for (int count = 0; count < letters.length; count++) {
            System.out.println(letters[count]);
        }
    }
}