package Injection;

import Consumer.Application;
import Consumer.ApplicationConsumer;
import Service.Word;

public class WordInjector implements FileInjector{
    @Override
    public ApplicationConsumer getApplication() {
        return new Application(new Word());
    }
}
