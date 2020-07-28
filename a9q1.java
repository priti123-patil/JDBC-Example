import java.util.*;
public class a9q1 {

    public static void main(String args[]) {
        try {
            FileInputStream file = new FileInputStream("C:/read.txt");
            BufferedReader reader = new BufferedReader(new InputStreamReader(file));
            String line = reader.readLine();
            while(line != null){
                System.out.println(line);
                line = reader.readLine();
            }
                 
            } catch (FileNotFoundException ex) {
            Logger.getLogger(CollectionTest.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
            Logger.getLogger(CollectionTest.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
}