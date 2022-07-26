package Service;

public class PDF implements FileService{
    @Override
    public void saveFile(String data) {
        System.out.println(data +" save in PDF format");
    }
}
