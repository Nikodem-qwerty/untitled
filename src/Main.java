import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;


void main() throws IOException {
    String Filepath = "./file.txt";
    FileWriter CrazyWriter = null;

    try {
        CrazyWriter = new FileWriter(Filepath);
    } catch (IOException e) {
        System.out.println("Could not locate your file");
    }
    assert CrazyWriter != null;
    Scanner myObj = new Scanner(System.in);

    while(true) {
        String brejker = myObj.nextLine();  // Read user input
        if (Objects.equals(brejker, "e")){
            break;
        }
        CrazyWriter.write(brejker);
    }
    CrazyWriter.close();

    try(BufferedReader reader = new BufferedReader(new FileReader(Filepath))){
        String line;
        while((line = reader.readLine()) != null){
            System.out.println(line);
        }
    } catch (IOException e){
        System.out.println(" Sam Thing Wong");
    }


}