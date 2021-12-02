import org.apache.commons.lang3.time.StopWatch;
import java.util.List;

/**
 * @author KlaughTs, Kretova Ksenia, AMM, 3rd year, 3rd group
 * @see Main
 */

public class Time {

    /**
     * Method that measures the execution time of adding items
     * @param list (ArrayList or LinkedList)
     * @param size the number of items in the list
     * @return time in milliseconds
     */
    public long addTime(List list, int size) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i=0; i<size; i++)
            list.add(i);
        stopWatch.stop();
        return stopWatch.getTime();
    }

    /**
     * Method that measures the execution time of getting items
     * @param list (ArrayList or LinkedList)
     * @param size the number of items in the list
     * @return time in milliseconds
     */
    public long getTime(List list, int size) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i=0; i<size; i++)
            list.get(i);
        stopWatch.stop();
        return stopWatch.getTime();
    }

    /**
     * Method that measures the execution time of removing items
     * @param list (ArrayList or LinkedList)
     * @param size the number of items in the list
     * @return time in milliseconds
     */
    public long deleteTime(List list, int size) {
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        for (int i=size-1; i>=0; i--)
            list.remove(i);
        stopWatch.stop();
        return stopWatch.getTime();
    }
}
