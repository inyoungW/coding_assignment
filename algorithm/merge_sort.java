import java.util.*;

public class HelloWorld{

    public static void main(String []args){
        final int[] ary = {6,2,4,7,1,3,5};
        List<Integer> sort = new ArrayList<Integer>();
        for (int i : ary) sort.add(i);
        sort = mergesort(sort);
        System.out.println(sort.toString());
    }
    public static List<Integer> mergesort(final List<Integer> values) {
      if(values.size() < 2) return values;
      final List<Integer> leftHalf = values.subList(0, values.size()/2);
      final List<Integer> rightHalf = values.subList(values.size()/2, values.size());
      return merge(mergesort(leftHalf),mergesort(rightHalf));
    }
    
    private static List<Integer> merge(final List<Integer> left, final List<Integer> right){
      int leftPtr = 0;
      int rightPtr = 0;
      final List<Integer> merged = new ArrayList<>(left.size()+right.size());
      
      while(leftPtr < left.size() && rightPtr < right.size()) {
        if(left.get(leftPtr) < right.get(rightPtr)) {
          merged.add(left.get(leftPtr));
          leftPtr++;
        } else {
          merged.add(right.get(rightPtr));
          rightPtr++;
        }
      }
      while(leftPtr < left.size()) {
        merged.add(left.get(leftPtr));
        leftPtr++;
        }
       while(rightPtr < right.size()) {
        merged.add(right.get(rightPtr));
        rightPtr++;
        }
        return merged;
    }
}
