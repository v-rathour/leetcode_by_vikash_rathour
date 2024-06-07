class Solution {
    class Node{
        char data;
        HashMap<Character,Node> child = new HashMap<>();
        boolean terminal = false;
    }
    
    private Node root;
    
    public void insert(String word){
        Node curr = root;
        
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
            }
            else{
                Node NewNode = new Node();
                NewNode.data = ch;
                curr.child.put(ch,NewNode);
                curr = NewNode;
            }
        }
        
        curr.terminal = true;
    }
    
    public String search(String word){
        Node curr = root;
        StringBuilder str = new StringBuilder("");
        for(int i = 0;i<word.length();i++){
            char ch = word.charAt(i);
            if(curr.child.containsKey(ch)){
                curr = curr.child.get(ch);
                str.append(ch);
                if(curr.terminal){
                    return str.toString();
                }
            }
            else{
                return "";
            }
        }
        
        return "";
    }
    
    public String replaceWords(List<String> dictionary, String sentence) {
        
        Node node = new Node();
        node.data = '*';
        root = node;
    
        
        for(String s : dictionary){
            insert(s);
        }
        
        // System.out.println(root.child);
        
        String str[] = sentence.split(" ");
        StringBuilder ans = new StringBuilder();
        
        for(String s : str){
            String a = search(s);
            // System.out.println(a);
            if(a.length() == 0){
                ans.append(s+" ");
            }
            else{
                ans.append(a+" ");
            }
        }
        ans.deleteCharAt(ans.length()-1);
        return ans.toString();
    }
}