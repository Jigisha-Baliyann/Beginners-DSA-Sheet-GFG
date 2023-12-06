class GfG
{
   
    public static int getNth(Node node, int ind)
    {
       //Your code here
       int data = node.data;
       for (int i=1; i<=ind; i++) {
           data = node.data;
           node = node.next;
       }
       return data;
    }
}
