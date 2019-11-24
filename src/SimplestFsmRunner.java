import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class SimplestFsmRunner {
    public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException {
        new SimplestFsm().testFSM();
    }
}
