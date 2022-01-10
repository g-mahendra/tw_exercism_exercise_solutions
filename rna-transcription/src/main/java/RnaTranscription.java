class RnaTranscription {

    String transcribe(String dnaStrand) {
        String answer = "";
        int length = dnaStrand.length();
        char temp = '\0';
        for (int i = 0; i < length; i++) {
            temp = dnaStrand.charAt(i);
            switch (temp) {
                case 'G':
                    answer += 'C';
                    break;
                case 'C':
                    answer += 'G';
                    break;
                case 'T':
                    answer += 'A';
                    break;
                case 'A':
                    answer += 'U';
                    break;
                default:
                    answer = "";
            }
        }
        return answer;
    }

}
