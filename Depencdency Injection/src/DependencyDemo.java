import Injection.FileInjector;
import Injection.PDFInjector;
import Injection.WordInjector;

public class DependencyDemo {
    public static void main(String[] args) {
        FileInjector fileInjector ;
        String data = "Welcome to Dependency Injection Example";
        fileInjector = new WordInjector();
        fileInjector.getApplication().process(data);
        fileInjector = new PDFInjector();
        fileInjector.getApplication().process(data);
    }
}
