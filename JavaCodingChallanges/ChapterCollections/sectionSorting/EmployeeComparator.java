package ChapterCollections.sectionSorting;

import java.util.Comparator;

public class EmployeeComparator {


    public Comparator<ProgrammerEmployee> employeeComparator(String pmSortingBy) {
        return switch (pmSortingBy) {
            case "name" -> new SortByName();
            case "salary" -> new SortBySalary();
            case "age" -> new SortByAge();
            case "possition" -> new SortByPossition();
            default -> Comparator.naturalOrder();
        };
    }

    class SortByName implements Comparator<ProgrammerEmployee> {

        @Override public int compare(ProgrammerEmployee o1, ProgrammerEmployee o2) {
            return o1.getOwnName()
                    .compareTo(o2.getOwnName());
        }

    }

    class SortBySalary implements Comparator<ProgrammerEmployee> {

        @Override public int compare(ProgrammerEmployee o1, ProgrammerEmployee o2) {
            return o1.getOwnSalary()
                    .compareTo(o2.getOwnSalary());
        }

    }

    class SortByAge implements Comparator<ProgrammerEmployee> {

        @Override public int compare(ProgrammerEmployee o1, ProgrammerEmployee o2) {
            return o1.getOwnSalary()
                    .compareTo(o2.getOwnSalary());
        }
    }

    class SortByPossition implements Comparator<ProgrammerEmployee> {

        @Override public int compare(ProgrammerEmployee o1, ProgrammerEmployee o2) {

            return !o1.getPosition()
                    .equals(o2.getPosition()) ? o1.mapPossitionToIntValue() - o2.mapPossitionToIntValue() : o1.getOwnSalary()
                    .compareTo(o2.getOwnSalary());
        }
    }

}
