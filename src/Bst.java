/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author Dharaneesh N
 */
class tree
{
    int data;
    tree right;
    tree left;
    tree(int d)
    {
        data=d;
        right=null;
        left=null;
    }
}
public class Bst {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args)  {
        Scanner scan=new Scanner(System.in);
        int data,n;
        tree root,new_node,temp;
        System.out.println("Enter the value for root node: ");
        root=createNode(scan.nextInt());
        System.out.println("Enter the number of nodes you want to insert: ");
        n=scan.nextInt();
        
        for(int i=0;i<n;i++)
        {
             System.out.println("Enter the value for new node: ");
            new_node=createNode(scan.nextInt());
          
           insertrec(root,new_node);
        }
        inorder(root); System.out.println();
        preorder(root);System.out.println();
        postorder(root);
    }
   
    public static void insertrec(tree node,tree new_node)
    {
       if(node.data>new_node.data)
       {
           if(node.left==null)
               node.left=new_node;
           else
               insertrec(node.left,new_node);
       }
       else
       {
           if(node.right==null)
               node.right=new_node;
           else
               insertrec(node.right,new_node);
       }
    }
    public static tree createNode(int data)
    {
        tree node=new tree(data);
        return node;
    }
    public static void inorder(tree node)
    {
        try
        {
        inorder(node.left);
        System.out.print(node.data+" ");
        inorder(node.right);
        }
        catch(NullPointerException e)
        {
            return;
        }
    }
    public static void preorder(tree node)
    {
        try
        {
        System.out.print(node.data+" ");
        preorder(node.left);
        preorder(node.right);
        }
        catch(NullPointerException e)
        {
            return;
        }
    }
    public static void postorder(tree node)
    {
        try
        {
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data+" ");
        }
        catch(NullPointerException e)
        {
            return;
        }
    }
    
}
