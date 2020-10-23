class Interval {
    int x1, x2;
    int length;
    int odd, even;
    /**
     * Prints all odd numbers of the entered interval
     */
    void odd() {
        System.out.print("Odd: ");
        for (int i = x1; i <= x2; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
            }
        }
    }
    /**
     * Prints all even numbers of the entered interval
     */
    void even() {
        System.out.print("\nEven: ");
        for (int i = x2; i >= x1; i--) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }

    }
    /**
     * Prints sum of odd numbers in interval
     */
    void sumOdd(){
        int sum = 0;
        for (int i = x1; i <= x2; i++) {
            if (i % 2 != 0) {
                sum+=i;
            }
        }
        System.out.println("\nSum of Odd numbers: " + sum);
    }
    /**
     * The same sum but with even numbers
     */
    void sumEven(){
        int sum = 0;
        for (int i = x2; i >= x1; i--) {
            if (i % 2 == 0) {
                sum+=i;
            }
        }
        System.out.println("Sum of Even numbers: " + sum);
    }
    /**
     * Making a number of fibonacci taking the two last numbers
     */
    void fibonacci(){
        int sum;
        int maxEven, maxOdd;
        int big, small;

        if(x2 % 2 == 0){
            maxEven = x2;
            maxOdd = x2-1;
        }
        else {
            maxOdd = x2;
            maxEven = x2-1;
        }
        if (maxEven > maxOdd) {
            big = maxEven;
            small = maxOdd;
            System.out.print(maxOdd + " ");
            System.out.print(maxEven + " ");
            odd++;
            even++;
        }
        else {
            big = maxOdd;
            small = maxEven;
            System.out.print(maxEven + " ");
            System.out.print(maxOdd + " ");
            odd++;
            even++;
        }
        for (int i = 0; i <length-2; i++){
            sum = small + big;
            small = big;
            big = sum;
            if(sum % 2 == 0){
                even++;
            }
            else {
                odd++;
            }
            System.out.print(sum + " ");
        }
    }

    /**
     * @return percent of odd numbers in fibonacci
     */
    int oddPercent(){
        return odd * 100 / length;
    }

    /**
     * @return percent of even numbers in fibonacci
     */
    int evenPercent(){
        return even * 100 / length;
    }
}