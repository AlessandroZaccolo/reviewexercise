import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.*;


public class RangeTest {

    // Create tests for the method that returns a list

    @Test
    public void correct_list_range() {

        Range test = new Range(2,5);
        List<Integer> actual = test.listRange();

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);


        Assert.assertThat(actual, is(expected));

    }

    @Test
    public void incorrect_list_range() {

        Range test = new Range(2,5);
        List<Integer> actual = test.listRange();

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);


        Assert.assertThat(actual, is(not(expected)));

    }


    // test range with undefined end
    @Test
    public void test_range_without_end() {

        Range r = new Range();

        r.setStart(2);
        r.setInterval(6);


        for (int i = r.getStart(); i <= r.getEnd(); i++ ){
            Assert.assertThat(i, is(i));
        }

    }

    // test list range with undefined end


    @Test
    public void test_list_range_without_end() {

        Range test = new Range();
        test.setStart(2);
        test.setInterval(4);
        List<Integer> actual = test.listRange();

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(2);
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);


        Assert.assertThat(actual, is(expected));

    }


    @Test
    public void test_print_range_excluding_start() {

        Range r = new Range();

        r.setStart(2);
        r.setEnd(6);
        r.setExcludeStart(true);

        int newStart = r.getStart() + 1;

        for (int i = newStart; i <= r.getEnd(); i++ ){
            Assert.assertThat(i, is(i));
        }

    }

    @Test
    public void test_print_range_excluding_end() {

        Range r = new Range();

        r.setStart(2);
        r.setEnd(6);
        r.setExcludeEnd(true);

        int newEnd = r.getEnd() - 1;

        for (int i = r.getStart(); i <= newEnd; i++ ){
            Assert.assertThat(i, is(i));
        }

    }

    @Test
    public void test_list_range_excluding_start_and_end() {

        Range test = new Range();
        test.setStart(2);
        test.setEnd(8);
        test.setExcludeStart(true);
        test.setExcludeEnd(true);
        List<Integer> actual = test.listRange();

        List<Integer> expected = new ArrayList<Integer>();
        expected.add(3);
        expected.add(4);
        expected.add(5);
        expected.add(6);
        expected.add(7);



        Assert.assertThat(actual, is(expected));

    }

}