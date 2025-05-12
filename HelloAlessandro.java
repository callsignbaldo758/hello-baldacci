import java.io.*;
public class HelloAlessandro{
    public static void main(String[] args){
        System.out.println("hello baldo");
        Vector<Charater> lettere = new Vector<Character>();
        lettere.add('a');
        lettere.add('l');
        lettere.add('e');
        lettere.add('s');
        lettere.add('s');
        lettere.add('a');
        lettere.add('n');
        lettere.add('d');
        lettere.add('r');
        lettere.add('o');
        for(int i = 0; i < lettere.size(); i++){
            System.out.println(lettere.get(i));
        }
    }
}