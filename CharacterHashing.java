class CharacterHashing {
    public static void countCharacters(String s){

        int[] hash=new int[26];

        for(int i=0;i<s.length();i++){

            hash[s.charAt(i)-'a']++;

        }
        char[] q={'a','f','c','b','e','z'};

        for(char c:q) {
            System.out.println("Character:" + c + ",Frequency:" + hash[c-'a']);
        }
    }
    public static void main(String[] args) {
        String s="abcdabefe";
        countCharacters(s);
    }
}
