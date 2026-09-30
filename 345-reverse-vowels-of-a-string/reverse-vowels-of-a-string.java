class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left=0;
        int right=arr.length-1;
       
       while(left<right) {
       char chl = arr[left];
       char chr = arr[right];
        
        if(isvowel(chl) && isvowel(chr)) {
        arr[left]=chr;
        arr[right]=chl;
        left++;
        right--;
        } else if(isvowel(chl)) {
            right--;
        } else if(isvowel(chr)) {
            left++;
        } else {
            left++;
            right--;
        }
       }
        return new String(arr);
       }
        

        boolean isvowel(char ch) {
            if (ch=='a'|| ch=='A') {
               return true;
            } else  if (ch=='e'|| ch=='E') {
                 return true;
            } else  if (ch=='i'|| ch=='I') {
                 return true;
            }else  if (ch=='o'|| ch=='O') {
                 return true;
            }else  if (ch=='u'|| ch=='U') {
                 return true;
            }else {
                return false;
            }
        }
    }
