import java.net.*;

public class URLEg{
    public static void main(String[] args){
        URL myurl = new URL("url");

        URLConnection urlc = myurl.openConnection();

        urlc.connect();

        BufferedReader br = new BufferedReader(new InputStreamReader(urlc.getInputStream()));

        String inputLine;

        while((inputLine=br) != null){
            System.out.println(inputLine);
        }
    }   
}