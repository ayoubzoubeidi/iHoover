package ayoub.test.core.interfaces;

import ayoub.test.core.UserInputData;

import java.io.IOException;

public interface UserInterface {
    UserInputData getUserInput() throws IOException;
}
