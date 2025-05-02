public class MorseTester {
    public static void main(String[] args) {
        MorseTree tree = new MorseTree();
        
        tree.something.setLeft(new TreeNode<String>("e"));
        tree.something.setRight(new TreeNode<String>("t"));

        tree.something.getLeft().setLeft(new TreeNode<String>("i"));
        tree.something.getLeft().setRight(new TreeNode<String>("a"));
        tree.something.getRight().setLeft(new TreeNode<String>("n"));
        tree.something.getRight().setRight(new TreeNode<String>("m"));

        tree.something.getLeft().getLeft().setLeft(new TreeNode<String>("s"));
        tree.something.getLeft().getLeft().setRight(new TreeNode<String>("u"));
        tree.something.getLeft().getRight().setLeft(new TreeNode<String>("r"));
        tree.something.getLeft().getRight().setRight(new TreeNode<String>("w"));
        tree.something.getRight().getLeft().setLeft(new TreeNode<String>("d"));
        tree.something.getRight().getLeft().setRight(new TreeNode<String>("k"));
        tree.something.getRight().getRight().setLeft(new TreeNode<String>("g"));
        tree.something.getRight().getRight().setRight(new TreeNode<String>("o"));

        tree.something.getLeft().getLeft().getLeft().setLeft(new TreeNode<String>("h"));
        tree.something.getLeft().getLeft().getLeft().setRight(new TreeNode<String>("v"));
        tree.something.getLeft().getLeft().getRight().setLeft(new TreeNode<String>("f"));
        tree.something.getLeft().getRight().getLeft().setLeft(new TreeNode<String>("l"));
        tree.something.getLeft().getRight().getRight().setLeft(new TreeNode<String>("p"));
        tree.something.getLeft().getRight().getRight().setRight(new TreeNode<String>("j"));
        tree.something.getRight().getLeft().getLeft().setLeft(new TreeNode<String>("b"));
        tree.something.getRight().getLeft().getLeft().setRight(new TreeNode<String>("x"));
        tree.something.getRight().getLeft().getRight().setLeft(new TreeNode<String>("c"));
        tree.something.getRight().getLeft().getRight().setRight(new TreeNode<String>("y"));
        tree.something.getRight().getRight().getLeft().setLeft(new TreeNode<String>("z"));
        tree.something.getRight().getRight().getLeft().setRight(new TreeNode<String>("q"));

        tree.preOrder();

        tree.postOrder();


        String morse = tree.toMorse("helloworld");

        String english = tree.toEnglish("oooo|o|o-oo|o-oo|---|o--|---|o-o|o-oo|-oo|");

        System.out.println(morse);

        System.out.println(english);
    }
}
