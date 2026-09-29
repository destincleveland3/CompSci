public class BooleanChecks {


    public boolean isPromiseKept(boolean isRaining, boolean isCanceled) {
        return !isRaining || isCanceled;
    }


    public boolean hasOneSide(boolean hasFries, boolean hasSalad) {
        return (hasFries && !hasSalad) || (!hasFries && hasSalad);
    }


    public boolean isApproved(boolean firstVote, boolean secondVote,
            boolean thirdVote) {
        return (firstVote && secondVote)
            || (firstVote && thirdVote)
            || (secondVote && thirdVote);
    }

    
    public boolean isLeapYear(int year) {
        return (year % 400 == 0)
            || (year % 4 == 0 && year % 100 != 0);
    }

    public boolean outsideRange(int value, int low, int high) {
        return value < low || value > high;
    }

   
    public boolean divides(int d, int n) {
        return d != 0 && n % d == 0;
    }

  
    public boolean averageAtLeast(int total, int count, int target) {
        return count != 0 && total / count >= target;
    }

   
    public boolean hasPrefix(String word, String prefix) {
        return prefix.length() <= word.length()
            && word.substring(0, prefix.length()).equals(prefix);
    }
}