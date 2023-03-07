
import java.util.ArrayList;
import java.util.List;
import java.util.*;

public class MaxMinusMin {
    /**
     * Return the difference between the highest and lowest values of the List.
     * This will require you to know some of the List interface methods.
     *
     * @param nums an List<Integer> containing varying nums.
     * @return the max value of nums minus the min value of nums.
     */
    public int difference(List<Integer> nums){
        List<Integer> sortList = new ArrayList<>(nums);
        Collections.sort(sortList);
        int minMinusMax = sortList.get(nums.size()-1) - sortList.get(0);

        return minMinusMax;
    }
}
