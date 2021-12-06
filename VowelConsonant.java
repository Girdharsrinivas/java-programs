import java.util.Scanner;
class VowelConsonant {
    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);
        char ch = Scanner.next().charAt(0);
        if(ch == 'a' ||ch =='e'||ch == 'i'||ch== '0'||ch == 'u')
        System.out.println(ch+":vowel");
        else
        System.out.println(ch+":consonant");
    }
}