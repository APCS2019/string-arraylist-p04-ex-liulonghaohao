/** @param str the string to encode using the master string
     *  Precondition: all of the characters in str appear in the master string;
     *  str.length() > 0
     *  @return a string part in the master string that matches the beginning of str.
     *  The returned string part has length at least 1 and largest 5. 
     *  The method gives prefernce to return the longer matches.
     */
    private StringPart findPart(String str){
            for(int i =5; i>=1;i--){
        String a = str.substring(0, 0 + i);
        if(masterSrting.indexOf(a)!=-1){
            StringPart a= new StringPart(masterString.indexOf(a),masterString.indexOf(a)+a.length()); 
        }
               
    }
        return a;
    }
    

