import java.lang.StringBuilder;


class ReverseString {

    StringBuilder sb;

    ReverseString(){
        this.sb = new StringBuilder();
    }
   
    String reverse(String inputString) {
        sb.setLength(0);

         for(int i = inputString.length() - 1; i >= 0 ; i--){
            sb.append(inputString.charAt(i));
        }

        return sb.toString();
    }
  
}
