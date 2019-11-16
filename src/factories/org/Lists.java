package factories.org;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lists {


    static ListType listType;

    //factory method
    public static List<String> getList(ListType listType) {


        return listType.getStrategyList();
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
                return new ArrayList<>();
            }
        },
        LINKED_LIST {
            @Override
            List<String> getStrategyList() {
                return new LinkedList<>();
            }
        };

        //strategy
        abstract List<String> getStrategyList();
    }


    //strategy
    interface ListCreator {
        List<String> createList();
    }

    class ArrayListCreator implements ListCreator {

        @Override
        public List<String> createList() {
            return new ArrayList<>();
        }
    }

    class LinkedListCreator implements ListCreator {

        @Override
        public List<String> createList() {
            return new LinkedList<>();
        }
    }


    //factory
    ListCreator getListCreator(String listType) {
        switch (listType) {
            case "array":
                return new ArrayListCreator();
            case "linked":
                return new LinkedListCreator();
            default:
                throw new IllegalArgumentException("");
        }
    }


}
