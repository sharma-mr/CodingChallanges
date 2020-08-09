class Solution {
    
    private final String[] LESS_THAN_20 = {"", "One", "Two", "Three", "Four",       "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Eleven", "Twelve", "Thirteen",         "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    
    private final String[] TENS = {"", "Ten", "Twenty", "Thirty", "Forty",           "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
   
    private final String[] THOUSANDS = {"", "Thousand", "Million", "Billion"};
    
    public String numberToWords(int num) {
         
        if(num == 0) {
            return "Zero";
        }
        
        //Calculate by 3 digits
        StringBuilder sb = new StringBuilder();
        int index = 0;
        while(num  > 0) {
            if(num % 1000 != 0) {
                StringBuilder temp = new StringBuilder();
                helper(temp, num % 1000);
                sb.insert(0, temp.append(THOUSANDS[index]).append(" "));
            }
            index++;
            num = num / 1000;
        }
        
          return sb.toString().trim();  
    }
    
    private void helper(StringBuilder tmp, int num) {
        if(num == 0) 
        {
            return;
        }
        
        if(num < 20) {
            tmp.append(LESS_THAN_20[num]).append(" ");
            return;
        } else if( num < 100) {
            tmp.append(TENS[num / 10]).append(" ");
            helper(tmp, num % 10);
        } else {
            tmp.append(LESS_THAN_20[num / 100]).append(" Hundred ");
            helper(tmp, num % 100);
        }
        
        
    }
}