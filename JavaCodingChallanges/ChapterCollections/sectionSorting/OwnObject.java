package ChapterCollections.sectionSorting;

import java.math.BigDecimal;

/**
 * Example of implementation for Comparable interface for OwnObject class
 * Using this implementation provide us to use OwnObject class as argument in
 * List sort function, or other functions which takes sorting parameter as
 * "something extends Comparable<T>
 */
public class OwnObject implements Comparable<OwnObject> {

    private String ownName;
    private String ownCompanyName;
    private BigDecimal ownSalary;

    @Override public int compareTo(OwnObject o) {
        int localResult = this.ownName.compareTo(o.ownName);
        if (localResult == 0) {
            localResult = this.ownCompanyName.compareTo(o.ownCompanyName);
            if (localResult == 0) {
                return this.ownSalary.compareTo(o.ownSalary);
            }
            return localResult;
        }
        return localResult;
    }

    @Override public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override public int hashCode() {
        return super.hashCode();
    }
}
