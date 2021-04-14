/*
 * Author: Hojjat Shabab
 *
 * Created on April 14, 2021, 2:00 PM
 */
public class Alphabet {
    public static void main(String []args){
        System.out.println("Welcome to the Alphabet program!");
        System.out.println("Alphabet lowercase");
        for (int i = 97; i <=122 ; i++) {
            System.out.print((char) i + "\t");
        }
        System.out.println("\n"+"Alphabet uppercase");
        for (int i = 65; i <=90 ; i++) {
            System.out.print((char) i + "\t");
        }
        System.out.println("\n"+"Alphabet one in in between show lowercase");
        for (int i = 97; i <=122 ; i+=2) {
            System.out.print((char) i + "\t");
        }
        System.out.println("\n"+"Alphabet one in between show uppercase");
        for (int i = 65; i <=90 ; i+=2) {
            System.out.print((char) i + "\t");
        }
    }
}
