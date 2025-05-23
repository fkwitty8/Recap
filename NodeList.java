    class Node{
    int Dta;
    Node NextNode;
    Node(int data){
        this.Data=data;
        this.NextNode=null;
    }
}


public class NodeList {
	Node 
	
	void addNode(int NodeData){


	    Node Nodeariable;

	    System.out.println("Hello2");
	    if(Head== null){
	         System.out.println("Hello3");
	        NodeVariable=Head;
	        System.out.println("Hello4");
	        
	    }
	    else{
	        Node NodeVariable1;
	        NodeVariable1=Head;
	        while(NodeVariable1.NextNode!=null){
	            NodeVariable1=NodeVariable1.NextNode;
	        }
	        NodeVariable=NodeVariable1;
	    }
	 System.out.println("Hello5");
	 NodeVariable.NextNode=new Node(NodeData);
	 System.out.println("Hello6");
    }
    
    void printList(){
        if(Head.NextNode==null){
            System.out.println("Empty List!");
        }
        else{
            Node NextNode=Head.NextNode;
             while(NextNode!=null){
                System.out.println(NextNode.Data);
                NextNode=NextNode.NextNode;
            }
            System.out.println("End of list!");
        }
    }

    public static void main(String[] args) {
		NodeList list=new NodeList();
		System.out.println("HelloA");
		int num=4;
		list.addNode(num);
		System.out.println("HelloB");
		list.addNode(2);
		list.addNode(3);
		list.printList();
    }
}
