package PRACTICE01;

    public class keypadCombinations {
        final static char[][] L = {{},{},{'a','b','c'},{'d','e','f'},{'g','h','i'},
                                  {'j','k','l'},{'m','n','o'},{'p','q','r','s'},
                                  {'t','u','v'},{'w','x','y','z'}};

        public static void letterCombinations(String str) {
            int n = str.length();
            if( n == 0) {
                System.out.println("");
                return;
            }
            bfs(0, n, new StringBuilder(), str);
        }
        public static void bfs(int pos, int n, StringBuilder sb, String str) {
            if(pos == n) {
                System.out.print(sb.toString() + " ");
            }
            else {
                char[] letters = L[Character.getNumericValue(str.charAt(pos))];
                for(int i=0; i<letters.length; i++) {
                    bfs(pos+1, n, new StringBuilder(sb).append(letters[i]), str);
                    
                }
            }
        }
      public static void main(String[] args) {
        letterCombinations("23");
      }
    }