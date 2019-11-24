import Action.FSMAction;
import FSM.FSM;
import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class SimplestFsm {

    private final static String CONFIG_FILE_NAME = "/pingpong.xml";

    public void testFSM() throws IOException, SAXException, ParserConfigurationException {
        FSM fsm = new FSM(this.getClass().getResourceAsStream(CONFIG_FILE_NAME), new FSMAction() {
            @Override
            public boolean action(String curState, String message, String nextState, Object args) {
                System.out.println("transition: " + curState + "=>" + nextState + " : " + message);
                return true;
            }
        });
        System.out.println(fsm.getCurrentState());

        System.out.println("********************************************************************************");
        System.out.println("First round");
        System.out.println("********************************************************************************");
        fsm.ProcessFSM("doPing");
        System.out.println(fsm.getCurrentState());

        fsm.ProcessFSM("doPong");
        System.out.println(fsm.getCurrentState());

        fsm.ProcessFSM("doPing");
        System.out.println(fsm.getCurrentState());

        fsm.ProcessFSM("doPong");
        System.out.println(fsm.getCurrentState());


        fsm.ProcessFSM("doPing");
        System.out.println(fsm.getCurrentState());

        fsm.ProcessFSM("doPong");
        System.out.println(fsm.getCurrentState());


        fsm.ProcessFSM("doPing");
        System.out.println(fsm.getCurrentState());

        fsm.ProcessFSM("doPong");
        System.out.println(fsm.getCurrentState());

        fsm.ProcessFSM("doPing");
        System.out.println(fsm.getCurrentState());

        fsm.ProcessFSM("doPong");
        System.out.println(fsm.getCurrentState());

        System.out.println("*********************************************************************************");
        System.out.println("Second round");
        System.out.println("*********************************************************************************");

        fsm.ProcessFSM("doPing");
        System.out.println(fsm.getCurrentState());

        fsm.ProcessFSM("doPong");
        System.out.println(fsm.getCurrentState());

        fsm.ProcessFSM("doPong");
        System.out.println(fsm.getCurrentState());

        fsm.ProcessFSM("doPong");
        System.out.println(fsm.getCurrentState());


    }
}
