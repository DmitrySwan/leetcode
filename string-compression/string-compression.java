class Solution {
    public int compress(char[] chars) {

        if(chars.length == 1) return chars.length;
        
        char buf = chars[0];
        int count = 1;        
        int index = 0;
        
        for(int i=1; i<chars.length; i++) {
            if(chars[i] == chars[i-1]) {
                count++;
            }
            if(i + 1 == chars.length) {
                chars[index] = buf;
                char s= chars[i];       
                char f= chars[i-1];

                if(count > 1 ) {
                    if(count>=1000) {
                        chars[++index] = (char)(count / 1000 + '0');
                         count = count % 1000;
                         if(count<100) {
                            chars[++index] ='0';
                             chars[++index] ='0';
                    }
                    }
                     if(count>=100) {
                        chars[++index] = (char)(count / 100 + '0');
                         count = count % 100;
                         if(count<10) {
                            chars[++index] ='0';
                    }
                        
                    }
                    if(count>=10) {
                        chars[++index] = (char)(count / 10 + '0');
                        
                    }
                    chars[++index] = (char)((count % 10) + '0');
                }  
                 if(s != f ) {
                     chars[++index] = s;
                 }
                break;
            }

            if(chars[i] != chars[i-1]) {
                chars[index] = buf;
                if(count == 1) {
                    index++;
                    count = 1;
                    buf = chars[i];
                    continue;
                }
                if(count>=10) {
                    chars[++index] = (char)(count / 10 + '0');
                }
                chars[++index] = (char)((count % 10) + '0');
                index++;
                count = 1;
                buf = chars[i];
            }
        }

        char[] temp = new char[index + 1];
        for (int j = 0; j < temp.length; j++) {
          temp[j] = chars[j];
        }
        return temp.length;
        
        
    }
}