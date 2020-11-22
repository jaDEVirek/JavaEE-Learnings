package ChapterCollections.sectionSorting;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<OwnObject> {


    public EmployeeComparator(String pmSortingBy) {
        switch (pmSortingBy) {

            case "name":
                break;
            case "salary":
                break;
            case "age":
                break;
            case "possition":
                break;

        }

    }

    @Override public int compare(OwnObject o1, OwnObject o2) {
        return 0;
    }


}
