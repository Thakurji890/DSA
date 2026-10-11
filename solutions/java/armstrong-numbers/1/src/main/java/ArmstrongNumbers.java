class ArmstrongNumbers {

    boolean isArmstrongNumber(int numberToCheck) {
        int numDigit = String.valueOf(numberToCheck).length();
        int temp = numberToCheck;
        int isArm = 0;
        while(temp > 0) {
            int d = temp % 10;
            isArm += (int) Math.pow(d,numDigit);
            temp /= 10;
        }
        return numberToCheck == isArm ? true : false;
    }

}
