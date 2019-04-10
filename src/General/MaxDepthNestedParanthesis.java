package General;

public class MaxDepthNestedParanthesis {
    public static void main(String args[]){
        String s = "( ((X)) (((Y))) ) ";
        char[] chars = s.toCharArray();

        int max=0, cur_max=0;
        for(int i=0;i<s.length();i++){
            if(chars[i]=='('){
                cur_max++;
                max=Math.max(max,cur_max);
            }
            else if(chars[i]==')'&&cur_max>=0){
                cur_max--;
            }
            else if(cur_max<0){
                System.out.println("not paired"+cur_max);
            return;}
        }
        System.out.println(" pair depth "+max);

    }
}
