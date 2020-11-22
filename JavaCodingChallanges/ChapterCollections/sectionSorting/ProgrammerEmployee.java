package ChapterCollections.sectionSorting;

import java.math.BigDecimal;

/**
 * Example of implementation for Comparable interface for OwnObject class
 * Using this implementation provide us to use OwnObject class as argument in
 * List sort function, or other functions which takes sorting parameter as
 * "something extends Comparable<T>
 */
public class ProgrammerEmployee implements Comparable<ProgrammerEmployee> {

    private String ownName;
    private String ownCompanyName;
    private BigDecimal ownSalary;
    private String ownPosition;

    @Override public int compareTo(ProgrammerEmployee o) {
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

    public String getOwnName() {
        return ownName;
    }

    public String getOwnCompanyName() {
        return ownCompanyName;
    }

    public BigDecimal getOwnSalary() {
        return ownSalary;
    }

    public String getPosition() {
        return ownPosition;
    }

    public Integer mapPossitionToIntValue(){
        if(this.getPosition().equals("Senior")){
            return 2;
        }else if(this.getPosition().equals("Junior")){
            return 1;
        }else{
            //default Intern
            return 0;
        }
    }
}
