public class MorseTree{
    TreeNode<String> something = new TreeNode<String>("");
    public MorseTree(){

    }
    public void preOrder(){
        something.preorder(something);   
    }
    public void postOrder(){
        something.postorder(something);    
    }
    public String toMorse(String target){
        String output = "";
        for (int i = 0; i < target.length(); i++){
            output += toMorseChar(target.charAt(i) + "", "", something);
            output += "|";
        }        
        return output;
    }

    public String toMorseChar(String target, String path, TreeNode<String> currentNode){
        if (currentNode.getElement().equals(target)){
            return path;
        }
        else{
            if (currentNode.getLeft() != null && currentNode.getRight() == null){
                return toMorseChar(target, path + "o", currentNode.getLeft());
            }
            else if (currentNode.getLeft() == null && currentNode.getRight() != null){
                return toMorseChar(target, path + "-", currentNode.getRight());
            }
            else if (currentNode.getLeft() == null && currentNode.getRight() == null){
                return "";
            }
            else{
                return toMorseChar(target, path + "o", currentNode.getLeft()) + toMorseChar(target, path + "-", currentNode.getRight());
            }
        }
    }
    public String toEnglish(String target){
        String output = "";
        String holder = "";
        for (int i = 0; i < target.length(); i++){
            if(target.charAt(i)!= '|'){
                holder = holder + target.charAt(i);
            }
            else{
                output += toEnglishChar(holder, something);
                holder = "";
                
            }
            
        }        
        return output;
    }
    public String toEnglishChar(String target, TreeNode<String> currentNode){
        String output = "";
        for (int i = 0; i < target.length(); i++){
            if((target.charAt(i) + "").equals("-")){
                currentNode = currentNode.getRight();
            }
            else{
                currentNode = currentNode.getLeft();
            }
        }
        output = currentNode.getElement();
        return output;
    }   

}