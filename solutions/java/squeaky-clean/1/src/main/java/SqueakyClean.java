class SqueakyClean {
    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder("");
        int dash = 0;
        for(int i=0; i<identifier.length(); i++){
            if(Character.isWhitespace(identifier.charAt(i))){
                sb.append("_");
                continue;
            }
            else if(identifier.charAt(i) == '-'){
                dash = 1;
                continue;
            } 
            else if(Character.isDigit(identifier.charAt(i))){
                switch(identifier.charAt(i)){
                    case '4':
                        sb.append('a');
                        break;
                    case '3':
                        sb.append('e');
                        break;
                    case '0':
                        sb.append('o');
                        break;
                    case '1':
                        sb.append('l');
                        break;
                    case '7':
                        sb.append('t');
                        break;
                }
                continue;
            } else if(!Character.isLetterOrDigit(identifier.charAt(i))){
                continue;
            }
            if(dash == 1){
                sb.append(Character.toUpperCase(identifier.charAt(i)));
                dash = 0;
                
            } else{
            sb.append(identifier.charAt(i));
            }
        }
        return sb.toString();
    }
}
