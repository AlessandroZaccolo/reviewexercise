import java.util.ArrayList;
import java.util.List;

public class Range {


    private int start;
    private int end;
    private int interval;
    private boolean excludeStart;
    private boolean excludeEnd;


    // A constructor that receives 2 parameters

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
        this.excludeStart = false;
        this.excludeEnd = false;
    }

    // Think whether you could add another constructor where A or B are not given (one of them or none)
    // I initialize a default constructor without any parameters), I set default values in this case 0 as fields are Integers
    // We can use set methods to assign values to start and end. However, I add interval field in case of an unknown end.

    public Range (){
        this.start = 0;
        this.end = 0;
        this.interval = interval;
        this.excludeStart = false;
        this.excludeEnd = false;

    }


    // Think of a way to choose whether you want to include A and/or B in the lists you print/return.
    // For example, let's say A is 3 and B is 7, and you want to include A but exclude B.
    // The resulting list would be 3, 4, 5, 6. (the 7 won't be included). You may add more fields to your class.

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getInterval() { return interval; }

    public void setInterval(int interval) { this.interval = interval; }

    public void setExcludeStart(boolean excludeStart) {
        this.excludeStart = excludeStart;
    }

    public void setExcludeEnd(boolean excludeEnd) {
        this.excludeEnd = excludeEnd;
    }

    // A method that prints the numbers from A to B.
    public void printRange(){


        excludeExtreme();

        if (end == 0 && start != 0){

            end = interval + start;
        }

        loopRange();

    }

    //A method that returns a list containing the numbers from A to B
    //Getter and setter methods to change A and B


    public List<Integer> listRange() {


        List<Integer> result = new ArrayList<Integer>();

        excludeExtreme();

        if (end == 0 && start != 0){

            end = interval + start;
        }

        while (start <= end){
            result.add(start);
            start++;
        }

        return result;

    }

    public void excludeExtreme(){

        if (excludeStart){
            start++;
        }
        if (excludeEnd){
            end--;
        }

    }

    public void loopRange(){

        while (start <= end){
            System.out.println(start);
            start++;
        }

    }





}
