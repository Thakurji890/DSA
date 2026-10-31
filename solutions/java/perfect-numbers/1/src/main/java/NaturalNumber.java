class NaturalNumber {
    private final int number;
    NaturalNumber(int number) {
        if(number <= 0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.number = number;
    }

    Classification getClassification() {
        int aliquotSum = calculateAliquotSum();
        if(aliquotSum == number)
            return Classification.PERFECT;
        else if(aliquotSum > number)
            return Classification.ABUNDANT;
        else
            return Classification.DEFICIENT;
    }
    private int calculateAliquotSum() {
        int sum =0;
        for(int i = 1; i <= number / 2 ; i++) {
            if(number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
}
