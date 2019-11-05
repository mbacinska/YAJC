package factories.org;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {


    static ListType listType;

    public static List<String> getList(ListType listType) {

        switch (listType) {
            case ARRAY_LIST: {
                return new ArrayList<>();
            }
            case LINKED_LIST: {
                return new LinkedList<>();
            }
        }
        throw new AssertionError();

    }

    public static void main(String[] args) {
        // List<String> data = getList(ListType.ARRAY_LIST);

        ListType listType = ListType.ARRAY_LIST;
        List<String> data = getList(listType);
        data.add("Ala");
        data.add("ma");
        data.add("Asa");

        System.out.println(data);

        listType = ListType.LINKED_LIST;
        data = getList(listType);

        //-------------------------

        ListType listType1 = ListType.ARRAY_LIST;
        List<String> data1 = listType1.getStrategyList();

    }

    public enum ListType {
        ARRAY_LIST {
            @Override
            List<String> getStrategyList() {
                return null;
            }
        },
        LINKED_LIST {
            @Override
            List<String> getStrategyList() {
                return null;
            }
        };

        abstract List<String> getStrategyList();
    }
}
