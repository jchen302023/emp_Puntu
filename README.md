# emp_Puntu 

### TNPG: Puntu   
  Anjini Katari, Jacc Chen
  
  APCS pd07 
  
  lab03 - Get Empirical 
  
  12-21-21
### - Tests Performed: 
- Filled an Array with 1000000 integers, ran BinSearch and LinSearch 5 times each on it. 
- Filled an Array with 100000 integers, ran BinSearch and LinSearch 5 times each on it. 
### - Results:
- Jacc's computer can't go over 10^9 (100 million)
- Anjini's computer can't go over 
- We created BinTime/LinTime that takes a Test array, a random number to search for, and the number of times you want to run Lin/Binsearch
- Test1 is an array of 1000000 ints, searching for a random #
  - Example testcase: Test1, randomInt = 606633, 10000 times each Lin/Binsearch 
    - BinSearch time taken: 9 milliseconds
    - LinSearch time taken: 11977 milliseconds
  - Example testcase: Test1, randomInt = 66824, 10000 times each Lin/Binsearch 
    - BinSearch time taken: 10 milliseconds
    - LinSearch time taken: 784 milliseconds
- Test2 is an array of 100000 ints 
  - Example testcase: Test2, randomInt = 71847, 10000 times each Lin/Binsearch 
    - BinSearch time taken: 2 milliseconds
    - LinSearch time taken: 822 milliseconds
  - Example testcase: Test2, randomInt = 30798, 10000 times each Lin/Binsearch 
    - BinSearch time taken: 1 milliseconds
    - LinSearch time taken: 352 milliseconds

### - Conclusion:
- Binary Searches operate faster than Linear Searches relative the size of the dataset
- My computer doubles as a heater too 
