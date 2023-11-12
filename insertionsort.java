public int[] insertionsort (int[] list) {
    int sortValue;
    int j;
    for (int i = 1; i<list.length-1; i++) {
      sortValue = i;
      j = i;
      while (j>0 && sortValue<list[j-1]) {
        list[j] = list[j-1];
        j = j-1;
      }
      list[j] = sortValue;
    }
    return list;
  }