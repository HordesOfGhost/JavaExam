import java.io.*;

// public class ReadWrite{
//     public static void main (String[] args){
//         try{
//             FileInputStream fi = new FileInputStream("Hellos.txt");
//             FileOutputStream vowels = new FileOutputStream("Vowels.txt");
//             FileOutputStream consonants = new FileOutputStream("Consonants.txt");
//             int c = 0;
//             while((c=fi.read()) != -1){
//                 char ch = (char)c;
//                 if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch == 'u'){
//                     vowels.write(c);
//                 }
//                 else{
//                     consonants.write(c);
//                 }
                
//             }
//             vowels.close();
//             consonants.close();

//         }
//         catch(Exception e){
//             System.out.println(e);
//         }
//     }
// }

public class ReadWrite{
    public static void main (String[] args){
        try{
            FileReader fi = new FileReader("Hellos.txt");
            FileWriter vowels = new FileWriter("Vowels.txt");
            FileWriter consonants = new FileWriter("Consonants.txt");
            int c = 0;
            while((c=fi.read()) != -1){
                char ch = (char)c;
                if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' || ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch == 'u'){
                    vowels.write(c);
                }
                else{
                    consonants.write(c);
                }
                
            }
            vowels.close();
            consonants.close();

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}