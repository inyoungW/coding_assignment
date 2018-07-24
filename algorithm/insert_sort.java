public static List<Integer> insertSort(final List<Integer> numbers) {  // 이미 정렬된 리스트 다시 정렬하는 경우  O(n^2)
  final List<Integer> sortedList = new LinkedList<>();
  originalList: for(Integer number : numbers){
    for(int i=0;i<sortedList.size();i++){
      if(number < sortedList.get(i)) {
        sortedList.add(i,number);
        continue originalList;
      }
    }
    sortedList.add(sortedList.size(),number);
  }
  return sortedList;
}
