class Acronym {

    private String phrase; 
    
    Acronym(String phrase) {
        this.phrase = phrase;
    }

    String get() {
        String res = "";
        String[] words = this.phrase.split("[-\\s]");
        for (String word: words){
            for(char c: word.toCharArray()){
                if(Character.isLetter(c)){
                    res += c;
                    break;
                }
            }
        }
        return res.toUpperCase();
    }

}
