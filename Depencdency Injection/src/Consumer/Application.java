package Consumer;

import Service.FileService;

public class Application implements ApplicationConsumer{
    private FileService fileService ;
    public Application(FileService fileService){
        this.fileService = fileService;
    }
    @Override
    public void process(String data) {
    fileService.saveFile(data);
    }
}
