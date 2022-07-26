package Injection;

import Consumer.Application;
import Consumer.ApplicationConsumer;
import Service.PDF;

public class PDFInjector implements FileInjector{
    @Override
    public ApplicationConsumer getApplication() {
        return new Application(new PDF());
    }
}
