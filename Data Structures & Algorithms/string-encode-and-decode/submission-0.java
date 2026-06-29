class Solution {

    public String encode(List<String> strs) {
        if(strs==null||strs.isEmpty()){
            return "";
        }
        StringBuilder res=new StringBuilder();
        for(String str:strs){
            res.append(str.length()).append('#').append(str);
        }
        return res.toString();
    }

    public List<String> decode(String str) {
         List<String> result=new ArrayList<>();
        if(str.isEmpty()){
            return result;
        }
        int i=0;
        while(i<str.length())
        {
        int idx=str.indexOf('#',i);
        int len=Integer.parseInt(str.substring(i,idx));
        i=idx+1;
        result.add(str.substring(i,i+len));
         i=i+len;
        }
        
        return result;
    }
}
