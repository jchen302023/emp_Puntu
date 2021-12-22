public class SearchDriver {

  public static long BinTime(Comparable[] a, int b, int c) {
    long BinStart = System.currentTimeMillis();
    for (int i = 0; i <  c; i ++) {
          BinSearch.binSearch(a, b);
    } 
    long BinEnd = System.currentTimeMillis();
    long BinTot = BinEnd - BinStart;
    System.out.println("Time it took Bin: " + BinTot + " milliseconds");
    return BinTot;
  } // BinTime

  public static long LinTime(Comparable[] a, int b, int c) {
    long LinStart = System.currentTimeMillis();
    for (int i = 0; i <  c; i ++) {
          LinSearch.linSearch(a, b);
    } //
    long LinEnd = System.currentTimeMillis();
    long LinTot = LinEnd - LinStart;
    System.out.println("Time it took Lin: " + LinTot + " milliseconds");
    return LinTot;
  } // LinTime

  public static void main(String[] args) {
    BinSearch BinTrial = new BinSearch();
    LinSearch LinTrail = new LinSearch();

    Comparable[] Test1 = new Integer[1000]; //1K
    for (int i = 0; i < Test1.length; i ++) {
      Test1[i] = i;
    }
    Comparable[] Test2 = new Integer[10000]; //10K
    for (int i = 0; i < Test2.length; i ++) {
      Test2[i] = i;
    }

    Comparable[] Test3 = new Integer[100000]; //100K
    for (int i = 0; i < Test3.length; i ++) {
      Test3[i] = i;
    }

    Comparable[] Test4 = new Integer[1000000]; //1M
    for (int i = 0; i < Test4.length; i ++) {
      Test4[i] = i;
    }

    Comparable[] Test5 = new Integer[10000000]; //10M
    for (int i = 0; i < Test5.length; i ++) {
      Test5[i] = i;
    }
    
    System.out.println("Filler case");
    BinTime(Test1, 1, 1);
    LinTime(Test1, 1, 1);

    //10k reps with the worst case scenario
    System.out.println("=========================");
    System.out.println("1K values in array:");
    BinTime(Test1, 999, 10000);
    LinTime(Test1, 999, 10000);

    System.out.println("=========================");
    System.out.println("10K values in array:");
    BinTime(Test2, 9999, 10000);
    LinTime(Test2, 9999, 10000);

    System.out.println("=========================");
    System.out.println("100K values in array:");
    BinTime(Test3, 99999, 10000);
    LinTime(Test3, 99999, 10000);

    System.out.println("=========================");
    System.out.println("1M values in array:");
    BinTime(Test4, 999999, 10000);
    LinTime(Test4, 999999, 10000);

    System.out.println("=========================");
    System.out.println("10M values in array:");
    BinTime(Test5, 9999999, 10000);
    LinTime(Test5, 9999999, 10000);

    /* random int
    int randomInt = (int) (Math.random() * (Test1.length + 1));
    System.out.println("Searching for... " + randomInt);
    BinTime(Test1, randomInt, 10000);
    LinTime(Test1, randomInt, 10000);

    int randomInt2 = (int) (Math.random() * (Test2.length + 1));
    System.out.println("Searching for... " + randomInt2);
    BinTime(Test2, randomInt2, 10000);
    LinTime(Test2, randomInt2, 10000);
    */

  } // main

}
