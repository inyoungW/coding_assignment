public void bubbleSort(int[] numbers){   // 최악의 경우 O(n^2)
  boolean numbersSwitched;
  do{
    numbersSwitched = false;
    for(int i;i<numbers.length-1;i++){
      if(numbers[i]>numbers[i+1]){
        int temp = numbers[i+1];
        int numbers[i+1] = numbers[i];
        numbers[i] = temp;
        numbersSwitched=true;
        }
     }
  } while(numberSwitched);
}
