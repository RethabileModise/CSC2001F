//Rethabile Modise
// 02/03/2020
// binary tree class of a distinct data type


public class BinaryTree<dataType>
{
   BinaryTreeNode<dataType> root;

   public BinaryTree ()
   {
      root = null;
   }
   
   

   public int getHeight ()
   {
      return getHeight (root);
   }

   public int getHeight ( BinaryTreeNode<dataType> node )
   {
      if (node == null)
         return -1;
      else
         return 1 + Math.max (getHeight (node.getLeft ()), getHeight (node.getRight ()));
   }

   public int getSize ()
   {
      return getSize (root);
   }

   public int getSize ( BinaryTreeNode<dataType> node )
   {
      if (node == null)
         return 0;
      else
         return 1 + getSize (node.getLeft ()) + getSize (node.getRight ());
   }

   public void preOrder ()
   {
         preOrder (root);
   }

   public void preOrder ( BinaryTreeNode<dataType> node )
   {
     if (node != null)
     {
        visit (node);
        preOrder (node.getLeft ());
        preOrder (node.getRight ());
     }
   }

   public void visit ( BinaryTreeNode<dataType> node )
   {
      System.out.println (node.data);
   }

}