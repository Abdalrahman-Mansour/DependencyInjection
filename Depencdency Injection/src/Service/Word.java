package Service;

public class Word implements FileService{
    @Override
    public void saveFile(String data) {
        System.out.println(data +" Save in .Doc extension");
    }
}
