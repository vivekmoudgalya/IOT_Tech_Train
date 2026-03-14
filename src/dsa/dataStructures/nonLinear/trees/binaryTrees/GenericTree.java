package dsa.dataStructures.nonLinear.trees.binaryTrees;

public class GenericTree<X>
{
    private final X data;
    private GenericTree<X>left;
    private GenericTree<X>right;
    public GenericTree(X data)
    {
        this.data=data;
        this.left=this.right=null;
    }
    void preOrder(){
        System.out.println(this.data+" ");
        if(this.left!=null)this.left.preOrder();
        if(this.right!=null)this.right.preOrder();
    }
    void inOrder(){
        if(this.left!=null)this.left.inOrder();
        System.out.println(this.data+" ");
        if(this.right!=null)this.right.inOrder();
    }
    void postOrder(){
        if(this.left!=null)this.left.postOrder();
        if(this.right!=null)this.right.postOrder();
        System.out.println(this.data+" ");
    }

    public static void main(String[] args) {
        GenericTree<Integer> IntegerRoot=new GenericTree<>(1);
        IntegerRoot.left=new GenericTree<>(2);
        IntegerRoot.right=new GenericTree<>(3);
        System.out.println("PreOrder Integer Tree: ");
        IntegerRoot.preOrder();
        System.out.println();
        System.out.println("InOrder Integer Tree: ");
        IntegerRoot.inOrder();
        System.out.println();
        System.out.println("PostOrder Integer Tree: ");
        IntegerRoot.postOrder();
        System.out.println();

        //this is a tree of floats

        GenericTree<Float>floatTree=new GenericTree<Float>(1.2f);
        floatTree.left=new GenericTree<>(2.4f);
        floatTree.right=new GenericTree<>(4.6f);

        System.out.println("PreOrder Float Tree: ");
        floatTree.preOrder();
        System.out.println();
        System.out.println("InOrder Float Tree: ");
        floatTree.inOrder();
        System.out.println();
        System.out.println("PostOrder Float Tree: ");
        floatTree.postOrder();
        System.out.println();

        //this is a tree of boolean

        GenericTree<Boolean>booleanTree=new GenericTree<Boolean>(true);
        booleanTree.left=new GenericTree<>(false);
        booleanTree.right=new GenericTree<>(true);

        System.out.println("PreOrder Boolean Tree: ");
        booleanTree.preOrder();
        System.out.println();
        System.out.println("InOrder Boolean Tree: ");
        booleanTree.inOrder();
        System.out.println();
        System.out.println("PostOrder Boolean Tree: ");
        booleanTree.postOrder();
        System.out.println();
    }
}
