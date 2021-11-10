package DataStructureAndAlgorthim.Sorting.ElementorySorting;
// this Date class is a simple example of implementing our own sorting rules.
public class DateComparableImplementation implements Comparable<DateComparableImplementation>{
    private int day , month, year;

    public DateComparableImplementation(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    // here we are implementing user defined class. We can define our own rules to sort our class objects
    // which the sort method can use to sort.

    // another key point is , we dont necessarily have to compare to same object, we can compare to another class
    // object and make our compareTo method rules.
    @Override
    public int compareTo(DateComparableImplementation that) {
        if(this.year>that.year)
            return 1;
        if(this.year<that.year)
            return -1;
        if(this.month>that.month)
            return 1;
        if(this.month<that.month)
            return -1;
        if(this.day>that.day)
            return 1;
        if(this.day<that.day)
            return -1;
        return 0;
    }
}
